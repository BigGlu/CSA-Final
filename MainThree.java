public class Time {
    private int hour = 0;
    private int minute = 0;
    
    public Time () {
      hour = 0;
      minute = 0;
    }
  
    public Time (int h, int m) {
      if (h >= 1 && h <= 23) {
        hour = h;
      } else {
        hour = 0;
      }
      if (m >= 1 && m <= 59) {
        minute = m;
      } else {
        minute = 0;
      }
    }
    
    void increment() {
      minute++;
      if (minute >= 60) {
        minute = 0;
        hour++;
        if (hour >= 24) {
          hour = 0;
        }
      }
    }
  
    public String convert() {
      String hr = "";
      String min = "";
      
      if (hour == 0) {
        hr = "12";
      } else if (hour < 12) {
        hr = Integer.toString(hour);
      } else if (hour == 12) {
        hr = "12";
      } else {
        hr = Integer.toString(hour - 12);
      }
      
      if (minute < 10) {
        min = "0" + Integer.toString(minute);
      } else {
        min = Integer.toString(minute);
      }
      
      if (hour < 12) {
        return hr + ":" + min + " AM";
      } else {
        return hr + ":" + min + " PM";
      }
    }
  
  
    public String toString () {
      return String.format("%02d%02d", hour, minute); //makes sure each one is 2 digits
    }
  }

class Main {
    public static void main(String[] args) {
      Time t1 = new Time(00, 00);
      System.out.println(t1.convert());
      
      Time t2 = new Time(14, 56);
      System.out.println(t2.convert());
      
      Time t3 = new Time(00, 12);
      System.out.println(t3.convert());
      
      Time t4 = new Time(05, 17);
      System.out.println(t4.convert());
      
      Time t5 = new Time(12, 15);
      System.out.println(t5.convert());
      
      Time t6 = new Time(00, 15);
      System.out.println(t6.convert());
      
      Time t7 = new Time(23, 59);
      System.out.println(t7.convert());
    }
}