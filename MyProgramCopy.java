class Student {
    String name;
    int rollno;

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    Student(Student s) {
        name = s.name;
        rollno = s.rollno;
    }

    void display() {
        System.out.println("name=" + name);
        System.out.println("rollno=" + rollno);
    }
}

class MyProgramCopy {
    public static void main(String[] args) {
        Student s1 = new Student("darshan", 101);
        Student s2 = new Student(s1);

        s1.display();
        s2.display();
    }
}



