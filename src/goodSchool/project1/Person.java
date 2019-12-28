package goodSchool.project1;

abstract public class Person {
    private String firstName;
    private String lastName;



    protected Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected String getLastName() {
        return lastName;
    }

    protected String getFullName() {
        return firstName + lastName;
    }

}
