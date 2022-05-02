package com.mystudy.college.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.mystudy.college.mybatis.DBService;

public class CustomerDAO {
	public static int insert() {
		SqlSession ss = DBService.getFactory().openSession();
		int n = ss.insert("college.insert");
		ss.commit();
		ss.close();
		return n;
	}
}
