package com.spring.user_rating.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        http.csrf(c->c.disable())
                .authorizeHttpRequests(request->request.requestMatchers("/index")
                        .permitAll().requestMatchers("/user-page")
                        .hasAuthority("StarRating").requestMatchers("/category").permitAll()
                        .requestMatchers("/index","/css/**")
                        .permitAll().anyRequest().authenticated())

                .formLogin(form-> form.loginPage("/login").loginProcessingUrl("/login")
                        .permitAll())


                .logout(form->form.invalidateHttpSession(true).clearAuthentication(true)
                        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                        .logoutSuccessUrl("/login?logout").permitAll());

        return  http.build();
    }

}
