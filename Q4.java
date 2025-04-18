import java.util.*;
class Movie{
    final String movie_name="AFSANA";
    final String showtime="10PM";
    final String movie_name1="BATMAN";
    final String showtime1="5PM";
    void Display(){
        System.out.println("Movie 1 "+movie_name+" will be premiering at "+showtime);
        System.out.println("Movie 2 "+movie_name1+" will be premiering at "+showtime1);
    }
}
class Ticket {
    int row_number, seat_num, tID;
    private Boolean status = false;

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getStatus() {
        return status;
    }

    public Ticket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your id like 2240**");
        int n = scanner.nextInt();
        int n1 = (n / 100) % 100;
    }

    void Display(int a, int a1) {
        seat_num = a;
        row_number = a1;
        System.out.println("Row number: " + row_number + " seat number: " + seat_num + " ticket number: " + tID + " SOLD STATUS: " + status);
    }
}
public class Q4{
    public static void main(String[] args) {
        Movie movie=new Movie();
        int c=0,c1=0;
        movie.Display();
        Ticket[] ticket=new Ticket[4];
        for (int i=1;i<=4;i++){
        ticket[i]=new Ticket();
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose ticket by pressing 1 and 2");
        int n=sc.nextInt();
        if(n>i){
            ticket[i].setStatus(false);
            c++;
            ticket[i].Display(c,c1);
            System.out.println("Ticket issued ");
            }
        else {
            ticket[i].setStatus(true);
            System.out.println("Ticket Status is "+ticket[i].getStatus());
            System.out.println("Ticket sold");
        }
        }
    }
}