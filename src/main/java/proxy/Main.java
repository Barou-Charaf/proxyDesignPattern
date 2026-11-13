package proxy;


public class Main {
    public static void main(String[] args) {

        IserviceImpl iservice = new IserviceImpl();

        Context client = new Context(iservice);
        client.count(120);
    }
}