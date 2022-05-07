package com.mystudy.college.model.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;

import com.mystudy.college.model.vo.LecSubjectVO;
import com.mystudy.college.model.vo.LectureVO;
import com.mystudy.college.model.vo.ProfessorVO;
import com.mystudy.college.mybatis.DBService;

public class ProfessorDAO {

	//교수 아이디로 받아서 개인정보 조회 
	public static List<ProfessorVO> selectId(int selectId) {
		SqlSession ss = DBService.getFactory().openSession();
		List<ProfessorVO> list = ss.selectList("college.professorSelect", selectId);
		System.out.println(list);
		ss.close();
		return list;
	}

	//교수 아이디로 검색해서 개인정보 수정 
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
	
	//교수 자기 강의 목록 조회 
	public static  List<LecSubjectVO> lecSelect(int pro_id){
		SqlSession ss = DBService.getFactory().openSession();
		List<LecSubjectVO> list = ss.selectList("college.LectureSelect", pro_id);
		System.out.println(list);
		ss.close();
		return list;
	}
}