public class Student {
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;

    Student(String name, int marks1, int marks2, int marks3) {
        this.name=name;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
    }
    public int average() {
        return (marks1+marks2+marks3)/3;
    }

    public int total() {
        return marks1+marks2+marks3;
    }

}
