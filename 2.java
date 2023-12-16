import java.util.Scanner;
public class ElectricityBill {
 public static void main(String[] args)
 {
 Scanner sr = new Scanner(System.in);
 System.out.print("Consumer Number: ");
 int consumerNo =sr.nextInt();
 System.out.print("Consumer Name: ");
 String consumerName = sr.next();
 System.out.print("Previous Month Reading: ");
 int previousMonthReading = sr.nextInt();
 System.out.print("Current Month Reading: ");
 int currentMonthReading=sr.nextInt();
 System.out.print("Domestic/Commercial: ");
 String ebConnectionType = sr.next();
 Electricity bill = new
Electricity(consumerName,ebConnectionType,consumerNo,previousMonthReading,currentMonthReading);
double billAmount = bill.calculateBillAmount();
 System.out.println("Electricity Bill Details:");
 System.out.println("Consumer Number: " + consumerNo);
 System.out.println("Consumer Name: " + consumerName);
 System.out.println("Previous Month Reading: " + previousMonthReading);
 System.out.println("Current Month Reading: " + currentMonthReading);
 System.out.println("EB Connection Type: " + ebConnectionType);
 System.out.println("Bill Amount: Rs. " + billAmount);
 }
}
class Electricity
{
String cname,ch,eb;
int cno,pmr,cmr;
double bill;
Electricity(String cname, String eb, int cno,int pmr,int cmr)
{
this.cname=cname;
this.eb=eb;
this.cno=cno;
this.pmr=pmr;
this.cmr=cmr;
}
double calculateBillAmount()
{
int units = cmr-pmr;
if(eb.equals("Domestic"))
{
if(units<=100)
bill=units*1;
else if(units>100 && units<=201)
bill = 100+(units-100)*2.5;
else if(units>200 && units<501)
bill =100+(100*2.5)+(units-200)*4;
else
bill = 100+(100*2.5)+(300*4)+(units-500)*6;
}
if(eb.equals("Commercial"))
{
if(units<100)
bill=units*2;
else if (units>100 && units<201)
bill = 200+(units-100)*4.5;
else if (units>200 && units<501)
bill=200+(100*4.5)+(units-200)*6;
else
bill=2980.0;
}
return bill;
}
}
