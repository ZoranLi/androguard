
public class Test2 {
    private int x = 0x41414141;
    public int z = 0x42424242;

    public String T = "HELLO TEST2 !!!!";

    public Test2() {
    }

    public int get_x() {
      return this.x;
    }
            
    public static void main(String args[]) {

      Test2 t = new Test2();
      Test2bis tbis = new Test2bis();

      System.out.println("x = " + t.get_x() + " z = " + t.z + " T = " + t.T);
      while(true) {
         try {
            Thread.currentThread().sleep(100000);
         }
         catch(Exception e)
         {
            System.out.println(e);
         }
      }
    }
    
}
