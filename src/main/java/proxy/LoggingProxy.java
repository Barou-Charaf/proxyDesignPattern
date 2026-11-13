package proxy;

import java.time.Instant;
import java.time.LocalDateTime;

public class LoggingProxy implements Iservice{

    private Iservice  iservice;

    public LoggingProxy(Iservice iservice){
        this.iservice = iservice;
    }


    @Override
    public double count(int parameter) {
        System.out.println("---------- logging proxy ----------");
        long before = System.nanoTime();
        double  res = iservice.count(parameter);
        long after =System.nanoTime();
        System.out.println("it took : "+ (after-before)*Math.pow(10,-9) + "s" );
        return res;
    }
}
