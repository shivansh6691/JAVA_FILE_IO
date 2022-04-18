import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class file_io_que_01
{
	
	public static void main(String[] args)
	{
		File f = new File("Input");
		f.mkdir();
		try 
		{
			FileInputStream rd = new FileInputStream("Output/number.txt");
			FileOutputStream fo = new FileOutputStream("Output/odd.txt");
			FileOutputStream fe = new FileOutputStream("Output/even.txt");
			int i;
			while((i=rd.read())!=-1)
			{
				if(i%2!=0)
				{
		
					fo.write(i);
					fo.write(' ');
				}
				else
				{
					fe.write(i);
				}
			}
			rd.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	
}
		
		
