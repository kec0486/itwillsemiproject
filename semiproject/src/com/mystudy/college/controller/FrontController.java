package com.mystudy.college.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.college.model.dao.EmployeeDAO;
import com.mystudy.college.model.vo.EmployeeVO;

//@WebServlet("/controller")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> FrontController.doGet() 실행~~");
		String type = request.getParameter("type");
		
		if ("list".equals(type)) {
			//1. DB연결하고 전체 데이터 가져오기
			List<EmployeeVO> list = EmployeeDAO.getList();
			//2. 응답페이지(list.jsp)에 데이터 전달
			request.setAttribute("list", list);
			//3. 응답페이지(list.jsp)로 화면 이동(전환)
			request.getRequestDispatcher("list.jsp").forward(request, response);
		}else if ("fullname".equals(type)) {
			//fullname.jsp 페이지로 응답처리
			request.getRequestDispatcher("fullname.jsp").forward(request, response);
		}else if ("fullnameList".equals(type)) {
			//0. 파라미터 값 추출(확인)
			String fullname = request.getParameter("fullname");
			
			//1. DB데이터 조회하고 가져오기
			List<EmployeeVO> list = EmployeeDAO.fullnameList(fullname);
			//2. DB데이터 request scope 에 저장
			request.setAttribute("list", list);
			//3. fullnameList.jsp 페이지로 위임(전달) 처리
			request.getRequestDispatcher("fullnameList.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> FrontController.doPost() 실행~~");
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
