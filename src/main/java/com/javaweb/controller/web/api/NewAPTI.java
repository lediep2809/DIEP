package com.javaweb.controller.web.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javaweb.model.NewModel;
import com.javaweb.model.UserModel;
import com.javaweb.service.IUserService;
import com.javaweb.service.impl.UserService;
import com.javaweb.utils.HttpUtil;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/api-new")
public class NewAPTI extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Inject
	private IUserService userService;



	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		UserModel userModel = HttpUtil.of(request.getReader()).toModel(UserModel.class);
		// userModel = UserService.save(userModel);
		mapper.writeValue(response.getOutputStream(), userModel);

	}
	
	/*
	 * protected void doPut(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * 
	 * }
	 * 
	 * protected void doDelete(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * 
	 * }
	 */
}
