import java.util.Scanner;

public class SimplePayRoll {
    
    public class Employee {
    
    private String name;
    
    public void setName(String name){
        
       this.name = name;
    
    }
    
    public String getName(){
        
        System.out.println("Employee: " + name);
        
        return name;
    
    }

}

public class FullTimeEmployee extends Employee{
    
    private double monthlySalary;
    
    public void setMonthlySalary(double monthlySalary){
        
           this.monthlySalary = monthlySalary;
   
    }
    
    public double getMonthlySalary(){
        
        System.out.println("Monthly Salary: " + monthlySalary);
     
        
        return monthlySalary;
    
    }

}

public class PartTimeEmployee extends Employee{
    
    private double ratePerHour;
    private int hoursWorked;
    private double wage;
    
    public void setWage(double wage){
       
          this.wage = wage;
    
    }
    
    public double getWage(){
        
         wage = ratePerHour*hoursWorked;
       
         System.out.printf("Wage: %.2f", wage);
    
         return wage;
    
    }
}
    
    public void RunEmployee(){
               
              Employee employee = new Employee();
              PartTimeEmployee partTime = new PartTimeEmployee();
              FullTimeEmployee fullTime = new FullTimeEmployee();
        
               Scanner input = new Scanner(System.in);
               
               System.out.print("Enter name: " );
               employee.setName(input.nextLine());
               
               System.out.print("Press F for Full Time or P for Part Time: " );
               char a = input.next().charAt(0);
               
               switch(a){
                   
                   case 'f':
                       
                       System.out.print("Enter a Salary: ");
                       fullTime.setMonthlySalary(input.nextDouble());
                       
                       employee.getName();
                       fullTime.getMonthlySalary();
                     
                       break;
                       
                   case 'p':
                       
                       System.out.print("Enter a rate per hour: ");
                       partTime.ratePerHour = input.nextDouble();
                       
                       System.out.print("Enter no. of hours: ");
                       partTime.hoursWorked = input.nextInt();
                       
                       employee.getName();
                       
                       partTime.getWage();
                       
                       break;
                       
                   default:
                       
                       System.out.print("Invalid Input!");
               
               }
               
    }

    public static void main(String[] args) {
        
        SimplePayRoll output = new SimplePayRoll();
        output.RunEmployee();
    }
}
       
    