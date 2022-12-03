package com.unab.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.unab.app.security.filter.JWTAuthenticationFilter;

@EnableGlobalMethodSecurity(securedEnabled=true, prePostEnabled=true)
@SuppressWarnings("deprecation")
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private RepositoryUserDetailService userDetailsService;

	@Autowired
	private IJWTService jwtService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			//.httpBasic()
//			.authorizeRequests()
//			.antMatchers(HttpMethod.POST, "/clientes**").permitAll()
//			.and()
			.authorizeRequests()
			.anyRequest().authenticated()
			.and()
			.addFilter(new JWTAuthenticationFilter(authenticationManager(), jwtService))
			.csrf()
			.disable()
			.sessionManagement();
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder build) throws Exception{
		build.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder);
	}
}