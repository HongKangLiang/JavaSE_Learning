package Exam_Test_2016_B1;

import java.util.ArrayList;

public class Journal {
    private String name;
    private ArrayList<Note> notes;

    public Journal(String name){
        this.name = name;
        this.notes = new ArrayList<Note>();
    }

    public void addNote(Note note){
        notes.add(note);
    }

    public int notesContaining(String text) {
        int count = 0;
        for(Note note : notes){
            if(note.include(text)){
                count++;
            }
        }
        //测试输出
        System.out.println(count);
        return count;
    }
}
