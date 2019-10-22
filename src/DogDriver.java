public class DogDriver
{
    public static void main(String [] args)
    {
        Dog fang = new Dog("Fang", "Husky", 5, 80);
        Dog nutmeg = new Dog("Nutmeg", "Australian Sheepdog", 12, 45);
        Dog gus = new Dog("Gus", "German Shepard", 2, 90);
        //Tests

        System.out.println("Name: " + fang.getName() + "\nBreed: " + fang.getBreed());
        System.out.println();
        System.out.println(nutmeg.getName() + "'s weight " + nutmeg.getWeight() + " in kg");
        System.out.println();
        System.out.println(gus);

//        System.out.println(fang);
//        System.out.println(nutmeg);
//        System.out.println(gus);
        System.out.println("You have " + Dog.dogCount() + " dogs.");
    }//end of main method
}//end DogDriver class
