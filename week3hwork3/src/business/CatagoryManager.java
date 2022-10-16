package business;

import java.lang.System.Logger;

import dataAccess.ICategoryDoa.ICategoryDao;
import enitities.Category;

public class CatagoryManager {
	

	

	public class CategoryManager {
	    private ICategoryDao categoryDao;
	    private Logger[] loggers;

	    public CategoryManager(ICategoryDao categoryDao, Logger[] loggers) {
	        this.categoryDao = categoryDao;
	        this.loggers = loggers;
	    }

	    public void add(Category category) throws Exception {
	        Category[] categories = {new Category(1, "Backend"), new Category(2, "Frontend"), new Category(3, "Mobile")};
	        for (Category c : categories) {
	            if (category.getName() == c.getName()) {
	                throw new Exception("Kategori ismi tekrar edemez.");
	            }
	        }
	        categoryDao.add(category);
	        for (Logger logger : loggers) {
	            logger.log(null, category.getName());
	        }
	    }
	}

	public void add(Category category1) {
		// TODO Auto-generated method stub
		
	}

}
