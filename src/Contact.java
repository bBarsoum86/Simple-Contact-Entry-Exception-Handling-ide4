public class Contact {
    //the fields of the contact
    private String name;
    private String email;
    private String phoneNumber;

    // the constructor
    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // display contact information ( name - email - phone number)
    public void displayInfo() {
        System.out.println("Contact Information:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }
// the getters for name and email and phone number
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
