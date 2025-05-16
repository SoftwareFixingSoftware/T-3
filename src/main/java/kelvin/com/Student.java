package kelvin.com;

public class Student {
    private int age;
    private String name;

    public Student() {
            this.age = age;
            this.name = name;


    }
    //getters and setters samples

    //Start with Getters for age

    public int getAge() {
        return age;
    }
    //Setters for age
    public void setAge(int age) {
        if (age >=0&&age <=150) {
            this.age = age;
        }

    }
    //this is getters for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }

    }
}
