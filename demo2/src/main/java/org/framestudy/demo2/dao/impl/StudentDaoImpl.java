package org.framestudy.demo2.dao.impl;

import org.framestudy.demo2.bean.Student;
import org.framestudy.demo2.dao.IStudentDao;

public class StudentDaoImpl implements IStudentDao {

	public boolean addStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("����ѧ���ɹ�");
		return false;
	}

	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("����ѧ���ɹ�");
		System.out.println(student.getUserName());
		return false;
	}

	public boolean delStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("ɾ��ѧ���ɹ�");
		return false;
	}

}
