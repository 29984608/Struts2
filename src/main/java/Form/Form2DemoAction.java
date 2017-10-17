package Form;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Form2DemoAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
/*    //第二种方式 使用ServletAction类获取
        //1 使用ServletActionContext获取request对象
        HttpServletRequest request= ServletActionContext.getRequest();
        //2 调用request里面的方法得到结果
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address= request.getParameter("address");
        System.out.println(username+" "+password+" "+address);*/
        //操作三个域对象
         //1 request域
        HttpServletRequest request1 = ServletActionContext.getRequest();
        request1.setAttribute("req","reqValue");
        //2 session域
        HttpSession session= request1.getSession();
        session.setAttribute("sess","sessValue");
        //3 ServletContext域
        ServletContext context = ServletActionContext.getServletContext();
        context.setAttribute("contextname","contextValue");
        return "success";
    }
}
