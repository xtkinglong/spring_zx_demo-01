import com.zx.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");

//        Person person = context.getBean("person", Person.class);
//
//        Person person1 = context.getBean("person1", Person.class);
//        System.out.println(person1);
//        System.out.println(person);

        Person xt = context.getBean("xt", Person.class);

        System.out.println(xt);


    }
}
