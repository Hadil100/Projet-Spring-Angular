package com.example.demo;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableDiscoveryClient

public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
	/* @Bean
	    public CorsFilter corsFilter()
	    {
	        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        final CorsConfiguration corsConfiguration = new CorsConfiguration();
	        corsConfiguration.setAllowCredentials(true);
	        corsConfiguration.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));
	        corsConfiguration.setAllowedHeaders(Collections.singletonList("*"));
	        corsConfiguration.setAllowedMethods(Arrays.asList("GET","POST","PUT","PATCH","DELETE","OPTIONS"));
	        source.registerCorsConfiguration("/**",corsConfiguration);
	        return new CorsFilter(source);
	   
	    }     */
	@Bean
	DiscoveryClientRouteDefinitionLocator definitionLocator(
	ReactiveDiscoveryClient rdc, 
	DiscoveryLocatorProperties dlp)
	{
	return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
	}


}
