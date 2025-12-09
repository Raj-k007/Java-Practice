package library_management;

public class Book {
  String title;
  int id;
  String author;
  int totalCopies;
  int availableCopies;
  public Book( int id,String title, String author, int totalCopies) {
    this.title = title;
    this.id = id;
    this.author = author;
    this.totalCopies = totalCopies;
    this.availableCopies = totalCopies;
  }
  void borrowBook() {
    if (availableCopies > 0) {
      availableCopies--;
      System.out.println("Book borrowed: " + title);
    } else {
      System.out.println("No copies available for: " + title);
    }
  }
  void returnBook() {
    if (availableCopies < totalCopies) {
      availableCopies++;
      System.out.println("Book returned: " + title);
    } else {
      System.out.println("All copies are already in the library for: " + title);
    }
  }
  boolean isAvailable() {
    if(availableCopies > 0){
      return true;
    }
    else{
      return false;
    }
  }
  void displayInfo() {
    System.out.println("Title: " + title);
    System.out.println("ID: " + id);
    System.out.println("Author: " + author);
    System.out.println("Total Copies: " + totalCopies);
    System.out.println("Available Copies: " + availableCopies);
  }
}
