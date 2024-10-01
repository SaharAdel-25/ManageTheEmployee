
package project;

public class Node {
     
    int ID;
    String Name; 
    String FirstDay;
    String PhoneNumber;
    String EmployeeAddress;
    int Hour;
    double Salary;
    Node next; 
    boolean isSalaryUpdated;
    
    public Node() {
        
        this.ID = 0;
        this.Name = "";
        this.FirstDay = "";
        this.PhoneNumber = "";
        this.EmployeeAddress = "";
        this.Hour = 0;
        this.Salary = 0.0;
        this.next = null;
        this.isSalaryUpdated = false;

    }
    
    public Node(int ID, String Name, String FirstDay, String PhoneNumber, String EmployeeAddress, int Hour, double Salary, Node next, boolean isSalaryUpdated) {
        this.ID = ID;
        this.Name = Name;
        this.FirstDay = FirstDay;
        this.PhoneNumber = PhoneNumber;
        this.EmployeeAddress = EmployeeAddress;
        this.Hour = Hour;
        this.Salary = Salary;
        this.next = next;
        this.isSalaryUpdated = isSalaryUpdated;
    }
    
}