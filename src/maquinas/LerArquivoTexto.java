package maquinas;

import java.io.IOException;
//import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LerArquivoTexto {
    
    public String[] abrirArquivo(String diretorio, String regex, String replace, int numLinhas) throws IOException{
        Path arquivo = Paths.get(diretorio);
        List<String> texto = Files.readAllLines(arquivo);
        String linhasString[] = new String[numLinhas];
        char[][] linhas = new char[8][];
        char[] linhasChar;
        //System.out.println(linhasString.length);
        //replaceAll usa String como parametro
        
       for(int i = 0; i < linhasString.length; i++){
            linhasString[i] = texto.get(i).replaceAll(regex, replace);
       }
       
//       for(int i = 0; i < linhasString.length; i++){
//           System.out.println(linhasString[i]);
//       }
        
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < linhasString.length; j++){
                linhas[i] = linhasString[i].toCharArray();
                System.out.println(linhas[i]);
            }    
        }
        
//        for(int i = 0; i < linhas.length; i++){
//            System.out.println(linhas[i]);
//        }
        
        return linhasString;
    }
}