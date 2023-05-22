public class Dog extends Animal {
    void voice (){
        System.out.println("Woof Woof");
    }

    void eat(String food){

        System.out.println(food != "Grass" ? "I like eat Meat " : "I don't like eat Grass "   );

    }
}
