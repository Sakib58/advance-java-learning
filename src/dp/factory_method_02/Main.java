package dp.factory_method_02;

public class Main {
    public static void main(String[] args) {
        String selectedRestaurant = "indiana";
        RestaurantFactory restaurantFactory = new RestaurantFactory();
        IRestaurant restaurant = restaurantFactory.createRestaurant(selectedRestaurant);
        System.out.println(restaurant.getName());
        restaurant.getMenus().forEach(menu -> System.out.println(menu));
    }
}
