package com.emergentes;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;

public class RespPDF extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Document document = new Document();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            PdfWriter.getInstance(document, baos);
            document.open();
            document.add(new Paragraph("Este es un documento PDF generado desde un servlet."));

            document.add(new Paragraph("TECNOLOGIAS EMERGENTES",
                    FontFactory.getFont("arial", 22, Font.ITALIC, BaseColor.CYAN)));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "inline; filename=ejemplo.pdf");
        response.getOutputStream().write(baos.toByteArray());
    }
}
