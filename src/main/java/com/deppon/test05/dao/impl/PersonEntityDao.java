package com.deppon.test05.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.deppon.test05.dao.IPersonEntityDao;
import com.deppon.test05.entity.PersonEntity;
import com.deppon.test05.util.MyBatisUtil;

public class PersonEntityDao implements IPersonEntityDao {
	public static final String NAMESPACE = "com.deppon.test05.mapper.PersonEntityMapper";

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