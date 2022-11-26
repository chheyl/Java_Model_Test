package Model;

public class Books {
        public int getBook_id() {
            return book_id;
        }

        public void setBook_id(int book_id) {
            this.book_id = book_id;
        }

        public String getName_of_book() {
            return name_of_book;
        }

        public void setName_of_book(String name_of_book) {
            this.name_of_book = name_of_book;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getBook_no() {
            return getBook_no();
        }

        public void setIsbn(int isbn) {
            this.book_no = book_no;
        }

        public int getA_year() {
            return a_year;
        }

        public void setA_year(int a_year) {
            this.a_year = a_year;
        }

        public Books(int book_id, String name_of_book, String author, int book_no, int a_year) {
            this.book_id = book_id;
            this.name_of_book = name_of_book;
            this.author = author;
            this.book_no = book_no;
            this.a_year = a_year;
        }

        int book_id;
        String name_of_book;
        String author;
        int book_no;
        int a_year;
    public void print_books (){
        System.out.println("Books");
        System.out.println("Name: " + this.name_of_book  );
        System.out.println("Author: " + this.author  );
        System.out.println("ISBN: " + this.book_no  );
        System.out.println("Published year: " + this.a_year  );

    }
}
