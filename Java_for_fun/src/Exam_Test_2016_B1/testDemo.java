package Exam_Test_2016_B1;

public class testDemo {
    public static void main(String[] args) {
        Note note1 = new Note("this is our new world","we will need you");
        Note note2 = new Note("we will protect you","do not trust any one");
        Journal journal = new Journal("Alan");

        journal.addNote(note1);
        journal.addNote(note2);

        journal.notesContaining("you");

    }
}
