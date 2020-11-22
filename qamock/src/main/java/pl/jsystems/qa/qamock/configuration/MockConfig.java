package pl.jsystems.qa.qamock.configuration;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class MockConfig {

    private static final Config CONFIG = ConfigFactory.load("qamockconfig.conf");
    private static final String ENVIRONMENT = CONFIG.getString("environment");
    private static final Config ENV = CONFIG.getConfig("environments").getConfig(ENVIRONMENT);

    public static final String HOST = ENV.getString("mock-host");
    public static final Integer PORT = ENV.getInt("mock-port");
    public static final String PATH = ENV.getString("base-path");


}
