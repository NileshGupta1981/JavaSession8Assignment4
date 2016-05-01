public class Session8Assignment4 extends Thread {
	
	public void run () {
		System.out.println (Thread.currentThread());
		System.out.println ("Main Thread will be alive till the child thread is alive");
		//System.out.println (Thread.currentThread().getThreadGroup());
		for (int i = 0 ; i <10 ; i++){
			//System.out.println ("Thread status is "+ Thread.isAlive());
			System.out.println("Printing the count "+i);
			if ( i%2 != 0){
			
			try{  
				//System.out.println (Thread.currentThread().getName()+ " is going to sleep");
				System.out.println ("Main Thread will be alive till the child thread is alive");
				Thread.sleep(10);  
				//System.out.println (Thread.currentThread().getName()+ " is wake up");  
				}catch(InterruptedException e){  
				throw new RuntimeException("Thread interrupted..."+e);  
				}
			}
	}
		System.out.println ("My Thread run is over");
	}
	
	public static void main (String args[]) throws Exception{
		Session8Assignment4 sa = new Session8Assignment4();
		
		//System.out.println (sa.currentThread());
		//System.out.println ("Thread status is "+ sa.getState());
		//System.out.println ("Main Thread will be alive till the child thread is alive");
		sa.setName("my extending thread");
		sa.start();
		Thread.sleep(1000);
		System.out.println ("Main Thread run is over");
		//System.out.println ("Thread status is "+ sa.getState());
	}	
	
}