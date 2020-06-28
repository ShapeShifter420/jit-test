package org.ShapeShifter420.JMHA;

import org.ShapeShifter420.JMHA.Testing.TestClass;

import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        Analize analyzer = new Analize(100);
        HashMap<String,ArrayList> temp = analyzer.analyz(TestClass.class);
        String text = "";
        for (String k : temp.keySet()) {
            System.out.println(k);
            System.out.println(temp.get(k));
            text+=String.format("%s : \n%s\n",k,temp.get(k).toString());

        }
        try(FileWriter writer = new FileWriter("data.txt", false))
        {
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }



    }
}