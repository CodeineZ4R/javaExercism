import java.util.HashMap;

class Scrabble {

    String word;
    HashMap<String,Integer> hmap = new HashMap<>();

    Scrabble(String word) {
        this.word = word;

    }

    int getScore() {

        hmap.put("AEIOULNRST", 1);
        hmap.put("DG", 2);
        hmap.put("BCMP", 3);
        hmap.put("FHVWY", 4);
        hmap.put("K", 5);
        hmap.put("JX", 8);
        hmap.put("QZ", 10);

        int res = 0;

        for (char ch: word.toCharArray()) {

            for (String strKey : hmap.keySet()) {

                if (strKey.indexOf(Character.toUpperCase(ch) ) != -1) {
                    res += hmap.get(strKey);

                }

            }

        }
        return res;
    }
} 
