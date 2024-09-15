
package sureForJob;


public class Admin {
    
    private String AdminId;
    private String userNmae;
    private String password;

    public Admin() {
    }

    public Admin(String AdminId, String userNmae, String password) {
        this.AdminId = AdminId;
        this.userNmae = userNmae;
        this.password = password;
    }

       public String getAdminId() {
        return AdminId;
    }

    public void setAdminId(String AdminId) {
        this.AdminId = AdminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserNmae() {
        return userNmae;
    }

    public void setUserNmae(String userNmae) {
        this.userNmae = userNmae;
    }


    
    
}
