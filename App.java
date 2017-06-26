import java.io.Console;

public class App {
 public static void main(String[] args) {
   Console myConsole = System.console();

   Animals cat = new Animals();
      cat.mSpecies = "Cat";
      cat.mBreed = "Maincoon";
      cat.mAge = 2;
      cat.mName = "Pushok";
      cat.mPrice = 500;
      cat.mSize = "small";
      cat.mIsAvailable = true;

    Animals dog = new Animals();
     dog.mSpecies = "Dog";
     dog.mBreed = "Terrier";
     dog.mAge = 3;
     dog.mName = "Druzhok";
     dog.mPrice = 100;
     dog.mSize = "medium";
     dog.mIsAvailable = true;

    Animals monkey = new Animals();
      monkey.mSpecies = "Monkey";
      monkey.mBreed = "Chimpanzee";
      monkey.mAge = 15;
      monkey.mName = "Billy";
      monkey.mPrice = 1000;
      monkey.mSize = "big";
      monkey.mIsAvailable = true;

    Animals horse = new Animals();
      horse.mSpecies = "Horse";
      horse.mBreed = "Pony";
      horse.mAge = 7;
      horse.mName = "Pickles";
      horse.mPrice = 10000;
      horse.mSize = "big";
      horse.mIsAvailable = true;

    Animals parrot = new Animals();
      parrot.mSpecies = "Parrot";
      parrot.mBreed = "Ara";
      parrot.mAge = 1;
      parrot.mName = "Gosha";
      parrot.mPrice = 120;
      parrot.mSize = "small";
      parrot.mIsAvailable = false;


      Animals[] allAnimals = {cat, dog, monkey, horse, parrot};

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
          System.out.println( individualAnimals.mIsAvailable );
          if (individualAnimals.insidePet()) {
            System.out.println("This is an inside animal");
          }
        }
      }
  }
}
