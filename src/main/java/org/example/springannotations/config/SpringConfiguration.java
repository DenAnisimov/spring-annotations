package org.example.springannotations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.springannotations")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfiguration {
}
