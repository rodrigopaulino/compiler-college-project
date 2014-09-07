/*
 * Este arquivo � propriedade de Rodrigo Paulino Ferreira de Souza.
 * Nenhuma informa��o nele contida pode ser reproduzida,
 * mostrada ou revelada sem permiss�o escrita do mesmo.
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import excecoes.ExcecaoCompilador;

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
			fReader = new FileReader("ARQUIVOTESTE_WINDOWS.C");
			buffReader = new BufferedReader(fReader);

			Parser.getInstancia().executar(buffReader);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ExcecaoCompilador e) {
			e.printStackTrace();
		}
	}
}
