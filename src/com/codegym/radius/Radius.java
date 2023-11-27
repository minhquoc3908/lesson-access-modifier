package com.codegym.radius;

public class Radius {
  private double radius=1.0;
  private String color ="red";

    public Radius() {

    }

    public void Radius(){

  }
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

