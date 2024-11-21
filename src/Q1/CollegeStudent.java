//Brad Ayers
//QAP3
//November 20-21, 2024

package Q1;

public class CollegeStudent extends Student {
    private String major = "Computer Science";
    private int year = 1;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        super (name, age, gender, idNum, gpa);

        this.major = major;
        this.year = year;
    }

    public String toString() {
        return super.toString() + ", major: " + major + ", year: " + year;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
