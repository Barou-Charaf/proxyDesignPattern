package proxy;


public class Main {
    public static void main(String[] args) {

        IserviceImpl iservice = new IserviceImpl();
        SecurityContext.Authenticate("charaf","lool","admin");

        Context client = new Context(new SecurityProxy(new CachProxy(new LoggingProxy(iservice))));
        client.count(120);
        System.out.println();
        client.count(120);
        System.out.println();
        client.count(10);
    }
}