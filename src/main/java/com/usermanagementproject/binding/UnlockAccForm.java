package com.usermanagementproject.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnlockAccForm {

	private String email;
	private String temPassword;
	private String newPassword;
	private String ConPassword;
}

