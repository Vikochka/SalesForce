package models;

//VALUE OBJECT PATTERN
//POJO - PLAIN OUT JAVA OBJECT
public class Contact {

    String salutation;
    String firstName;
    String lastName;
    String accountName;
    String title;
    String phone;
    String mobile;
    String email;
    String reportsTo;
    String mailingStreet;
    String mailingCity;
    String mailingState;
    String postalCode;
    String mailingCountry;
    String otherStreet;
    String otherCity;
    String otherState;
    String otherZip;
    String otherCountry;
    String fax;
    String homePhone;
    String otherPhone;
    String assistPhone;
    String assistant;
    String department;
    String leadSource;
    String birthdate;
    String description;

    public Contact(String salutation, String firstName, String lastName, String accountName, String title, String phone, String mobile, String email, String reportsTo, String mailingStreet, String mailingCity, String mailingState, String postalCode, String mailingCountry, String otherStreet, String otherCity, String otherState, String otherZip, String otherCountry, String fax, String homePhone, String otherPhone, String assistPhone, String assistant, String department, String leadSource, String birthdate, String description) {
        this.salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountName = accountName;
        this.title = title;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
        this.reportsTo = reportsTo;
        this.mailingStreet = mailingStreet;
        this.mailingCity = mailingCity;
        this.mailingState = mailingState;
        this.postalCode = postalCode;
        this.mailingCountry = mailingCountry;
        this.otherStreet = otherStreet;
        this.otherCity = otherCity;
        this.otherState = otherState;
        this.otherZip = otherZip;
        this.otherCountry = otherCountry;
        this.fax = fax;
        this.homePhone = homePhone;
        this.otherPhone = otherPhone;
        this.assistPhone = assistPhone;
        this.assistant = assistant;
        this.department = department;
        this.leadSource = leadSource;
        this.birthdate = birthdate;
        this.description = description;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public void setOtherCity(String otherCity) {
        this.otherCity = otherCity;
    }

    public String getOtherState() {
        return otherState;
    }

    public void setOtherState(String otherState) {
        this.otherState = otherState;
    }

    public String getOtherZip() {
        return otherZip;
    }

    public void setOtherZip(String otherZip) {
        this.otherZip = otherZip;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public void setOtherCountry(String otherCountry) {
        this.otherCountry = otherCountry;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }

    public String getAssistPhone() {
        return assistPhone;
    }

    public void setAssistPhone(String assistPhone) {
        this.assistPhone = assistPhone;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
