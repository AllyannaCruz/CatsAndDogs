package tudublin.ie // bc ie is the package in my folders

public class Main{

}

public static void main(String[] args){

}
//This is not polymorphism
Cat topcat = new Cat("Topcat");

//This is polymorphism
Animal mino = new Cat("Mino");

//a virtual method
//dynamic binding  -- //always call one of instance instead of super
mino.speak(); // Cat method speak gets called

//cast -- (Cat) added
System.out.println((Cat)mino.getNumLives()); //program won't compile here // compiler wont know mino is a cat, only knows its an animal
//compiler will only know when you run the program.

mino = new Dog("Misty"); // This will compile because type is Animal
topcat = new Dog("Tara");// Won't compile because type is cat

