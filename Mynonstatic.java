public class Mynonstatic {

    public static void main(String[] args) {
        int a = 1, b = 2, c;

        Mynonstatic mp = new Mynonstatic(); // object creation
        c = mp.add(a, b);

        System.out.println(c);
    }

    public int add(int i, int j) {
        return i + j;
    }
}


