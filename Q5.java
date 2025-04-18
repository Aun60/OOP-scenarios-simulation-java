import java.util.*;

class user {
    int []uid=new int[2];
    int id,age,height;
    String name, gender, demographic,shoesize;

    public int[] getUid() {
        return uid;
    }
    public void setUid(int[] uid) {
        this.uid = uid;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;
    }

    public String getShoesize() {
        return shoesize;
    }

    public void setShoesize(String shoesize) {
        this.shoesize = shoesize;
    }

    Scanner sc = new Scanner(System.in);

    public user() {
        System.out.println("Enter your ID like 224050");
        id= sc.nextInt();
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Enter your gender");
        gender = sc.next();
        System.out.println("Enter your name");
        name = sc.next();
        System.out.println("Enter your height like 510(5feet and 10 inch)");
        height= sc.nextInt();
        uid[0]=id/10000;
        uid[1]=id%10000;
        if(age<=2)
        {
            demographic="infant";
        }
        if(age>=3&&age<=5)
        {
            demographic="toddler";
        }
        if(age>=10&&age<=12)
        {
            demographic="child";
        }
        if(age>=13&&age<=19)
        {
            demographic="teen";
        }
        if(age>19)
        {
            demographic="adult";
        }
        else {
            System.out.println("Invalid entry. Please Enter digits only");
              }
    }
}
class shoe {
    String style;
    int width;

    public String getStyle() {
        return style;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public shoe(user usr,int CH) {
        if (Objects.equals(usr.demographic, "infant")) {
            width = 5;
            usr.shoesize = "XS";
        }
        if (Objects.equals(usr.demographic, "toddler")) {
            width = 9;
            usr.shoesize = "S";
        }
        if (Objects.equals(usr.demographic, "child")) {
            width = 11;
            usr.shoesize = "M";
        }
        if (Objects.equals(usr.demographic, "teen")) {
            width = 14;
            usr.shoesize = "L";
        }
        if (Objects.equals(usr.demographic, "adult")) {
            usr.shoesize = "XL";
            width = 18;
        }
        switch (CH) {

            case 1:
                style = "Athletic shoes";
                break;

            case 2:
                style = "Sneakers";
                break;

            case 3:
                style = "Flip flops";
                break;
            default:
                System.out.println("Error");
        }
    }
    public void display (user u) {
        System.out.println("user id: "+u.uid[0]+","+u.uid[1]+"\nAge: "+u.age+"\nname: "+u.name+"\nGender: "+u.gender+"\nHeight: "+u.height+"\nDemographic:"+u.demographic+"\nShoe size: " +u.shoesize+ "\nShoe width: "+width+"\nShoe style: "+style);
    }
}
public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        user us = new user();

        System.out.println("\nChoose by Pressing \n1)Athletic\n2)Casual\n3)Party wear");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                shoe sports = new shoe(us,choose);
                sports.display(us);
                break;
            case 2:
                shoe casual = new shoe(us, choose);
                casual.display(us);
                break;
            case 3:
                shoe fancy = new shoe(us, choose);
                fancy.display(us);
                break;
        }
    }
}