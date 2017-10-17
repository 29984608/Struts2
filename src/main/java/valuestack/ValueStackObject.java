package valuestack;

import com.opensymphony.xwork2.ActionSupport;
import entity.User;

public class ValueStackObject extends ActionSupport {
    private User user = new User();

    public User getUser() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        user.setUsername("张丹峰");
        user.setPassword("6666666");
        user.setAddress("上海");
        return "success";
    }
}
