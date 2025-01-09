import Config.JavaBeanConfiguration;
import beans.Writer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaBeanConfiguration.class);
        Writer writer = (Writer) applicationContext.getBean("writer");
        writer.write();
    }
}
