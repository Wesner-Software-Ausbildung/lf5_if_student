package sort;

import java.util.Scanner;

public class SortUI {

    public static void main(String[] args) {
        Sort sort = new Sort();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Erste große: ");
        double size1 = scanner.nextDouble();
        System.out.print("Zweite große: ");
        double size2 = scanner.nextDouble();
        System.out.print("Dritte große: ");
        double size3 = scanner.nextDouble();
        System.out.println(sort.sort(size1, size2, size3));
    }
}
