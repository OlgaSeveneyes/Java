// Создать новый список, добавить несколько строк и вывести коллекцию на экран.
// Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// Вставить элемент в список в первой позиции.
// Извлечь элемент (по указанному индексу) из заданного списка.
// Обновить определенный элемент списка по заданному индексу.
// Удалить третий элемент из списка.
// Поиска элемента в списке по строке.
// Создать новый список и добавить в него несколько елементов первого списка.
// Удалить из первого списка все элементы отсутствующие во втором списке.
// Сортировка списка.

package DZ1.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DZ3 {
    public static void main(String[] args) {
        List <String> lst = new ArrayList<>();
        lst.add("круг");
        lst.add("квадрат");
        lst.add("треугольник");
        lst.add("параллелограмм");
        lst.add("ромб");
        System.out.println(lst);

        Collections.sort(lst);
        System.out.println(lst);

        for (int i = 0; i < lst.size(); i++) {                   
            lst.set(i, lst.get(i) + "!");
        }
        System.out.println(lst);

        lst.add(0, "прямоугольник");
        System.out.println(lst);

        System.out.println(lst.get(2));

        lst.set(2, "зигзаг");
        System.out.println(lst);

        lst.remove(3);
        System.out.println(lst);

        lst.contains("круг!");                          
        System.out.println("круг! в списке под индексом: " + lst.indexOf("круг!"));
                
        ArrayList<String> new_lst = new ArrayList<String>();
        new_lst.addAll(0, lst.subList(2,4));
        System.out.println(new_lst);

        lst = new_lst;                                          
        System.out.println(lst);
        System.out.println(new_lst);
    }
    
}
