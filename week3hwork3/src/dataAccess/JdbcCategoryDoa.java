package dataAccess;

public class JdbcCategoryDoa {
	import enitities.Category;

	
	    public  void add(Category category) {
	        System.out.println("Jdbc ile veritabanina eklendi : " + category.getName());
	   }
}


