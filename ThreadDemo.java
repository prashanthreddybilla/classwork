//to find sum,product,sub,div of two numbers using multithreading
import java.util.*;
class MyThread1 extends Thread
{	
public void run()
{
for(int i=0;i<1;i++)
{
System.out.println("*********************ADDITION**********************************");
System.out.println("enter two numbers:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("sum:"+(a+b));
}
}
}
class MyThread2 extends Thread
{
public void run()
{
for(int i=0;i<1;i++)
{
System.out.println("*********************SUBTRACTION**********************************");
System.out.println("enter two numbers:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("subtract:"+(a-b));
}
}
}
class MyThread3 extends Thread
{
public void run()
{
for(int i=0;i<1;i++)
{
System.out.println("*********************MULTIPLICATION**********************************");
System.out.println("enter two numbers:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("product:"+(a*b));
}
}
}
class ThreadDemo extends Thread
{
public static void main(String[] args)
{
MyThread1 t1=new MyThread1();
t1.start();
MyThread2 t2=new MyThread2();
t2.start();
MyThread3 t3=new MyThread3();
t3.start();
for(int i=0;i<1;i++)
{
System.out.println("*********************DIVISION**********************************");
System.out.println("enter two numbers:");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("division:"+(a/b));
}
}
}

