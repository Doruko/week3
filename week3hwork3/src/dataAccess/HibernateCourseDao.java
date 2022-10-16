package dataAccess;

import enitities.Category;
import enitities.Course;

public class HibernateCourseDao implements ICourseDao {
	    @Override
	    public void add(Course course) {
	        System.out.println("Hibernate ile veritabanina eklendi : "+course.getName());
	    }

		@Override
		public void add(Category category) {
			// TODO Auto-generated method stub
			
		}
	}


