class Main {
    public static void main(String[] args) {
      System.out.println(golf_score(5,4,true));  //birdie
      System.out.println(golf_score(3,5,true));  //double bogey
      System.out.println(golf_score(4,5,true));  //bogey
      System.out.println(golf_score(3,2,true));  //birdie
      System.out.println(golf_score(7,2,true));  //error     
      System.out.println(golf_score(5,4,false)); //1 below par   
    }
    public static String golf_score(int par, int score, boolean words) {
      String output = "";
      if (par-1 == score) {
        if (words == true) {
          output = "birdie";
        } else {
          output = "1 below par";
        }
      } else if (par-2 == score) {
        if (words == true) {
          output = "eagle";
        } else {
          output = "2 below par";
        }
      } else if (par+1 == score) {
        if (words == true) {
          output = "bogey";
        } else {
          output = "1 above par";
        }
      } else if (par+2 == score) {
        if (words == true) {
          output = "double bogey";
        } else {
          output = "2 above par";
        }
      } else if (par == score) {
        output = "par";
      } else {
        output = "error";
      }
      return output;
    }
  }