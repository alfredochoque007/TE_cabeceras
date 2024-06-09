package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RespJSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");

        PrintWriter out = response.getWriter();
        try {
            out.println("{\"empleados\":[");
            out.println("{\"nombre\":\"Bruno\",\"apellido\":\"Diaz\"},");
            out.println("{\"nombre\":\"Juan Jose\",\"apellido\":\"Paredes\"},");
            out.println("{\"nombre\":\"Dolores\",\"apellido\":\"Fuentes\"},");
            out.println("]}");
        } finally {
            out.close();
        }
    }

}
