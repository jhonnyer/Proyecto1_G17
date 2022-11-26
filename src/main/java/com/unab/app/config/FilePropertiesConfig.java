package com.unab.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource({"classpath:mensajes.properties"})
})
public class FilePropertiesConfig {
	
}
