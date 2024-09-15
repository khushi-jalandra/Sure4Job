
package sureForJob;

import java.io.File;

public class User {
    
    private String id;
    private String userName;
    private String password;
    private String email;
    private long contact;
    private String Address;
    private String Qualification;
    private String Status;
    private File photo;
    private float percentage_10;
    private float percentage_12;
    private float cgpa;
    private String newPassword;
    private String confirmPassword;

    public User() {
    }

    public User(String id, String userName, String password, String email, long contact, String Address, String Qualification, String Status, File photo, float percentage_10, float percentage_12, float cgpa) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.contact = contact;
        this.Address = Address;
        this.Qualification = Qualification;
        this.Status = Status;
        this.photo = photo;
        this.percentage_10 = percentage_10;
        this.percentage_12 = percentage_12;
        this.cgpa = cgpa;
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

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public float getPercentage_10() {
        return percentage_10;
    }

    public void setPercentage_10(float percentage_10) {
        this.percentage_10 = percentage_10;
    }

    public float getPercentage_12() {
        return percentage_12;
    }

    public void setPercentage_12(float percentage_12) {
        this.percentage_12 = percentage_12;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    
    
}
