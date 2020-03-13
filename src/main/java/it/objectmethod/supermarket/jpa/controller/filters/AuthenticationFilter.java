package it.objectmethod.supermarket.jpa.controller.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.objectmethod.supermarket.jpa.controller.beans.LoggedUsers;

@Component
public class AuthenticationFilter implements Filter {

	@Autowired
	LoggedUsers loggedUsers;
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest httpReq =  (HttpServletRequest) request;
		String url = httpReq.getRequestURI();
		
		System.out.println("stampa url: " + url);
		
		if(url.endsWith("login")) {
			System.out.println("richiesta approvata");
			chain.doFilter(request, response);

		}else {
			System.out.println("richiesta bloccata");

		}
		
		System.out.println("ciao sono il filtro");
	}

}
