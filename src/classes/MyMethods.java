package classes;


import java.util.*;

public class MyMethods {


  /*  public static int getNumbSubjects(boolean regular, boolean working) {
        int numbSubjects;

        if (working) {
            numbSubjects = 6;
        } else if (!regular && !working) {
            numbSubjects = 5;
        } else {
            numbSubjects = 7;
        }
        return numbSubjects;
    }

}




public static void looper (int counter) {
    int num = 1;

    while (num <= counter) {
        System.out.println ("[" + num + "]");
        num ++;





    }
}*/

/*-----------------------------------------------------------------------------------------*/
/* WHILE LOOP

Make a method that computes the sum of first n positive integers:
            sum = 1+2+3+4+5+6*/
/*

public static int sixInt(int n){
        int num = 1;
        int sum = 0;

        while (num<=n){

        sum += num;
        num ++;
        }
      return sum;
            }
*/

/*---------------------------------------------Do While Loop---------------------------------------------*/

/*public static int DoWhile(int n) {
    int num = n;
    int output = 1;

    do {
        System.out.print("[" +output+  "]");
        output++;
    }
    while (output <= n) ;
    return output;


}*/
/*------------------------------------------------For Loop---------------------------------------------------*/

/*    public static void Rname(String[] args) {

        String names[] = {"Ornopia", "Arboy", "Miko", "John"};
        names = new String[5];
        names[0] = "Jan";
        names[1] = "Jen";
        names[2] = "Jin";
        names[3] = "Jon";
        names[4] = "Jun";

        int num = (int) (Math.random()*5);
        System.out.print("My name is " + names[num]);



    }*/

/*-----------------------------------RANDOM FRIENDS-----------------------------------------*/
public static String Rname(){
    List<String> FList = new ArrayList<String>();

    Random rand = new Random();
    int index = rand.nextInt(5);

    FList.add("Jash");
    FList.add("Jesh");
    FList.add("Jish");
    FList.add("Josh");
    FList.add("Jush");

    return FList.get(index);
}
/*-----------------------------------RANDOM RELATIONSHIPS-----------------------------------------*/

    public static String Relationships() {
        List<String> RList = new ArrayList<String>();

        Random rand = new Random();
        int index = rand.nextInt(5);

        RList.add(" Loves ");
        RList.add(" Hates ");
        RList.add(" Likes ");
        RList.add(" Cared ");
        RList.add(" Hit ");

        return RList.get(index);

    }

    /*-----------------------------------RANDOM GIRLFRIENDS-----------------------------------------*/
    public static String Girlfriends() {
        List<String> GFList = new ArrayList<String>();

        Random rand = new Random();
        int index = rand.nextInt(5);

        GFList.add("Ann");
        GFList.add("Mary");
        GFList.add("Angel");
        GFList.add("Cheng");
        GFList.add("Jane");

        return GFList.get(index);

    }



}



