package dataAccess;
import enitities.Category;
import enitities.Course;
public interface ICourseDao {
	void add(Category category);

	void add(Course course);
}
