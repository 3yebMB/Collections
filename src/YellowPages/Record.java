package YellowPages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Record {
    private String name;
    private long phone;
    HashMap<Long, String> yp = new HashMap<>();

    public void add(String n, long ph){
        yp.put(ph, n);
    }

    public void get(String n){
        for (HashMap.Entry<Long, String>entry : yp.entrySet()){
            if (n.equalsIgnoreCase(entry.getValue()))
                System.out.printf("Аббонент %s, т. %s\n", entry.getValue(), entry.getKey());
        }
    }
}
