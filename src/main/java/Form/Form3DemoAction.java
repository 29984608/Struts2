package Form;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

public class Form3DemoAction extends ActionSupport implements ServletRequestAware {
    private HttpServletRequest request =null;
    public void setServletRequest(HttpServletRequest httpServletRequest) {
    this.request = request;
    }

    @Override
    public String execute() throws Exception {
        String username= request.getParameter("username");
        System.out.println(username);
        return NONE;
    }
}
