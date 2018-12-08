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

@RestController
public class MenuController {


    @RequestMapping("/menu/day")
    public Menu getMenu() {

        MenuFetcher fetcher=new MenuFetcher();

        System.out.println("execute curl localhost:8080/menu/day");

        return fetcher.fetchMenu();

    }
}