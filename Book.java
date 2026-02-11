public class Book extends item{
    String bookId;
    String category;
    Book(String t,String a,String b,String c){
        super(t,a);
        bookId=b;
        category=c;
    }

    @Override
    String getItemInfo() {
        return super.getItemInfo()+"\nBook Id: "+bookId+
                "\nCategory: "+category;
    }
}
