package Interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

public class LoginInterceptor extends MethodFilterInterceptor {
    //这个方法里面写拦截器逻辑
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        //判断session里面是否有名称是username
        //得到session
        HttpServletRequest request = ServletActionContext.getRequest();
        Object object= request.getSession().getAttribute("username");
        System.out.println(object);
        //判断
        if (object != null){
            //登录状态
            //做类似于放行操作，执行action的方法
            return actionInvocation.invoke();
        }else {
            //不是登录状态
            //不到登录，不执行action，返回登录页面
            //到result标签里面找到名称是error的值，到配置路径里面
            System.out.println(11111);
            return  "error";
        }
    }
}
