class Box {
    double length, breadth, height;

    Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void volume() {
        double v = length * breadth * height;
        System.out.println("Volume is " + v);
    }
}

class BoxDemoThis {
    public static void main(String[] args) {
        Box b1 = new Box(20, 30, 10);
        Box b2 = new Box(3, 6, 9);

        b1.volume();
        b2.volume();
    }
}



