package Form;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class Form2DemoAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
    //第二种方式 使用ServletAction类获取
        //1 使用ServletActionContext获取request对象
        HttpServletRequest request= ServletActionContext.getRequest();
        //2 调用request里面的方法得到结果
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address= request.getParameter("address");

        System.out.println(username+" "+password+" "+address);
        return NONE;
    }
}
