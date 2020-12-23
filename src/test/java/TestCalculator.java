import com.zx.dao.Calculator;
import com.zx.dao.impl.MyCalculator;
import com.zx.dao.impl.MyCalculatorForCGlib;
import com.zx.proxy.CalculatorProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalculator {
    public static void main(String[] args) throws Exception {
//----------------------------1、第一种方式开始----------------------------
//        MyCalculator myCalculator  = new MyCalculator();
//
//        int add = myCalculator.add(1, 2);
//        System.out.println(add);
//----------------------------1、第一种方式结束----------------------------



//----------------------------2、第二种方式开始，使用jdk自带proxy----------------------------
        //测试自己写的Proxy进行日志切面插入
//        Calculator proxyRes = CalculatorProxy.getProxyRes(new MyCalculator());
//        proxyRes.add(1,2);

        //用aop方法进行切面日志插入测试
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

//        Calculator myCalculatorForAOP = context.getBean("myCalculatorForAOP", Calculator.class);
        Calculator myCalculatorForAOP = context.getBean(Calculator.class);

        myCalculatorForAOP.add(1,3);

        System.out.println(myCalculatorForAOP.getClass().getName());
//----------------------------2、第二种方式结束，使用jdk自带proxy----------------------------
        System.out.println("--------------------------------------------------------");


//----------------------------3、第二种方式开始，使用CGlib自带proxy----------------------------
        //使用CGlib进行代理，不需要MyCalculatorForCGlib实现Calculator接口
        //实现接口进行动态代理，是jdk自带代理方式，不实现接口是CGlib代理

        MyCalculatorForCGlib myCalculatorForCGlib = context.getBean(MyCalculatorForCGlib.class);
        myCalculatorForCGlib.add(2,5);
        System.out.println(myCalculatorForCGlib);
        System.out.println(myCalculatorForCGlib.getClass());

//----------------------------3、第二种方式结束使用CGlib自带proxy----------------------------

    }
}
