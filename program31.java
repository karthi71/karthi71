1.	class A{  
2.	public static void main(String args[]){  
3.	StringBuffer sb=new StringBuffer();  
4.	System.out.println(sb.capacity());//default 16  
5.	sb.append("Hello");  
6.	System.out.println(sb.capacity());//now 16  
7.	sb.append("java is my favourite language");  
8.	System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
9.	}  
10.	}  
