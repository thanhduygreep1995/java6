package com.poly.dto;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.poly.entity.AccountRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
	@NotEmpty
	@Length(min = 6)
	private String username;
    @NotEmpty
    @Length(min = 6)
	private String password;
	@NotEmpty
	private String fullname;
	@NotEmpty
	private String email;
	private String photo;
	List<AccountRole> accountRoles;
}
