package by.task45.dao;

import java.util.List;

import by.task45.entity.FacultySubject;

public interface FacultySubjectDao extends CrudDao<Long, FacultySubject> {

	List<FacultySubject> findAll();

}
