//Miti Naik
public class employee implements Comparable<employee>
{
private String name;
private String id;
private double Salary;
private double bonus;

public employee()
{
name = " ";
id = " ";
Salary = 0.0;
bonus = 0.0;


}
public employee(String N, String I, double S, double B)
{
name = N;
id = I;
Salary = S;
bonus = B;
}
public void setname(String N)
{name = N;}
public void setid(String I)
{id = I;}
public void setSalary(double S)
{Salary = S;}
public void setbonus(double B)
{bonus = B;}

public String getname()
{ return name;}
public String getid()
{ return id;}
public double getSalary()
{return Salary;}
public double getnbonus()
{return bonus;}

public String toString()
{ String str = (  " Name: "+ name +  " ," + "id "+ id+ ", " +  "$" + Salary +"," + "$"+ bonus);
return str;
}




}