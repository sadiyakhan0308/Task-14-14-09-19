package com.ssi.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssi.dao.EmpDao;
import com.ssi.model.Emp;

public class EmpEntry {

	public static void main(String args[]) {
		Session session = new EmpDao().getSession();

		Emp e1 = new Emp(111, "Anjali", 50000);
		Emp e2 = new Emp(112, "Ashi", 60000);
		Emp e3 = new Emp(113, "Faizan", 70000);
		Emp e4 = new Emp(114, "Pooja", 80000);
		Emp e5 = new Emp(115, "Aditya", 90000);

		Transaction tr = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);

		tr.commit();
		session.close();
		System.out.println("RECORD ADDED");
	}
}