package ru.job4j;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;

    }

    public static void main(String[] args) {
        int maxi = Max.max(2, 3);
        System.out.println(maxi);
    }
}