package beans;

import Interfaces.Pen;

public class Writer {
    private final Pen pen;
    public Writer( Pen pen){
        this.pen=pen;
    }
    public void write(){
        pen.write();
    }
}
