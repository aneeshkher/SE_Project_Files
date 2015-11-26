import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class GraPaccClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void GraPaccTest () throws FileNotFoundException {
		
		FileReader fReader = new FileReader("README.txt");
		
		BufferedReader b1 = new BufferedReader(fReader);
	}

}
