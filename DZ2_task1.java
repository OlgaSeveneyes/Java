// Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).

package DZ1.Java;

public class DZ2_task1 {
    public static void main(String[] args) {
        String str1 = "Посмотрим, что тут можно сделать?!";
        String str2 = "что тут можно сделать?";
        
        int index = str1.indexOf(str2);

        if(index == - 1) {
            System.out.println("Текст не найден");
        } else {
            System.out.println("Индекс вхождения " + index);
        }
    }
}
