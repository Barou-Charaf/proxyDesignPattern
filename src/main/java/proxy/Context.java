package proxy;

public class Context {
    private Iservice iservice;

    public Context(Iservice iservice){
        this.iservice = iservice;
    }
    public void count(int parameter){
        double data = iservice.count(parameter);
        System.out.println("---------------inside the context methode -------------");
        System.out.println("result : "+data);
        System.out.println("---------------inside the context methode -------------");
    }
}
