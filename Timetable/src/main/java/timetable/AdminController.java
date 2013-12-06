package timetable;
 
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class AdminController {
 
    @Autowired
    private AdminDao adminDao;
 
    @RequestMapping(value="/admin")
    public ModelAndView timetable(HttpServletRequest request) {
        // Handle a new guest (if any):
        String course = request.getParameter("course");
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        String duration = request.getParameter("duration");
        String repeatFreq = request.getParameter("repeatFreq");
        String lecturer = request.getParameter("lecturer");
        String maxAtt = request.getParameter("maxAtt");
        String compulsory = request.getParameter("compulsory");
        String venue = request.getParameter("venue");
        if ((course != null) && (date != null) && (time != null) && (duration != null) && (repeatFreq != null) && (lecturer != null) && (maxAtt != null)&& (compulsory != null) && (venue != null))
            adminDao.persist(new Admin(course, date, time, duration, repeatFreq, lecturer, maxAtt, compulsory, venue));
 
        // Prepare the result view (guest.jsp):
        return new ModelAndView("admin.jsp", "adminDao", adminDao);
    }
}