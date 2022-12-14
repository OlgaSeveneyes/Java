// Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

package DZ1.Java;

import java.util.Scanner;

public class DZ2_task3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа");
        int i = scan.nextInt();
        int j = scan.nextInt();
        System.out.println("Введите знак: + или - или *");
        String sign = scan.next();
        if (sign.equals("+")){
            str.append(i).append(" + ").append(j).append(" = ").append(i+j);
        }
        else if (sign.equals("-")){
            str.append(i).append(" - ").append(j).append(" = ").append(i-j);
        }
        else if (sign.equals("*")){
            str.append(i).append(" * ").append(j).append(" = ").append(i*j);
        }
        System.out.println(str);
    }
}
