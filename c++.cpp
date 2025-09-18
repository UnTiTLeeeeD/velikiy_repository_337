#include <vector>
#include <stack>
using namespace std;

int main() {
    // Создание вектора
    vector<int> my_vector = {1, 2, 3, 4, 5};
    
    // Добавление элемента в конец вектора
    my_vector.push_back(6);
    
    // Удаление последнего элемента
    my_vector.pop_back();
    
    // Создание стека
    stack<int> my_stack;
    
    // Добавление элементов в стек
    my_stack.push(1);
    my_stack.push(2);
    my_stack.push(3);
    
    // Удаление верхнего элемента из стека
    my_stack.pop();
    
}