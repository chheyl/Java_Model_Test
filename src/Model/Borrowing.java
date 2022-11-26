package Model;

public class Borrowing {
        int book_id;

        public Borrowing(int book_id, int student_id, int added_days, int fine_price) {
            this.book_id = book_id;
            this.student_id = student_id;
            this.added_days = added_days;
            this.fine_price = fine_price;
        }

        int student_id;

        public int getBook_id() {
            return book_id;
        }

        public void setBook_id(int book_id) {
            this.book_id = book_id;
        }

        public int getStudent_id() {
            return student_id;
        }

        public void setStudent_id(int student_id) {
            this.student_id = student_id;
        }

        public int getAdded_days() {
            return added_days;
        }

        public void setAdded_days(int added_days) {
            this.added_days = added_days;
        }

        public int getFine_price() {
            return fine_price;
        }

        public void setFine_rate(int fine_price) {
            this.fine_price = fine_price;
        }

        int added_days;
        int fine_price;

    public int borrowing(){
        int extra_days = this.added_days;
        int fine = extra_days * 50;
        System.out.println("The total fine for bookid " + this.book_id + " for "+ this.added_days + " extra days is " + fine);
        return fine;

    }
    }
