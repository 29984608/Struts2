package Action;

/**
 * Created by pc on 2017/9/18.
 */
public class HelloAction {
    /*
    * (1)每次访问servlet时候，都会service方法
    * - 写继承HttpServlet，重写类里面的方法
    * - 在web.xml里面配置servlet访问路径
    * (2)访问action，每次访问action时候，默认执行名称execute
    * - 配置action访问路径
    * */
    public String execute(){
        return "ok";
    }
}
