class Animals {
  public String mSpecies;
  public String mBreed;
  public int mAge;
  public String mName;
  public int mPrice;
  public String mSize;
  public boolean mAdopted;


  public Animals(String species, String breed, int age, String name, int price, String size, boolean adopted) {
    mSpecies = species;
    mBreed = breed;
    mAge = age;
    mName = name;
    mPrice = price;
    mSize = size;
    mAdopted = adopted;
  }

  public boolean worthBuying(int maxPrice) {
    return (mPrice < maxPrice);
  }
  public boolean insidePet() {
    return (mSize.equals("small") || mSize.equals("medium"));
  }
  public boolean adoptedPet() {
    return (mAdopted = true);
  }
}
