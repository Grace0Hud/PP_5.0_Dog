public class DogDriver
{
    public static void main(String [] args)
    {
        Dog fang = new Dog("Fang", "Husky", 5, 80);
        Dog nutmeg = new Dog("Nutmeg", "Australian Sheepdog", 12, 45);
        Dog gus = new Dog("Gus", "German Shepard", 2, 90);

        //5.0 PP
        System.out.println("Start of 5.0");
        System.out.println("Name: " + fang.getName() + "\nBreed: " + fang.getBreed() + "\nAge: " + fang.getAge());
        System.out.println();
        System.out.println(nutmeg.getName() + "'s weight " + nutmeg.getWeight() + " in kg");
        System.out.println();
        System.out.println(gus);
        System.out.println("You have " + Dog.dogCount() + " dogs.");

        //5.3 PP
        System.out.println("Start of 5.3");
        if(nutmeg.compareTo(fang) == 0)
        {
            System.out.println("Same Age!");
        }else if(nutmeg.compareTo(fang) < 0)
        {
            System.out.println("Nutmeg is younger younger than Fang!");
        }else
        {
            System.out.println("Fang is younger than Nutmeg!");
        }//end of nutmeg to fang
        if(fang.compareTo(gus) == 0)
        {
            System.out.println("Same Age!");
        }else if(fang.compareTo(gus) < 0)
        {
            System.out.println("Fang is younger younger than Gus!");
        }else
        {
            System.out.println("Gus is younger than Fang!");
        }//end fang to gus
    }//end of main method
}//end DogDriver class
