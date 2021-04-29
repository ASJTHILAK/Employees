package employee;

import java.io.*;

public class Employee{
    int y,num;
    String name, adr;
    InputStreamReader n = new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(n);
    void input()throws IOException{
    //user defined function
    System.out.println("Enter the number of employees");
    num=Integer.parseInt(br.readLine());
    for(int i = 0;i<num;i++){   
    System.out.println("Enter your Name");
    name=br.readLine();
    System.out.println("Enter your year of joining");
    y=Integer.parseInt(br.readLine());
    System.out.println("Enter your addresses");
    adr=br.readLine();
    }
    System.out.println("Name \t\t Year Of Joining \t Address");
    for(int i = 0;i<num;i++){
        System.out.printf("%s\t\t %d\t\t\t %s\n",name,y,adr);
    }
    }
    public static void main(String[] args)
    throws IOException
    {
    Employee emp=new Employee();
    emp.input();
    }
}
