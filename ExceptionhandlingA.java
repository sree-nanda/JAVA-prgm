public class ExceptionhandlingA 
{
    
    public static void main(String args[] )
   
    { 
        int sum;
        
        System.out.println("Division by 0 :");
        try 
        {   //int b[]=new int[5];
            //b[10]=20/1;
            int a = 50;
            sum = a/0;
        } catch (ArithmeticException e) 
        {
           System.out.println("CatchBlock"); // TODO: handle exception
        }
            catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException Occurs");
        }
        System.out.println("Rest of the code:");
        System.out.println("Divisin by 1 :");
        int b=30;
        float Sum =b/1;
    }
}
