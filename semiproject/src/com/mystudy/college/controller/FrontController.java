package com.mystudy.college.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.college.model.dao.EmployeeDAO;
import com.mystudy.college.model.dao.LectureDAO;
import com.mystudy.college.model.vo.EmployeeVO;
import com.mystudy.college.model.vo.LectureVO;


@WebServlet("/lecture_insert_ok")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String department = request.getParameter("department");
		String categorize = request.getParameter("categorize");
		String year = request.getParameter("year");
		String semester = request.getParameter("semester");
		String name = request.getParameter("name");
		String professor = request.getParameter("professor");
		int credit = Integer.parseInt(request.getParameter("credit"));
		System.out.println(id+  department+  categorize+ year+ semester+ name+ professor+ credit);
		
		LectureVO vo = new LectureVO(id, department, categorize, year, semester, name, professor, credit);
			//1. DB데이터 조회하고 가져오기
			  LectureDAO.Insert_Lecture(vo);
			
			request.getRequestDispatcher("lecture_list.jsp").forward(request, response);
		}
	}



