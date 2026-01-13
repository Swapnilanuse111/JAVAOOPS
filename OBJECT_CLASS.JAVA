class Student
{
    void disp()
    {
        int id = 1;            // initialized
        String name = "Ram";   // initialized

        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}

class OBJECT_CLASS
{
    public static void main(String args[])
    {
        Student s = new Student();
        s.disp();
    }
}
