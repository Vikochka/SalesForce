package modals;

public class Contact {
    String firstName;
    String lastName;
    String accountName;
    String salutation;
    String title;
    String mobile;
    String phone;
    String mail;
    String reportsTo;
    String mailingStreet;
    String otherAddress;
    String mailingCity;
    String mailingStateProvince;
    String otherCity;
    String otherState;
    String otherStreet;
    String mailingZipPostalCode;
    String mailingCountry;
    String otherZipPostalCode;
    String otherCountry;
    String fax;
    String homePhone;
    String otherPhone;
    String asstPhone;
    String assistant;
    String department;
    String leadSource;
    String birthDate;
    String description;

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

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public String getOtherAddress() {
        return otherAddress;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public void setOtherStreet(String otherStreet) {
        this.otherStreet = otherStreet;
    }

    public void setOtherAddress(String otherAddress) {
        this.otherAddress = otherAddress;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingStateProvince() {
        return mailingStateProvince;
    }

    public void setMailingStateProvince(String mailingStateProvince) {
        this.mailingStateProvince = mailingStateProvince;
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

    public String getMailingZipPostalCode() {
        return mailingZipPostalCode;
    }

    public void setMailingZipPostalCode(String mailingZipPostalCode) {
        this.mailingZipPostalCode = mailingZipPostalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }

    public String getOtherZipPostalCode() {
        return otherZipPostalCode;
    }

    public void setOtherZipPostalCode(String otherZipPostalCode) {
        this.otherZipPostalCode = otherZipPostalCode;
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

    public String getAsstPhone() {
        return asstPhone;
    }

    public void setAsstPhone(String asstPhone) {
        this.asstPhone = asstPhone;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Contact(String firstName, String lastName, String accountName, String salutation, String title, String mobile,
                   String phone, String mail, String reportsTo, String mailingStreet, String otherAddress,
                   String mailingCity, String mailingStateProvince, String otherCity, String otherState,
                   String otherStreet, String mailingZipPostalCode, String mailingCountry, String otherZipPostalCode,
                   String otherCountry, String fax, String homePhone, String otherPhone, String asstPhone,
                   String assistant, String department, String leadSource, String birthDate, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountName = accountName;
        this.salutation = salutation;
        this.title = title;
        this.mobile = mobile;
        this.phone = phone;
        this.mail = mail;
        this.reportsTo = reportsTo;
        this.mailingStreet = mailingStreet;
        this.otherAddress = otherAddress;
        this.mailingCity = mailingCity;
        this.mailingStateProvince = mailingStateProvince;
        this.otherCity = otherCity;
        this.otherState = otherState;
        this.otherStreet = otherStreet;
        this.mailingZipPostalCode = mailingZipPostalCode;
        this.mailingCountry = mailingCountry;
        this.otherZipPostalCode = otherZipPostalCode;
        this.otherCountry = otherCountry;
        this.fax = fax;
        this.homePhone = homePhone;
        this.otherPhone = otherPhone;
        this.asstPhone = asstPhone;
        this.assistant = assistant;
        this.department = department;
        this.leadSource = leadSource;
        this.birthDate = birthDate;
        this.description = description;
    }
}
