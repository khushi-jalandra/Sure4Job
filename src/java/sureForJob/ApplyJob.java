
package sureForJob;

import java.io.File;


public class ApplyJob {
    
    private String id;
    private String userName;
    private String email;
    private String contact;
    private String address;
    private File photo;
    private float percentage_10;
    private float percentage_12;
    private float cgpa;
    private String Qualification;
    private boolean confirm;

    public ApplyJob() {
    }

    public ApplyJob(String id, String userName, String email, String contact, String address, File photo, float percentage_10, float percentage_12, float cgpa, String Qualification, boolean confirm) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.contact = contact;
        this.address = address;
        this.photo = photo;
        this.percentage_10 = percentage_10;
        this.percentage_12 = percentage_12;
        this.cgpa = cgpa;
        this.Qualification = Qualification;
        this.confirm = confirm;
    }

    public boolean isConfirm() {
        return confirm;
    }

    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }
    
    
}
