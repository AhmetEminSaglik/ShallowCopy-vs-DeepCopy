package org.example.deepcopy.model;

public class Department implements Cloneable {
    private String empId;

    private String grade;

    private String designation;

    public Department(String empId, String grade, String designation) {
        this.empId = empId;

        this.grade = grade;

        this.designation = designation;
    }

    //Default version of clone() method.
    /*protected*/
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Department{" +
                "empId='" + empId + '\'' +
                ", grade='" + grade + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
