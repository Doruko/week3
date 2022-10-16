package hw3;

import java.lang.System.Logger;

import business.CatagoryManager;
import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCategoryDoa;
import enitities.Category;
import enitities.Course;
import enitities.Instructor;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.MailLogger;

public class Main {
	



	
	    public static void main(String[] args) throws Exception {
	        Logger[] loggers = {(Logger) new MailLogger(), (Logger) new DatabaseLogger(), new FileLogger()};

	        Category category1 = new Category(4, "Cloud");
	        CatagoryManager categoryManager = new CatagoryManager(new JdbcCategoryDoa(), loggers);
	        categoryManager.add(category1);

	        System.out.println("---");

	        Course course1 = new Course(3, "Kotlin", "Mobil Programing", 0);
	        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
	        courseManager.add(course1);

	        System.out.println("---");

	        Course course2 = new Course(4, "Swift", "Mobil Programing", 0);
	        CourseManager courseManager2 = new CourseManager(new HibernateCourseDao(), loggers);
	        courseManager.add(course2);

	        System.out.println("---");

	        Instructor instructor = new Instructor(1, "Engin", "Demirog");
	        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
	        instructorManager.add(instructor);
	    }
}
