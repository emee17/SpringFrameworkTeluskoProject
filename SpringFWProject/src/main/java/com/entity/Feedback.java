package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback 
{
	private String name;
	@Id
	private String email;
	private String msg;
	private String reg;
	private String code;
	private int rating;
	public Feedback()
	{
		
	}
	public Feedback(String name, String email,String msg, String reg, String code, int rating) {
		super();
		this.name = name;
		this.email = email;
		this.msg = msg;
		this.reg = reg;
		this.code = code;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getReg() {
		return reg;
	}
	public void setReg(String reg) {
		this.reg = reg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Feedback [name=" + name + ", email=" + email + ", reg=" + reg + ", code=" + code + ", rating=" + rating
				+ "]";
	}
}
