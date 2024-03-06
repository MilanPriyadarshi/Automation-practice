package General;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromText {

	public static void main(String[] args) throws IOException
	{
		String Fpath="C:\\Users\\LAXMIPRIYA LENKA\\Desktop\\Read.txt";
		BufferedReader bf= new BufferedReader(new FileReader(Fpath));
		String sl;
		int i=1;
		while((sl=bf.readLine())!=null)
		{
			System.out.println(i+" "+sl);
			i++;
		}
		
	}

}
