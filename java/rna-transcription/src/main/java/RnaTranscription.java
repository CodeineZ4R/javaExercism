class RnaTranscription {

        String transcribe(String dnaStrand) {

                String tR= "";

                for (char c : dnaStrand.toCharArray()) {
                        
                        char chr;

                        switch (c) {
                                case 'C':
                                        tR += 'G';
                                        break;
                                case 'G':
                                        tR += 'C';
                                        break;
                                case 'T':
                                        tR += 'A';
                                        break;
                                case 'A':
                                        tR += 'U';
                                        break;
                                default:
                                        throw new IllegalArgumentException("Invalid input");

                        }

                }

                return tR;

        }


}
