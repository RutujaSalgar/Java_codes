class Parent{
       void fun(){
         System.out.println("Parent");
       }
       
}
class child extends Parent{
           void fun(){
	       System.out.println("Child fun");
	   }
	   void gun(){
	        
	   }
}
class code18{
         public static void main(String[]args){
          
         Parent obj = new Parent();
	 obj.fun();
	 }
}
