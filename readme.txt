	1.	使用actuator与注册微服务信息完善，给eureka改名，实例名称，不再是localhost或者ip的方式，8001模块添加实例名称
		  instance:
		     instance-id: james.com
		     prefer-ip-address: true #访问路径可以显示IP地址
	2.	使用actuator与注册微服务信息完善，给eureka添加info信息 
			info: 
			  app.name: SpringCloudDemo
			  company.name: www.james.com
			  build.artifactId: $project.artifactId$
			  build.version: $project.version$
			  
	3.	eureka的服务发现
		a.	分别在Provider和Consumer的控制器中添加discovery的代码
		b.	提供者的主类main中添加注解
			@EnableDiscoveryClient //服务发现
			
	4.	eureka集群设置
		分别添加两个子模块7002， 7003
		修改各自的yml，并设置域名解析
			修改host
				mac:		sudo vi /etc/hosts
				windows:	c:/windows/system32/driver/etc/
			127.0.0.1 james1.com
			127.0.0.1 james2.com
			127.0.0.1 james3.com
		修改8001的yml
	      #defaultZone: http://localhost:7001/eureka
	      defaultZone: http://james1.com:7001/eureka,http://james2.com:7002/eureka,http://james3.com:7003/eureka
	      
	5.	使用ribbon实现客户端的负载均衡
		a.	在consumer的yml中添加eureka的设置
			eureka:
			  client:
			    register-with-eureka: false
			    service-url: 
			      defaultZone: http://james1.com:7001/eureka/,http://james2.com:7002/eureka/,http://james3.com:7003/eureka/
		b. 	在ConfigBean中添加负载均衡的注解
			@LoadBalanced	      
		c.	在客户端的主启动类中添加注解
			@EnableEurekaClient
		d.	在客户端的控制器中将之前的url前缀从主机+端口的方式修改为微服务名称的方式
			//private static final String REST_URL_PREFIX = "http://localhost:8001";
			private static final String REST_URL_PREFIX = "http://SPRINGCLOUDDEMOAPI";