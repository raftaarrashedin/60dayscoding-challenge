class Employee{  
  float salary=40000;  
}  
class singleInheritance extends Employee{  
  int bonus=10000;  
  public static void main(String args[]){  
    singleInheritance p=new singleInheritance();  
    System.out.println("Programmer salary is:"+p.salary);  
    System.out.println("Bonus of Programmer is:"+p.bonus);  
  }  
}


// output



// C:\Users\Sgrams\Desktop\java\4june_java>javac singleInheritance.java

// C:\Users\Sgrams\Desktop\java\4june_java>java singleInheritance
// Programmer salary is:40000.0
// Bonus of Programmer is:10000

// C:\Users\Sgrams\Desktop\java\4june_java>