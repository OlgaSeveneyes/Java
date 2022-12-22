package DZ1.Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DZ4 {

    static ArrayList<String> list_fname = new ArrayList<>();
    static ArrayList<String> list_lname = new ArrayList<>();
    static ArrayList<String> list_tname = new ArrayList<>();
    static ArrayList<Integer> list_age = new ArrayList<>();
    static ArrayList<Boolean> list_sex = new ArrayList<>();
    static List<Integer> linkedlist = new LinkedList<>();

    
    public static void main(String[] args) {

        putTo("Ivanov Ivan Ivanovich", 16, "M");
        putTo("Gurov Fedr Ivanovich", 16, "M");
        putTo("Kalyma Alexandr Ivanovich", 51, "M");
        putTo("Selega Olga Ivanovna", 34, "F");
        putTo("Buzov Anna Ivanovna", 16, "F");
        putTo("Huligan Sveta Ivanovich", 34, "F");
        putTo("Terpilo Stepan Ivanovich", 34, "M");

        option();
              
    }

    static void putTo(String fio, int age, String gender){
        list_age.add(age);
        String[] fio1 = fio.split(" ");
        list_fname.add(fio1[1]);
        list_lname.add(fio1[0]);
        list_tname.add(fio1[2]);
        if (gender.contains("F")) {list_sex.add(true);} else  {list_sex.add(false);}
        linkedlist.add(list_age.size() - 1);
    }

    static void print(){
        linkedlist.forEach(i -> System.out.println(list_fname.get(i)
            + " " + list_lname.get(i).toUpperCase().charAt(0)
            + "." + list_tname.get(i) + " " + list_age.get(i) + " " 
            + list_sex.get(i)));
        System.out.println();
    }

    static void sort_Age(){
        int cnt = linkedlist.size()-1;
        while (cnt > -1) {
            int max_age = list_age.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (max_age < list_age.get(linkedlist.get(i))){
                    max_age = list_age.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);
            cnt--;
        }
    }

    static void sort_MaleOrFemale(){
        int cnt = linkedlist.size()-1;
        while (cnt > -1) {
            Boolean MaleOrFemale = list_sex.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (MaleOrFemale){
                    MaleOrFemale = list_sex.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);
            cnt--;
        }
    }

    static void sort_LastName(){
        int cnt = linkedlist.size()-1;
        while (cnt > -1) {
            String LastName = list_lname.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (LastName.compareToIgnoreCase(list_lname.get(linkedlist.get(i))) < 0){
                    LastName = list_lname.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);
            cnt--;
        }
    }
    
    static void option(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберете нужный пункт:\n1.Вывести список на экран\n2.Отсортировать по возрасту\n3.Отсортировать по полу\n4.Отсортировать по фамилии\n5.Выход");
        int a = scan.nextInt();
        try {
            switch (a){
                case 1: print();
                        option();  
                        break;
                case 2: sort_Age();
                        print();
                        option();
                        break;
                case 3: sort_MaleOrFemale();
                        print();
                        option();
                        break;
                case 4: sort_LastName();
                        print();
                        option(); 
                        break;
                case 5: break;
                default:
                        System.out.println("я не знаю такой операции");
                        break;
            }
        }
        catch(Exception e){
            System.out.println("Что-то пошло не так");
        }
    }
}




        
    

