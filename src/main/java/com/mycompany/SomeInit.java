package com.mycompany;

import org.springframework.beans.factory.InitializingBean;

public class SomeInit implements InitializingBean{
	
	private Something something;
	 
	public void setSomething(Something something) {
		this.something = something;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(something.getName());
	}

}
