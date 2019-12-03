public class Die{

  private int num;

  public int roll(){
      num = Math.round( (int) (Math.random()*6 + 1));
      return num;
  }

  public Die(){
    num = 0;
  }

}
