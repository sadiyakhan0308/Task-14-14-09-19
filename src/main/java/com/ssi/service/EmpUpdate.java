package com.ssi.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.dao.EmpDao;
import com.ssi.model.Emp;

public class EmpUpdate {
	public static void main(String[] args) {
		Session session = new EmpDao().getSession();

		Emp e = session.get(Emp.class, 113);
		System.out.println(e);
		e.setSal(55000);
		e.setEname("sadiya");
		System.out.println(e);
		Transaction tr = session.beginTransaction();
		session.update(e);
		tr.commit();
		session.close();
		System.out.println("Updated Successfully");

	}
}
