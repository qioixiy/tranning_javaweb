package com.quickmove.springmvc.service.impl;

import com.quickmove.springmvc.dao.IPersonDao;
import com.quickmove.springmvc.service.IPersonService;

public class PersonService implements IPersonService {
	private IPersonDao personDao;

	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void processSave() {
		System.out.println("-------------from PersonService.processSave()");

		personDao.save();
	}

}