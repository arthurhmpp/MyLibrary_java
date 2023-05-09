package capitulo16;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExemploCriacao {
	public static void main(String[] args) {
		try {
			FileOutputStream arquivo = new FileOutputStream("exemplo.txt");
			DataOutputStream dados = new DataOutputStream(arquivo);
			dados.flush();
			dados.writeChars("Java escrevendo no arquivo");
			dados.close();
			System.out.println("Arquivo gravado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
