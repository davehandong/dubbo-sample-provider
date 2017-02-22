package net.davehan.sample.service.impl;

import net.davehan.sample.service.UserService;

public class UserServiceImpl implements UserService {

	public String getUserName(String id) {
		return "韩冬冬"+id;
	}

}
