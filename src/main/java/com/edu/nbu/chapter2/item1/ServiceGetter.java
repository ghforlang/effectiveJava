package com.edu.nbu.chapter2.item1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-07-20 09:42
 *  
 */
//服务访问API
public class ServiceGetter {

    private ServiceGetter() {
    }

    private static final Map<String,Provider> providers = new ConcurrentHashMap<>();
    public static final String DEFALUT_SERVICE_PROVIDER = "<def>";

    //注册服务
    public static void registerPovider(Provider provider){
        registerProvider(DEFALUT_SERVICE_PROVIDER,provider);
    }

    public static void registerProvider(String name,Provider provider){
        providers.put(name,provider);
    }


    //获取服务
    public static Service newInstance(){
        return newInstance(DEFALUT_SERVICE_PROVIDER);
    }

    public static Service newInstance(String name){
        Provider provider = providers.get(name);
        if(null == provider){
            throw new IllegalArgumentException("no provider register");
        }
        return provider.newService();
    }
}
