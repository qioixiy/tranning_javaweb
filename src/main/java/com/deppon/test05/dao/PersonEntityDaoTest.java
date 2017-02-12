package com.deppon.test05.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.deppon.test05.dao.impl.PersonEntityDao;
import com.deppon.test05.entity.PersonEntity;

public class PersonEntityDaoTest {
	private IPersonEntityDao personEntityDao;

	@Before
	public void before() {
		personEntityDao = new PersonEntityDao();
	}

	@Test
	public void testQueryAll() {
		List<PersonEntity> personList = personEntityDao.queryAll();

		for (PersonEntity each : personList) {
			System.out.println(each);
		}
	}

	@Test
	public void testInsert() {
		PersonEntity person = new PersonEntity();
		person.setId(200);
		person.setName("乔巴");

		personEntityDao.insert(person);
	}
}