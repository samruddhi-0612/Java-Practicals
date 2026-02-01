public class Mystatic {

    public static void main(String[] args) {
        int a = 1, b = 2, c;

        c = add(a, b); // static method call
        System.out.println(c);
    }

    static int add(int i, int j) {
        return i + j;
    }
}

