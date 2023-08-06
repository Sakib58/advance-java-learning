package dp.singleton_01;

public class App {
    public static void main(String[] args) {
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();
        System.out.println(configurationManager.getConfigValue("api-key"));
    }
}
