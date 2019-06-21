package com.james.service;

import java.util.List;

import com.james.pojo.Dept;

public interface DeptService {
	boolean add(Dept dept);

	Dept get(Long id);

	List<Dept> list();
}
