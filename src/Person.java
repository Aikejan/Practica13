public class Person {
    private  String fullname;
    private  int age;
    private String clothes;
    private  int experience;
    private  int salary;

    public Person(String fullname, int age, String clothes, int experience, int salary) {
        this.fullname = fullname;
        this.age = age;
        this.clothes = clothes;
        this.experience = experience;
        this.salary = salary;


    }
    public  int work(){
        return salary;
    }
    public String wear(){
        return clothes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", clothes='" + clothes + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }
}

