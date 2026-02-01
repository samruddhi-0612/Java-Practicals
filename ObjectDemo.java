class Rectangle {
    int width;
    int height;
}

class ObjectDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = r1;

        r1.width = 10;
        r1.height = 20;

        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
    }
}

