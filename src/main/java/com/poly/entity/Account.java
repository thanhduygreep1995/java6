package com.poly.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;


@Data
@Entity
@Table(name = "Accounts")
public class Account implements Serializable {
	@Id
	private String username;
	private String password;
	private String fullname;
	private String email;
	private String photo;
	@JsonIgnore
	@OneToMany(mappedBy = "accounts", fetch = FetchType.EAGER )
	List<AccountRole> accountRoles;
	@JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Order> orders;
	
}
