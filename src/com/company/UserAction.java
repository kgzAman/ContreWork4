package com.company;

import java.util.*;

public class UserAction {

    public List<Cat> MakeCat( List<Cat> cats){
        cats.add(new Cat(1,"Peach",11,78,86,50));
        cats.add(new Cat(2,"Jasper",12,83,39,43));
        cats.add(new Cat(3,"Poppy",9,38,57,71));
        return cats;

  }

  public Cat addCat() {
      var rnd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя питомца ");
        String nameCat = sc.nextLine();
         System.out.println("Введите возраст питомца ");
      int ageCat = Integer.parseInt(String.valueOf(sc.nextInt()));;
      Cat a = new Cat(4,nameCat,ageCat,rnd.nextInt(80)+20,rnd.nextInt(80)+20,rnd.nextInt(80)+20);

      return a;
  }
}
