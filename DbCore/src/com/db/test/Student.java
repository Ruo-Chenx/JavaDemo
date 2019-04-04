package com.db.test;

import java.math.BigDecimal;

import com.db.annotation.Colunm;
import com.db.annotation.Exclude;
import com.db.annotation.Table;

@Table("stu")
public class Student {
   private long id;
   private int age;
   private String name;
   private String sex;
   @Colunm("money")
   private BigDecimal money;
   
   @Exclude
   private String type;
   
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public BigDecimal getMoney() {
	return money;
}
public void setMoney(BigDecimal money) {
	this.money = money;
}
   
   
}
