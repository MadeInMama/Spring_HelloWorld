import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean0 = applicationContext.getBean(HelloWorld.class);
        System.out.println(bean0.getMessage());

        HelloWorld bean1 = applicationContext.getBean(HelloWorld.class);
        System.out.println(bean1.getMessage());

        Cat bean2 = applicationContext.getBean(Cat.class);
        System.out.println(bean2.getMessage());

        Cat bean3 = applicationContext.getBean(Cat.class);
        System.out.println(bean3.getMessage());
        
        System.out.println(bean0 == bean1);
        System.out.println(bean2 == bean3);
    }
}