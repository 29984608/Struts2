package Date;

import com.opensymphony.xwork2.ActionSupport;
import entity.User;

import java.util.List;

//封装数据到list集合
public class ListAction extends ActionSupport{
    //1 声明List变量
    private List<User> list;
    //2 生成get和set方法

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(list);
        return NONE;
    }
}
