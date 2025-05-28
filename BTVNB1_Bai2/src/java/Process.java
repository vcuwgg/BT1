
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/process"})
public class Process extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tk = request.getParameter("taikhoan");
        String mk = request.getParameter("matkhau");
        PrintWriter res = response.getWriter();
        if (tk.equals("Admin") && mk.equals("123")) {
            res.println("Login Successfully!!!");
        } else {
            res.println("Login Failed!!");
        }
    }

}
