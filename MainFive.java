public class Coin
{
    public final int HEADS = 0;
    public final int TAILS = 1;
    private int face;

    public Coin ()
    {
      flip();
    }

    public void flip()
    {
      face = (int) (Math.random() * 2);
    }

    public boolean isHeads()
    {
      return (face == HEADS);
    }

    public String toString()
    {
      String faceName;
      if (face == HEADS)
          faceName = "Heads";
      else
          faceName = "Tails";
      return faceName;
    }
}
class Main {
  public static void main(String[] args) {
    
    Coin coins = new Coin();
    String flip = "";
    int head = 0;
    int tail = 0;
    int headMax = 0;
    int tailMax = 0;
    
    for (int i = 0; i < 100; i++) {
      coins.flip();
      flip = coins.toString();

      if (flip.equals("Heads")) {
        if (tail > tailMax) {
          tailMax = tail;
        }
        tail = 0;
        head++;
      } else {
        if (head > headMax) {
          headMax = head;
        }
        head = 0;
        tail++;
      }
    }
    if (headMax > tailMax) {
      System.out.println("Heads: " + headMax);
    } else if (tailMax > headMax) {
      System.out.println("Tails: " + tailMax);
    } else if (tailMax == headMax) {
      System.out.println("Its a Tie!");
    }
    
  }
}