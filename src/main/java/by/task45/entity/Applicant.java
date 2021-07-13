package by.task45.entity;

public class Applicant extends Entity {

	private static final long serialVersionUID = 1L;

	String name;

	Subject subject1, subject2;

	Integer certificateGrade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Subject getSubject1() {
		return subject1;
	}

	public void setSubject1(Subject subject1) {
		this.subject1 = subject1;
	}

	public Subject getSubject2() {
		return subject2;
	}

	public void setSubject2(Subject subject2) {
		this.subject2 = subject2;
	}

	public Integer getCertificateGrade() {
		return certificateGrade;
	}

	public void setCertificateGrade(Integer certificateGrade) {
		this.certificateGrade = certificateGrade;
	}



}
