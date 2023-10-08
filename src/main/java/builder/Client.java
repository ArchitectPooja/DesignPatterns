package builder;

public class Client {
    //Requirements for Builder:-
        /*
        1. If a class has lot of attributes.
        2. We have to validate the attributes before the object gets created.
         */
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                            .setName("Pooja")
                           // .setGradYear(2023)
                            .build();
        System.out.println(student.name);
    }
}
