public class Person {
    private String name;
    private int age;
    
    private String address;
    private String city;
    
    private String phoneNumber;
    private String email;

    public Person(String name, int age, String address, String city, String phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void printPersonalInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void printAddress() {
        System.out.println("Address: " + address + ", City: " + city);
    }

    public void printContactDetails() {
        System.out.println("Phone: " + phoneNumber + ", Email: " + email);
    }
}
