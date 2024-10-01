package project;

import java.util.Scanner;

public class linkedlist {
    
    Scanner input = new Scanner(System.in);
    
    private Node head; 
    public linkedlist() { 
        head = null; 
    }
    
    
//    public void insertEmployee() {
//        System.out.print("Enter employee ID: ");
//        int ID = input.nextInt();
//        input.nextLine();
//
//        // Check for ID duplication
//        Node temp = head;
//        while (temp != null) {
//            if (temp.ID == ID) {
//                System.out.println("This ID already exists. Please enter a different ID.");
//                return;
//            }
//            temp = temp.next;
//        }
//
//        Node newNode = new Node();
//        newNode.ID = ID;
//
//        System.out.print("Enter employee name: ");
//        newNode.Name = input.nextLine();
//
//        System.out.print("Enter start date: ");
//        newNode.FirstDay = input.nextLine();
//
//        System.out.print("Enter phone number: ");
//        newNode.PhoneNumber = input.nextLine();
//
//        System.out.print("Enter employee address: ");
//        newNode.EmployeeAddress = input.nextLine();
//
//        System.out.print("Enter hours worked: ");
//        newNode.Hour = input.nextInt();
//
//        System.out.print("Enter salary: ");
//        newNode.Salary = input.nextDouble();
//        input.nextLine();
//
//        if (empty() || ID < head.ID) {
//            // If the list is empty or the new ID is smaller than the head's ID
//            // Insert the new record at the beginning of the list
//            newNode.next = head;
//            head = newNode;
//        } else {
//            temp = head;
//            while (temp.next != null && ID > temp.next.ID) {
//                temp = temp.next;
//            }
//            newNode.next = temp.next;
//            temp.next = newNode;
//        }
//    }
    
