package code._4_student_effort.Observer;

public class Student implements Observer {
    String name;

    public Student(String name) {
        this.name = name;
    }

    void listenTo(Teacher teacher)
    {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student "+name+" learned about "+message);
    }
}
