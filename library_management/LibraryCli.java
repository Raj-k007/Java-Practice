package library_management;
import java.util.*;
public class LibraryCli {
  public static void main(String[] args) {
    System.out.println("Welcome to the Library Management System"); // loan id display, members and books display can be added
    boolean tag=true;
    Scanner scanner = new Scanner(System.in);
    libraryManager manager = new libraryManager();  // think about test cases for remove (and update member and book)
    while(tag==true){
    System.out.println("1. Add Member");
    System.out.println("2. Add Book");
    System.out.println("3. Borrow Book");
    System.out.println("4. Return Book");
    System.out.println("5. Exit");
    int choice = scanner.nextInt();
    scanner.nextLine(); // Consume newline
    switch (choice) {
      case 1: System.out.println("Enter Member ID, Name, Email, Max Books Allowed:");
              int id=scanner.nextInt();
              scanner.nextLine(); // Consume newline
              String name=scanner.nextLine();
              String email=scanner.nextLine();
              int maxBooksAllowed=scanner.nextInt();
              scanner.nextLine(); // Consume newline
              manager.addMember(new Member(id, name, email, maxBooksAllowed));
        break;
      case 2: System.out.println("Enter Book ID, Title, Author, Total Copies:");
      int bookId=scanner.nextInt();
      scanner.nextLine(); // Consume newline
              String title=scanner.nextLine();
              String author=scanner.nextLine();
              int totalCopies=scanner.nextInt();
              scanner.nextLine(); // Consume newline
              manager.addBook(new Book(bookId, title, author, totalCopies));   
        break;
      case 3: System.out.println("Enter Member ID and Book ID to borrow:");
      int memberId=scanner.nextInt();
      scanner.nextLine(); // Consume newline
              int bId=scanner.nextInt();
              scanner.nextLine(); // Consume newline
              manager.addLoan( memberId, bId);
              break;
      case 4: System.out.println("Enter Loan ID to return:");
      int loanId=scanner.nextInt();
      scanner.nextLine(); // Consume newline
              manager.returnLoan(loanId);
        break;
      case 5: System.out.println("Exiting...");
               scanner.close();
              // System.exit(0);
              tag=false;
        break;
    }
  }
}
}
