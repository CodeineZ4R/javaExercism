class RnaTranscription {

    String transcribe(String dnaStrand) {
            String strReturn = "";
            for (String s : dnaStrand.split("")) {
                    switch (s) {
                            case "G" : strReturn += "C";
                                       break;
                            
                            case "C" : strReturn += "G";
                                       break;

                            case "T" : strReturn += "A";
                                       break;
                            
                            case "A" : strReturn += "U";
                                       break;
                                     
                    }
            }
            return strReturn;
    }

}
