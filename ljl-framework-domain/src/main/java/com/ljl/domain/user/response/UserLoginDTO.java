package com.ljl.domain.user.response;

import com.ljl.domain.JWT;
import com.ljl.domain.User;
import lombok.Data;

@Data
public class UserLoginDTO {
//	private User user;
	private JWT jwt;
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	public JWT getJwt() {
		return jwt;
	}

	public void setJwt(JWT jwt) {
		this.jwt = jwt;
	}

}
