package com.mystudy.college.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.college.model.command.Command;
import com.mystudy.college.model.command.ProSelectCommand;
import com.mystudy.college.model.command.ProUpdateCommand;
import com.mystudy.college.model.command.lectureSelectCommand;
import com.mystudy.college.model.command.proUpdateListCommand;
import com.mystudy.college.model.command.professorSelectListCommand;
import com.mystudy.college.model.command.prolectureSelectListCommand;

@WebServlet("/controller")
public class FrontControllerCommand extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(">> FrontControllerCommand.doGet() 실행~~");
		String type = request.getParameter("type");

		Command command = null;

		if ("list".equals(type)) { // 교수 개인 정보 조회
			command = new ProSelectCommand();
		} else if ("professorSelectList".equals(type)) { //조회결과 
			command = new professorSelectListCommand();
		} else if ("professorUpdate".equals(type)) { //교수 개인정보 수정 요청 
			command = new ProUpdateCommand();
		} else if ("professorUpdateList".equals(type)) { //교수 개인정보 수정 확인 요청
			command = new proUpdateListCommand();
		} else if ("prolectureSelect".equals(type)) { //교수 개인정보 수정 확인 요청
			command = new lectureSelectCommand();
		} else if ("prolectureSelectList".equals(type)) { //교수 개인정보 수정 확인 요청
			command = new prolectureSelectListCommand();
		}
		
		String path = command.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println(">> FrontControllerCommand.doPost() 실행~~");
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
