//Lambda function with one parameter
interface core2web{
         String lang(int numCourse);
}
class code7{
              public static void main(String[]args){
	         core2web c2w=(xyz) -> "Bootcamp/Java/Python/OS" +":" +xyz;
		 System.out.println(c2w.lang(8));
	      }
}
