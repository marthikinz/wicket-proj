package com.mycompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService{
	
	@Autowired
	private HibernateSomethingDao somethingDao;

	@Override
	public String getSomeMessag() {
		return somethingDao.load(1).getName();
	}

}
