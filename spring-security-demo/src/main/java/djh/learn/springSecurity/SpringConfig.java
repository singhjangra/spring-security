package djh.learn.springSecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "djh.learn")
@EnableWebMvc
public class SpringConfig {

	@Bean
	 public ViewResolver configureViewResolver() {
	     InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
	     viewResolve.setPrefix("/WEB-INF/view/");
	     viewResolve.setSuffix(".jsp");
	 
	     return viewResolve;
	 }
}
