package Collection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int STRING_COUNT = 11;
        ArrayList<String> arrayList = new ArrayList<>(STRING_COUNT+2);
        int count = 1;

        for (int i = 0; i < STRING_COUNT; i++) {
            arrayList.add(createRandomString(10));
        }

        arrayList.add(0, arrayList.get(arrayList.size()-1));
        arrayList.add(arrayList.size()/2, arrayList.get(arrayList.size()/2-1));


        System.out.println("Все элементы списка : ");
        System.out.println(arrayList);

        String tmp;
        for (int i=0; i<arrayList.size(); i++) {
            count = 1;
            tmp = arrayList.get(i);
            for (int y = i + 1; y < arrayList.size(); y++) {
                if (tmp.equalsIgnoreCase(arrayList.get(y))){
                    arrayList.remove(y);
                    count++;
                }
            }
            System.out.println("Строка " + arrayList.get(i) + " встречается " + count + " раз.");
        }
    }

    public static String createRandomString(int len) { // генератор строк
        int rand = 0;
        String str = "";
        int i = 0;

        do {
            rand = (int) (Math.random()*100);
            if (((rand>64) && (rand<91)) || ((rand>96) && (rand<123))) {
                str += Character.toString((char) rand);
                i++;
            }
        } while (i<len);
        return str;
    }
}
