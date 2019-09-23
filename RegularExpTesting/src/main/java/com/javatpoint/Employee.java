package com.javatpoint;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Employee {
	private String name;
	@NotNull
	@Size(min = 1, message = "required")
	@Pattern(regexp = "^[a-zA-Z0-9]{3}", message = "length must be 3")
	private String pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
