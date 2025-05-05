package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractApplication /*extends WebSecurityConfigurerAdapter*/ {

	public static void main(String[] args) {
		SpringApplication.run(AbstractApplication.class, args);
	}
	/*
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// @formatter:off
		http.authorizeRequests(a -> a
				.antMatchers("/", "/error", "/webjars/**").permitAll()
				.anyRequest().authenticated()
		).exceptionHandling(e -> e
				.authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
		).oauth2Login();
		// @formatter:on
	}*/

}
