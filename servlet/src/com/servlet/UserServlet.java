package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.User;
import com.service.Userservice;
import com.util.Jsonwriter;
import com.vo.Jsonresult;

@WebServlet("/user/findById")
public class UserServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id =req.getParameter("uid");
		
		Userservice u =new Userservice();
		User user =u.find(id);
		
		Jsonresult jsonresult =new Jsonresult("200","³É¹¦",user);
		Jsonwriter.write(resp, jsonresult);
		
		
	}
}
