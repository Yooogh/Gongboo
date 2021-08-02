package com.consolution.test.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Bar72 {

	private Foo72 foo72;

	
	public Bar72() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("member변수 foo72가 가지고있는 주소값 : " + foo72);
	}

	@Required
	@Resource
	public void setFoo72(Foo72 foo72) {
		this.foo72 = foo72;
	}
	
	public void doBar72() {
		foo72.doFoo72();
	}
}
