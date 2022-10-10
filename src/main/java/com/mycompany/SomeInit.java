package com.mycompany;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeInit implements InitializingBean{
	
	@Autowired
	private HibernateSomethingDao somethingDao;

	@Override
	public void afterPropertiesSet() throws Exception {
		Something something = new Something();
		something.setName("testing");
		somethingDao.save(something);
	}

}
