package com.notahmed.jpa_rest_product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {


    // use the same format from application.properties file
    // Now it will take from the database
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.httpBasic(Customizer.withDefaults());
        http.csrf(csrf -> csrf.disable());

//        Allow endpoints without authentication
//        http.authorizeHttpRequests(
//                        request -> request.requestMatchers("/**").permitAll()
//                );

//        Allow all endpoints with any authentication
//        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());


//        All users with ADMIN Role only
//        http.authorizeHttpRequests(
//                request -> request.requestMatchers("/**")
//                        .hasAnyRole("ADMIN")
//        );


//        authorization for multiple endpoints
        http.authorizeHttpRequests(
                request ->
                        request
                                .requestMatchers(HttpMethod.GET, "/products", "/products/**").permitAll()
                                .requestMatchers(HttpMethod.POST, "/products").hasAnyRole("ADMIN", "USER")
                                .requestMatchers(HttpMethod.PUT, "/products/**").hasAnyRole("ADMIN", "USER")
                                .requestMatchers(HttpMethod.DELETE, "/products/**").hasRole("ADMIN")
        );


        return http.build();
    }

}
