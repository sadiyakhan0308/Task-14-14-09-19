package com.ssi.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.dao.*;
import com.ssi.model.Emp;

public class EmpDelete {
	public static void main(String[] args) {
		Session session = new EmpDao().getSession();

		Emp e = new Emp();
		e.setEno(112);

		Transaction tr = session.beginTransaction();
		session.delete(e);

		tr.commit();
		session.close();
		System.out.println("Deleted Successfully");

	}
}
