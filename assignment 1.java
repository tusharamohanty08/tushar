import java.util.*;
class stdentdetails
{
public static void main(String args[])
{
try (Scanner sc = new Scanner(System.in)) {
    System.out.println("enter student name : ");
    String name = sc.nextLine();
    
    System.out.println("enter student roll :");
    int sroll = sc.nextInt();
    
    System.out.println("enter student gender :");
    final char g = sc.next().charAt(0);
    
    
    System.out.println("enter student mark :");
    Double smark = sc.nextDouble();
    
    System.out.println("student name is :"+name);
    System.out.println("student roll is :"+sroll);
    System.out.println("student gender is :"+g);
    System.out.println("student mark :"+smark);
}
}
}
