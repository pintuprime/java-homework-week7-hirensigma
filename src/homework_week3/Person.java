package homework_week3;

public class Person {
    public static void main(String[] args) {// main method
        Person person = new Person();//object created
        person.setFirstName("");//first name is set to empty string
        person.setLastName(""); // last name is set to empty string
        person.setAge(10);
        System.out.println("fullName=" + person.getFullName());
        System.out.println("teen =" + person.isTeen());
        person.setFirstName("john");// first name is to set john
        person.setAge(18);
        System.out.println("full name=" + person.getFullName());
        System.out.println("teen=" + person.isTeen());
        person.setLastName("Smith");//last name is set to smith
        System.out.println("fullName=" + person.getFullName());
    }
    String firstName;//instance variable
    String lastName;//instance variable
    int Age;//instance variable
    public String getFirstName() {//instance method
        return firstName;
    }
    public String getLastName() {//instance method
        return lastName;
    }
    public int getAge() {//instance method
        return Age;
    }
    public void setFirstName(String firstName) {//instance method
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {//instance method
        this.lastName = lastName;
    }
    public void setAge(int Age) {//instance method
        if (Age > 0 && Age <= 100) {//if else loop used
            this.Age = Age;
        } else {
            this.Age = 0;
        }
    }
    public boolean isTeen() {//instance method
        if (Age > 12 && Age < 20) {//if else used
            return true;
        }
        return false;
    }
    public String getFullName() {//instance method
        if (firstName.isEmpty()) {//if else used
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "  ";
        } else {
            return firstName + " " + lastName;
        }
    }

}
