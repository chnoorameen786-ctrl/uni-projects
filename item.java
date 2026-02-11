public class item {
    String title;
    String author;
    item(String t,String a){
        title=t;
        author=a;
    }
    String getItemInfo(){
        return "Title : "+title+"\nAuthor : "+author;
    }
}
