import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;


public class GraPaccClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void GraPaccTest () throws FileNotFoundException {
		FileReader fReader = new FileReader("README.md");
		BufferedReader bReader = new BufferedReader(fReader);
	}
}
