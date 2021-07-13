package by.task45.dao;

import java.util.List;


import by.task45.entity.Student;

public interface StudentDao extends CrudDao<Long, Student> {

	List<Student> findAll();


}
