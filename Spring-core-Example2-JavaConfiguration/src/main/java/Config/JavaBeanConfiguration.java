package Config;

import Interfaces.Impl.Bitco;
import Interfaces.Impl.BlackInk;
import Interfaces.Ink;
import Interfaces.Pen;
import beans.Writer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBeanConfiguration {

    @Bean
    public Ink ink(){
        return new BlackInk();
    }

    @Bean
    public Pen pen(Ink ink ){
        return new Bitco(ink);
    }

    @Bean
    public Writer writer(Pen pen){
        return new Writer(pen);
    }

}
