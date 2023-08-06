package dp.factory_method_02;

import java.util.ArrayList;
import java.util.List;

public class IndianaRestaurant implements IRestaurant{
    private String name;
    private List<String> menus;

    public IndianaRestaurant() {
        name = "Indiana Restaurant";
        menus = new ArrayList<>();
        menus.add("Indiana menu 1");
        menus.add("Indiana menu 2");
        menus.add("Indiana menu 3");
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
