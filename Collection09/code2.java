import java.util.*;
class code2{
        public static void main(String[]args){
	Queue que=new LinkedList();
	que.offer(10);
	que.offer(20);
	que.offer(50);
	que.offer(30);
	que.offer(40);

	System.out.println(que);
	que.poll();
	System.out.println(que);

	System.out.println(que.peek());

	System.out.println(que);

	}}
