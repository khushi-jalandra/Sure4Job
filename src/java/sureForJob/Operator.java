
package sureForJob;

public class Operator {
    
    
    private String OperatorId;
    private String userName;
    private String password;
    private String email;
    private long contact;
    private String Address;

    public Operator() {
    }

    public Operator(String OperatorId, String userName, String password, String email, long contact, String Address) {
        this.OperatorId = OperatorId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.contact = contact;
        this.Address = Address;
    }

    public String getOperatorId() {
        return OperatorId;
    }

    public void setOperatorId(String OperatorId) {
        this.OperatorId = OperatorId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
    
}
