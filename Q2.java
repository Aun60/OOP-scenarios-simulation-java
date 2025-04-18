import java.util.Scanner;

class Datascientist {
    private final String  Firstname, HighestEducation, Lastname;
    private int age, NumofQus, NumofAns;
    private String Country;
    private final int id;

    Datascientist(int id, String Country, String Firstname, String Lastname, String HighestEducation) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Country = Country;
        this.HighestEducation = HighestEducation;
        this.NumofAns = 0;
        this.NumofQus = 0;
        this.id=id;
    }


    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCountry() {
        return Country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getNumofAns() {
        return NumofAns;
    }

    public String getHighestEducation() {
        return HighestEducation;
    }

    public int getId() {
        return id;
    }

    public int getNumofQus() {
        return NumofQus;
    }

    public void askQuestion(String problem) {
        System.out.println("User " + id + " qustions: " + problem);
        NumofQus++;
    }

    public void answerProblem(String problem) {
        System.out.println("User " + id + " solution: " + problem);
        NumofAns++;
    }
}
class Admin {
    private String country, lastName, firstName;
    private static int userCount = 0;
    private int adminID,age;

    public Admin(String firstName, String lastName, int age, String country) {
        this.firstName = firstName;
        adminID = getAdminID();
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public int getAdminID() {
        return adminID;
    }

    public static int getTotalUserCount() {
        return userCount;
    }

    public static void incrementUserCount() {
        userCount++;
    }
}
        public class Q2 {
            public static void main(String[] args) {
                System.out.println("22k-4029");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter three digit roll number: ");
                int n = sc.nextInt();
                int n1 = n % 100;
                Datascientist bop = new Datascientist(n1, "PAKISTAN", "AUN", "ALI", "BS");
                bop.setAge(20);
                bop.askQuestion("Name of Input library in intellij?");
                bop.answerProblem("import java.util.Scanner;");
                System.out.println("DataScientist id= " + bop.getId() + ", FirstName= " + bop.getFirstname() + ", LastName='" + bop.getLastname());
                System.out.println("Country=" + bop.getCountry() + ", age=" + bop.getAge() + ", highestEducation='" + bop.getHighestEducation());
                System.out.println("NumAnswersGiven= " + bop.getNumofAns() + ", numQuestionsAsked= " + bop.getNumofQus());
                Admin amin=new Admin("Shahnawaz","Kazi",52,"PAKISTAN");
                System.out.println("Enter Admin ID");
                int s=sc.nextInt();
                amin.setAdminID(s);
                Admin.incrementUserCount();
                System.out.println("Total users are: "+Admin.getTotalUserCount());
            }
        }