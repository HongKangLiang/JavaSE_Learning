package Exam_Test_2017_B1;

public class SheetMusic {
    private String title;
    private String author;
    private String reference;

    public SheetMusic(String title, String author, String reference) {
        this.title = title;
        this.author = author;
        this.reference = reference;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getReference(){
        return reference;
    }

    public boolean titleMatch(String text){
        //这里用indexOf来检验字符串中是否含有某子字符串，没有则返回-1
        if (title.indexOf(text) != -1) {
            return true;
        }else{
            return false;
        }
    }
}
