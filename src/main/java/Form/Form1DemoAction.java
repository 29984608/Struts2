package Form;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class Form1DemoAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        //第一种方式
        //1 使用ActionContext类对象
        ActionContext context = ActionContext.getContext();
        //2 调用方法得到表单数据
         // key 是表单输入项name属性值，value是输入的值
        Map<String,Object> map= context.getParameters();

        Set<String> keys = map.keySet();
        for (String key : keys){
            //根据key得到value
            //数组形式：因为输入项里面可能有复选框
            Object[] objects= (Object[]) map.get(key);
            System.out.println(Arrays.toString(objects));
        }
        return NONE;
    }
}
