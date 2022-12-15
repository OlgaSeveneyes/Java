// Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

package DZ1.Java;

public class DZ2_task2 {
    public static void main(String[] args) {
        
        String str1 = "qwerty";
        String str2 = "ytrewq";
        
        String str = new StringBuilder(str1).reverse().toString();
        boolean b = str.equals(str2);
        
        if (b == true) {
            System.out.println("Строка является палиндромом");
        }
        else {
            System.out.println("Это не палиндром");    
        }
    }
}
