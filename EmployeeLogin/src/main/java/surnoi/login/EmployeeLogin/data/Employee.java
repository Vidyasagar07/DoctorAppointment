package surnoi.login.EmployeeLogin.data;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;
    private String firstName;
    private String lastName;
    private String martialStatus;
    private String dateOfBirth;
    private String role;
    private String department;
    private String workEmail;
    private String personalEmail;
    private long mobilePhone;
    private long workPhone;
    private String currentAddressLine;
    private String currentAddressCity;
    private String currentAddressPinCode;
    private String currentAddressState;
    private String permanentCurrentAddressLine;
    private String permanentCurrentAddressCity;
    private String permanentCurrentAddressPinCode;
    private String permanentCurrentAddressState;
    private String graduationBranch;
    private String graduationCGPA;
    private String graduationYearOfCompletion;
    private String graduationUniversity;
    private String postGraduationBranch;
    private String postGraduationCGPA;
    private String postGraduationYearOfCompletion;
    private String postGraduationUniversity;
    private String employeeUsername;
    private String employeePassword;


    public Employee(){

    }

    public Employee(String firstName, String lastName, String martialStatus, String dateOfBirth, String role, String department, String workEmail, String personalEmail, long mobilePhone, long workPhone, String currentAddressLine, String currentAddressCity, String currentAddressPinCode, String currentAddressState, String permanentCurrentAddressLine, String permanentCurrentAddressCity, String permanentCurrentAddressPinCode, String permanentCurrentAddressState, String graduationBranch, String graduationCGPA, String graduationYearOfCompletion, String graduationUniversity, String postGraduationBranch, String postGraduationCGPA, String postGraduationYearOfCompletion, String postGraduationUniversity, String employeeUsername, String employeePassword) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.martialStatus = martialStatus;
        this.dateOfBirth = dateOfBirth;
        this.role = role;
        this.department = department;
        this.workEmail = workEmail;
        this.personalEmail = personalEmail;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.currentAddressLine = currentAddressLine;
        this.currentAddressCity = currentAddressCity;
        this.currentAddressPinCode = currentAddressPinCode;
        this.currentAddressState = currentAddressState;
        this.permanentCurrentAddressLine = permanentCurrentAddressLine;
        this.permanentCurrentAddressCity = permanentCurrentAddressCity;
        this.permanentCurrentAddressPinCode = permanentCurrentAddressPinCode;
        this.permanentCurrentAddressState = permanentCurrentAddressState;
        this.graduationBranch = graduationBranch;
        this.graduationCGPA = graduationCGPA;
        this.graduationYearOfCompletion = graduationYearOfCompletion;
        this.graduationUniversity = graduationUniversity;
        this.postGraduationBranch = postGraduationBranch;
        this.postGraduationCGPA = postGraduationCGPA;
        this.postGraduationYearOfCompletion = postGraduationYearOfCompletion;
        this.postGraduationUniversity = postGraduationUniversity;
        this.employeeUsername = employeeUsername;
        this.employeePassword = employeePassword;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public long getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(long mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public long getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(long workPhone) {
        this.workPhone = workPhone;
    }

    public String getCurrentAddressLine() {
        return currentAddressLine;
    }

    public void setCurrentAddressLine(String currentAddressLine) {
        this.currentAddressLine = currentAddressLine;
    }

    public String getCurrentAddressCity() {
        return currentAddressCity;
    }

    public void setCurrentAddressCity(String currentAddressCity) {
        this.currentAddressCity = currentAddressCity;
    }

    public String getCurrentAddressPinCode() {
        return currentAddressPinCode;
    }

    public void setCurrentAddressPinCode(String currentAddressPinCode) {
        this.currentAddressPinCode = currentAddressPinCode;
    }

    public String getCurrentAddressState() {
        return currentAddressState;
    }

    public void setCurrentAddressState(String currentAddressState) {
        this.currentAddressState = currentAddressState;
    }

    public String getPermanentCurrentAddressLine() {
        return permanentCurrentAddressLine;
    }

    public void setPermanentCurrentAddressLine(String permanentCurrentAddressLine) {
        this.permanentCurrentAddressLine = permanentCurrentAddressLine;
    }

    public String getPermanentCurrentAddressCity() {
        return permanentCurrentAddressCity;
    }

    public void setPermanentCurrentAddressCity(String permanentCurrentAddressCity) {
        this.permanentCurrentAddressCity = permanentCurrentAddressCity;
    }

    public String getPermanentCurrentAddressPinCode() {
        return permanentCurrentAddressPinCode;
    }

    public void setPermanentCurrentAddressPinCode(String permanentCurrentAddressPinCode) {
        this.permanentCurrentAddressPinCode = permanentCurrentAddressPinCode;
    }

    public String getPermanentCurrentAddressState() {
        return permanentCurrentAddressState;
    }

    public void setPermanentCurrentAddressState(String permanentCurrentAddressState) {
        this.permanentCurrentAddressState = permanentCurrentAddressState;
    }

    public String getGraduationBranch() {
        return graduationBranch;
    }

    public void setGraduationBranch(String graduationBranch) {
        this.graduationBranch = graduationBranch;
    }

    public String getGraduationCGPA() {
        return graduationCGPA;
    }

    public void setGraduationCGPA(String graduationCGPA) {
        this.graduationCGPA = graduationCGPA;
    }

    public String getGraduationYearOfCompletion() {
        return graduationYearOfCompletion;
    }

    public void setGraduationYearOfCompletion(String graduationYearOfCompletion) {
        this.graduationYearOfCompletion = graduationYearOfCompletion;
    }

    public String getGraduationUniversity() {
        return graduationUniversity;
    }

    public void setGraduationUniversity(String graduationUniversity) {
        this.graduationUniversity = graduationUniversity;
    }

    public String getPostGraduationBranch() {
        return postGraduationBranch;
    }

    public void setPostGraduationBranch(String postGraduationBranch) {
        this.postGraduationBranch = postGraduationBranch;
    }

    public String getPostGraduationCGPA() {
        return postGraduationCGPA;
    }

    public void setPostGraduationCGPA(String postGraduationCGPA) {
        this.postGraduationCGPA = postGraduationCGPA;
    }

    public String getPostGraduationYearOfCompletion() {
        return postGraduationYearOfCompletion;
    }

    public void setPostGraduationYearOfCompletion(String postGraduationYearOfCompletion) {
        this.postGraduationYearOfCompletion = postGraduationYearOfCompletion;
    }

    public String getPostGraduationUniversity() {
        return postGraduationUniversity;
    }

    public void setPostGraduationUniversity(String postGraduationUniversity) {
        this.postGraduationUniversity = postGraduationUniversity;
    }

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", martialStatus='" + martialStatus + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", role='" + role + '\'' +
                ", department='" + department + '\'' +
                ", workEmail='" + workEmail + '\'' +
                ", personalEmail='" + personalEmail + '\'' +
                ", mobilePhone=" + mobilePhone +
                ", workPhone=" + workPhone +
                ", currentAddressLine='" + currentAddressLine + '\'' +
                ", currentAddressCity='" + currentAddressCity + '\'' +
                ", currentAddressPinCode='" + currentAddressPinCode + '\'' +
                ", currentAddressState='" + currentAddressState + '\'' +
                ", permanentCurrentAddressLine='" + permanentCurrentAddressLine + '\'' +
                ", permanentCurrentAddressCity='" + permanentCurrentAddressCity + '\'' +
                ", permanentCurrentAddressPinCode='" + permanentCurrentAddressPinCode + '\'' +
                ", permanentCurrentAddressState='" + permanentCurrentAddressState + '\'' +
                ", graduationBranch='" + graduationBranch + '\'' +
                ", graduationCGPA='" + graduationCGPA + '\'' +
                ", graduationYearOfCompletion='" + graduationYearOfCompletion + '\'' +
                ", graduationUniversity='" + graduationUniversity + '\'' +
                ", postGraduationBranch='" + postGraduationBranch + '\'' +
                ", postGraduationCGPA='" + postGraduationCGPA + '\'' +
                ", postGraduationYearOfCompletion='" + postGraduationYearOfCompletion + '\'' +
                ", postGraduationUniversity='" + postGraduationUniversity + '\'' +
                ", employeeUsername='" + employeeUsername + '\'' +
                ", employeePassword='" + employeePassword + '\'' +
                '}';
    }
}