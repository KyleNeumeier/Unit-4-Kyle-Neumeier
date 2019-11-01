//Creates instances of the coin class and tests their attributes and behaviors

public class coinTester{
  public static void main(String[] args){
    coin myCoin = new coin();
    coin yourCoin = new coin();

    System.out.println("My Coin = " + myCoin.toString());
    System.out.println("Your Coin = " + yourCoin.toString());

    int numHeads = 0;
    final int NUM_FLIPS = 10;

    System.out.println("\nFlipping a coin " + NUM_FLIPS + " times:");

    for(int i = 1; i <= NUM_FLIPS; i++){
      myCoin.flip();
      System.out.println(myCoin + "\t");
      if(myCoin.isHeads()){
        numHeads++;
      }
    }
  }
}
