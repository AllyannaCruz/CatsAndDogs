package tudublin.ie;

public class Animal
{
    //local to class
    private String name; // make two public accessors

    public Animal(String num)
    {
       setName(name);
    }


    public String getName() //accessor for name must be spelled getName
    {
        
    }

    public void getName(String name)//accessor method
    {
        this.name = name;
    }

    //constructor - object is called when u create an object --default constructor when not made
    //constructor must be the same as CLass

    public void setName(){

    }

    public void speak()
    {
        System.out.println("Meow!");
    }

    public toString()
    {
        
    }

}