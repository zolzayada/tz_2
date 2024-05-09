package ru.lab.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MathServiceTest {

    @Test
    void min() {
        MathService mathService = new MathService(Arrays.asList(1, 10, -1, -10, 100));
        int expected = -10;
        int actual = mathService.min();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void max() {
        MathService mathService = new MathService(Arrays.asList(1, 10, -1, -10, 100));
        int expected = 100;
        int actual = mathService.max();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void sum() {
        MathService mathService = new MathService(Arrays.asList(1, 10, -1, -10, 100));
        int expected = 100;
        int actual = mathService.sum();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void mult() {
        MathService mathService = new MathService(Arrays.asList(1, 10, -1, -10, 100));
        int expected = 10000;
        int actual = mathService.mult();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenGenerate1000NumbersAndGetMin() {
        int countNumbers = 1000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        MathService mathService = new MathService(numbers);
        mathService.min();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Время затраченное на выполнение чтения и поиска минимума из " + countNumbers + " чисел: " + result + " милисекунд");
    }

    @Test
    void whenGenerate1000NumbersAndGetMax() {
        int countNumbers = 1000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        MathService mathService = new MathService(numbers);
        mathService.max();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Время затраченное на выполнение чтения и поиска максимума из " + countNumbers + " чисел: " + result + " милисекунд");
    }

    @Test
    void whenGenerate1000NumbersAndGetSum() {
        int countNumbers = 1000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        MathService mathService = new MathService(numbers);
        mathService.sum();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Время затраченное на выполнение чтения и поиска суммы из " + countNumbers + " чисел: " + result + " милисекунд");
    }

    @Test
    void whenGenerate1000NumbersAndGetMult() {
        int countNumbers = 1000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        MathService mathService = new MathService(numbers);
        mathService.mult();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Время затраченное на выполнение чтения и поиска произведения из " + countNumbers + " чисел: " + result + " милисекунд");
    }

    @Test
    void whenGenerate100000NumbersAndGetMin() {
        int countNumbers = 100000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        MathService mathService = new MathService(numbers);
        mathService.min();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Время затраченное на выполнение чтения и поиска минимума из " + countNumbers + " чисел: " + result + " милисекунд");
    }

    @Test
    void whenGenerate100000NumbersAndGetMax() {
        int countNumbers = 100000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        MathService mathService = new MathService(numbers);
        mathService.max();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Время затраченное на выполнение чтения и поиска максимума из " + countNumbers + " чисел: " + result + " милисекунд");
    }

    @Test
    void whenGenerate100000NumbersAndGetSum() {
        int countNumbers = 100000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        MathService mathService = new MathService(numbers);
        mathService.sum();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Время затраченное на выполнение чтения и поиска суммы из " + countNumbers + " чисел: " + result + " милисекунд");
    }

    @Test
    void whenGenerate100000NumbersAndGetMult() {
        int countNumbers = 100000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        MathService mathService = new MathService(numbers);
        mathService.mult();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Время затраченное на выполнение чтения и поиска произведения из " + countNumbers + " чисел: " + result + " милисекунд");
    }

    @Test
    void whenGenerate1000000NumbersAndGetMin() {
        int countNumbers = 1000000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        MathService mathService = new MathService(numbers);
        mathService.min();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Время затраченное на выполнение чтения и поиска минимума из " + countNumbers + " чисел: " + result + " милисекунд");
    }

    @Test
    void whenGenerate1000000NumbersAndGetMax() {
        int countNumbers = 1000000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        MathService mathService = new MathService(numbers);
        mathService.max();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Время затраченное на выполнение чтения и поиска максимума из " + countNumbers + " чисел: " + result + " милисекунд");
    }

    @Test
    void whenGenerate1000000NumbersAndGetSum() {
        int countNumbers = 1000000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        MathService mathService = new MathService(numbers);
        mathService.sum();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Время затраченное на выполнение чтения и поиска суммы из " + countNumbers + " чисел: " + result + " милисекунд");
    }

    @Test
    void whenGenerate1000000NumbersAndGetMult() {
        int countNumbers = 1000000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        long startTime = System.currentTimeMillis();
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        MathService mathService = new MathService(numbers);
        mathService.mult();
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println("Время затраченное на выполнение чтения и поиска произведения из " + countNumbers + " чисел: " + result + " милисекунд");
    }

    @Test
    void whenWriteAndReadFileWithNumbers() {
        int countNumbers = 1000;
        ReadAndWriteService.generateRandomNumbersFile(countNumbers, 10);
        List<Integer> numbers = ReadAndWriteService.readFileWithNumbers("./files/numbers.txt");
        assertThat(numbers).hasSize(countNumbers);
    }
}