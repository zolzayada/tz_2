package ru.lab;

import ru.lab.service.MathService;
import ru.lab.service.ReadAndWriteService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Генерируем файл с числами (в скобках указывается общее количество чисел и максимальная величина чисел)
        ReadAndWriteService.generateRandomNumbersFile(10, 10);

        //Читаем все числа из файла записываем их в список (в скобках указывается путь к файлу)
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");

        //Выводим в консоль получившийся список чисел
        System.out.println("Список чисел: " + numbers);

        //Создаем класс для использования работы с числами
        MathService mathService = new MathService(numbers);

        //Вызываем метод для поиска минимального значения и выводим результат в консоль
        System.out.println("Минимальное число в файле: " + mathService.min());

        //Вызываем метод для поиска максимального значения и выводим результат в консоль
        System.out.println("Максимальное число в файле: " + mathService.max());

        //Вызываем метод для подсчета суммы всех чисел и выводим результат в консоль
        System.out.println("Сумма всех чисел в файле: " + mathService.sum());

        //Вызываем метод для подсчета произведения всех чисел и выводим результат в консоль
        System.out.println("Произведение всех чисел в файле: " + mathService.mult());
    }
}