package maquinas;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.matches;

public class AutomatoFinito {
    
    public void automatoFinito(String[] linhas, String dir, String regex, String replace, int numLinhas) throws IOException{
        LerArquivoTexto arq = new LerArquivoTexto();
        String spec[] = new String[numLinhas];
        spec = arq.abrirArquivo(dir, regex, replace, numLinhas);
       
        // nao consegui formatar as entradas para as variaveis pelo o arquivo
        // faria assim sem o arquivo texto
        /*
            int[] estadoFinal = new int[2];
            estadoFinal[0] = 8;
            estadoFinal[1] 12
            boolean aceita
            for(int i = 0; i < numLinhas; i++){
                 
            }
        
        */
    }  
}
