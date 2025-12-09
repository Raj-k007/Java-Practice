package library_management;

public class Loan {
  int loanId;
  int memberId;
  int bookId;
  static int loanCounter=0;
  {
    loanId=++loanCounter;
  }
  Loan(int memberId, int bookId){
    this.memberId=memberId;
    this.bookId=bookId;
  }
  boolean isMember(int memberId){
    return this.memberId==memberId;
  }
  boolean isBook(int bookId){
    return this.bookId==bookId;
  }
}
