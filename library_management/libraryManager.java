package library_management;

import java.util.Map;
import java.util.HashMap;


public class libraryManager {
  Map<Integer, Loan> loans=new HashMap<>();
  Map<Integer, Book> books=new HashMap<>();
  Map<Integer, Member> members=new HashMap<>();

  void addBook(Book book){
    books.put(book.id, book);
  }
  void addMember(Member member){
    members.put(member.id, member);
  }
  void addLoan(int memberId, int bookId){
    Member member=members.get(memberId);
    Book book=books.get(bookId);
    if(member!=null && book!=null){
      if(book.isAvailable() && member.isBorrowable()){
        book.borrowBook();
        member.borrowBook();
        // Loan.loanCounter++;
        Loan ln=new Loan(memberId, bookId);
        loans.put(ln.loanId, ln);
        System.out.println("Loan added: Member ID " + memberId + " borrowed Book ID+ " + bookId);
      }
      else if(!book.isAvailable()){
        System.out.println("Book ID " + bookId + " is not available for borrowing.");
      }
      else{
        System.out.println("Member ID " + memberId + " has reached the borrowing limit.");
      }
    }
    else if(member==null){
      System.out.println("Member not found with ID: " + memberId);
    }
    else{
      System.out.println("Book not found with ID: " + bookId);
    }
  }
  void returnLoan(int loanId){
    Loan loan=loans.get(loanId);
    if(loan!=null){
      Book book=books.get(loan.bookId);
      Member member=members.get(loan.memberId);
      book.returnBook();
      member.returnBook();
      loans.remove(loanId);
      System.out.println("Loan returned: Loan ID " + loanId);
    }
    else{
      System.out.println("Loan not found with ID: " + loanId);
    }
  }
}
