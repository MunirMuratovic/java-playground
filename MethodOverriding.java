package com.company;

public class Main {

    public static void main(String[] args) {
        Dog doggie = new Dog("doggie", 4);
        doggie.eat();
    }

    public static class Animal {
        private String name;
        private int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void eat() {
            System.out.println("This animal eats");
        }
    }

    public static class Dog extends Animal {

        private void chew() {
            System.out.println("This dog chews");
        }

        @Override
        public void eat() {
            System.out.println("Method eat() is overriden!");
            super.eat(); // calling eat() method by default from super class
            chew();
        }

        public Dog(String name, int age) {
            super(name, age);
        }
    }
}
