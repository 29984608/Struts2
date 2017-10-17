package valuestack;

import com.opensymphony.xwork2.ActionSupport;

public class ValueStackString extends ActionSupport {
    private String username;

    public String getUsername() {
        return username;
    }

    @Override
    public String execute() throws Exception {
        username="赛利亚";
        return "success";
    }
}
