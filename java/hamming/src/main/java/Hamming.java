public class Hamming {

        String leftStrand;
        String rightStrand;

        Hamming(String leftStrand, String rightStrand) {
                if (leftStrand.length() == rightStrand.length()) {
                        this.leftStrand = leftStrand;
                        this.rightStrand = rightStrand;

                }else{
                        throw new IllegalArgumentException
                                ("leftStrand and rightStrand must be of equal length.");

                }
        }

        int getHammingDistance() {
                if (leftStrand.isEmpty() && rightStrand.isEmpty()) {
                        return 0;

                }else {
                        int rez = 0;
                        char[] charsL = leftStrand.toCharArray();
                        char[] charsR = rightStrand.toCharArray();
                        for (int i = 0; i < charsL.length ; i++) {
                                if (charsL[i] != charsR[i]) {
                                        rez++;

                                }

                        }
                        return rez;

                }

        }
}
