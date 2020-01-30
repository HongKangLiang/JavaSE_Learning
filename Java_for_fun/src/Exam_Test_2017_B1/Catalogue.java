package Exam_Test_2017_B1;

import java.util.ArrayList;

public class Catalogue {
    private String name;
    private ArrayList<SheetMusic> tunes;

    public Catalogue(String name){
        this.name = name;
        this.tunes = new ArrayList<SheetMusic>();
    }

    public void addTune(SheetMusic sheetmusic){
        tunes.add(sheetmusic);
    }

    public ArrayList<SheetMusic> tunesMatching(String text){
        ArrayList<SheetMusic> arr_search = new ArrayList<SheetMusic>();
        for (SheetMusic sheetmusic : tunes) {
            if (sheetmusic.titleMatch(text)) {
                arr_search.add(sheetmusic);
            }
        }
        //测试输出
        for (SheetMusic sheetMusic : arr_search){
            System.out.println(sheetMusic.getTitle()+":"+sheetMusic.getAuthor());
        }
        return arr_search;
    }
}
