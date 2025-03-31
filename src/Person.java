public class Person {
    private String name;
    private int age;
    private Address address;
    private String phoneNumber;
    private String email;

    public Person(String name, int age, Address address, String phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void printPersonalInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void printAddress() {
        address.printAddress();
    }

    public void printContactDetails() {
        System.out.println("Phone: " + phoneNumber + ", Email: " + email);
    }
}
