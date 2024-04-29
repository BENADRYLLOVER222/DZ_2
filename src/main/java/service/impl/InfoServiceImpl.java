package service.impl;

import java.util.ArrayList;
import java.util.List;

import bean.News;
import service.InfoService;


public class InfoServiceImpl implements InfoService {

	@Override
	public List<News> lastNews() {
		List<News> news = new ArrayList<News>();

		news.add(new News("Базовый курс Java", "Идеальный курс для начинающих изучать Java с нуля.",
				"Дата начала: 1 июня | Длительность: 3 месяца | Стоимость: 30,000 руб.",
				"images/image.jpg"));
		news.add(new News("Продвинутый Java", "Углубленные знания Java для опытных разработчиков.",
				"Дата начала: 15 июля | Длительность: 2 месяца | Стоимость: 40,000 руб.",
				"images/image.jpg"));
		news.add(new News("Java для веб-разработки", "Курс охватывает серверную разработку на Java и фреймворки.",
				"Дата начала: 20 августа | Длительность: 4 месяца | Стоимость: 45,000 руб.",
				"images/image.jpg"));

		return news;
	}
	
	  @Override
	    public void addNews(News someNew) {
		  List<News> news = new ArrayList<News>();
			news.add(new News("Базовый курс Java", "Идеальный курс для начинающих изучать Java с нуля.",
					"Дата начала: 1 июня | Длительность: 3 месяца | Стоимость: 30,000 руб.",
					"images/image.jpg"));
			news.add(new News("Продвинутый Java", "Углубленные знания Java для опытных разработчиков.",
					"Дата начала: 15 июля | Длительность: 2 месяца | Стоимость: 40,000 руб.",
					"images/image.jpg"));
			news.add(new News("Java для веб-разработки", "Курс охватывает серверную разработку на Java и фреймворки.",
					"Дата начала: 20 августа | Длительность: 4 месяца | Стоимость: 45,000 руб.",
					"images/image.jpg"));
			news.add(someNew);
	        
	    }

}
