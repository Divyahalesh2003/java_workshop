package com.xworkz.playo.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/validate")
public class PlayoServlet extends HttpServlet {
    public class PlayoServlet() {
            System.out.println("PlayoServlet created now it can handle the"+"request and response");
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("doGet method invoked");
    }
}



