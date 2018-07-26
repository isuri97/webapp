package org.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;

public class GetClaimServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        if(isLogin(req)) {
            String callBackUrl = req.getParameter("callbackUrl");

            String cityClaim = "Colombo";
            String mobileNumber = "094344442244";

            req.setAttribute("cityClaim", cityClaim);
            req.setAttribute("mobileNumber", mobileNumber);

            String responseUrl = URLDecoder.decode(callBackUrl, "UTF-8") +
                    "&success=" + "true" +
                    "&cityClaim=" + cityClaim +
                    "&mobileNumber=" + mobileNumber;

            System.out.println(responseUrl);
        }
        //resp.sendRedirect(responseUrl);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    private boolean isLogin(HttpServletRequest request){
        String authorization = request.getHeader("AUTHORIZATION");
//        if(username == and password && password == ){

            return true;
        }
//       return false;
//    }
}
