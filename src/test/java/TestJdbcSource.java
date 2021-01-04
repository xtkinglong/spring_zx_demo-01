import com.alibaba.druid.pool.DruidDataSource;
import com.zx.Controller.PersonController;
import com.zx.entity.Address;
import com.zx.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.List;

public class TestJdbcSource {

    ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
    @Test
    public void testJdbcCon(){



        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);

        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String sql = "insert into zx_address (privnce, city ,town, person_num) values(?,?,?,?)";

        int update = jdbcTemplate.update(sql, "陕西", "西安", "子兮", 10);

        System.out.println(update);

        System.out.println("------------------------------------");

        try {
            System.out.println(jdbcTemplate);
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }

   }




    @Test
    public void testTx(){
        Class<PersonController> personControllerClass = PersonController.class;

        Person person = new Person("zixi", 18, 10);
        Address address = new Address("陕西","西安","子兮",10);

        PersonController personController = context.getBean("personController", PersonController.class);

        personController.addPerAndAdd(person, address);




        //如下方法进行使用PersonController会报错，说private PersonService personService;为null
        //因此只能使用----》context.getBean("personController", PersonController.class);的形式进行调用

//        PersonController personController1 = new PersonController();
//        personController1.addPerAndAdd(person, address);





//        try {
//            PersonController personController = personControllerClass.newInstance();
//
//            Method addPerAndAdd = personControllerClass.getMethod("addPerAndAdd", Person.class, Address.class);
//
//
//            Object invoke = addPerAndAdd.invoke(personController, person, address);
//
//
//
//
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }


    }

    @Test
    public void  testQuery(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        PersonController personController = context.getBean("personController", PersonController.class);
        Person person = new Person("zixi", 18, 10);
        List<Person> personCon = personController.getPersonCon(person);
        for (Person p: personCon){
            System.out.println(p);
        }

    }
}
