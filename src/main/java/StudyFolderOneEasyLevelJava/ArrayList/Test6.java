package StudyFolderOneEasyLevelJava.ArrayList;
import java.util.ArrayList;
public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList <StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
//        FirstStudyProgramm.FirstStudyProgramm.EncapsulationLesson.EncapsulationLesson.ArrayList <StringBuilder> list3=list1;
//        FirstStudyProgramm.FirstStudyProgramm.EncapsulationLesson.EncapsulationLesson.ArrayList <StringBuilder> list2 = (FirstStudyProgramm.FirstStudyProgramm.EncapsulationLesson.EncapsulationLesson.ArrayList<StringBuilder>) list1.clone();
//        System.out.println(list1==list3);
//        System.out.println();
//        System.out.println(list1.get(0)==list2.get(0));
        Object[] array1 = list1.toArray();
        for(Object o : array1){
            System.out.print(o + " ");

        }
    }
}
