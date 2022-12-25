package DZ1.Java;

import java.util.HashMap;
import java.util.Set;

public class DZ5 {
    public static void main(String[] args) {
        HashMap <Integer, String> spisok = new HashMap<>();
        spisok.put(1, "Первый Иван Петрович 23 м");
        spisok.put(2, "Второй Федр Николаевич 56 м");
        spisok.put(3, "Средняя Ангелина Владимировна 23 ж");
        spisok.put(4, "Предпоследняя Алла Васильевна 42 ж");
        spisok.put(5, "Крайний Лев Владимирович 36 м");

        print(spisok);
        System.out.println();
        UP_Gender(spisok);
        System.out.println();
        UP_Initials(spisok);
    }

    static void print(HashMap <Integer, String> spisok){
        spisok.forEach((k, v) -> System.out.println(k + ":" + v));
    }
    
    static void UP_Gender(HashMap <Integer, String> spisok){
        Set <Integer> key = spisok.keySet();
        for (Integer keys: key){
            String str = spisok.get(keys);
            int g = str.length()-1; 
            char ch = Character.toUpperCase(str.charAt(g));
            StringBuilder new_str = new StringBuilder(str);
            new_str.setCharAt(g, ch);
            str = new_str.toString();
            System.out.println(str);
            spisok.put(keys, str);
        }
    }

    static void UP_Initials(HashMap <Integer, String> spisok){
        Set <Integer> key2 = spisok.keySet();
        for (Integer keys: key2){
            String[] str = spisok.get(keys).split(" ");
            String name = Character.toUpperCase(str[1].charAt(0))+".";
            String patronymic = Character.toUpperCase(str[2].charAt(0))+".";
            spisok.put(keys, str[0]+" "+name+patronymic+" "+str[3]+" "+str[4]);
        }
        print(spisok);

    }

}


    
    

    

