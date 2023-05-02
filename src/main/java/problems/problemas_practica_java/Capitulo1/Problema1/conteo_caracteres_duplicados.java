package problems.problemas_practica_java.Capitulo1.Problema1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class conteo_caracteres_duplicados {
    public Map<Character, Integer> contarCaracteresDuplicadosCadena(String cadena){
        Map<Character, Integer> result = new HashMap<>();
        for(int i = 0; i<cadena.length();i++){
            char ch = cadena.charAt(i);
            result.compute(ch, (k,v)->(v==null)?1:++v);
        }
        return result;
    }
    public Map<Character, Long> contarCaracteresDuplicadosCadena2(String cadena){
        Map<Character, Long> result = new HashMap<>();
        cadena.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
        return result;
    }
}
