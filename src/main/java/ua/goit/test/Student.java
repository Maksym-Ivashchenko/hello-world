package ua.goit.test;

public class Student {

    int nb;
    String name;
    String lastname;
    int godobuch;
    double srocmatem;
    double sroceconom;
    double srocinjaz;

    public double arithmeticMeanScore () {
        return  (this.srocmatem + this.sroceconom + this.srocinjaz) / 3;
    }
}

class StudentTest {

    public static void main(String[] args) {

        Student stud1 = new Student();
        Student stud2 = new Student();
        Student stud3 = new Student();

        stud1.nb=1;
        stud1.name="Ivan";
        stud1.lastname="Kozlov";
        stud1.godobuch=2000;
        stud1.srocmatem=4.8;
        stud1.sroceconom=5;
        stud1.srocinjaz=4.5;

        stud2.nb=2;
        stud2.name="Oleg";
        stud2.lastname="Sidorov";
        stud2.godobuch=2002;
        stud2.srocmatem=4.2;
        stud2.sroceconom=4;
        stud2.srocinjaz=4.8;

        stud3.nb=3;
        stud3.name="Petr";
        stud3.lastname="Fedorov";
        stud3.godobuch=2004;
        stud3.srocmatem=4.6;
        stud3.sroceconom=4.4;
        stud3.srocinjaz=4.7;

        System.out.println("Студент: " + stud1.name + " " + stud1.lastname + " Средняя арифметическая оценка - "
                + stud1.arithmeticMeanScore());
        System.out.println("Студент: " + stud2.name + " " + stud2.lastname + " Средняя арифметическая оценка - "
                + stud2.arithmeticMeanScore());
        System.out.println("Студент: " + stud3.name + " " + stud3.lastname + " Средняя арифметическая оценка - "
                + stud3.arithmeticMeanScore());

    }

}