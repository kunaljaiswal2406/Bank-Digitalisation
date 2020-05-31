package bank.dto;

public class user extends UserID {

    private long accountNo;
    private String userName;
    private int cifNo;
    private long adharNo;
    private String address;
    private long phoneNo;
    private String eMail;
    private String accountType;
    private String dob;
    private double balance;

    public user() {
    }

    public user(long accountNo, String userName, int cifNo, long adharNo, String address, long phoneNo, String eMail, String accountType, String dob, double balance, String id, String password) {
        super(id, password);
        this.accountNo = accountNo;
        this.userName = userName;
        this.cifNo = cifNo;
        this.adharNo = adharNo;
        this.address = address;
        this.phoneNo = phoneNo;
        this.eMail = eMail;
        this.accountType = accountType;
        this.dob = dob;
        this.balance = balance;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCifNo() {
        return cifNo;
    }

    public void setCifNo(int cifNo) {
        this.cifNo = cifNo;
    }

    public long getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(long adharNo) {
        this.adharNo = adharNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

}
