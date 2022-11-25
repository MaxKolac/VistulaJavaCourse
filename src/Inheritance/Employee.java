package Inheritance;

public class Employee {
    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getStreetName() {
        return streetName;
    }
    public String getStreetNumber() {
        return streetNumber;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getCity() {
        return city;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setCity(String city) {
        this.city = city;
    }

    private String name;
    private String secondName;
    private String streetName;
    private String streetNumber;
    private String postalCode;
    private String city;

    Employee(){

    }

    public void Initialize(String name, String secondName, String streetName,
                           String streetNumber, String postalCode, String city){
        this.name = name;
        this.secondName = secondName;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
    }

    public void Print(){
        System.out.println();
        System.out.print(name + ", ");
        System.out.print(secondName + ", ");
        System.out.print(streetName + ", ");
        System.out.print(streetNumber + ", ");
        System.out.print(postalCode + ", ");
        System.out.print(city);
    }
}

