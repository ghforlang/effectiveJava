import gnu.trove.map.TIntIntMap;
import gnu.trove.map.hash.TIntIntHashMap;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author fanwh
 * @version V1.0
 * @create 2017-08-10 11:11
 *  
 */
public class TestTrove4j {

    @Test
    public void testOne(){//memory cost
        Runtime run  = Runtime.getRuntime();
        System.out.println("总内存："+ run.totalMemory() + " 空闲：" + run.freeMemory() + " 使用：" + (run.totalMemory()-run.freeMemory()));
        run.gc();
        System.out.println("初始内存使用:");
        long meUsed = run.totalMemory()-run.freeMemory();
        System.out.println("总内存："+ run.totalMemory() + " 空闲：" + run.freeMemory() + " 使用：" + meUsed);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<500000;i++){
            map.put(i,i);
        }
        long afterUsed = run.totalMemory()-run.freeMemory();
        System.out.println("结束时内存使用:");
        System.out.println("总内存："+ run.totalMemory() + " 空闲：" + run.freeMemory() + " 使用：" + (afterUsed));
        System.out.println("实际使用：" + (afterUsed-meUsed));
    }

    @Test
    public void testTwo(){
        Runtime run  = Runtime.getRuntime();
        System.out.println("总内存："+ run.totalMemory() + " 空闲：" + run.freeMemory() + " 使用：" + (run.totalMemory()-run.freeMemory()));
        run.gc();
        System.out.println("初始内存使用:");
        long meUsed = run.totalMemory()-run.freeMemory();
        System.out.println("总内存："+ run.totalMemory() + " 空闲：" + run.freeMemory() + " 使用：" + meUsed);
        TIntIntMap map = new TIntIntHashMap();
        for(int i=0;i<500000;i++){
            map.put(i,i);
        }
        long afterUsed = run.totalMemory()-run.freeMemory();
        System.out.println("结束时内存使用:");
        System.out.println("总内存："+ run.totalMemory() + " 空闲：" + run.freeMemory() + " 使用：" + (afterUsed));
        System.out.println("实际使用：" + (afterUsed-meUsed));
    }

    @Test
    public void testThree(){

    }
}
