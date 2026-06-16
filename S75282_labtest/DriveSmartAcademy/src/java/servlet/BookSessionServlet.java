package servlet;

import bean.SessionBean;
import dao.SessionDAO;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/BookSessionServlet")
public class BookSessionServlet
extends HttpServlet {

    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)

            throws ServletException,
            IOException {

        String student =
        request.getParameter("student_name");

        String branch =
        request.getParameter("branch_location");

        String lesson =
        request.getParameter("lesson_type");

        SessionBean session =
                new SessionBean();

        session.setStudent_name(student);
        session.setBranch_location(branch);
        session.setLesson_type(lesson);
        session.setStatus("Booked");

        SessionDAO dao =
                new SessionDAO();

        dao.bookSession(session);

        response.sendRedirect(
                "ScheduleServlet");
    }
}