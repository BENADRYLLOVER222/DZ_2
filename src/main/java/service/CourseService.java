package service;

import bean.Course;

public interface CourseService {
	boolean add(Course course);

	boolean addUserToCourse(int idCourse, int idUser);
}
