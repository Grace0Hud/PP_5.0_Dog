public class Dog implements Comparable<Dog>
{
    private String name, breed;
    private int age;
    private double weight;
    private static int count;
    public Dog()
    {
        name = null;
        breed = null;
        age = 0;
        weight = 0;
    }//end of 0-arg const
    public Dog(String name, String breed, int age, double weight)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = poundsToKg(weight);
        count++;
    }//end of multi-arg constructor
    //getters
    public String getName()
    {
        return name;
    }//end of get name
    public String getBreed()
    {
        return breed;
    }//end of getBreed
    public int getAge()
    {
        return age;
    }
    public double getWeight()
    {
        return poundsToKg(weight);
    }//end of get weight
    public static int dogCount()
    {
        return count;
    }//end of count getter
    //setters
    public void setName(String name)
    {
        this.name = name;
    }//end of name setter
    public void setBreed(String breed)
    {
        this.breed = breed;
    }//end of breed setter
    public void setAge(int age)
    {
        this.age = age;
    }//end of age setter
    public void setWeight(double weight)
    {
        this.weight = poundsToKg(weight);
    }//end of weight setter
    //brain metods
    //start of 5.3 PP
    public int compareTo(Dog someDog)
    {
        if(this.age < someDog.getAge())
        {
            return -1;
        }else if(this.age > someDog.getAge())
        {
            return 1;
        }else
        {
            return 0;
        }//end of if
    }//end of compareTo (and 5.3 PP)
    private double poundsToKg(double pounds)
    {
        double kg;
        kg = pounds/2.205;
        kg = Math.round(kg);
        return kg;
    }//end of pounds to kg
    //to string
    public String toString()
    {
        String output = "Dog Information";
        output+= "\nName: " + name;
        output += "\nBreed: " + breed;
        output += "\nAge: " + age + " years";
        output += "\nWeight: " + weight + "kg";
        output += "\n";
        return output;
    }//end of to string
}//end of dog class
