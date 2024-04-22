package surnoi.login.EmployeeLogin.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class LeaveAction {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String fromDate;
    private String toDate;
    private String typeOfLeave;
    private String note;
    private String notify;
    private String action;

    public LeaveAction() {
        super();
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFromDate() {
        return fromDate;
    }
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }
    public String getToDate() {
        return toDate;
    }
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
    public String getTypeOfLeave() {
        return typeOfLeave;
    }
    public void setTypeOfLeave(String typeOfLeave) {
        this.typeOfLeave = typeOfLeave;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public String getNotify() {
        return notify;
    }
    public void setNotify(String notify) {
        this.notify = notify;
    }
    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    @Override
    public String toString() {
        return "LeaveAction [id=" + id + ", fromDate=" + fromDate + ", toDate=" + toDate + ", typeOfLeave="
                + typeOfLeave + ", note=" + note + ", notify=" + notify + ", action=" + action + "]";
    }

}