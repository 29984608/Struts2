package Action;

import com.opensymphony.xwork2.ActionSupport;
import entity.User;

import java.util.ArrayList;
import java.util.List;

public class ListDemoAction extends ActionSupport{
    //1 定义list集合变量
    private List<User> list = new ArrayList<User>();
    //2 生成get方法
    public List<User> getList() {
        return list;
    }
    //3 设置值
    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setUsername("Zhang");
        user.setPassword("12424");
        user.setAddress("广州");
        list.add(user);
        System.out.println(list);
        return "success";
    }
}
