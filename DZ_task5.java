// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace()

package DZ1.Java;

public class DZ_task5 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("0 = 0");
        for (int i = 0; i < str.length(); i++) {
            int j = str.indexOf("=");
            if (j > 0){
                str.replace(j, j+1, "равно");
            }
        }
        System.out.println(str);
    }
}
