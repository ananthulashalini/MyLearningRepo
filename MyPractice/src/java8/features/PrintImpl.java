package java8.features;

public class PrintImpl {

	public static void main(String[] args) {
		PrintFunctionalInterface pfi= (name) ->System.out.println("Hello, "+name+"!!");
		pfi.printMyString("Shalini");
	}

}
