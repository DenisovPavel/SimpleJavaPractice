package StudyFolderOneEasyLevelJava.EncapsulationLesson;
//Encapsulation(сокрытие данных)
public class Test1 {
    public static void main(String[] args) {
        int i = 2;
        String s = new String[]{"A","B","C","D"}[i];
        System.out.println(s);// 2 элемент массива S -это "C";
    }
}
