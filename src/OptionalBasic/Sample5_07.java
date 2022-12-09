package OptionalBasic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Sample5_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter fw = new FileWriter("test1.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.println("Hello");
			pw.println("GoodBye!");
			
			pw.close();
			System.out.println("資料已寫入檔案");
		}
		catch(IOException e)
		{
			System.out.println("輸出入錯誤");
		}
	}

}
