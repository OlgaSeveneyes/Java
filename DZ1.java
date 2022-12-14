package DZ1.Java;

import java.util.Random;
import java.util.ArrayList;

public class DZ1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2001); // Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i 
        System.out.println(i);
       
        int n = highBit(i); //Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        System.out.println(n);

        //Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        System.out.println("Кратные числу " + n + " в диапазоне от " + i + " до " + Short.MAX_VALUE);
        massiv(i, n);

        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        System.out.println("Кратные числа " + n + " в диапазоне от " + Short.MIN_VALUE + " до " + i);
        massiv(i, n);
    }
   
    static int highBit(int i) {
        return Integer.toBinaryString(i).length();
    }
    
    static void printAr(ArrayList<Integer> m){          
        System.out.println(m.toString());
    }

    static void massiv(int i, int n) {
        ArrayList<Integer> m1 = new ArrayList<Integer>();  
        ArrayList<Integer> m2 = new ArrayList<Integer>();
        
        for (int j = 1; j < Short.MAX_VALUE; j++){
            if (i%n == 0){
                m1.add(j);
            }
        }
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (i%n != 0){
                m2.add(j);
            }
        }
    }
}
    

    



   

    

