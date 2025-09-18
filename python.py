# Создание массива
list = [1, 2, 3, 4, 5]

# Добавление элементов
list.append(6)

# Удаление элементов
list.pop()

# Создание стека с помошью модуля collections
from collections import deque
stack_deque = deque()
stack_deque.append('1')  # Добавление элемента в стек
stack_deque.append('2')  
stack_deque.append('3')  
popped = stack_deque.pop()  # Удаление и получение верхнего элемента
