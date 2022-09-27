package com.mycompany;
import org.springframework.beans.factory.InitializingBean;

public class SomeInit implements InitializingBean{
	private SomethingDao somethingDao;

	public void setSomethingDao(SomethingDao somethingDao) {
		this.somethingDao = somethingDao;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		Something something = new Something();
		something.setName("testing");
		somethingDao.save(something);
	}

}
