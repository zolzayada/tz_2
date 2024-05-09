package ru.lab.service;

import java.util.List;

public class MathService {
    private List<Integer> numbers;

    public MathService(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int min() {
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int max() {
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int sum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public int mult() {
        int multiply = 1;
        for (int num : numbers) {
            multiply *= num;
        }
        return multiply;
    }
}
