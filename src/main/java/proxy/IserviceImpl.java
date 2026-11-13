package proxy;

public class IserviceImpl implements Iservice{


    @Override
    public double count(int parameter) {
        return 10.8 * parameter;
    }
}
