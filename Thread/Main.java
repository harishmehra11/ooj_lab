class NewThread implements Runnable {
    String name;
    Thread t;
    NewThread(String threadName) {
    name = threadName;
    t = new Thread(this, name);
    System.out.println("New thread: " + t);
    t.start();
                          }
    public void run() {
            try {
                 if (t.getName().equals("One")) 
				 {
                  for (int i = 5; i > 0; i--) 
				  {
                   System.out.println("BMS College of Engineering");
                   Thread.sleep(10000);
                   }
                 }
                 else{
                       for (int i = 20; i > 0; i--) {
                         System.out.println("CSE");
                                       Thread.sleep(2000);
                                                      }
                                                         }
                                                          }
                                  catch(InterruptedException e){
                                                     System.out.println(name + "Interrupted");
														}	
                                          System.out.println(name + " exiting.");
	}
}	
                                                                                                                                                                                                                                                       
public class Main {

    public static void main(String[] args) {
            new NewThread("One");
                    new NewThread("Two");
                        }
                        }
