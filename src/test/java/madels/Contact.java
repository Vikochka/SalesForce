package madels;

public class Contact {
    String firstName;
    String lastName;
    String accountName;
    String mobile;
    String phone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact(String firstName, String lastName, String accountName, String mobile, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountName = accountName;
        this.mobile = mobile;
        this.phone = phone;
    }
}
