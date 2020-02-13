package com.ams;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.ams.controllers" })

public class ServletConfig implements WebMvcConfigurer {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/",".jsp");
	}

	// Configuration to render STATIC CONTENTS (IMAGE, CSS, JS)
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		// Register resource handler for -

		// IMAGES
		registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/resources/");

		// CSS
		registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/resources/");

		// JAVASCRIPT
		registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/resources/");

		// Plugins
		registry.addResourceHandler("/plugins/**").addResourceLocations("/WEB-INF/resources/plugins/");

		// Dist
		registry.addResourceHandler("/dist/**").addResourceLocations("/WEB-INF/resources/dist/");
	}

}
