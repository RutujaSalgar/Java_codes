class Parent {
       Parent(){
           System.out.println("In parent constructor");
       }
}
class Child extends Parent{
          Child(){
	        System.out.println("In child constructor");
	  }
}
class code1{
          public static void main(String[]args){
	   Parent obj = new Parent();
	   Child obj1 = new Child();
	  
	  }
}
