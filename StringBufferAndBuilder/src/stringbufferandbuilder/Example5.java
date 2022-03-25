package stringbufferandbuilder;

public class Example5 {

	public static void main(String[] args) {
	 StringBuffer n=new StringBuffer("welcome to India");
	 System.out.println(n.indexOf("India"));
     System.out.println("----------------");
     StringBuffer n1=new StringBuffer("welcome to India");
     System.out.println(n1.insert(16, ", Welcome to Chennai"));
	}

}
