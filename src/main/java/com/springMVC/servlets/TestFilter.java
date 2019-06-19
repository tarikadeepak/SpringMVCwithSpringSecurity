package com.springMVC.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

// Implements Filter class
public class TestFilter implements Filter  {
   public void  init(FilterConfig config) throws ServletException {
      
      // Get init parameter 
      String testParam = config.getInitParameter("name"); 

      //Print the init parameter 
      System.out.println("Test Param"); 
   }
   
   public void  doFilter(ServletRequest request, ServletResponse response,
      FilterChain chain) throws java.io.IOException, ServletException {

      // Get the IP address of client machine.
      String ipAddress = request.getRemoteAddr();

      // Log the IP address and current timestamp.
      System.out.println("IP "+ ipAddress + ", Time " + new Date().toString());

      // Pass request back down the filter chain
      chain.doFilter(request,response);
   }

   public void destroy( ) {
	   System.out.println("Test Filter Leaving");
      /* Called before the Filter instance is removed from service by the web container*/
   }
}