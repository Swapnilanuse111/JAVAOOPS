class Student {
    int id;
    String name;
    int id1;
    String name1;

    Student(int id, String name) {
        this.id = id;       // instance variable
        this.name = name;   // instance variable
        this.id1=id1;
        this.name1=name1;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(id1 + " " + name1);
    }

    public static void main(String[] args) {
        Student s = new Student(101, "Swapnil");
        Student s2 = new Student(102, "Rahul");
        s.display();
        s2.display();
    }
}
