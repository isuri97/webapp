package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginController")
public class LoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String un=request.getParameter("username");
        String pw=request.getParameter("password");

        if(un.equals("admin") && pw.equals("admin"))
        {
            response.sendRedirect("success");
            return;
        }
        else
        {
            response.sendRedirect("error");
            return;
        }
    }
}
