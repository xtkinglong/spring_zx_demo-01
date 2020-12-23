import com.zx.dao.impl.MyCalculatorForCGlib;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXMLCGlib {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopxmlbean.xml");
        MyCalculatorForCGlib myCalculatorForCGlib = context.getBean(MyCalculatorForCGlib.class);

        myCalculatorForCGlib.add(5,7);
    }

}
