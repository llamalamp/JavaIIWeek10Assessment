package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.WineBottle;

/**
 * @author kenne-krcutkomp
 * CIS175 - Fall 2022
 */
@Configuration
public class BeanConfiguration {

	@Bean
	public WineBottle bottle() {
		WineBottle bean = new WineBottle();
		String b = bean.getBrand();
		return bean;
	}

}
