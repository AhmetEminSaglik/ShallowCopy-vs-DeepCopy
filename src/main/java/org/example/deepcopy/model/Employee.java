package org.example.deepcopy.model;

public class Employee implements Cloneable {
    private int id;

    private String name;

    private Department dept;

    public Employee(int id, String name, Department dept) {
        this.id = id;

        this.name = name;

        this.dept = dept;
    }

    // Overriding clone() method to create a deep copy of an object.

    /*protected */
    public Object clone() throws CloneNotSupportedException {
        Employee emp = (Employee) super.clone();

        emp.dept = (Department) dept.clone();

        return emp;
    }

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
}
