package com.ramkrishna;

import java.util.Scanner;

public class OneToTwenty {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter any of the four (Area, Perimeter, Volume, Surface Area)");
        String str=in.nextLine();

        str=str.toUpperCase();

        switch (str) {
            case "AREA" -> {
                System.out.println("Enter the choice(Circle, Triangle, Rectangle, Isosceles Triangle, Parallelogram, Rhombus, Equilateral triangle)");
                String choice=in.nextLine();
                choice=choice.toUpperCase();
                switch (choice) {
                    case "CIRCLE" -> {
                        System.out.println("Enter radius: ");
                        double r=in.nextDouble();
                        System.out.println("Area of circle is "+Math.PI*r*r);
                    }
                    case "TRIANGLE" -> {
                        System.out.println("Enter 3 sides of triangle");
                        double a=in.nextDouble(),b= in.nextDouble(),c= in.nextDouble();
                        double s=(a+b+c)/2;
                        System.out.println("Area of Triangle is "+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                    }
                    case "RECTANGLE" -> {
                        System.out.println("Enter length and breadth: ");
                        double l= in.nextDouble(),b=in.nextDouble();
                        System.out.println("Area of rectangle is "+l*b);
                    }
                    case "ISOSCELES TRIANGLE" -> {
                        System.out.println("Enter lengths on  equal and base side respectively: ");
                        double a=in.nextDouble(),b=in.nextDouble();
                        System.out.println("Area of Isosceles Triangle is "+((b/2)+Math.sqrt((a*a-b*b)/4)));
                    }
                    case "PARALLELOGRAM" -> {
                        System.out.println("Enter base and height: ");
                        double base=in.nextDouble(),height=in.nextDouble();
                        System.out.println("Area of parallelogram is "+base*height);
                    }
                    case "RHOMBUS" -> {
                        System.out.println("Enter Lengths of Diagonal: ");
                        double p=in.nextDouble(),q=in.nextDouble();
                        System.out.println("Area of Rhombus is "+p*q/2);
                    }
                    case "EQUILATERAL TRIANGLE" -> {
                        System.out.println("Enter length of a side: ");
                        double a=in.nextDouble();
                        System.out.println("Area of Equilateral triangle is "+a*a*Math.sqrt(3)/4);
                    }
                    default -> System.out.println("Not a valid Input");
                }
            }
            case "PERIMETER" ->{
                System.out.println("Enter the choice:(Circle, Equilateral Triangle, Parallelogram, Rectangle, Square, Rhombus)");
                String choice=in.nextLine();
                choice=choice.toUpperCase();
                switch (choice){
                    case "CIRCLE" -> {
                        System.out.println("Enter radius:");
                        double r=in.nextDouble();
                        System.out.println("Circumference of circle is "+(Math.PI*r*2));
                    }
                    case "EQUILATERAL TRIANGLE" -> {
                        System.out.println("Enter length of side");
                        double side=in.nextDouble();
                        System.out.println("Perimeter of Equilateral Triangle is "+(3*side));
                    }
                    case "PARALLELOGRAM" -> {
                        System.out.println("Enter lengths of non parallel sides: ");
                        double a=in.nextDouble(),b=in.nextDouble();
                        System.out.println("Perimeter of Parallelogram is "+(2*a+2*b));
                    }

                    case "RECTANGLE" -> {
                        System.out.println("Enter Length and Breadth:");
                        double l=in.nextDouble(),b=in.nextDouble();
                        System.out.println("Perimeter of Rectangle is "+(2*l+2*b));
                    }
                    case "SQUARE" -> {
                        System.out.println("Enter length of side: ");
                        double side=in.nextDouble();
                        System.out.println("Perimeter of Square is "+4*side);
                    }
                    case "RHOMBUS" -> {
                        System.out.println("Enter length of a side: ");
                        double side=in.nextDouble();
                        System.out.println("Perimeter of Rhombus is "+4*side);
                    }
                    default -> System.out.println("Not a valid input");

                }
            }
            case "VOLUME" -> {
                System.out.println("Enter your choice(Cone, Prism, Cylinder, Sphere, Pyramid): ");
                String choice=in.nextLine();
                choice=choice.toUpperCase();
                switch (choice){
                    case "CONE"-> {
                        System.out.println("Enter height and radius: ");
                        double h=in.nextDouble(),r=in.nextDouble();
                        System.out.println("Volume of cone is "+Math.PI*r*r*h/3);
                    }
                    case "PRISM"-> {
                        System.out.println("Enter height and area of face:");
                        double h=in.nextDouble(),a=in.nextDouble();
                        System.out.println("Volume of prism is "+h*a);
                    }
                    case "CYLINDER"-> {
                        System.out.println("Enter height and radius");
                        double h=in.nextDouble(),r=in.nextDouble();
                        System.out.println("Volume of Cylinder is "+Math.PI*r*r*h);
                    }
                    case "SPHERE"-> {
                        System.out.println("Enter radius");
                        double r=in.nextDouble();
                        System.out.println("Volume of Sphere is "+4*Math.PI*r*r*r/3);
                    }
                    case "PYRAMID"-> {
                        System.out.println("Enter length, width and height: ");
                        double l=in.nextDouble(),w=in.nextDouble(),h=in.nextDouble();
                        System.out.println("Volume of pyramid is "+l*w*h/3);
                    }
                    default -> System.out.println("Not a valid Input.");
                }
            }
            case "SURFACE AREA" -> {
                System.out.println("Enter your choice(Cylinder, Cube):");
                String choice=in.nextLine();
                choice=choice.toUpperCase();
                switch (choice){
                    case "CYLINDER" -> {
                        System.out.println("Enter Height and radius: ");
                        double h=in.nextDouble(),r=in.nextDouble();
                        System.out.println("Curved surface area of cylinder is "+2*Math.PI*r*h);
                    }
                    case "CUBE" -> {
                        System.out.println("Enter a length of side:");
                        double s=in.nextDouble();
                        System.out.println("Total surface area of cube is "+6*s*s);
                    }
                    default -> System.out.println("Not a valid Input.");
                }
            }
            default -> System.out.println("Not a valid Input");
        }

    }
}
