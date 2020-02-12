package ie.tudublin //change folder names

public class Cat extends Animal
{
    private int numLives; //generate getters and setters

    public Cat(String name){
        //constructor chaining
        super(name);
    }

    public void getNumLives(int numLives)
    {

    }

    public void setNumLives(int numLives)
    {
        this.numLives = numLives;
    }
    
}