package YellowPages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        final String surname1 = "Гагарин Ю.А.";
        final String surname2 = "Леонов А.А.";
        final String surname3 = "Терешкова В.В.";
        final String surname4 = "Титов Г.С.";

        Record phones = new Record();
        phones.add(surname1, 88002000000L);
        phones.add(surname2, 88002000001L);
        phones.add(surname3, 88002000002L);
        phones.add(surname4, 88002000003L);
        phones.add(surname1, 88002000004L);
        phones.add(surname2, 88002000005L);

        phones.get(surname1);
        phones.get("Леонов А.А.");

    }
}
