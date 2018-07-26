package my.mybatis.generator.auto.entity;

import java.util.Date;

public class UserType {
    private String id;

    private String rowstamp;

    private String pawprint;

    private String usertype;

    private String submittedBy;

    private Date submitted;

    private Short isactive;

    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRowstamp() {
        return rowstamp;
    }

    public void setRowstamp(String rowstamp) {
        this.rowstamp = rowstamp == null ? null : rowstamp.trim();
    }

    public String getPawprint() {
        return pawprint;
    }

    public void setPawprint(String pawprint) {
        this.pawprint = pawprint == null ? null : pawprint.trim();
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype == null ? null : usertype.trim();
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy == null ? null : submittedBy.trim();
    }

    public Date getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Date submitted) {
        this.submitted = submitted;
    }

    public Short getIsactive() {
        return isactive;
    }

    public void setIsactive(Short isactive) {
        this.isactive = isactive;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}