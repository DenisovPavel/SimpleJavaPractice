package StudyFolderOneEasyLevelJava.ArrayList;
import java.util.ArrayList;
public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(1, new StringBuilder("pokemon"));
        for( StringBuilder sb : list) {
            System.out.print(sb + " ");
        }
        System.out.println(list.indexOf(new StringBuilder("poka")));

    }
}
