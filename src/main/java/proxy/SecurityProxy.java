package proxy;

public class SecurityProxy implements Iservice{

    private Iservice iservice;

    public SecurityProxy(Iservice iservice){
        this.iservice=iservice;
    }

    @Override
    public double count(int parameter) {
        System.out.println("------------ Security Proxy -------------");
       if(!SecurityContext.role.equals("admin")) {
           throw new RuntimeException("you are not allowed to access these resouces");
       }
       return iservice.count(parameter);
    }
}
