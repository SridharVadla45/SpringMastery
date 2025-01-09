import beans.Writer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-config.xml");
        Writer writer = (Writer) applicationContext.getBean("writer");
        writer.write();
    }
}
