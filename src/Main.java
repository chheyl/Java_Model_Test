import Model.Books;
import Model.Borrowing;
import Model.Student;
public class main {
    public static void main(String[] args) {
        Student p1 = new Student(1,"Ashna",12,9);
        Student p2 = new Student(2,"chheyl",12,11);
        Student p3 = new Student(3,"euria",12,13);
        Student p4 = new Student(4,"SHM",12,15);

        Books b1 = new Books(1,"IKIGAI","Kim han",1234455,2013);
        Books b2 = new Books(2,"dairy of young girl","Manjushree",1234456,2015);
        Books b3 = new Books(3,"sold","mccormick",1234457,2012);
        Books b4 = new Books(4,"Hope was here","joan bauer",1234458,2005);

        Borrowing bo1 = new Borrowing(1,1,0,50);
        Borrowing bo2 = new Borrowing(2,2,1,50);
        Borrowing bo3 = new Borrowing(3,3,3,50);
        Borrowing bo4 = new Borrowing(4,4,5,50);

        b1.print_books();
        b2.print_books();
        b3.print_books();
        b4.print_books();

        p1.print_student();
        p2.print_student();
        p3.print_student();
        p4.print_student();

        bo1.borrowing();
        bo2.borrowing();
        bo3.borrowing();
        bo4.borrowing();

    }
}