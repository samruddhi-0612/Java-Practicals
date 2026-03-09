class Person{
    String name;
    int age;
}
class myProgramPerson{
    public static void main(String[] args){
    Person p1 = new Person();
    Person p2 = new Person();
    p1.name = "Samruddhi";
    p1.age = 20;
    p2.name = "Shubham";
    p2.age = 21;
    System.out.println("p1.name = "+p1.name);
    System.out.println("p1.age = "+p1.age);
    System.out.println("p2.name = "+p2.name);
    System.out.println("p2.age = "+p2.age);
}
}