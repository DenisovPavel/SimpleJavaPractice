package FirstStudyProgramm.EncapsulationLesson.Lesson19VarArgs;

public class EnhancedForHomeTask {
    public static void abc(String ... array){
       String [] array1 = null;
        for (int i = 0; i < array.length; i++) {
         //array = array1[i];
    }
        System.out.print(array);
    }

    public static void main(String[] args) {
        abc("Привет","Мир");
        abc("Привет","мои","Друзья");
        abc("Привет","мои","Друзья","Я","Тут","с","Вами");

    }
}
