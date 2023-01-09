package org.example.shallowcopy;


import org.example.shallowcopy.model.Department;
import org.example.shallowcopy.model.Employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Shallow Copy : ");

        Department dept1 = new Department("1", "A", "AVP");

        Employee emp1 = new Employee(111, "John", dept1);

        Employee emp2 = null;

        try {
            // Creating a clone of emp1 and assigning it to emp2

            emp2 = (Employee) emp1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(emp1);
        System.out.println(emp2);
        // Printing the designation of 'emp1'

        System.out.println(emp1.getDept().getDesignation()); // Output : AVP

        // Changing the designation of 'emp2'

        emp2.getDept().setDesignation("Director");
        emp1.setName("Emin");

        // This change will be reflected in original Employee 'emp1'

        System.out.println(emp1.getDept().getDesignation()); // Output : Director

        System.out.println(emp1);
        System.out.println(emp2);
    }
}

