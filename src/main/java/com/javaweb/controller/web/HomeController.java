package com.javaweb.controller.web;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaweb.constant.SystemConstant;
import com.javaweb.model.NewModel;
import com.javaweb.model.UserModel;
import com.javaweb.service.ICategoryService;
import com.javaweb.service.INewService;
import com.javaweb.service.IUserService;
import com.javaweb.utils.FormUtil;
import com.javaweb.utils.SessionUtil;

import java.io.IOException;
import java.util.ResourceBundle;

@WebServlet(urlPatterns = { "/trang-chu", "/dang-nhap", "/thoat","/dang-ky","/dang-phong" })
public class HomeController extends HttpServlet {

	@Inject
	private ICategoryService categoryService;
	
	@Inject
	private INewService newService;
	
	@Inject
	private IUserService userService;

	private static final long serialVersionUID = 1L;

	ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		NewModel model = new NewModel();
		model.setListResult(newService.findAll());
		request.setAttribute(SystemConstant.MODEL, model);

		// đăng nhập
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			String alert = request.getParameter("alert");
			String message = request.getParameter("message");
			if (message != null && alert != null) {
				request.setAttribute("message", resourceBundle.getString(message));
				request.setAttribute("alert", alert);
			}
			RequestDispatcher rd = request.getRequestDispatcher("/view/login.jsp");
			rd.forward(request, response);
		} else if (action != null && action.equals("logout")) {
			SessionUtil.getInstance().removeValue(request, "USERMODEL");
			response.sendRedirect(request.getContextPath()+"/trang-chu");
		}else if (action != null && action.equals("register")) {
			RequestDispatcher rd = request.getRequestDispatcher("/view/register.jsp");
			rd.forward(request, response);
		}else if(action != null && action.equals("post-room")){
			RequestDispatcher rd = request.getRequestDispatcher("/view/post-room.jsp");
			rd.forward(request, response);
		}
		else {
			request.setAttribute("categories", categoryService.findAll());
			RequestDispatcher rd = request.getRequestDispatcher("/view/web/home.jsp");
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action != null && action.equals("login")) {
			UserModel model = FormUtil.toModel(UserModel.class, request);
			model = userService.findByUserNameAndPasswordAndStatus(model.getUserName(), model.getPassword(), 1);
			if(model !=null) {
				SessionUtil.getInstance().putValue(request, "USERMODEL", model);
				if(model.getRole().getCode().equals("USER")) {
					response.sendRedirect(request.getContextPath() + "/trang-chu");
				}else if (model.getRole().getCode().equals("ADMIN")) {
					response.sendRedirect(request.getContextPath() + "/admin-home");
				}
			}else {
				response.sendRedirect(request.getContextPath() + "/dang-nhap?action=login&message=not_permission&alert=danger");
				
			}
				
		}
	}
}
