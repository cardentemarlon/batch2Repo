import classes.Customer;
import classes.Employee;
import classes.MyMethods;
import classes.Person;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //gwapo kaayu si ornops
        /*System.out.println("Hello Ms.World!");
        System.out.println("Hello Ms.World!");*/


        //Test1

        /*byte byteVar = 127; //range from -128 to 127;
        short shortVar = 32767;
        int decimalVarTo= 214748364;
        long largeDecVarFrom = 15;
        float fVar = 8.2f;
        double doubleVar = 12312312.1232d;
        boolean bolVar = true;
        char sChar = '\u0041';


        System.out.println("byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("int: " + decimalVarTo);
        System.out.println("long: " + largeDecVarFrom);
        System.out.println("float: " + fVar);
        System.out.println("double: " + doubleVar);
        System.out.println("boolean: " + bolVar);
        System.out.println("char: " + sChar);*/


        //Test 2

        /*
        String name = " ";

        System.out.println(name);*/


        //---------------------------------------ARRAY-------------------------------------------------------

       /* int grades[] = new int[5];

        grades[0] = 93;
        grades[1] = 94;
        grades[2] = 95;
        grades[3] = 96;
        grades[4] = 97;

        System.out.println("Grades: " + grades[0]);
        System.out.println("Grades: " + grades[1]);
        System.out.println("Grades: " + grades[2]);
        System.out.println("Grades: " + grades[3]);
        System.out.println("Grades: " + grades[4]);*/


        //Test 4


    /*    String errorMessages[] = new String[3];

        errorMessages[0] = "This is an error" ;
        errorMessages[1] = "Page not found" ;
        errorMessages[2] = "No internet connection" ;

        System.out.println("Error 1: " + errorMessages[0]);
        System.out.println("Error 2: " + errorMessages[1]);
        System.out.println("Error 3: " + errorMessages[2]);*/


        //Test 5

        /*
    Person personObject = new Person();
        personObject.setName("Marlon");
        personObject.setGender(true);
        personObject.setEmail("cardentemarlon@gmail.com");
        personObject.setAge(20);
        personObject.setWeight(60f);
        personObject.setHeight(156f);


        System.out.println("Name: " + personObject.getName());
        System.out.println("Gender: " + personObject.isGender());
        System.out.println("Email: " + personObject.getEmail());
        System.out.println("Age: " + personObject.getAge());
        System.out.println("Weight: " + personObject.getWeight() + " kg.");
        System.out.println("Height: " + personObject.getHeight() + " cm.");

        */

        //Employee Side Code
       /* Employee employee = new Employee();
        employee.setName("Marlon Cardente");
        employee.setDepartment("Accounting");
        employee.setSSSID(1345);
        employee.setPagibigID(123523);

        System.out.println("\n");
        System.out.println("+++++EMPLOYEE+++++");
        System.out.println("Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("SSS ID: " + employee.getSSSID());
        System.out.println("Pag-ibig ID: " + employee.getPagibigID());
        System.out.println("Hi I am " + employee.introduceYourSelf());


        //Customer Side Code
        Customer customer = new Customer();
        customer.setName("Joshua Ornopism");
        customer.setCustomerID(1424);
        customer.setMembershipLevel("VIP");
        customer.setCreditCardNumber(12153);
        customer.setAddress("Sitio Manga, Mandaue City");

        System.out.println("\n");
        System.out.println("+++++++CUSTOMER IS ALWAYS RIGHT++++++++");
        System.out.println("Name: " + customer.getName());
        System.out.println("Customer ID: " + customer.getCustomerID());
        System.out.println("Membership Level: " + customer.getMembershipLevel());
        System.out.println("Credit Card Number: " + customer.getCreditCardNumber());
        System.out.println("Address: " + customer.getAddress());

        //call 2 method
        System.out.println(customer.introduceYourSelf("Joseph Imperial. ","Looc, Mandaue City.", "Very Important"));

        }*/

