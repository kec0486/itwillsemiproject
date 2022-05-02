package com.mystudy.college.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.mystudy.college.model.command.Command;
import com.mystudy.college.model.command.FullnameCommand;
import com.mystudy.college.model.command.FullnameListCommand;
import com.mystudy.college.model.command.ListCommand;
import com.mystudy.college.model.command.SearchCommand;


@WebServlet("/controller")
public class FrontControllerCommand extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> FrontControllerCommand.doGet() 실행~~");
		String type = request.getParameter("type");
		
		Command command = null;
		
		if ("list".equals(type)) {
			command = new ListCommand();
		}else if("fullname".equals(type)) {
			command = new FullnameCommand();
		}else if("fullnameList".equals(type)) {
			command = new FullnameListCommand();
		}else if("search".equals(type)) {
			command = new SearchCommand();
		}
		String path = command.exec(request, response);
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> FrontControllerCommand.doPost() 실행~~");
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}

}
