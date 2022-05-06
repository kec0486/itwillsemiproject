package com.mystudy.college.model.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;

import com.mystudy.college.model.vo.LecSubjectVO;
import com.mystudy.college.model.vo.LectureVO;
import com.mystudy.college.model.vo.ProfessorVO;
import com.mystudy.college.model.vo.RegistrationVO;
import com.mystudy.college.model.vo.StuRegiVO;
import com.mystudy.college.mybatis.DBService;

public class ProfessorDAO {

	//교수 개인정보 조회 
	public static List<ProfessorVO> selectId(int selectId) {
		SqlSession ss = DBService.getFactory().openSession();
		List<ProfessorVO> list = ss.selectList("college.professorSelect", selectId);
		System.out.println(list);
		ss.close();
		return list;
	}

	//교수 개인정보 업데이트 (수정)
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
	
	//교수 아이디로 교수의 강의 목록 조회 
	public static  List<LecSubjectVO> lecSelect(int pro_id){
		SqlSession ss = DBService.getFactory().openSession();
		List<LecSubjectVO> list = ss.selectList("college.LectureSelect", pro_id);
		System.out.println(list); 
		ss.close();
		return list;
	}
	
	//과목코드로 수강생 리스트 출력 
	public static  List<StuRegiVO> LectureStudentList(int sub_code){
		SqlSession ss = DBService.getFactory().openSession();
		List<StuRegiVO> list = ss.selectList("college.LectureStudentList", sub_code);
		System.out.println(list); 
		ss.close();
		return list;
	}
	
	//과목코드로 수강생 점수 입력 
		public static  List<RegistrationVO> proRegiInsert(RegistrationVO rvo){
			SqlSession ss = DBService.getFactory().openSession();
			List<RegistrationVO> list = ss.selectList("college.proRegiInsert", rvo);
			System.out.println(list); 
			ss.close();
			return list;
		}
		
	//과목코드와 학생 아이디로 확인해서 점수 수정 
		public static  int proRegiUpdate(RegistrationVO rvo){
			int rst; 
			SqlSession ss = null;	
			try {	
				ss = DBService.getFactory().openSession();
				rst = ss.update("college.proRegiUpdate", rvo);
				ss.commit();
			} catch(Exception e){
				e.printStackTrace();
				return  -1;

			}
			finally {
				ss.close();
			}
			System.out.println(rst);
			return rst;
		}
}