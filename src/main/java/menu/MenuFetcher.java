package menu;

import com.google.common.base.CharMatcher;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

public class MenuFetcher {

    private final String CONNECTION_ERROR_MESSAGE = "Unable to connect to website";
    private final String FETCH_ERROR_MESSAGE = "Unable to fetch data from website, Maybe the website has changed.";
    private final String WEBSITE_URL = "https://www.cobie.de/speisekarte";

    public Menu fetchMenu() {
        Document doc = null;

        try {
            doc = Jsoup.connect(WEBSITE_URL).get();
        } catch (HttpStatusException ex) {
            throw new RuntimeException(ex.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(CONNECTION_ERROR_MESSAGE);
        }

        if (doc == null)
            throw new RuntimeException(CONNECTION_ERROR_MESSAGE);

        Element dishes = doc.getElementById("post-1545");

        if (dishes == null)
            throw new RuntimeException(FETCH_ERROR_MESSAGE);

        Elements dishType = dishes.getElementsByTag("h3");
        Elements dishDescription = dishes.getElementsByClass("cobie-product-description");
        Elements dishPrice = dishes.getElementsByClass("price");
        if (dishType == null || dishDescription == null || dishPrice == null)
            throw new RuntimeException(FETCH_ERROR_MESSAGE);

        Menu menu = new Menu();

        for (int i = 1; i < dishType.size(); i++) {
            Element link = dishType.get(i);

            //break if the items is from next day
            if (link.attr("class").equals("dayheadline"))
                break;

            String addons = CharMatcher.is(',').or(CharMatcher.digit()).retainFrom(link.text());
            String type = CharMatcher.is(' ').or(CharMatcher.javaLetter()).retainFrom(link.text());
            String price = dishPrice.get(i - 1).text();
            String description = dishDescription.get(i - 1).text().replace("\"", "");

            Dish dish = new Dish(type, description, addons, price);

            menu.insertDish(dish);
        }

        return menu;

    }
}
