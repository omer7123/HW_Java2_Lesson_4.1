package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();

        System.out.println("Введите 5 строк в список а");
        a.add(scan.nextLine());
        a.add(scan.nextLine());
        a.add(scan.nextLine());
        a.add(scan.nextLine());
        a.add(scan.nextLine());

        System.out.println("Список а: " + a);
        System.out.println("Введите 5 строк в список b");

        b.add(scan.nextLine());
        b.add(scan.nextLine());
        b.add(scan.nextLine());
        b.add(scan.nextLine());
        b.add(scan.nextLine());

        System.out.println("Список b: " + b);

        Collections.reverse(b);
        Iterator<String> iteratorA = a.iterator();
        Iterator<String> iteratorB = b.iterator();
        while (iteratorA.hasNext() && iteratorB.hasNext()) {
            c.add(iteratorA.next());
            c.add(iteratorB.next());
        }
        System.out.println(c);
        c.sort(Comparator.comparing(String::length));
        System.out.println(c);

    }
}
