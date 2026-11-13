package proxy;


public class Main {
    public static void main(String[] args) {

        IserviceImpl iservice = new IserviceImpl();
        Proxy proxy = new Proxy(iservice);
        SecurityContext.Authenticate("charaf","lool","admin");

        Context client = new Context(new SecurityProxy(iservice));
        client.count(120);
    }
}