package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import controller.Starter;

/**
 * Created by Satyarth on 30/11/16.
 */
@Configuration
@ComponentScan(basePackages = {"config","controller"})
public class Config {

  private Starter starter;
}
