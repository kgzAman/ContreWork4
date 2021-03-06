package com.company;

import java.util.List;
import java.util.Scanner;

public class Printer{

    public static final void printHeader(){
        System.out.println(String.format("%1$.3s+%1$-3.9s+%1$-3.10s+%1$-3.10s+%1$-3.10s+%1$-3.10s+%1$-1s+", "---------------"));
        System.out.println(String.format("%2.3s |%-8s |%-9s |%-9s |%-9s|%-9s |%-9s|", "#","Имя", "Возрост", "Здоровье", "Настроение","Сытость","Средний уровень"));
        System.out.println(String.format("%1$.3s+%1$-3.9s+%1$-3.10s+%1$-3.10s+%1$-3.10s+%1$-3.10s+%1$-1s+", "---------------"));
    }
    public static void printCat(Cat cat ){

        System.out.println(String.format("%2.3s |%8s |%6s    |%6s    |%6s    |%6s    |%8s       |",cat.getNumber(),cat.getName(), cat.getAge(), cat.getHealth(),cat.getMood(),cat.getSatiety(),cat.getAverageLevel()));

    }
    public static final void printFooter(){
        System.out.println(String.format("%1$.3s+%1$-3.9s+%1$-3.10s+%1$-3.10s+%1$-3.10s+%1$-3.10s+%1$-1s+", "---------------"));
    }

    public static int choose() {
        System.out.println(" 1 : Покормит \n 2 : Поиграть \n 3 : К ветеринару \n 4 : Завести нового кота ");
        Scanner scanner = new Scanner(System.in);
        int ac = Integer.parseInt(scanner.nextLine());
        return ac;
    }

    public static final void print(List<Cat> cats) {
        printHeader();
        cats.sort(Cat::sortByAverage);
        cats.forEach(Printer::printCat);
        printFooter();

        System.out.println();
    }

}
