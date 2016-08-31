package module3.homework3.task3;

//        Class SpecialStudent that is child of CollegeStudent.
//        With additional fields long secretKey, String email.
//        Create three constructors: two the same as in CollegeStudend and one with secretKey field.

public class SpecialStudent extends CollegeStudent{
    private long secretKey;
    private String email;

    SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    SpecialStudent(long secretKey) {
        this.secretKey = secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
