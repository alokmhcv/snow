//package com.luv2code.springboot.cruddemo.security;
//
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class DemoSecurityConfig {
//	
//	@Bean
//	public UserDetailsManager userDtMn(DataSource dataSource) {
//		
//		
//		return new JdbcUserDetailsManager(dataSource);
//		
//	}
//
//	//This bean will provide In Memory user accounts. Now commented out as we will be using Database to get the user accounts.
////	@Bean
////	public InMemoryUserDetailsManager userDetailsManager() {
////		UserDetails john=User.builder()
////							.username("john")
////							.password("{noop}testp123")
////							.roles("EMPLOYEE")
////							.build();
////		
////		UserDetails pixma=User.builder()
////				.username("pixma")
////				.password("{noop}testp123")
////				.roles("EMPLOYEE","MANAGER")
////				.build();
////		
////		UserDetails soumya=User.builder()
////				.username("soumya")
////				.password("{noop}testp123")
////				.roles("EMPLOYEE","MANAGER","ADMIN")
////				.build();
////		
////		return new InMemoryUserDetailsManager(john,pixma,soumya);
////	}
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception
//	{
//		httpSecurity.authorizeHttpRequests(configurer->
//				configurer
//					.requestMatchers(HttpMethod.GET,"/api/employees").hasRole("EMPLOYEE")
//					.requestMatchers(HttpMethod.GET,"/api/employees/**").hasRole("EMPLOYEE")
//					.requestMatchers(HttpMethod.POST,"/api/employees").hasRole("MANAGER")
//					.requestMatchers(HttpMethod.PUT,"/api/employees").hasRole("MANAGER")
//					.requestMatchers(HttpMethod.DELETE,"/api/employees/**").hasRole("ADMIN")
//				
//		);
//		httpSecurity.httpBasic();
//		httpSecurity.csrf().disable();
//		return httpSecurity.build();
//	}
//}
