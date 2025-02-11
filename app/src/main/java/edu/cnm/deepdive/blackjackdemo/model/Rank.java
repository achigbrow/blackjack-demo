package edu.cnm.deepdive.blackjackdemo.model;

public enum Rank {

  ACE(1, 11),
  TWO(2),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SIX(6),
  SEVEN(7),
  EIGHT(8),
  NINE(9),
  TEN(10),
  JACK(10),
  QUEEN(10),
  KING(10);

  private final int hardValue;
  private final int softValue;

  Rank(int value) {
    hardValue = value;
    softValue = value;
  }

  Rank(int hardValue, int softValue) {
    this.hardValue = hardValue;
    this.softValue = softValue;
  }

  public int getHardValue() {
    return hardValue;
  }

  public int getSoftValue() {
    return softValue;
  }

  private static final String[] ABBREVIATIONS = {
      "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
  };

  public String abbreviation() {
    return ABBREVIATIONS[ordinal()];  
  }
  
}
