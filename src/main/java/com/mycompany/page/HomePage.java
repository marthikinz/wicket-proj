package com.mycompany.page;

import org.apache.wicket.spring.injection.annot.SpringBean;

import com.mycompany.SomeService;

import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends BasePage {
	private static final long serialVersionUID = 1L;
	
	@SpringBean
	private SomeService someService;

	public HomePage() {
		super();
		add(new Label("something", someService.getSomeMessag()));

	}
}
