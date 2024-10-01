
package project;

import java.util.Scanner;
public class ManageTheEmployee {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        linkedlist mylist = new linkedlist();
        int choice;
        do {
            System.out.println("-------------------------");
            System.out.println("1.Insert employee record"
                    + "\n2. Delete employee record "
                    + "\n3. Update employee record"
                    + "\n4. Show details of an employee"
                    + "\n5. Search an employee"
                    + "\n6. Update the salary of an employee"
                    + "\n7. exit" ); 
            System.out.print("chose number: ");
            choice = input.nextInt();
            System.out.println("-------------------------");

            switch (choice){
                case 1:
                    mylist.insertEmployee();
                    
                    break;
                case 2:
                    if (mylist.empty()){
                        System.out.println("The list is empty!");  }
                    else {
                        System.out.print("Enter the ID of the employee to delete: ");
                        int ID = input.nextInt();

                        mylist.deleteEmployee(ID);}
                    break;
                case 3:
                    if (mylist.empty()){
                        System.out.println("The list is empty!");  }
                    else {
                        int empID ;
                        System.out.print("Enter the ID of the employee to update: ");
                        empID = input.nextInt();                    
                        mylist.updateEmployee(empID);}
                    break;
                case 4:
                    if (mylist.empty()){
                        System.out.println("The list is empty!");  }
                    else {
                        mylist.displayEmployees();}
                    break;
                case 5:
                    if (mylist.empty()){
                        System.out.println("The list is empty!");  }
                    else {
                        mylist.searchEmployee();}
                    break;
                case 6:
                    if (mylist.empty()){
                        System.out.println("The list is empty!");  }
                    else {
                        mylist.updateSalary();}
                    break;
                case 7:
                    System.out.println("برا");        
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number from 1 to 7.");        
            }
        } while(choice != 7);
        
       
        
        
    }
    
}