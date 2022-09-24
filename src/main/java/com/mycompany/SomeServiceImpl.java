package com.mycompany;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements SomeService{
	
	private Something something;
	
	public void setSomething(Something something) {
		this.something = something;
	}

	@Override
	public String getSomeMessag() {
		// TODO Auto-generated method stub
		return something.getName();
	}

}
