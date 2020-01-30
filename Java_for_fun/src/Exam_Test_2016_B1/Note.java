package Exam_Test_2016_B1;

public class Note {
    private String subject;
    private String contents;

    public Note(String topic, String words) {
        subject = topic;
        contents = words;
    }

    public boolean include(String text){
        if(text.isEmpty()){
            System.out.println("The keyword is invalid. Please retry!");
            return false;
        }else{
            if(subject.indexOf(text) != -1 | contents.indexOf(text) != -1){
                return true;
            }else {
                return false;
            }
        }
    }
}
