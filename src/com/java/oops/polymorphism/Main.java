package com.java.oops.polymorphism;

public class Main {

	public static void main(String[] args) {

		Shape shape = new Shape();
		System.out.println(shape.square(10));
		System.out.println(shape.circle(10.6));
		System.out.println(shape.traingle(10, 8));
		System.out.println(shape.rectangele(10, 5));
		System.out.println(shape.parallelogram(10, 8));
		
		
		System.out.println();
		ShapePolymorphic shapePolymorphic = new ShapePolymorphic();
		System.out.println(shapePolymorphic.area(10));
		System.out.println(shapePolymorphic.area(10.5));

	}

}
