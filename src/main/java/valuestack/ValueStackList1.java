package valuestack;

        import com.opensymphony.xwork2.ActionSupport;
        import entity.User;

        import java.util.ArrayList;
        import java.util.List;

public class ValueStackList1 extends ActionSupport {
    private List<User> list = new ArrayList<User>();

    public List<User> getList() {
        return list;
    }

    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setUsername("张无忌");
        user.setPassword("54654652");
        user.setAddress("光明顶");
        list.add(user);
        return "success";
    }
}
