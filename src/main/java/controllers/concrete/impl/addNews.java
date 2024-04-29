package controllers.concrete.impl;

import java.io.IOException;
import java.util.List;

import bean.News;
import controllers.concrete.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.InfoService;
import service.ServiceProvider;

public class addNews implements Command {
	 private final InfoService infoService = ServiceProvider.getInstance().getInfoService();

	    @Override
	    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	List<News> mainNews  = infoService.lastNews();
			request.setAttribute("mainNews", mainNews);
	        // Получаем данные из формы
	        String title = request.getParameter("title");
	        String brief = request.getParameter("brief");
	        String info = request.getParameter("info");
	        String imagePath = request.getParameter("image");
	        String fullText = request.getParameter("full_text");

	        // Создаем экземпляр News с полученными данными
	        News news = new News(title, brief, info, imagePath);
	        // Добавляем новость в сервис
	        infoService.addNews(news);

	        // Перенаправляем на страницу с новостями после успешного добавления
	        response.sendRedirect("MyController?command=go_to_main_page");
	    }
}
