package service.impl;

import bean.AuthInfo;
import bean.Profile;
import bean.User;
import bean.UserRegInfo;
import service.UserService;

public class UserServiceImpl implements UserService {
	
	@Override
	public User signIn(AuthInfo authInfo) {
		if("user@mail.ru".equals(authInfo.getLogin())) {
			return new User("admin", "admin");
		}
		return null;
	}

	@Override
	public boolean registration(UserRegInfo regInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean blockUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Profile userProfile(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
