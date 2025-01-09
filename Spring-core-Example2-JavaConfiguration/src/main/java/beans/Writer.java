package beans;

import Interfaces.Pen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


public class Writer {
    @Autowired
    @Qualifier
    private final Pen pen;
    public Writer(Pen pen){
        this.pen=pen;
    }
    public void write(){
        pen.write();
    }
}
