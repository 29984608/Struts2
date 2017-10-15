package Action;

import com.opensymphony.xwork2.ActionSupport;
import entity.User;

public class ObjectDemoAction extends ActionSupport {
    //1  定义对象变量
    private User user = new User();
    //2  生成get方法
    public User getUser() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        //3 向值栈中放入数据
        user.setUsername("yang");
        user.setPassword("123");
        user.setAddress("陕西");
        return "success";
    }
}
