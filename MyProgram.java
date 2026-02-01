import java.util.Scanner;

class Rectangle {
    float height;
    float width;

    float calArea() {
        return height * width;
    }
}

class MyProgram {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Scanner sc = new Scanner(System.in);

        System.out.print("enter height:");
        r1.height = sc.nextFloat();

        System.out.print("enter width:");
        r1.width = sc.nextFloat();

        float area = r1.calArea();
        System.out.println("Area=" + area);
    }
}


