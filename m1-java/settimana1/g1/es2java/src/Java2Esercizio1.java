public class Java2Esercizio1 {

        public static boolean lunghezzaPari(String stringa) {
            return stringa.length() % 2 == 0;
        }

        public static void main(String[] args) {
            // Esempi di utilizzo:
            System.out.println(lunghezzaPari("ciao"));
            System.out.println(lunghezzaPari("hello"));
        }
    }


