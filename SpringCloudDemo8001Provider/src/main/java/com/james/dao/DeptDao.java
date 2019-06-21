package com.james.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.james.pojo.Dept;

@Mapper
public interface DeptDao {
	boolean addDept(Dept dept);

	Dept findById(Long id);

	List<Dept> findAll();
}
