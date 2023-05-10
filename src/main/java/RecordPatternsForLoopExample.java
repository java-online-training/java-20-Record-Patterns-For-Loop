import java.util.List;

public class RecordPatternsForLoopExample {


    record Monkey(String name, int age){}
    
    public static void main(String[] args) {
        List monkes = List.of(new Monkey("Bert", 2), new Monkey("Jeff", 5), new Monkey("Ernie", 7));
        
        for (Monkey m : monkeys){
            System.out.println(m.name);
        }
    }
}
