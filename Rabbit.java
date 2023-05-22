public class Rabbit extends Animal {
    void voice(){
        System.out.println("Snort Snort");
    }
    void eat(String food){
        System.out.println(food != "Meat" ? "I like eat Grass " : "I don't like eat Meat "   );

    }

}
