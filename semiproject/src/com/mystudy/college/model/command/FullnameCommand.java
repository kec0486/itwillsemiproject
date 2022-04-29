package com.mystudy.model.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FullnameCommand implements Command{
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//fullname.jsp 페이지로 응답처리
		//request.getRequestDispatcher("fullname.jsp").forward(request, response);
		return "fullname.jsp";
	}
}
