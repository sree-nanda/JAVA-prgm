 class A extends Thread
{
    public void run()

    {
        
        for ( int i = 1; i <= 100; i++)
         {
            // Check if the current number is even
            if (i % 2 == 0) {
                System.out.println(i);
            }
            }
        System.out.println("Exiting Thread A");

    
}
}
 class B extends Thread
    {
        public void run()

        {
            
            for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
            System.out.println("Exiting Thread B");

        }
    }

        class Multithread
        {
        public static void main(String[] args) 
            {
                A t1=new A();
                B t2=new B();

                t1.start();
                t2.start();


            }
        } 

    

