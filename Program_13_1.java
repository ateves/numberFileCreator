import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Program_13_1
{

	public static void main(String[] args)
			throws IOException
	{
		
		String file_name;
		String done_string = "done";
		boolean done = false;
		String output_file_name;
		
	while (!done) 	
	{
		file_name = JOptionPane.showInputDialog("Enter a file name or done to exit: ");
		
		if (file_name.equals(done_string))
		{
			done = true;
		}
		else	
		{
			try
			{
			File file_in = new File(file_name); 
			if(!file_in.exists())
			{
				JOptionPane.showMessageDialog(null, "FILE DOES NOT EXIST");
			}
			else
			{
				Scanner input = new Scanner(file_in);
				output_file_name = JOptionPane.showInputDialog("Enter an output file name: ");
				PrintWriter outputFile = new PrintWriter(output_file_name);
				
				Reverse_13_1 reverse_obj = new Reverse_13_1(input, outputFile);
				reverse_obj.reverse_Ints();
				
				outputFile.close();
				input.close();
			}
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "The system cannot find the path specified");
			
		}
			
		}
	}
	}
}

// This program was written by ANTHONY TEVES