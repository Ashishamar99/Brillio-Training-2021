package p1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {

    @RequestMapping("/")
    public String getUrl(){
        return "index";
        /*In spring-servlet.xml,
         * <property name="prefix" value="/WEB-INF/jsp/" />
         *  <property name="suffix" value=".jsp" />
         *  we want the srting "index" to be joined to the property name. so that the page's name
         * ie. "index.jsp" will be formed and loaded.*/
    }

    @RequestMapping("/menu")
    public String getMenuUrl(){
        return "menu";
        /*In spring-servlet.xml,
         * <property name="prefix" value="/WEB-INF/jsp/" />
         *  <property name="suffix" value=".jsp" />
         *  we want the srting "index" to be joined to the property name. so that the page's name
         * ie. "index.jsp" will be formed and loaded.*/
    }
}
