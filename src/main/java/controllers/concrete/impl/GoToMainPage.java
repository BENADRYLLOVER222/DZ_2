package controllers.concrete.impl;

import java.io.IOException;
import java.util.List;

import bean.News;
import controllers.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import service.InfoService;
import service.ServiceProvider;

public class GoToMainPage implements Command{
	private final InfoService infoService = ServiceProvider.getInstance().getInfoService();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = (HttpSession) request.getSession(false);
		
		if(session != null && session.getAttribute("user") != null) {
			List<News> mainNews  = infoService.lastNews();
			request.setAttribute("mainNews", mainNews);
		    for (News news : mainNews) {
		        System.out.println("Title: " + news.getTitle());
		        System.out.println("Brief: " + news.getBrief());
		        System.out.println("Info: " + news.getInfo());
		        System.out.println("Image Path: " + news.getImgPath());
		        System.out.println("-----------------------------");
		    }

			request.setAttribute("invitationMessage", "Hello, user!");

			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/news.jsp");
			dispatcher.forward(request, response);
		}else {
			
			response.sendRedirect("MyController?command=go_to_index_page&authError=You cannot perform this action. Please log in!");
		}
		
	}

}
