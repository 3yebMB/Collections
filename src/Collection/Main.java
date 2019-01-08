package Collection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int STRING_COUNT = 13;
        ArrayList<String> arrayList = new ArrayList<>(STRING_COUNT);
        int count = 1;

        for (int i = 0; i < STRING_COUNT; i++) {
            arrayList.add(createRandomString(10));
        }

        String casualStringArray[] = new String[arrayList.size()];
        arrayList.toArray(casualStringArray);
        // создать можно было сразу обычный массив, но тема урока была коллекции... (:
        // а дальше с обычным массивом работать удобнее.

        casualStringArray[0] = casualStringArray[casualStringArray.length - 1];
        casualStringArray[casualStringArray.length / 2] = casualStringArray[casualStringArray.length / 2 - 1];
        // повторяющиеся элементы

        for (int i = 0; i < casualStringArray.length; i++) {
            count = 1;
            for (int y = i+1; y < casualStringArray.length; y++) {
                if (casualStringArray[i].equals(casualStringArray[y]))
                    count++;
            }
            if (count == 1)
                System.out.println(casualStringArray[i]);
//            System.out.println("Строка " + casualStringArray[i] + " встречается " + count + " раз");
            // второй вариант
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
