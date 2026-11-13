package proxy;

public class Proxy implements Iservice {

    Iservice  iservice;

    public Proxy(Iservice iservice){
        this.iservice = iservice;
    }

    @Override
    public double count(int parameter) {
        System.out.println("------ first bridge proxy ------------");
        return iservice.count(parameter);
    }
}
