package com.exam.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Adminuser entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "adminuser", catalog = "test")
public class Adminuser extends AbstractAdminuser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Adminuser() {
	}

	/** full constructor */
	public Adminuser(String name, String password) {
		super(name, password);
	}

}
