// Напишите программу, чтобы перевернуть строку с помощью рекурсии.

package DZ1.Java;

public class DZ2_task6 {
    public static void main(String[] args) {
        String s = "qwertyuiop";
        
        if(s.length() > 0) {
            reverseString(s, s.length() - 1);
        }
    }
    
    public static void reverseString(String s, int index) {
        if(index == 0) {
            System.out.println(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        reverseString(s, index - 1);
    }
    
}