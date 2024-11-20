package Q1;

class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA; // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        // use the super class’ constructor
        super(name, age, gender);

        // initialize what’s new to Student

        this.myIdNum = idNum;

        this.myGPA = gpa;

    }

    public String toString() {
        return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
    }

    public String getMyIdNum() {
        return this.myIdNum;
    }

    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public double getMyGPA() {
        return this.myGPA;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }
}
