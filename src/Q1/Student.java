//Brad Ayers
//QAP3
//November 20-21, 2024

package Q1;

class Student extends Person {
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);

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
