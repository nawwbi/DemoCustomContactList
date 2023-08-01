package sg.edu.rp.c346.id22024713.democustomcontactlist;

public class Contact {
    private String name;
    private int countryCode;
    private int phoneNumber;
    private char gender;

    public Contact(String name, int countryCode, int phoneNumber, char gender) {
        this.name = name;
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", countryCode=" + countryCode +
                ", phoneNumber=" + phoneNumber +
                ", gender=" + gender +
                '}';
    }
}
