public class Address {
    private String address;
    private String city;

    public Address(String address, String city) {
        this.address = address;
        this.city = city;
    }

    public void printAddress() {
        System.out.println("Address: " + address + ", City: " + city);
    }
}
