package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "DemoController", urlPatterns = {"/first"})
public class DemoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String a = request.getParameter("value1");
        String b = request.getParameter("value2");
        PrintWriter res = response.getWriter();

        String select = request.getParameter("Phep_Tinh");
        if (select.equals("Cong")) {

            try {
                int c = Integer.parseInt(a);
                int d = Integer.parseInt(b);
                int sum = c + d;

                res.println(sum);
            } catch (Exception e) {
                res.println("Please Enter A Number!!!");
            }

        } else if (select.equals("Tru")) {
            try {
                int c = Integer.parseInt(a);
                int d = Integer.parseInt(b);
                int dif = c - d;

                res.println(dif);
            } catch (Exception e) {
                res.println("Please Enter A Number!!!");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
