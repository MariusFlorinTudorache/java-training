package code._4_student_effort.Animal_Hierarchy;

public class Spider extends Animal {
    public Spider()
    {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Paianjenul mananca insecte");
    }
}
