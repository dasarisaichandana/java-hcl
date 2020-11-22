import java.io.File;
import java.io.IOException;

public class FileEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		File file=new File("javaclass.txt");
		
		
		System.out.println("file created or not");
		
		if(file.createNewFile())
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("file is already existing");
		}
		

	}

}
