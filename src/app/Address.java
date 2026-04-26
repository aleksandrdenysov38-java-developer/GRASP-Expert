package app;

class Address {
    private String city;
    private String street;
    private String houseNumber;

    public Address(String city, String street, String houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getFullAddress() {
        return city + ", " + street + ", " + houseNumber;
    }
}
