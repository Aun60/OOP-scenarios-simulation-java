import java.util.Scanner;

class Radiator{
    protected int RadiatorID;
    public boolean isON=false;
    int radint = 0, rad1int = 0;
    Radiator(int radiatorID ){
        radiatorID+=15;
        this.RadiatorID=radiatorID;
    }
    public int getRadiatorID()
    {
        return RadiatorID;
    }
    public boolean heat() {

        boolean isON = true;
        return isON;
    }
}
class Room {
    String RoomName;
    int SeatingCapacity = 12, numRadiators;

    public Room(String RoomName) {
        this.RoomName = RoomName;
    }
    public String is_heated_by(Radiator rd1,Radiator r2, int a,int a1) {

        rd1.radint=rd1.radint+a;
        r2.rad1int=r2.rad1int+a1;
        if(rd1.radint==1)
        {
            return "First Radiator added ";
        }
        else if(r2.rad1int==1){
            return "Second Radiator added";
        }
        else if(rd1.radint>1 && r2.rad1int<1){
            return "First Radiator already added";
        }
        else if(rd1.radint<1 && r2.rad1int>1){
            return "Second Radiator already added";
        }
        return "Limit of radiators reached";
    }
}
public class Q1 {
    public static void main(String[] args) {
        System.out.println("22k-4029");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Student ID: ");
        int n = sc.nextInt();
        int n1=n%1000;
        Radiator rd1 = new Radiator(n1);
        Radiator rd2 = new Radiator(n1);
        System.out.println("Radiator id is: " + rd1.getRadiatorID());
        Room room = new Room("ROOM 20");

        int i=0,s=0,s1=0;
        for (i = 0; i <= 3; i++) {
            System.out.println("PRESS 5 TO ADD RADIATOR x\nPRESS 0 TO ADD RADIATOR y");
            int choice= sc.nextInt();
            boolean a;
            String check;
            switch (choice)
            {
                case 5:
                    s++;
                    check= room.is_heated_by(rd1,rd2,s,s1);
                    System.out.println(check);
                    a=rd1.heat();
                    System.out.println("isON: "+a);
                    break;

                case 0:
                    s1++;
                    check=room.is_heated_by(rd1,rd2,s,s1);
                    a=rd2.heat();
                    System.out.println(check);
                    System.out.println("isON: "+a);
                    break;
            }
        }
    }
}