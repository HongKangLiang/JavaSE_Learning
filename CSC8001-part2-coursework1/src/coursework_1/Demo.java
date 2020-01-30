package coursework_1;


import java.io.*;
import java.util.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner inFile = new Scanner(new FileReader("/Users/lianghongkang/Java-file-test/resources.txt"));
        List<Word> transfer = new ArrayList<Word>();
        Set<String> list_string = new HashSet<String>();
        PrintWriter outFile = new PrintWriter(new FileWriter("/Users/lianghongkang/Java-file-test/result.txt"));

        while (inFile.hasNext()) {
            String letter_temp = inFile.next();
            StringBuilder sb = new StringBuilder(letter_temp);
            char end = sb.charAt(sb.length()-1);
            if (end ==','|| end =='.'||end ==';'||end ==':'||end =='?'||end =='!'|| end == ' '){
                sb.deleteCharAt(sb.length()-1);
            }
            String letter_temp2 = sb.toString();
            String letter = letter_temp2.toLowerCase();
            Word word = new Word(letter,1);

            if (list_string.contains(letter)) {
                for (Word w : transfer) {
                    if (w.getValue().equals(word.getValue())) {
                        w.setCount(w.getCount() + 1);
                    }
                }
            }else {
                list_string.add(letter);
                transfer.add(word);
            }
        }

        Collections.sort(transfer, new Comparator<Word>() {
            @Override
            public int compare(Word w1, Word w2) {
                int num = w2.getCount() - w1.getCount();
                int num2 = num == 0 ? w1.getValue().compareTo(w2.getValue()) : num ;
                return num2;
            }
        });

        for (Word w : transfer) {
            outFile.print(w.getValue());
            outFile.print("  ");
            outFile.println(w.getCount());
        }

        outFile.close();

    }
}
