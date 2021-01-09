import java.util.Scanner;

class Console {

	private static final Scanner sc = new Scanner(System.in);

	public String read(String string) {
		this.write(string);
		return sc.next();
	}

	public void write(String string) {
		System.out.print(string);
	}

}
