package core.java.examples.qafox;

public class CommandLineArgs {

	public static void main (String[] args) {
		
		if (args.length>0) {
			for (String arg:args){
				System.out.println(arg);
			}
		}
	}
}
