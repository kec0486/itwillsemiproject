package com.mystudy.college.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mystudy.college.model.vo.EmployeeVO;
import com.mystudy.college.model.vo.LectureVO;
import com.mystudy.college.mybatis.DBService;

public class EmployeeDAO {
	
	// 개인강의 시간표 조회 
	public static List<LectureVO> getList() {
		SqlSession ss = DBService.getFactory().openSession();
		List<LectureVO> list = ss.selectList("college.selectLecture");
		ss.close();
		return list;
	}
	
//	//이름으로 검색
//	public static List<EmployeeVO> fullnameList(String fullname) {
//		SqlSession ss = DBService.getFactory().openSession();
//		List<EmployeeVO> list = ss.selectList("hr.fullnameList", fullname);
//		ss.close();
//		return list;
//	}
//
//	public static List<EmployeeVO> getSerch(String idx, String keyword) {
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("idx", idx);
//		map.put("keyword", keyword);
//		
//		SqlSession ss = DBService.getFactory().openSession();
//		List<EmployeeVO> list = ss.selectList("hr.search", map);
//		ss.close();
//		return list;
//	}
}
