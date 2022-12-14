# Lab 1. Introduction to Java

## Java Fundamentals

1.Вычислить значение выражения по формуле (все переменные принимают действительные значения).
<p align="center"> 
<img src="https://user-images.githubusercontent.com/69767713/190920645-126fa85b-8f9d-4927-a35c-486507359f83.png" width="200" height="130">
</p>

2.Для данной области составить программу, которая печатает _true_, если точка с координатами _(х, у)_ принадлежит закрашенной области, и _false_ — в противном случае.
<p align="center"> 
<img src="https://user-images.githubusercontent.com/69767713/190920772-c6c6b8ad-9e3b-43f4-9b72-877a8354b0ea.png" width="280" height="220">
</p>

3.Составить программу для вычисления значений функции _F(x)_ на отрезке _[а, b]_ с шагом _h_. Результат представить в виде таблицы, первый столбец которой — значения аргумента, второй — соответствующие значения функции.
<p align="center"> 
<img src="https://user-images.githubusercontent.com/69767713/190920853-2b11486d-76ec-4487-b766-204e882524e0.png" width="120" height="40">
</p>

4.Задан целочисленный массив размерности _N_. Есть ли среди элементов массива простые числа? Если да, то вывести номера этих элементов.

5.Дана целочисленная таблица _A[n]_. Найти наименьшее число _K_ элементов, которые можно выкинуть из данной последовательности, так, чтобы осталась возрастающая подпоследовательность.

6.Даны действительные числа _a1, a2, …, an_. Получить следующую квадратную матрицу порядка _n_.
<p align="center"> 
<img src="https://user-images.githubusercontent.com/69767713/190921066-68e07e21-64af-4e88-abbf-87551c9d2f58.png" width="380" height="240">
</p>

7.**Сортировка Шелла**. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается это следующим образом: сравниваются два соседних элемента _ai_ и _ai+1_. Если _ai <= ai+1_, то продвигаются на один элемент вперед. Если _ai > ai+1_, то производится перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.

8.Пусть даны две неубывающие последовательности действительных чисел _a1 <= a2 <= … <= an_ и _b1 <= b2 <= … <= bm_. Требуется указать те места, на которые нужно вставлять элементы последовательности _b1 <= b2 <= … <= bm_ в первую последовательность так, чтобы новая последовательность оставалась возрастающей.

##  Classes and Objects

9.Создать класс _Мяч_. Создать класс _Корзина_. Наполнить корзину мячиками. Определить вес мячиков в корзине и количество синих мячиков.

10.Скомпилировать и запустить приложение, созданное при решении задачи 9 из командной строки.

11.Создать запускной jar-файл и запустить приложение, созданное при решении задачи 9.

12.Не пользуясь средствами автогенерации кода переопределить для класса Book методы equals(), hashCode() и toString().
```Java
public class Book {
    private String title;
    private String author; 
    private int price;
    private static int edition;
}
```

13.Не пользуясь средствами автогенерации кода переопределить для класса ProgrammerBook методы equals(), hashCode() и toString().
```Java
public class ProgrammerBook extends Book { 
    private String language;
    private int level;
}
```

14.Не пользуясь средствами автогенерации кода переопределить для класса Book из задачи 12 метод clone(). Добавьте в класс Book из задачи 12 поле isbn. Реализуйте в классе Book интерфейс Comparable так, чтобы книги приобрели сортировку по умолчанию согласно номеру isbn.

15.Реализуйте для класса Book из задачи 12 компараторы, позволяющие сортировать книги по названию; по названию, а потом по автору; по автору, а потом по названию; по автору, названию и цене.
