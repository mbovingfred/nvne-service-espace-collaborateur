package fr.nvne.espacecollaborateur;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import fr.nvne.espacecollaborateur.entities.UserCollaborateur;

@Configuration
public class GlobalRepositoryRestConfigurer implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.setReturnBodyOnCreate(true);
		config.setReturnBodyOnUpdate(true);
		config.exposeIdsFor(UserCollaborateur.class);
		System.out.println("exposing ids ...");
		config.getCorsRegistry()
			.addMapping("/**")
			.allowedOrigins("https://www.nvne.fr")
			.allowedOrigins("https://admin.nvne.fr")
			.allowedOrigins("https://accounts.nvne.fr")
			.allowedOrigins("http://localhost:4201")
			.allowedOrigins("http://localhost:4202")
			.allowedHeaders("*")
			.allowedMethods("OPTIONS","HEAD","GET","PUT","POST","DELETE","PATCH");
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config);
	}
	
}
