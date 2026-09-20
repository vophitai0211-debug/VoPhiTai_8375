package Review.OExercise1;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookList bookArrayList = new BookList();

        int option;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add new book");
            System.out.println("2. Update book by id");
            System.out.println("3. Delete book by id");
            System.out.println("4. Find book by id");
            System.out.println("5. Display all books");
            System.out.println("0. Exit menu");
            System.out.print("Choose option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1:
                    System.out.print("Enter book type (1: text book / 2: reference book): ");

                    int type = scanner.nextInt();
                    scanner.nextLine();

                    if (type == 1) {

                        TextBook textbook = new TextBook();
                        textbook.addBook();
                        bookArrayList.addBook(textbook);

                        System.out.println("Add textbook successfully!");

                    } else if (type == 2) {

                        ReferenceBook referenceBook = new ReferenceBook();
                        referenceBook.addBook();
                        bookArrayList.addBook(referenceBook);

                        System.out.println("Add reference book successfully!");

                    } else {

                        System.out.println("Invalid book type!");

                    }

                    break;

                case 2:
                    System.out.print("Enter id to update: ");
                    String updateId = scanner.nextLine();

                    bookArrayList.updateBook(updateId);

                    break;

                case 3:
                    System.out.print("Enter id to delete: ");
                    String deleteId = scanner.nextLine();

                    bookArrayList.deleteBookById(deleteId);

                    break;

                case 4:
                    System.out.print("Enter id to find: ");
                    String findId = scanner.nextLine();

                    Book foundBook = bookArrayList.findBookById(findId);

                    if (foundBook != null) {
                        foundBook.displayBook();
                    } else {
                        System.out.println("Error! Book not found");
                    }

                    break;

                case 5:
                    bookArrayList.displayBookList();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option! Please choose again.");
                    break;
            }

        } while (option != 0);

        scanner.close();
    }
}