package com.mycompany;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService{
	
	private SomethingDao somethingDao;

	public void setSomethingDao(SomethingDao somethingDao) {
		this.somethingDao = somethingDao;
	}

	@Override
	public String getSomeMessag() {
		// TODO Auto-generated method stub
		return somethingDao.load(1).getName();
	}

}
