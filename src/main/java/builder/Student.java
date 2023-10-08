package builder;

public class Student {
    String name;
    int age;
    int psp;
    String phoneNumber;
    int gradYear;
    String batch;

    //Private constructor to avoid creating Student class object directly
    private Student(){}

    private Student(Builder builder){
        if(builder.getGradYear() > 2022){
            throw new IllegalArgumentException("Grad year can't be greater than 2022");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.phoneNumber = builder.getPhoneNumber();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    static class Builder{
        String name;
        int age;
        int psp;
        String phoneNumber;
        int gradYear;
        String batch;

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public int getPsp() {
            return this.psp;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public int getGradYear() {
            return this.gradYear;
        }

        public String getBatch() {
            return this.batch;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}