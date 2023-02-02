
package maquinas;

import java.io.IOException;

public class Main {
    
   
    public static void main(String[] args) throws IOException {
        String diretorio = "C:/Users/Danilo/Documents/Linguagem Java/comoProgramarJava/maquinas/src/textos/Input.txt";
        String regex = "[0-9]";
        String replace = "";
        int numLinhas = 8;
               
        LerArquivoTexto arq = new LerArquivoTexto();
        String linhas[] = new String[8];
        linhas = arq.abrirArquivo(diretorio, regex, replace, numLinhas);
        AutomatoFinito f = new AutomatoFinito();
//        System.out.println("asfhshfldj");
        
        //Input, DiretorioSpec, FormatacaoArquivo/Substituicao, Linhas
        {
            diretorio = "C:/Users/Danilo/Documents/Linguagem Java/comoProgramarJava/maquinas/src/textos/F.txt";
            regex = ",";
            replace = " ";
            numLinhas = 16;
            f.automatoFinito(linhas, diretorio, regex, replace, numLinhas);
        }
        
    }
    
    
}