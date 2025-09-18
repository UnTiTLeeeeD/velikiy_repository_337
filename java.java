import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        // Создание ArrayList
        List<Integer> myList = new ArrayList<>();
        myList.add(1);  // Добавление элемента
        myList.add(2);  // Добавление элемента
        myList.add(3);  // Добавление элемента
        myList.add(4);  // Добавление элемента
        myList.add(5);  // Добавление элемента
        
        // Добавление элемента в конец списка
        myList.add(6);
        
        // Удаление последнего элемента
        myList.remove(myList.size() - 1);
        
        // Создание стека
        Stack<Integer> stack = new Stack<>();
        
        // Добавление элементов в стек
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        // Удаление и получение верхнего элемента из стека
        int popped = stack.pop();
    }
}
