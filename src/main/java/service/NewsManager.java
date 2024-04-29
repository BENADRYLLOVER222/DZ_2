import java.util.ArrayList;
import java.util.List;

import bean.News;

public final class NewsManager {

    // Статический список новостей
    private static final List<News> newsList = new ArrayList<>();

    // Приватный конструктор для предотвращения создания экземпляров
    private NewsManager() {
        // Пустой приватный конструктор
    }
    
    static {
        newsList.add(new News("Базовый курс Java", "Идеальный курс для начинающих изучать Java с нуля.",
                "Дата начала: 1 июня | Длительность: 3 месяца | Стоимость: 30,000 руб.",
                "images/image.jpg"));
        newsList.add(new News("Продвинутый Java", "Углубленные знания Java для опытных разработчиков.",
                "Дата начала: 15 июля | Длительность: 2 месяца | Стоимость: 40,000 руб.",
                "images/image.jpg"));
        newsList.add(new News("Java для веб-разработки", "Курс охватывает серверную разработку на Java и фреймворки.",
                "Дата начала: 20 августа | Длительность: 4 месяца | Стоимость: 45,000 руб.",
                "images/image.jpg"));
    }

    // Метод для добавления новости
    public static synchronized void addNews(News news) {
        newsList.add(news);
    }

    // Метод для удаления новости по индексу
    public static synchronized void removeNews(int index) {
        if (index >= 0 && index < newsList.size()) {
            newsList.remove(index);
        }
    }

    // Метод для получения всех новостей
    public static synchronized List<News> getNewsList() {
        return new ArrayList<>(newsList); // Возвращаем копию списка
    }
    
    // Метод для получения новости по индексу
    public static synchronized News getNews(int index) {
        if (index >= 0 && index < newsList.size()) {
            return newsList.get(index);
        }
        return null;
    }
}