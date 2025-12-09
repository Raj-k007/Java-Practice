package library_management;

public class Member {
  int id;
  String name;
  String email;
  int maxBooksAllowed;
  int booksBorrowed;
  public Member(int id, String name, String email, int maxBooksAllowed) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.maxBooksAllowed = maxBooksAllowed;
    this.booksBorrowed = 0;
  }
  void borrowBook() {
    if (booksBorrowed < maxBooksAllowed) {
      booksBorrowed++;
      System.out.println("Book borrowed by: " + name);
    } else {
      System.out.println("Borrowing limit reached for: " + name);
    }
  }
  boolean isBorrowable() {
    if (booksBorrowed < maxBooksAllowed) {
      return true;
    } else {
      return false;
    }
  }
  void returnBook() {
    if (booksBorrowed > 0) {
      booksBorrowed--;
      System.out.println("Book returned by: " + name);
    } else {
      System.out.println("No books to return for: " + name);
    }
  }
  void displayInfo() {
    System.out.println("Member ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Email: " + email);
    System.out.println("Max Books Allowed: " + maxBooksAllowed);
    System.out.println("Books Borrowed: " + booksBorrowed);
  }

}
