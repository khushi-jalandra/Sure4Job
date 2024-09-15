

package sureForJob;


public class Job {
    
    private int jobId;
    private String OperatorId;
    private String userName;
    private String email;
    private String contact;
    private String jobInfo;
    private String jobMode;
    private String workDeadline;
    private float amount;
    private String termsAndCondition;

    public Job() {
    }

    public Job(int jobId, String OperatorId, String userName, String email, String contact, String jobInfo, String jobMode, String workDeadline, float amount, String termsAndCondition) {
        this.jobId = jobId;
        this.OperatorId = OperatorId;
        this.userName = userName;
        this.email = email;
        this.contact = contact;
        this.jobInfo = jobInfo;
        this.jobMode = jobMode;
        this.workDeadline = workDeadline;
        this.amount = amount;
        this.termsAndCondition = termsAndCondition;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
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

    public String getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(String jobInfo) {
        this.jobInfo = jobInfo;
    }

    public String getJobMode() {
        return jobMode;
    }

    public void setJobMode(String jobMode) {
        this.jobMode = jobMode;
    }

    public String getWorkDeadline() {
        return workDeadline;
    }

    public void setWorkDeadline(String workDeadline) {
        this.workDeadline = workDeadline;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getTermsAndCondition() {
        return termsAndCondition;
    }

    public void setTermsAndCondition(String termsAndCondition) {
        this.termsAndCondition = termsAndCondition;
    }

   
}
