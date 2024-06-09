package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RespXLS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/vn.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=archivo.xls");
        PrintWriter out = response.getWriter();
        try {
            out.print("Respuesta generada desde Excel");
            out.print("100");
            out.print("200");
            out.print("La suma  es: \t");
            out.print("=suma(a2:a3");
        } finally {
            out.close();
        }
    }
}
