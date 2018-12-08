package menu;

import model.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {


    @RequestMapping("/menu/day")
    public Menu getMenu() {

        MenuFetcher fetcher=new MenuFetcher();

        System.out.println("execute curl localhost:8080/menu/day");

        return fetcher.fetchMenu();

    }
}