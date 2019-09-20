import java.util.Scanner;
class Book{
    private String bookName;
    private String authorName;
    private long ISBN;

    public String getBookName(){
        return bookName;
    }

    public String getAuthorName(){
        return authorName;
    }

    public long getISBN(){
        return ISBN;
    }

    public void setBookName(String bookName){
        this.bookName=bookName;
    }

    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }

    public void setPrice(long ISBN){
        this.ISBN=ISBN;
    }
    public Book(String bookName,String authorName,long ISBN){
        this.bookName=bookName;
        this.authorName=authorName;
        this.ISBN=ISBN;
    }
    @Override
    public String toString(){
        return String.format("Book Name:\t%s\nAuthor Name:\t%s\nISBN:\t%d",getBookName(),getAuthorName(),getISBN());






    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();


        Book[] books=new Book[n];
        if(n==0){
            System.out.println("N/A");
        }
        else{
            scanner.nextLine().trim();


            for(int i=0;i<n;i++){

                String bookName=scanner.nextLine().trim();

                String authorName=scanner.nextLine().trim();
                long ISBN=Long.parseLong(scanner.nextLine().trim());
                books[i]=new Book(bookName, authorName, ISBN);
            }


            for(int j=0;j<n;j++){
                System.out.println("-----------------------------");
                System.out.println(books[j]);
                System.out.println("-----------------------------");

            }

        }


    }

}







