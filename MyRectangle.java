import java.util.Scanner;

class Rectangle {
    static float height;
    static float width;

    static void calArea() {
        System.out.println("Area = " + height * width);
    }
}

public class MyRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        Rectangle.height = sc.nextFloat();

        System.out.print("Enter width: ");
        Rectangle.width = sc.nextFloat();

        Rectangle.calArea();
    }
}
