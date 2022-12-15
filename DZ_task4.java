// Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

package DZ1.Java;

public class DZ_task4 {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder();
        str.append("0 = 0");
        for (int i = 0; i < str.length(); i++) {
            int j = str.indexOf("=");
            if (j > 0){
                str.deleteCharAt(j);
                str.insert(j, "равно");
            }
        }
        System.out.println(str);
    }
}
