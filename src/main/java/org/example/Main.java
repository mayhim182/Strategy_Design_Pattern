package org.example;

public class Main {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    FlyBehavior flyBehavior = new FlyNoWay();
    QuackBehavior quackBehavior = new MuteQuack();
    mallard.setFlyBehavior(flyBehavior);
    mallard.setQuackBehavior(quackBehavior);
    mallard.performQuack();
    mallard.performFly();

    System.out.println("Hello world!");
  }
}
