public class Doctor extends  Person {


    public Doctor(String fullname, int age, String clothes, int experience, int salary) {
        super(fullname, age, clothes, experience, salary);
    }

    @Override
    public String toString() {
        return "Doctor{}" +super.toString();
    }
}






