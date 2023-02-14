package StudyFolderOneEasyLevelJava.Lesson21GarCollector;
//simple interesting difference btw constr-r & method;
public class ConstructorEx {
    ConstructorEx() {
        System.out.println("Eto Constructor");
    }
    void ConstructorEx() {
        System.out.println("Eto method");
    }
    public static void main(String[] args) {
        ConstructorEx cons = new ConstructorEx();
        cons.ConstructorEx();
    }
}

