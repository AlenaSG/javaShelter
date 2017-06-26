public class App {
 public static void main(String[] args) {
   Animals cat = new Animals();
      cat.mSpecies = "Cat";
      cat.mBreed = "Maincoon";
      cat.mAge = 2;
      cat.mName = "Pushok";
      cat.mPrice = 500;
      cat.mIsAvailable = true;

    Animals dog = new Animals();
     dog.mSpecies = "Dog";
     dog.mBreed = "Terrier";
     dog.mAge = 3;
     dog.mName = "Druzhok";
     dog.mPrice = 100;
     dog.mIsAvailable = true;

    Animals monkey = new Animals();
      monkey.mSpecies = "Monkey";
      monkey.mBreed = "Chimpanzee";
      monkey.mAge = 5;
      monkey.mName = "Billy";
      monkey.mPrice = 1000;
      monkey.mIsAvailable = true;

    Animals parrot = new Animals();
      parrot.mSpecies = "Parrot";
      parrot.mBreed = "Ara";
      parrot.mAge = 1;
      parrot.mName = "Gosha";
      parrot.mPrice = 120;
      parrot.mIsAvailable = false;


      Animals[] allAnimals = {cat, dog, monkey, parrot};

      System.out.println("All Animals:");

      for ( Animals individualAnimals : allAnimals ) {
        System.out.println( "----------------------" );
        System.out.println( individualAnimals.mSpecies );
        System.out.println( individualAnimals.mBreed );
        System.out.println( individualAnimals.mAge );
        System.out.println( individualAnimals.mName );
        System.out.println( individualAnimals.mPrice );
        System.out.println( individualAnimals.mIsAvailable );
      }

    }
  }
