package classes;

public class Customer extends Person{

    public int CustomerID;
    public String MembershipLevel;

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String Address;
    private int CreditCardNumber;

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getMembershipLevel() {
        return MembershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        MembershipLevel = membershipLevel;
    }

    public int getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        CreditCardNumber = creditCardNumber;
    }
}
