package com.poly.servlet

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {
    "/home/index", 
    "/home/about", 
    "/home/contact",
    "/home/*"
})
public class HomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        String uri = request.getRequestURI();
        PrintWriter out = response.getWriter();
        
        if (uri.contains("/home/index")) {
            out.println("<h1>Welcome to Home Page</h1>");
        } else if (uri.contains("/home/about")) {
            out.println("<h1>About Us Page</h1>");
        } else if (uri.contains("/home/contact")) {
            out.println("<h1>Contact Page</h1>");
        } else {
            out.println("<h1>404 - Page Not Found</h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>POST method is called</h1>");
    }
}