package p1;

import jdbc_demo.SDetailsDTO;
import jdbc_demo.SchoolDAOB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/student")
@Controller
public class FirstController {

    /*
    @RequestMapping("/")
    public String getUrl(){
        return "index";
        }
     */
        /*In spring-servlet.xml,
         * <property name="prefix" value="/WEB-INF/jsp/" />
         *  <property name="suffix" value=".jsp" />
         *  we want the srting "index" to be joined to the property name. so that the page's name
         * ie. "index.jsp" will be formed and loaded.*/
// ----------------------------------------------------------------------------------------------------------------


    SchoolDAOB daob = new SchoolDAOB();


    // Let's use request mapping with value and method.
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getUrl(){
        return "index";
    }

    @RequestMapping(value = "/displayStudent/{sid}", method = RequestMethod.GET)
    public String displayStudent(@PathVariable String sid, Model model) throws Exception{
        SDetailsDTO dto = SchoolDAOB.getAnyStudent(sid);
        model.addAttribute("student", dto);
        return "display student";
    }

    @RequestMapping(value = "/display/{name}", method = RequestMethod.GET)
    public String display(@PathVariable String name, Model model){
        model.addAttribute("name", name);
        return "display name";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String getStudentDetails(){
        return "student";
    }

//    @RequestMapping(value = "/insert", method = RequestMethod.POST)
//    public String addStudentDetails(@RequestBody SDetailsDTO dtoAdd, Model model) throws Exception {
//        daob.insertStudentDetailsRecord(dtoAdd);
//        model.addAttribute("msg", "Record Added" + dtoAdd.getSid());
//        return "student";
//    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String addStudentDetails(SDetailsDTO dtoAdd, Model model) throws Exception {
        daob.insertStudentDetailsRecord(dtoAdd);
        model.addAttribute("msg", "Record Added" + dtoAdd.getSid());
        return "student";
    }
}
