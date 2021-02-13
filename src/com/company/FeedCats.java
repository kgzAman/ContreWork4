package com.company;

import java.io.IOException;
import java.util.*;

public class FeedCats {


    public void MakeCat( List<Cat> cats){
        Printer print = new Printer();
        cats.add(new Cat(1,"Peach",11,78,86,50));
        cats.add(new Cat(2,"Jasper",12,83,39,43));
        cats.add(new Cat(3,"Poppy",9,38,57,71));

  }
  public void addCat(List<Cat> c ) {
      try{
      var rnd = new Random();
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите имя питомца ");
      String nameCat = sc.nextLine();
      System.out.println("Введите возраст питомца ");
      int ageCat = Integer.parseInt(String.valueOf(sc.nextInt()));;
      c.add(new Cat(4,nameCat,ageCat,rnd.nextInt(80)+20,rnd.nextInt(80)+20,rnd.nextInt(80)+20));
    }catch (InputMismatchException b ){
          System.out.println("Не правильно ввели данные  ");
      }
  }
}
