package capitulo16;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ExemploLeitura {
	public static final String BASE_URI = "";
	public static void main(String[] args) {	
	
		try {
			FileInputStream arquivo = new FileInputStream(BASE_URI + "exemplo.txt");			
//			FileInputStream arquivo = new FileInputStream("exemplo.txt");
			DataInputStream dados = new DataInputStream(arquivo);
			while(dados.available() > 0) {
				System.out.print(dados.readChar());
//				System.out.println(dados.readByte());
			}
			dados.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
