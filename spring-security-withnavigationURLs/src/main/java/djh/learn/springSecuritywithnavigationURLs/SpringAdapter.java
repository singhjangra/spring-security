package djh.learn.springSecuritywithnavigationURLs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SpringAdapter extends WebSecurityConfigurerAdapter{
    
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
		.withUser(users.username("deepak").password("deepak").roles("EMPLOYEE"))
		.withUser(users.username("sunil").password("sunil").roles("EMPLOYEE","MANAGER"))
		.withUser(users.username("ajay").password("ajay").roles("EMPLOYEE","ADMIN","MANAGER"));
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers("/").hasRole("EMPLOYEE")
		.antMatchers("/leaders/**").hasRole("MANAGER")
		.antMatchers("/systems/**").hasRole("ADMIN").and()
		.formLogin().loginPage("/loginPage").loginProcessingUrl("/authenticateTheUser").permitAll()
		.and().logout().permitAll();
	}
}
