package dp.factory_method_02;

import java.util.ArrayList;
import java.util.List;

public class ChineseRestaurant implements IRestaurant{
    private String name;
    private List<String> menus;

    public ChineseRestaurant() {
        name = "Chinese Restaurant";
        menus = new ArrayList<>();
        menus.add("Chinese menu 1");
        menus.add("Chinese menu 2");
        menus.add("Chinese menu 3");
        menus.add("Chinese menu 4");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getMenus() {
        return menus;
    }
}
