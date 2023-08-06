package dp.singleton_01;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager configurationManager;
    private Map<String, String> configurations;

    public ConfigurationManager() {
        configurations = new HashMap<>();
        configurations.put("api-key","welcome-to-dp-123");
        configurations.put("max-thread-pool","100");
    }

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public String getConfigValue(String key) {
        return configurations.get(key);
    }
}
