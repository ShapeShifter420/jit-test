package org.ShapeShifter420.JMHA.Testing;

import org.ShapeShifter420.JMHA.TestRun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestClass {
    public static int TEMP = 0;
    @TestRun()
    public void Test1(){
        int k = 0;
        while (k<10000000){
        TEMP+="f5a5a608".hashCode();
        k++;}
    }
    @TestRun()
    public void Test2(){
        int k = 0;
        while (k<10000000){
            TEMP+="fgfgfevb".hashCode();
        k++;}
        //матрицы
    }
    //@TestRun()
    public void Test2_2(){
        int k = 0;
        for (int i = 0; i < 10000000; i++)
            TEMP+="1111111111111".hashCode();
        //матрицы
        System.out.println(TEMP);
    }
    //@TestRun
    public void Test3() {
        int res = 0;
        for (int i = 0; i < 100000; i++) {
            res += testIterator();
        }
        System.out.println(res);
    }
    //@TestRun
    public int testIterator() {
        List list = Collections.singletonList("x");
        int sum = 0;
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String s = it.next();
            sum += s.length();
        }
        return sum;
    }
    //@TestRun
    public void Test4() {
        int[] array = new int[3000];
        for (int k = 0; k < array.length; ++k)
        {
            array[k] = k;
        }
    }
    //@TestRun
    public void Test5() {
        KR(1000,1000);
    }

    public static int KR(int a, int b)
    {
        if (b == 0)
            return a;

        return KR(b, a % b);
    }

}

