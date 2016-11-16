package classes;

public class Employee extends Person {

    public String department;
    public int SSSID;
    public int PagibigID;
    private String introduceYourself;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSSSID() {
        return SSSID;
    }

    public void setSSSID(int SSSID) {
        this.SSSID = SSSID;
    }

    public int getPagibigID() {
        return PagibigID;
    }

    public void setPagibigID(int pagibigID) {
        PagibigID = pagibigID;
    }

    public String getintroduceYourself() {
        return introduceYourself;
    }
}
