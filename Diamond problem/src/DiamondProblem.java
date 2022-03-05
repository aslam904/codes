
//diamond problem occurs when a program tries call a function by implementing multiple inheritance
//where both the extended class has a function with same name it is solved by using interface


interface displayinterface1  
{  
public  default void display()   
{  
System.out.println("the display() method of displayinterface1 invoked");  
}  
}  
interface displayinterface2  
{  
public default void display()   
{  
System.out.println("the display() method of displayinterface2 invoked");  
}  
}  
public class DiamondProblem implements displayinterface1, displayinterface2  
{  
public void display()   
{  
displayinterface1.super.display();  
displayinterface2.super.display();  
}  
public static void main(String args[])   
{  
DiamondProblem obj = new DiamondProblem();  
obj.display();  
}  
}  