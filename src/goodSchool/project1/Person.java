package goodSchool.project1;

abstract public class Person {
    protected String firstName;
    protected String lastName;



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
