package Method;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by pc on 2017/9/21.
 */
public class BookAction extends ActionSupport {
    //添加
    public String add(){
        System.out.println("add........");
        return NONE;
    }
    //修改
    public String update(){
        System.out.println("update.......");
        return  NONE;
    }
}
