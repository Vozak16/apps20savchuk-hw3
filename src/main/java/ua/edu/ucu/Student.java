package ua.edu.ucu;


class Student {

    private final double GPA;
    private final int year;
    private final String name;
    private final String surname;

    public Student(String name, String surname, double gpa, int year) {
        this.GPA = gpa;
        this.year = year;
        this.name = name;
        this.surname = surname;
    }

    public double getGPA() {
        return GPA;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", surname=" + surname +
                ", " + "GPA=" + GPA + ", year=" + year + '}';
    }

}
