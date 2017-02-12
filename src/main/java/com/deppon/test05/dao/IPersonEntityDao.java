package com.deppon.test05.dao;

import java.util.List;

import com.deppon.test05.entity.PersonEntity;

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