/*        Person person = new Person("people");
        Person person2 = new Person();


}*/


        //CONDITIONS//
/*int number = 3;
        if(number <3){
             System.out.println(number + " is less than 3");
    }
        else if (number==3) {
            System.out.println(number + " is equal to 3");
        }
        else {
            System.out.println(number + " is greater than 3");
    }


    }*/

        //Conditions

        //Test 1

      /*  int tstudents = 20;
        int cstudents = 15;

        String day = "Monday";


        if(cstudents <= 15 && day == "Monday"){
            System.out.println("MONDAY");
            System.out.println("Current Subject is MATH and Teacher 1 has less than or equal to " + cstudents);
        }
        else if (cstudents > 15 && day == "Monday"){
            System.out.println("MONDAY");
            System.out.println("Current Subject is Math and teacher 1 has greater than 15 students");
        }
        else if (cstudents == tstudents && day == "Tuesday"){
            System.out.println("TUESDAY");
            System.out.println("Current Subject is Science and Teacher 3 has " + tstudents + " students");
        }
        else {
            System.out.println("TUESDAY");
            System.out.println("Current Subject is English,OOP & Server Maintenance and Teacher 2,4 & 5 has less than or greater than " +tstudents + "students");
        }
    }*/


        //Test 2
/*
        boolean Weekday = true;
        boolean Holiday = false;

        if (!Weekday || Holiday) {
            System.out.println("Today is Vacation");
        }
        else {
            System.out.println("Today is Not Vacation");
            }

        }*/
/*
        boolean rstudent = true;
        boolean ptstudent = true;

        if (rstudent==true && ptstudent==false){
            System.out.println("Regular Students have 7 Subjects per Trimester");
        }
        else if (rstudent && ptstudent){
            System.out.println("Regular Student but Working Part-time in School can take 6 subjects");
        }
        else if (!rstudent && ptstudent){
            System.out.println("Part Time Students can take 6 subjects");
        }
        else {
            System.out.println("Irregular Students can take 5 subjects only.");
        }
    }*/
/*----------------------------------------------------------------------*/
/* Write a method that computes the sum of first n positive integers:
            sum = 1+2+3+4+5+6*/
    /*   System.out.println("The sum is " + MyMethods.sixInt(6));*/



/*------------------------------------------------------------------------*/




      /*  MyMethods.DoWhile(8);*/


     /* ------------------------------------ FOR LOOP ---------------------------------------*/
  /*      int a;
        String myFriends[]= new String[5];
        myFriends[0] = "Arboy";
        myFriends[1] = "Argirl";
        myFriends[2] = "Argay";
        myFriends[3] = "ArShe";
        myFriends[4] = "ArHe";

        System.out.println("My Friends are: ");

        for (a=0; a<5; a++){
            System.out.println( myFriends[a]);
    }
}
*/



           /* String names[] = {"Ornopia", "Arboy", "Miko", "John"};
            System.out.println(names[new Random().nextInt(names.length)]);

         MyMethods.Rname(names);*/
     /*   System.out.print(MyMethods.Rname());
        System.out.print(MyMethods.Relationships());
        System.out.println(MyMethods.Girlfriends());
*/
 /*    String friends = MyMethods.Rname();
        String relations = MyMethods.Relationships();
        String girls = MyMethods.Girlfriends();
        String arr[] = {friends, girls};
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        int index2 = rand.nextInt(arr.length);

        System.out.println(arr[index] + " " + relations + " " + arr[index2]);

*/

/* --------------------------------------INTERCHANGE RNAME AND GIRLFRIENDS-------------------------------------*/
 int i=5;
    Random random = new Random();
    boolean shuff = random.nextBoolean();

        if (shuff){
            System.out.print(MyMethods.Rname() + MyMethods.Relationships() + MyMethods.Girlfriends());
        }
        else{
            System.out.print(MyMethods.Girlfriends() + MyMethods.Relationships() + MyMethods.Rname());
        }
    }


    }

