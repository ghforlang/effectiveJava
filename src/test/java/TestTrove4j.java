import gnu.trove.map.TIntIntMap;
import gnu.trove.map.hash.*;
import org.apache.commons.lang3.StringUtils;
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
        TIntIntHashMap map = new TIntIntHashMap();
        TIntByteHashMap byteMap = new TIntByteHashMap();
        TIntCharHashMap charMap = new TIntCharHashMap();
        TIntLongHashMap longMap = new TIntLongHashMap();
        TIntShortHashMap shortMap = new TIntShortHashMap();
        TIntObjectHashMap objectMap = new TIntObjectHashMap();
        Map exchangeMap = new THashMap();
//        EnumMap enumMap = new EnumMap<Enum, Long>(Enum.class);
    }

    @Test
    public void testStrSplit(){
        String[] str1 = "".split(",");
        System.out.println(str1.length+"*****************");
        for (String s : str1){
            System.out.println(s);
        }

        String[] str2= ",1,".split(",");
        System.out.println(str2.length +"****************");
        for (String s : str2){
            System.out.println(s);
        }

        String[] str3 = ",".split(",");
        System.out.println(str3.length+ "****************");
        for (String s : str3){
            System.out.println(s);
        }

        String[] str4 = StringUtils.split(",");
        System.out.println(str4.length+"******************");
        for (String s : str4){
            System.out.println(s);
        }
    }
}
