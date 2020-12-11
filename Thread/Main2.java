class NewThread implements Runnable {
	int sum=0;
    String name;
    Thread t;
    NewThread(String threadName) {
    name = threadName;
    t = new Thread(this, name);
    System.out.println("New thread: " + t);
    t.start();
         }
		 
		 public void run()
		 {
			
			 {
				 for(int i=1;i<100;i=i+2)
				 {
					 sum+=i;
				 }
				 System.out.println("The sum of the odd numbers is: "+sum);
			 }
			   
			 System.out.println(name + " exiting.");
		 }
		  
}
public class Main2{

    public static void main(String[] args) {
		int sume=0;
		
            new NewThread("Odd");
			Thread t2=Thread.currentThread();
			System.out.println("Main Thread "+t2);
			t2.setName("Main Thread");
			 
				 for(int i=0;i<100;i=i+2)
				 {
					 sume+=i;
				 }
				 System.out.println("The sum of the odd numbers is: "+sume);
			 
			   
			 System.out.println( "main exiting.");
                  
                        }
                        }
			
			