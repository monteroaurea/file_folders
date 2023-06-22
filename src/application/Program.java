package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Exibir a lista de pastas a partir de um caminho
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		// Exibir a lista de arquivos a partir de um caminho
		
		File[] files = path.listFiles(File::isFile); 
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		sc.close();
	}

}
