    public class Employee {

    private String name;
    private int age;
    private Employer employer;

    public Employee (String name, int age, Employer employer) {

        this.name = name;
        this.age = age;
        this.employer = employer;

    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;

//        Employee > getName();

    }

        public Employer getEmployer() {

            return employer;
        }
    }
