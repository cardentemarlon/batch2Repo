package classes;

public abstract class Person {

    public String name;
    public boolean gender; /*true = Male false - Female*/
    public int age;
    public float weight; /*in kg.*/
    public float height; /*in cm.*/
    public String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


/*
// this is for introducing yourself
    public String introduceYourSelf () {
        return this.name;
    }

    public String introduceYourSelf (String eName, String Address, String MembershipLevel) {
        return "Hi I am " + eName + "I am from " + Address + " Lol " + MembershipLevel;
    }
*/


        //CONSTRUCTOR
     public Person(String per1){

    }
     public Person(){

    }
















    }



