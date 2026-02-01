class StaticDemo {

    static int a = 4;
    static int b;

    static {
        System.out.println("Static block initialized.");
        b = a * 5;
    }

    static void dispValue(int x) {
        System.out.println("Static method initialized.");
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        System.out.println("inside main()");
        dispValue(44);
    }
}

