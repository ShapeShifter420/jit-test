package org.ShapeShifter420.JMHA;

import org.ShapeShifter420.JMHA.Testing.TestClass;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Analize {
    Integer Count;
    public Analize(Integer count){
        this.Count = count;
    }
    public HashMap<String,ArrayList> analyz(Class<?> clazz) throws Exception {
        Method[] methods = clazz.getMethods();
        HashMap<String, ArrayList> Result = new HashMap<String, ArrayList>();

        for (Method method : methods) {
            if (method.isAnnotationPresent(TestRun.class)) {
                ArrayList<Long> temp = new ArrayList<Long>();
                for (int i = 0; i < Count; i++) {
                    // Получаем доступ к атрибутам
                    long startTime = System.currentTimeMillis();
                    method.invoke(new TestClass());
                    long finishTime = System.currentTimeMillis() - startTime;
                    temp.add(finishTime);
                }
                Result.put(method.getName(), temp);
            }
            }
            return Result;
        }
}

