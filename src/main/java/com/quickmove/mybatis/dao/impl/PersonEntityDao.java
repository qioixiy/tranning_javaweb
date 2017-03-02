package com.quickmove.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.quickmove.mybatis.dao.IPersonEntityDao;
import com.quickmove.mybatis.entity.PersonEntity;
import com.quickmove.mybatis.util.MyBatisUtil;

public class PersonEntityDao implements IPersonEntityDao {
	public static final String NAMESPACE = "com.quickmove.mybatis.mapper.PersonEntityMapper";

	@Override
	public void insert(PersonEntity person) {
		SqlSession session = MyBatisUtil.getSession();
		session.insert(NAMESPACE + ".insert", person);

		session.commit();
		session.close();
	}

	@Override
	public List<PersonEntity> queryAll() {
		SqlSession session = MyBatisUtil.getSession();
		List<PersonEntity> personList = session.selectList(NAMESPACE + ".queryAll");

		session.commit();
		session.close();

		return personList;
	}

}