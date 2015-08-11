import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class Scrabble {
    public static void main(String[] args){}

    public Integer getScore(String userWord) {
        // Integer x = 0;
        String word = userWord.toLowerCase();
        Integer total = 0;
        Map<Character, Integer> numberHash = new HashMap<Character, Integer>();
        numberHash.put('a', 1);
        numberHash.put('b', 3);
        numberHash.put('c', 3);
        numberHash.put('d', 2);
        numberHash.put('e', 1);
        numberHash.put('f', 4);
        numberHash.put('g', 2);
        numberHash.put('h', 4);
        numberHash.put('i', 1);
        numberHash.put('j', 8);
        numberHash.put('k', 5);
        numberHash.put('l', 1);
        numberHash.put('m', 3);
        numberHash.put('n', 1);
        numberHash.put('o', 1);
        numberHash.put('p', 3);
        numberHash.put('q', 10);
        numberHash.put('r', 1);
        numberHash.put('s', 1);
        numberHash.put('t', 1);
        numberHash.put('u', 1);
        numberHash.put('v', 4);
        numberHash.put('w', 4);
        numberHash.put('x', 8);
        numberHash.put('y', 4);
        numberHash.put('z', 10);
        numberHash.put(' ', 0);

        for (Integer i = 0; i < word.length(); i++) {
         total += numberHash.get(word.charAt(i));
        }

        return total;


    }

}
