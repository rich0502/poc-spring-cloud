package security;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity(prePostEnabled = true)
//public class SecurityConfig {
//
//    private JwtAuthConverter jwtAuthConverter;
//
//    public SecurityConfig(JwtAuthConverter jwtAuthConverter) {
//        this.jwtAuthConverter = jwtAuthConverter;
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
//        return httpSecurity
//                .sessionManagement(sm -> sm.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                //.csrf(csrf -> csrf.disable())
////                .authorizeHttpRequests(ar -> ar.requestMatchers("/customers/**").hasAnyAuthority("USER"))
//                //.authorizeHttpRequests(ar -> ar.requestMatchers("/swagger-ui/**").permitAll())
//                .authorizeHttpRequests(ar -> ar.anyRequest().authenticated())
//                .oauth2ResourceServer(ors -> ors.jwt(jwtConfigurer -> jwtConfigurer.jwtAuthenticationConverter(jwtAuthConverter)))
//                .csrf(csrf->csrf.ignoringRequestMatchers("/swagger-ui/**"))
//                .build();
//    }
//}
