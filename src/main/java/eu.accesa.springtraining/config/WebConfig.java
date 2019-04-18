package eu.accesa.springtraining.config;

import eu.accesa.springtraining.auth.AuthorizationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    private static final Logger log = LoggerFactory.getLogger(WebConfig.class);


    @Bean
    public FilterRegistrationBean registerExternalAuthFilter() {
        FilterRegistrationBean reg = new FilterRegistrationBean();
	    reg.setFilter(new AuthorizationFilter());
        reg.setName("authFilterExternal");
        reg.addUrlPatterns("/*");
        return reg;
    }

}