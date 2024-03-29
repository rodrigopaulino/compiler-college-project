/*
 * Este arquivo � propriedade de Rodrigo Paulino Ferreira de Souza.
 * Nenhuma informa��o nele contida pode ser reproduzida,
 * mostrada ou revelada sem permiss�o escrita do mesmo.
 */
package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import excecoes.ExcecaoCompilador;
import excecoes.ExcecaoSemantico;
import util.Parser;

/**
 * 
 */
public class Compilador {
	//~ Metodos --------------------------------------------------------------------------------------------------------------------

	/**
	 * DOCUMENT ME!
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fReader;
		BufferedReader buffReader;

		try {
			fReader = new FileReader(args[0]);
			buffReader = new BufferedReader(fReader);

			Parser.getInstancia().executar(buffReader);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExcecaoCompilador e) {
			System.out.print(e.getMessage());
		} catch (ExcecaoSemantico e) {
			System.out.print(e.getMessage());
		}
	}
}
