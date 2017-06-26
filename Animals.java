class Animals {
  public String mSpecies;
  public String mBreed;
  public int mAge;
  public String mName;
  public int mPrice;
  public String mSize;
  public boolean mIsAvailable;


  public boolean worthBuying(int maxPrice) {
    return (mPrice < maxPrice);
  }
  public boolean insidePet() {
    return (mSize.equals("small") || mSize.equals("medium"));
  }
}
