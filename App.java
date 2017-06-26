import java.io.Console;

public class App {
 public static void main(String[] args) {
   Console myConsole = System.console();


      Animals cat = new Animals("Cat", "Maincoon", 2, "Pushok", 500, "small", false);
      Animals dog = new Animals("Dog", "Terrier", 3, "Druzhok", 100, "medium", false);
      Animals monkey = new Animals("Monkey", "Chimpanzee", 15, "Billy", 1000, "big", false);
  //  Animals cat = new Animals();
  //     cat.mSpecies = "Cat";
  //     cat.mBreed = "Maincoon";
  //     cat.mAge = 2;
  //     cat.mName = "Pushok";
  //     cat.mPrice = 500;
  //     cat.mSize = "small";
  //     cat.mAdopted = false;
   //
  //   Animals dog = new Animals();
  //    dog.mSpecies = "Dog";
  //    dog.mBreed = "Terrier";
  //    dog.mAge = 3;
  //    dog.mName = "Druzhok";
  //    dog.mPrice = 100;
  //    dog.mSize = "medium";
  //    dog.mAdopted = false;
   //
  //   Animals monkey = new Animals();
  //     monkey.mSpecies = "Monkey";
  //     monkey.mBreed = "Chimpanzee";
  //     monkey.mAge = 15;
  //     monkey.mName = "Billy";
  //     monkey.mPrice = 1000;
  //     monkey.mSize = "big";
  //     monkey.mAdopted = false;
   //
  //   Animals horse = new Animals();
  //     horse.mSpecies = "Horse";
  //     horse.mBreed = "Pony";
  //     horse.mAge = 7;
  //     horse.mName = "Pickles";
  //     horse.mPrice = 10000;
  //     horse.mSize = "big";
  //     horse.mAdopted = false;
   //
  //   Animals parrot = new Animals();
  //     parrot.mSpecies = "Parrot";
  //     parrot.mBreed = "Ara";
  //     parrot.mAge = 1;
  //     parrot.mName = "Gosha";
  //     parrot.mPrice = 120;
  //     parrot.mSize = "small";
  //     parrot.mAdopted = false;


      Animals[] allAnimals = {cat, dog, monkey};

      System.out.println("What is your maximum budget for a pet?");
      String stringUserMaxBudget = myConsole.readLine();
      int userMaxBudget = Integer.parseInt(stringUserMaxBudget);


      System.out.println("Alright, here's what we have in your price range:");



      for ( Animals individualAnimals : allAnimals ) {
        if (individualAnimals.worthBuying(userMaxBudget)) {
          System.out.println( "----------------------" );
          System.out.println( individualAnimals.mSpecies );
          System.out.println( individualAnimals.mBreed );
          System.out.println( individualAnimals.mAge );
          System.out.println( individualAnimals.mName );
          System.out.println( individualAnimals.mPrice );
          // System.out.println( individualAnimals.mAdopted );
          if (individualAnimals.insidePet()) {
            System.out.println("This is an inside animal");
          }
          if (individualAnimals.adoptedPet()) {
              System.out.println( individualAnimals.mAdopted );
           }

          }
        }
      }
  }
