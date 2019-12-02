package com.company;

public class Main {

    public static void main(String[] args) {

        Box<Apple> boxOfApples = new Box<>();

        boxOfApples.add(new Apple());
        boxOfApples.add(new Apple());
        boxOfApples.add(new Apple());
        boxOfApples.add(new Apple());
        boxOfApples.add(new Apple());

        Cart<Box> cartOfBoxes = new Cart<>();

        cartOfBoxes.getList().add(boxOfApples);

        System.out.println(boxOfApples.getCount());
        System.out.println(cartOfBoxes.getCount());

    }
}
