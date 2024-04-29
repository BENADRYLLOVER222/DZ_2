package service;

import service.impl.CourseServiceImpl;
import service.impl.InfoServiceImpl;
import service.impl.UserServiceImpl;

public final class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();

	private UserService userService = new UserServiceImpl();
	private CourseService courseService = new CourseServiceImpl();
	private InfoService infoService = new InfoServiceImpl();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public UserService getUserService() {
		return userService;
	}

	public CourseService getCourseService() {
		return courseService;
	}

	public InfoService getInfoService() {
		return infoService;
	}

}
