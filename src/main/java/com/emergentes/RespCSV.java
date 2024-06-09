package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RespCSV extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/csv");
        response.setHeader("Content-Disposition", "attachment;filename=archivo.csv");
        PrintWriter out = response.getWriter();
        try {
            out.println("id;tnombre;apellido;edad");
            out.println("1;Luis;Choque;21");
            out.println("2;Alfredo;Canaviri;25");
            out.println("3;Nataly;Alavi;26");
        } finally {
            out.close();
        }
    }

}
