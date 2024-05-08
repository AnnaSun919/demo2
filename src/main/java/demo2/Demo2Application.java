package demo2;


import java.util.Arrays;

import javax.servlet.ServletContext;


import javax.servlet.ServletContext;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.servlet.OAuth2ClientAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import ch.qos.logback.ext.spring.web.LogbackConfigListener;
import ch.qos.logback.ext.spring.web.WebLogbackConfigurer;

import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude =  {DataSourceAutoConfiguration.class })
@EnableAutoConfiguration(exclude = {
		DataSourceAutoConfiguration.class
	})
public class Demo2Application extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		
	}
	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(Demo2Application.class);
//	}
	
//	@Override
//	protected WebApplicationContext createRootApplicationContext(ServletContext servletContext) {
//		WebApplicationContext rootAppContext = super.createRootApplicationContext(servletContext);
//		
//		Environment env = rootAppContext.getEnvironment();
//        String envStr = StringUtils.EMPTY;
//        
//        if(env.getActiveProfiles().length != 0 && !env.getActiveProfiles()[0].equalsIgnoreCase("predev") && !env.getActiveProfiles()[0].equalsIgnoreCase("default"))  {
//            envStr = "." + env.getActiveProfiles()[0];
//        }
//        
//        servletContext.setInitParameter(WebLogbackConfigurer.CONFIG_LOCATION_PARAM, String.format("classpath:logback%s.xml", envStr));
//		servletContext.setInitParameter(WebLogbackConfigurer.EXPOSE_WEB_APP_ROOT_PARAM, String.valueOf(false));
//		servletContext.addListener(new LogbackConfigListener()); //listener to split log config
//		//servletContext.addListener(new SessionListener(env.getProperty("server.session.timeout"))); //listener to enable session timeout
//		servletContext.setInitParameter("dispatchOptionsRequest", "true");
//		return rootAppContext;
//	}
	
//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}
//
//		};
//	}
	


}
