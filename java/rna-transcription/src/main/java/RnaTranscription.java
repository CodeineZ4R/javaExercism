class RnaTranscription {

    String transcribe(String dnaStrand) {

        StringBuilder tR = new StringBuilder();

        for (char c : dnaStrand.toCharArray()) {

            switch (c) {
                case 'C': tR.append('G');
                    break;
                case 'G': tR.append('C');
                    break;
                case 'T': tR.append('A');
                    break;
                case 'A': tR.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Invalid input");

            }

        }

        return tR.toString();

    }


}
