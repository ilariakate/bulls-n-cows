
class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {

        if (firstName.equals("") && lastName.equals("")) {
            return "Unknown";
        }
        if (firstName.equals("") || lastName.equals("")) {
            return firstName + lastName;
        }
        return firstName + " " + lastName;
    }
}