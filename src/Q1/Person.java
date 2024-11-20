package Q1;

class Person {

    protected String myName ; // name of the person
    protected int myAge; // person’s age
    protected String myGender; // “M” for male, “F” for female

    public Person(String name, int age, String gender) {

        myName = name; myAge = age ; myGender = gender; }

    public String toString() { return myName + ", age: " + myAge + ", gender: " + myGender; }

    public String getMyName() {
        return this.myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return this.myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyGender() {
        return this.myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }
}