//This is a coin class
//blueprint for how to make a coin object
public class coin{
  //These are the declartions for the attributes of a coin.
  private int face;

  private final int HEADS = 0;  //Constants defining heads and tails
  private final int TAILS = 0;

  //The Coin constructor that defines what happens when a Coin object is made.
  //When a new is made it gets flipped.
  public coin(){
    flip();
  }

//This is the section of the class containing the methods (behaviors) or a Coin

//The flip method assigns a randomly chosen value to the face of the coin

  public int getFace(){
    return face;
  }

  public void setFace(int newFace){
    face = newFace;
  }

  public void flip(){
    face = (int) (Math.random() * 2);
  }

  public boolean isHeads(){
    return (face == HEADS);
  }

  //Returns true if the current face of the coin is heads

  public String toString(){
    String result = "";
    if(face == HEADS){
      result = "HEADS";
    }
    else{
      result = "TAILS";
    }
    return result;
  }
}
