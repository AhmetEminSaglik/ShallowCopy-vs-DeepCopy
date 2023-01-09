package org.example.shallowcopy.model;


public class Employee implements Cloneable {
    private int id;

    private String name;

    private Department dept;

    public Employee(int id, String name, Department dept) {
        this.id = id;

        this.name = name;

        this.dept = dept;
    }

    // Default version of clone() method. It creates shallow copy of an object.

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}