package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndBufferWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"teste4", "teste5", "teste6"};
		
		String path = "C:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}

}
