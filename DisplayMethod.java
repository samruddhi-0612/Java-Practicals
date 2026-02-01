class Person {
    String name;
    int age;

    void displayName() {
        System.out.println("name=" + name);
    }

    void displayAge() {
        System.out.println("age=" + age);
    }
}

class DisplayMethod {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "modi";
        p1.age = 71;

        p2.name = "bachchan";
        p2.age = 80;

        p1.displayName();
        p2.displayName();
        p1.displayAge();
        p2.displayAge();
    }
}
