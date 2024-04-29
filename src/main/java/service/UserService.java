package service;

import bean.AuthInfo;
import bean.Profile;
import bean.User;
import bean.UserRegInfo;

public interface UserService {

	User signIn(AuthInfo authInfo);

	boolean registration(UserRegInfo regInfo);

	boolean blockUser(int id);

	Profile userProfile(int id);

}
