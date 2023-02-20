package murach.email;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import murach.business.User;

import java.io.IOException;

@WebServlet(name = "EmailListServlet2", value = "/emailList")
public class EmailListServlet2 extends HttpServlet {
    @Override

    protected  void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.html";

        String action = request.getParameter("action");
        if (action == null  )
        {
            action = "join";
        }


        if (action.equals("join")) {
            url = "/index.jsp";
        }
//        else if(action.equals("Return")) {
//            url = "/index.jsp";
//
//            getServletContext().getRequestDispatcher(url)
//                    .forward(request, response);
//        }
        else if (action.equals("add")) {
            // get parameter from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            //store data i user object and save user object in db
            User user = new User(firstName, lastName, email);
            //UserDB.insert(user);

            request.setAttribute("user", user);
            url = "/thanks.jsp";

        }
//        else {
//            url = "/index.jsp";
//        }


        getServletContext().getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

}
