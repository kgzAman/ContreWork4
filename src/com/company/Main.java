package com.company;
import Action.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List <Cat>cats = new ArrayList<>();
        UserAction us= new UserAction();

        Printer.print(us.MakeCat(cats));
        System.out.println("Выберите кота по номеру ");
        Scanner sc = new Scanner(System.in);
        int sd = sc.nextInt();
        System.out.println("Выбирите действие ");

        switch (Printer.choose()){
            case 1: feedCat fd = new feedCat();
            fd.makeAction(cats.get(sd));
                System.out.println("вы покормили "+ cats.get(sd).getName()+", " + cats.get(sd).getAge()+" лет ");
            break;
            case 2: play play = new play();
                play.makeAction(cats.get(sd));
                System.out.println("вы поиграли "+ cats.get(sd).getName()+", " + cats.get(sd).getAge()+" лет ");
                break;
            case 3 :
                goToDoctor goToDoctor = new goToDoctor();
                goToDoctor.makeAction(cats.get(sd));
                System.out.println("вы отвезли к доктору  "+ cats.get(sd).getName()+", " + cats.get(sd).getAge()+" лет ");
                break;
        }








    }
}
