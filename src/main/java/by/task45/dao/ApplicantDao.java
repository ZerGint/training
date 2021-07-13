package by.task45.dao;

import java.util.List;

import by.task45.entity.Applicant;

public interface ApplicantDao extends CrudDao<Long, Applicant> {

	List<ApplicantDao> findAll();

}
