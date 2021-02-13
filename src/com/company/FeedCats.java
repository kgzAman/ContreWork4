package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FeedCats {

    public void MakeCat( ){
        List<Cat> cats = new ArrayList<>();
        Printer print = new Printer();

        cats.add(new Cat(1,"Peach",11,78,86,50));
        cats.add(new Cat(2,"Jasper",12,83,39,43));
        cats.add(new Cat(3,"Poppy",9,38,57,71));
        addCat();

        Printer.print(cats);
  }
  public void addCat(){
        try (Scanner sc = new Scanner(System.in)){

        }
  }


}
