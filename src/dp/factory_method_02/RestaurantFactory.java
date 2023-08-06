package dp.factory_method_02;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class RestaurantFactory {
    private Map<String, Supplier<IRestaurant>> restaurants;

    public RestaurantFactory() {
        restaurants = new HashMap<>();
        restaurants.put("chinese", ChineseRestaurant::new);
        restaurants.put("indiana", IndianaRestaurant::new);
    }

    public IRestaurant createRestaurant(String restaurantName) {
        Supplier<IRestaurant> restaurant = restaurants.get(restaurantName);
        if (restaurant != null) {
            return restaurant.get();
        } else {
            throw new IllegalArgumentException("Restaurant Not found!");
        }
    }

}
