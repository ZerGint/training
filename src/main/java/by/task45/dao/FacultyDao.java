package by.task45.dao;

import java.util.List;

import by.task45.entity.Faculty;

public interface FacultyDao extends CrudDao<Long, Faculty> {

	List<Faculty> findAll();
	
}
