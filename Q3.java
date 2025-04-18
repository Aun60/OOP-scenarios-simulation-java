import java.util.*;
class HeartRate{
        String Firstname;
        int id,month,day,currnt_year=2023,year,DOB;
HeartRate(int id,String Firstname,int day,int month,int year){
        this.Firstname=Firstname;
        this.id=id;
        this.day=day;
        this.month=month;
        this.year=year;
       }

        public void setFirstname(String firstname) {
                Firstname = firstname;
        }

        public String getFirstname() {
                return Firstname;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getId() {
                return id;
        }

        public void setDay(int day) {
                this.day = day;
        }

        public int getDay() {
                return day;
        }

        public void setMonth(int month) {
                this.month = month;
        }

        public int getMonth() {
                return month;
        }

        public void setYear(int year) {
                this.year = year;
        }

        public int getYear() {
                return year;
        }
        public int getAge(){
            return (currnt_year-getYear());
        }
        public int getMaxiumumHeartRate(){
         return (220-getAge());
        }
        public double getTargetHeartRate(){
        return (getMaxiumumHeartRate()*0.7);
        }
}
public class Q3 {
        public static void main(String[] args) {
            System.out.println("22k-4029");
        Scanner sc=new Scanner(System.in);
        System.out.println("Entr your full ID. Such as 224050");
        int n=sc.nextInt();
        int n1=(n/1000)%10;
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter your day of birth");
        int d=sc.nextInt();
        System.out.println("Enter your month of birth");
        int m=sc.nextInt();
        System.out.println("Enter your year of birth");
        int y=sc.nextInt();
        HeartRate HR=new HeartRate(n1,name,d,m,y);
        System.out.println("Maximum heart rate of "+HR.getFirstname()+" is: "+HR.getMaxiumumHeartRate());
        System.out.println("Date of birth of "+HR.getFirstname()+" is: "+HR.day+"/"+HR.month+"/"+HR.year);
        System.out.println("Target heart rate of "+HR.getFirstname()+" is: "+HR.getTargetHeartRate());
        }
   }
