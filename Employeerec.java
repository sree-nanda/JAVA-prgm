import java.util.*;

class Employee
{
    Scanner Sc=new Scanner(System.in);
    String name;
    int empno,ph;

    Employee(String name,int empno,int ph)
    {
        this.name=name;
        this.empno=empno;
        this.ph=ph;
    }
    void print()
    {
        System.out.println(empno+"\t\t"+name+"\t\t"+ph);
    }
}
class Employeerec
{
    public static void main(String args[])
    {
        Scanner Sc =new Scanner(System.in);
        System.out.println("How many Employees");
        int n=Sc.nextInt();
        Employee E[]=new Employee[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter your name :");
            String name=Sc.next();
            System.out.println("Enter your employee no :");
            int empno=Sc.nextInt();
            System.out.println("Enter your phone number :");
            int ph=Sc.nextInt();
            E[i]=new Employee(name,empno,ph);
        }
        System.out.println("empno:\t\tname:\t\tph:");
        for (int i=0;i<n;i++)
            E[i].print();


    }

}



