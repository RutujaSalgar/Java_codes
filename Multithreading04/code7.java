//ThreadGroup
class myThread extends Thread{
	        myThread (ThreadGroup tg ,String str){
		         super(tg ,str);
		}
		public void run(){
		         System.out.println(Thread.currentThread());
		}
        
}
class code7{
             public static void main(String[]args){
	             ThreadGroup pThreadGP=new ThreadGroup("Core2web");

		     myThread obj1=new myThread(pThreadGP ,"RAM");

		     myThread obj2=new myThread(pThreadGP,"Sita");

		     myThread obj3=new myThread(pThreadGP ,"XYZ");

		     obj1.start();
		     obj2.start();
		     obj3.start();

		 
	     }
}
