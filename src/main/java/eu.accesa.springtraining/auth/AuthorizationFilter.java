package eu.accesa.springtraining.auth;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by boga@mediamarktsaturn.com on 1/16/18.
 */
public class AuthorizationFilter implements Filter {

    private static final Logger log = LoggerFactory.getLogger(AuthorizationFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("on the way in");
        String name = request.getParameter("name");
//        if(((HttpServletRequest)request).getHeader("JWT") == null) {
//            ((HttpServletResponse) response).sendError(HttpServletResponse.SC_BAD_REQUEST, "Headerismissing");
//        } else {
//            log.info("NUMELE: {}",name);
            chain.doFilter(request, response);
            System.out.println("on the way out");
//        }
    }

    @Override
    public void destroy() {

    }
}