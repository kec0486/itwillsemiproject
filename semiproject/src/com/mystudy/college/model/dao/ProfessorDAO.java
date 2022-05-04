package com.mystudy.college.model.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;

import com.mystudy.college.model.vo.LectureVO;
import com.mystudy.college.model.vo.ProfessorVO;
import com.mystudy.college.mybatis.DBService;

public class ProfessorDAO {

	public static List<ProfessorVO> selectId(int selectId) {
		SqlSession ss = DBService.getFactory().openSession();
		List<ProfessorVO> list = ss.selectList("college.professorSelect", selectId);
		System.out.println(list);
		ss.close();
		return list;
	}

	public static int proUpdate(ProfessorVO pvo) {
		int result; 
		SqlSession ss = null;	
		try {	
			ss = DBService.getFactory().openSession();
			result = ss.update("college.professorUpdate", pvo);
			ss.commit();
		} catch(Exception e){
			e.printStackTrace();
			return  -1;

		}
		finally {
			ss.close();
		}
		System.out.println(result);
		return result;
	}
	
	public static  List<LectureVO> lecSelect(int pro_id){
		SqlSession ss = DBService.getFactory().openSession();
		List<LectureVO> list = ss.selectList("college.LectureSelect", pro_id);
		System.out.println(list);
		ss.close();
		return list;
	}
}