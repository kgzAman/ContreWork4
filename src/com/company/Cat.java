package com.company;

public class Cat implements AvaregeLevael{
    private String name;
    private int age;
    private int health;
    private int mood;
    private int satiety;
    private int averageLevel;
    int number;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getAverageLevel() {
        return averageLevel;
    }

    public void setAverageLevel(int averageLevel) {
        this.averageLevel = averageLevel;
    }


    public Cat(int number,String name, int age, int health, int mood, int satiety) {
        this.number=number;
        this.name = name;
        this.age = age;
        this.health = health;
        this.mood = mood;
        this.satiety = satiety;
        this.averageLevel = (this.satiety+this.mood+this.mood)/3;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static int sortByAverage(Cat one, Cat two){
   return two.getAverageLevel()-one.getAverageLevel();
    }

    @Override
    public int averageLevel() {
        int x =(getSatiety()+getMood()+getHealth())/3;
        return x;
    }

}
