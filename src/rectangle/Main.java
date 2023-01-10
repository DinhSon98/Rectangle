package rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = scanner.nextDouble();
        System.out.println("Enter the height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("you rectangle"+ rectangle.display()+"\n");
        System.out.println("Perimeter of the Retangle: "+ rectangle.getPerimeter());
        System.out.println("area of the Rectangle: "+ rectangle.getArea());
    }
}