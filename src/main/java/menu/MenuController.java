package menu;

import model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @Autowired
    private MenuFetcher fetcher;

    @RequestMapping("/menu/day")
    public Menu getMenu() {
        return fetcher.fetchMenu();
    }

}