    public void insertEmployee() {

    System.out.print("Enter employee ID: ");
    while (!input.hasNextInt()) { 
        System.out.println("Invalid input. Please enter an integer for employee ID: ");
        input.nextLine(); // Consume the newline character
    }
    int ID = input.nextInt();
    input.nextLine(); // Consume the newline character

    // Check for ID duplication
    Node temp = head;
    while (temp != null) {
        if (temp.ID == ID) {
            System.out.println("This ID already exists. Please enter a different ID.");
            return;
        }
        temp = temp.next;
    }

    Node newNode = new Node();
    newNode.ID = ID;

    System.out.print("Enter employee name: ");
    newNode.Name = input.nextLine();

    System.out.print("Enter start date: ");
    newNode.FirstDay = input.nextLine(); 

    System.out.print("Enter phone number: ");
    newNode.PhoneNumber = input.nextLine(); 

    System.out.print("Enter employee address: ");
    newNode.EmployeeAddress = input.nextLine(); 

    System.out.print("Enter hours worked: ");
    while (!input.hasNextInt()) { 
        System.out.println("Invalid input. Please enter a number for hours worked: ");
        input.nextLine(); 
    }
    newNode.Hour = input.nextInt();
    input.nextLine(); 

    System.out.print("Enter salary: ");
    while (!input.hasNextDouble()) { 
        System.out.println("Invalid input. Please enter a number for salary: ");
        input.nextLine(); 
    }
    newNode.Salary = input.nextDouble();
    input.nextLine(); 

    if (empty() || ID < head.ID) {
        newNode.next = head;
        head = newNode;
    } else {
        temp = head;
        while (temp.next != null && ID > temp.next.ID) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
}
    
   public void updateEmployee(int empID) {
        Node temp = head;
        while (temp != null) {
            if (temp.ID == empID) {
                System.out.println("Enter new employee information:");
                System.out.println("1. Update name");
                System.out.println("2. Update first day");
                System.out.println("3. Update phone number");
                System.out.println("4. Update employee address");
                System.out.println("5. Update hours worked");
                System.out.println("6. Update salary");
                System.out.println("7. Update all");

                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                input.nextLine(); // Consume the newline character after reading the integer

                switch (choice) {
                    case 1:
                        System.out.print("Enter updated name: ");
                        temp.Name = input.nextLine();
                        break;
                    case 2:
                        System.out.print("Enter updated first day: ");
                        temp.FirstDay = input.nextLine();
                        break;
                    case 3:
                        System.out.print("Enter updated phone number: ");
                        temp.PhoneNumber = input.nextLine();
                        break;
                    case 4:
                        System.out.print("Enter updated employee address: ");
                        temp.EmployeeAddress = input.nextLine();
                        break;
                    case 5:
                        System.out.print("Enter updated hours worked: ");
                        while (!input.hasNextInt()) { 
                            System.out.println("Invalid input. Please enter a number for hours worked: ");
                            input.nextLine(); 
                        }
                        temp.Hour = input.nextInt();
                        input.nextLine(); 

                        break;
                    case 6:
                        System.out.print("Enter updated salary: ");
                        while (!input.hasNextDouble()) { 
                            System.out.println("Invalid input. Please enter a number for salary: ");
                            input.nextLine(); 
                        }
                        temp.Salary = input.nextDouble();
                        input.nextLine(); 
                        
                        break;
                    case 7:
                        System.out.print("Enter updated name: ");
                        temp.Name = input.nextLine();

                        System.out.print("Enter updated first day: ");
                        temp.FirstDay = input.nextLine();

                        System.out.print("Enter updated phone number: ");
                        temp.PhoneNumber = input.nextLine();

                        System.out.print("Enter updated employee address: ");
                        temp.EmployeeAddress = input.nextLine();

                        System.out.print("Enter updated hours worked: ");
                        while (!input.hasNextInt()) { 
                            System.out.println("Invalid input. Please enter a number for hours worked: ");
                            input.nextLine(); 
                        }
                        temp.Hour = input.nextInt();
                        input.nextLine(); 

                        System.out.print("Enter updated salary: ");
                        while (!input.hasNextDouble()) { 
                            System.out.println("Invalid input. Please enter a number for salary: ");
                            input.nextLine(); 
                        }
                        temp.Salary = input.nextDouble();
                        input.nextLine(); 
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        return;
                }

                System.out.println("Employee record updated successfully.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Employee with ID " + empID + " not found.");
    }
    
    
    public int deleteEmployee(int ID) {

        if (empty()) {
            System.out.println("The list is empty!");
            return -1 ;
        }
        if (head.ID == ID) {
            head = head.next;
            System.out.println("Employee with ID " + ID + " has been deleted.");
            return 0;
        }
        
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.ID == ID) {
                temp.next = temp.next.next;
                System.out.println("Employee with ID " + ID + " has been deleted.");
                return 0 ;
            }
            temp = temp.next;
        }

        System.out.println("No employee found with ID " + ID + ".");
        return -1 ;

    }
    
    
    public boolean empty() {
        return head == null;
    }
    
    
    public void searchEmployee() {
        System.out.print("Enter the ID of the employee to search: ");
        int ID = input.nextInt();
        input.nextLine();

        Node temp = head;
        while (temp != null) {
            if (temp.ID == ID) {
                System.out.println("Employee found:");
                printEmployee(temp);
                return;
            }
            temp = temp.next;
        }

        System.out.println("No employee found with ID " + ID + ".");
    }
    
    public void updateSalary() {
        Node temp = head;
        while (temp != null) {
            if (temp.Hour > 32 && !temp.isSalaryUpdated) {
                int extraHours = temp.Hour - 32;

                double updatedSalary = temp.Salary + (extraHours * 0.02 * temp.Salary);
                temp.Salary = updatedSalary;

                temp.isSalaryUpdated = true; // Set the flag to indicate that the salary has been updated

                System.out.println("Salary updated successfully.");
                //printEmployee(temp);
                return;
            }
            temp = temp.next;
        }


    }
    
    private void printEmployee(Node employee) {
    System.out.println("ID: " + employee.ID);
    System.out.println("Name: " + employee.Name);
    System.out.println("Start Date: " + employee.FirstDay);
    System.out.println("Phone Number: " + employee.PhoneNumber);
    System.out.println("Address: " + employee.EmployeeAddress);
    System.out.println("Hours Worked: " + employee.Hour);
    System.out.println("Salary: " + employee.Salary);
}
 


public void displayEmployees() {
    Node temp = head;
    System.out.println("---------------------------------------------------------------------------------------------------------");
    System.out.format("| %-3s | %-20s | %-12s | %-15s | %-18s | %-5s | %-10s |\n",
            "ID", "Name", "First Day", "Phone Number", "Employee Address", "Hour", "Salary");
    System.out.println("---------------------------------------------------------------------------------------------------------");
    while (temp != null) {
        System.out.format("| %-3d | %-20s | %-12s | %-15s | %-18s | %-5d | %-10.2f |\n",
                temp.ID, temp.Name, temp.FirstDay, temp.PhoneNumber,
                temp.EmployeeAddress, temp.Hour, temp.Salary);
        temp = temp.next;
    }
}

}