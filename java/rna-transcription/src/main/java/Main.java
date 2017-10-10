public class Main {
        public static void main (String ... args ) {
                RnaTranscription rTr = new RnaTranscription();
                System.out.println(rTr.transcribe("C"));
                System.out.println(rTr.transcribe("G"));
                System.out.println(rTr.transcribe("T"));
                System.out.println(rTr.transcribe("A"));
               
                System.out.println(rTr.transcribe("ACGTGGTCTTAA"));
                System.out.println("UGCACCAGAAUU");
              
        }
}
