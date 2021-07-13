package by.task45.dao;

import java.util.List;

import by.task45.entity.Subject;

public interface SubjectDao extends CrudDao<Long, Subject> {

	List<Subject> findAll();
}
