package Form;

import com.opensymphony.xwork2.ActionSupport;
import entity.User;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class Form4DemoAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        //1 获取表单数据
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        //2 封装到实体类
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAddress(address);

        System.out.println(user);
        return NONE;
    }
}
