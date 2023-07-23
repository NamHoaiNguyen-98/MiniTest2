package Book;

import java.util.ArrayList;

public class MainBooks {
    public static void main(String[] args) {
        FictionBook fictionBook1 = new FictionBook("F1", "Fiction1", 10000, "Nam", "Fic1");
        FictionBook fictionBook2 = new FictionBook("F2", "Fiction2", 5000, "Peter", "Fic2");
        FictionBook fictionBook3 = new FictionBook("F3", "Fiction3", 15000, "John", "Fic3");
        FictionBook fictionBook4 = new FictionBook("F4", "Fiction1", 15000, "Wick", "Fic1");
        FictionBook fictionBook5 = new FictionBook("F5", "Fiction5", 3000, "Mic", "Fic1");
        ProgrammingBook programmingBook1 = new ProgrammingBook("P1", "Programming1", 5000, "KaKa", "Brazil", "one");
        ProgrammingBook programmingBook2 = new ProgrammingBook("P2", "Programming2", 15000, "Noname", "Japanese", "two");
        ProgrammingBook programmingBook3 = new ProgrammingBook("P3", "Programming3", 7000, "Messi", "Argentina", "three");
        ProgrammingBook programmingBook4 = new ProgrammingBook("P4", "Programming4", 50000, "CR7", "Portugal", "four");
        ProgrammingBook programmingBook5 = new ProgrammingBook("P5", "Programming5", 20000, "Son", "Korea", "five");
        ArrayList<Book> books = new ArrayList<>();
        books.add(fictionBook1);
        books.add(fictionBook2);
        books.add(fictionBook3);
        books.add(fictionBook4);
        books.add(fictionBook5);
        books.add(programmingBook1);
        books.add(programmingBook2);
        books.add(programmingBook3);
        books.add(programmingBook4);
        books.add(programmingBook5);

        System.out.println("Total price 10 books: ");
        int sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        System.out.println(sum);
        System.out.println("----------------------------------");
        System.out.println("Count name fictionBooks is Fic1: ");
        int countName = 0;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) book;
                if (fictionBook.getCategory().equals("Fic1")) {
                    countName++;
                }
            }
        }
            System.out.println(countName);
            System.out.println("----------------------------------");
            System.out.println("Count Price books less than 9000: ");
            int countPrice = 0;
            for (Book book : books) {
                if (book.getPrice() < 90000) {
                    countPrice++;
                }
            }
            System.out.println(countPrice);
        }
    }
