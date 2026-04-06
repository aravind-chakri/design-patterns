package builder_design_pattern.problem;

public class TelescopicClass {

    // required fields
    private int a;
    private int b;

    // optional fields
    private String word;
    private Double c;

    /*
    * This class contains optional fields resulting in telescopic constructors.
    * We can eliminate this problem using setters, but that will make objects of
    * this class as mutable objects and not thread safe
    *
    *
    * Let's see how Builder Design Pattern solves this problem
    *  */

    public TelescopicClass(int a, Double c, String word, int b) {
        this.a = a;
        this.c = c;
        this.word = word;
        this.b = b;
    }

    public TelescopicClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public TelescopicClass(int a, String word, int b) {
        this.a = a;
        this.word = word;
        this.b = b;
    }
}
