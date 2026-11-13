package proxy;

public class SecurityContext {
    public  static  String username ="";
    public  static  String password ="";
    public  static  String role ="";

    public static void Authenticate(String pusername,String ppassword,String prole){
        username=pusername;
        role=prole;
        password=ppassword;
    }
}
