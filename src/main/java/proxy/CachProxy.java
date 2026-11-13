package proxy;

import java.util.HashMap;
import java.util.Map;

public class CachProxy implements Iservice{

    private Map<Integer,Double> map = new HashMap<>();

    private Iservice iservice;

    public CachProxy(Iservice proxy) {
        this.iservice = proxy;
    }

    @Override
    public double count(int parameter) {
        if(map.containsKey(parameter)){
            System.out.println("------------------- in cache-------------");
            return map.get(parameter);
        }
        System.out.println("------------------ new value-------------");
        map.put(parameter,iservice.count(parameter));
        return map.get(parameter);
    }
}
