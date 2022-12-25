package DZ1.Java;

import java.util.*;

public class DZ6 {
    public static void main(String[] args) {
        HashSet<String> country_hs = new HashSet<>();
        country_hs.add("Турция");
        country_hs.add("Греция");
        country_hs.add("Кипр");
        country_hs.add("Таиланд");
        country_hs.add("Испания");

        System.out.println(country_hs);

        LinkedHashSet country_lhs = new LinkedHashSet();
        ArrayList sortedList = new ArrayList();
        Iterator<String> iterator = country_hs.iterator();
        while (iterator.hasNext()) {
            sortedList.add(iterator.next());
        }
        Collections.sort(sortedList);
        for (int i = 0; i < sortedList.size(); i++) {
            country_lhs.add(sortedList.get(i));
        }
        System.out.println(country_lhs);

        TreeSet<String> country_ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) { return 0;}
                if (o1.compareTo(o2) < 0) {return 1;}
                else return -1;
            }
        });

        country_ts.addAll(country_hs);
        System.out.println(country_ts);

    }
}
