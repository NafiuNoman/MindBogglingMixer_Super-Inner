
package superkeytry;

public class second extends first{
    public static String ok="i am fine";
    
    public second (int x)
            
    {
        super(x);
        System.out.println("hiiii this is from second from sub class construcktor");
    }
    
    class secondInner extends NewClass
    {
        public secondInner(String name)
        {
            super(name);
            
        }
        public void display()
        {
            System.out.println("this is inner class from secondClass");
        }
    }
    
}
