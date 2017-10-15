package Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ValueStackDemoAction extends ActionSupport {
    //第三种方式 在action定义变量，生成变量的get方法
    //3.1 定义变量
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String execute() throws Exception {
        //第一种方式 使用值栈对象里面的set方法
        //1.1 获取值栈对象
        ActionContext actionContext = ActionContext.getContext();
        ValueStack stack = actionContext.getValueStack();
        //1.2 调用方法set
        stack.set("username","eurasia");
        //第二种方式 使用值栈对象里面的push方法
        //2.2 调用push方法
        stack.push("abcd");

        //3.2在执行的方法里面向变量设置值
        name = "425";
        return "success";
    }
}
