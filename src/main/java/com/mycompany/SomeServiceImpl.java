package com.mycompany;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.mycompany.model.Something;
import com.mycompany.repository.SomethingRepository;

@Service
public class SomeServiceImpl implements SomeService{
	
	@Autowired
	private SomethingRepository somethingRepository;

	@Override
	public String getSomeMessag() {
		List<Something> s = somethingRepository.findByNumber(2);
		return s.get(0).getName();
	}

	@Override
	public int getCount() {
		Something something = Something.builder().number(2).build();
		return (int) somethingRepository.count(Example.of(something, ExampleMatcher.matching().withIgnorePaths("id")));
	}

}
