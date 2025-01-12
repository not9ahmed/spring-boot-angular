package com.notahmed.mvc_jpa_crud_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        // "/auth/login" will be created by us
        // /authenticateUser will be endpoint

        // Allowing the logout endpoint to all
        // .logout(logout -> logout.permitAll());

        // base url will be accessible
        http.authorizeHttpRequests(request ->
                        request.requestMatchers("/", "/auth/**", "/css/**", "js/**")
                                .permitAll()
                                .anyRequest()
                                .authenticated()
        ).formLogin(form -> form.loginPage("/auth/login")
                .loginProcessingUrl("/authenticateUser")
                .permitAll()
        ).logout(logout -> logout.permitAll());


        // http.csrf(csrf -> csrf.disable());
        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
