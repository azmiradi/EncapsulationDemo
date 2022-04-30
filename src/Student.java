public class Student {
    private String name;
    private String idNum;
    private int age;

    public String getAge() {
        if (age < 24)
            return "Age Invalid";
        else return "30";
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum(String newId) {

        idNum = newId;
    }

    public String getStudentCard() {
        return "" + "Student Name: " + getName() + "\n" +
                "Student ID: " + getIdNum() + "\n" +
                "Student Age: " + getAge() + "\n";
    }

}
