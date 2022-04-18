import java.util.*;
import java.io.*;

public class file_io_que_02
{
		public static void main(String[] args)
		{
			try
			{
				Scanner sc= new Scanner(System.in);
				int counter=0;
				FileReader f1 = new FileReader("C:\\Desktop\\target_file.txt");
				
				System.out.println("Enter word you want to replace ->");
				String word1 =sc.nextLine();
				
				System.out.println("Enter word you want to replace with ->");
				String word2 =sc.nextLine();
				
				String msg="";
				Scanner b1 = new Scanner(f1);
			    while(b1.hasNext())
			    {
		            msg += b1.next()+" ";
		        }
			    System.out.println("File Before Replace Word -> "+msg);
			    Scanner b2 = new Scanner(msg);
			    String msg1;
			    while(b2.hasNext())
			    {
		            msg1 = b2.next();
		            if(msg1.equals(word1))
		            {
		            	counter++;
		            }
		        }
			    msg = msg.replace(word1,word2);
			    f1.close();
			    System.out.println("Count of replaced Words -> "+counter);
			    System.out.println("File After Replace Word -> "+msg);
			    sc.close();
			    b1.close();
			    b2.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
				
			}
		}
}

