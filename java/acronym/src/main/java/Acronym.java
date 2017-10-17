class Acronym {

        String phrase;

        Acronym(String phrase) {

                this.phrase = phrase;
        }

        String get() {
                String result = "";
                for (String string : phrase.split(" |-")) {
                        result += string.charAt(0);

                }
                return result.toUpperCase();
        }

}
