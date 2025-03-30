class Employee {
     private int Emp_Id;
     private String Emp_Fname ;
     private String Emp_Lname ;
     private int Emp_Sallery;
     private String Emp_Deptmnt ;

     public void setEmpId(int Emp_Id){
        this.Emp_Id=Emp_Id;
     }

     public void setEmpFName(String Emp_Fname ){
         this.Emp_Fname =Emp_Fname; 
     }

     public void setEmpLName(String Emp_Lname ){
        this.Emp_Lname =Emp_Lname; 
     }

     public void setEmpDeptmnt(String Emp_Deptmnt){
        this.Emp_Deptmnt =Emp_Deptmnt; 
     }

     public void setEmpSallery(int Emp_Sallery){
       this.Emp_Sallery=Emp_Sallery;
     }
     public void getEmpId(){
      System.out.println("This is a Employee Id");
      System.out.println("Employee Id" + " " +Emp_Id);
   }

     public void getEmpFName(){
      System.out.println("This is  Employee First Name");
       System.out.println("Employee First Name" + " " + Emp_Fname);
   }

      public void getEmpLName(){
        System.out.println("This is Employee Last Name");

      System.out.println("Employee Last Name" + " " +Emp_Lname);
   }

     public void getEmpDeptmnt(){
      System.out.println("This is Employee Deprtment");

      System.out.println("Employee Department" + " " +Emp_Deptmnt);
   }

     public void getSalary(){
      System.out.println("This is  Employee Sallery");
      System.out.println("Employee Sallery" + " " +Emp_Sallery);
   }

  
}
 
class Emp_Info{
    public static void main(String[] args) {
        System.out.println("Informtion About All The  Employee");
        Employee emp = new Employee();
         emp.setEmpId(1);
         emp.setEmpFName("Deepak");
         emp.setEmpLName("Mishra");
         emp.setEmpDeptmnt("Account");
         emp.setEmpSallery(17000);

         emp.getEmpId();
         emp.getEmpFName();
         emp.getEmpLName();
         emp.getEmpDeptmnt();
         emp.getSalary();
    }
}

