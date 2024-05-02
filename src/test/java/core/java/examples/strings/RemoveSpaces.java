package core.java.examples.strings;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = "hello world this is new chaper";
String input1 = "hello world this is new chaper		kjj";

System.out.println(input.replace(" ", ""));
System.out.println(input.replaceAll("\\s+", ""));
char[] charArray = input1.toCharArray();
String withoutSpaces = "";

for (int i=0;i<charArray.length;i++) {
	
	if (charArray[i]!= ' ' && charArray[i]!='\t') {
		
		withoutSpaces = withoutSpaces+charArray[i];
	}
}

System.out.println("Aftr removing the spaces: "+withoutSpaces);
	}

}
