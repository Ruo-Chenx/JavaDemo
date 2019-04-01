package com.part01;

public @interface Author {

	public String value() default "admin";
	public String name();
	public int age();
	public String[] emails();
}
