package Action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginAction extends ActionSupport {

/*    @Override
    public String  execute() throws Exception{
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        System.out.println(2222222);
        if (username.equals("admin")&&password.equals("123456")){
            session.setAttribute("username",username);
            System.out.println(111111);
            System.out.println(session.getAttribute("username"));
            return "success";
        }else {
            System.out.println(username);
            System.out.println(password);
            return "error";
        }
    }*/
    public String logintext(){
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin")&&password.equals("123456")){
            session.setAttribute("username",username);
            System.out.println(session.getAttribute("username"));
            return "success";
        }else {
            System.out.println(username);
            System.out.println(password);
            return "error";
        }
    }
}
