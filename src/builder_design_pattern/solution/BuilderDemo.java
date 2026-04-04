package builder_design_pattern.solution;

public class BuilderDemo {
    public static void main(String[] args) {
        Student student  = new Student.Builder(2, "Aravind")
                .setAddress("Hyderabad").build();

        System.out.println(student);
    }
}
