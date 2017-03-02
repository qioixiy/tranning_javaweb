package com.quickmove.mybatis.dao;

import java.util.List;

import com.quickmove.mybatis.entity.PersonEntity;

public interface IPersonEntityDao {
	/**
	 * 插入一条记录
	 * 
	 * @param person
	 */
	public void insert(PersonEntity person);

	/**
	 * 查询所有记录
	 * 
	 * @return
	 */
	public List<PersonEntity> queryAll();
}