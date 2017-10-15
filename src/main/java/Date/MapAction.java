package Date;

import com.opensymphony.xwork2.ActionSupport;
import entity.User;

import java.util.Map;

//封装数据到map集合
public class MapAction extends ActionSupport {
    //1 声明map集合
    private Map<String,User> map;
    //2 设置get和set方法
    public Map<String, User> getMap() {
        return map;
    }
    public void setMap(Map<String, User> map) {
        this.map = map;
    }
    @Override
    public String execute() throws Exception {
        System.out.println(map.get("one"));
        return NONE;
    }

}
