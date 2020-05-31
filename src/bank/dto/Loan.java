package bank.dto;

public class Loan {

    private String name;
    private long accNo;
    private String loanType;
    private long contact;
    private String Addr;
    private String others;

    public Loan() {
    }

    public Loan(String name, long accNo, String loanType, long contact, String Addr, String others) {
        this.name = name;
        this.accNo = accNo;
        this.loanType = loanType;
        this.contact = contact;
        this.Addr = Addr;
        this.others = others;
    }

    public Loan(String name, String accNo, String loanType, String contact, String addr, String other) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

}
