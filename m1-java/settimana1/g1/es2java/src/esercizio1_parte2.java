public class esercizio1_parte2 {
//dobbiamo prima creare un metodo che accetta come parametro un numero(anno)
    //dopodiché utilizziamo una serie di condizioni e un boolean per vedere se quest'anno in base
    //al modulo quale resto da, in base al resto l'anno sarà bisestile o meno
    public class AnnoBisestile {
        public static boolean Bisestile(int anno) {
            if (anno % 4 == 0) {
                if (anno % 100 == 0) {
                    return anno % 400 == 0;
                } else {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {

            System.out.println(Bisestile(2020));
            System.out.println(Bisestile(1900));
            System.out.println(Bisestile(2000));
            System.out.println(Bisestile(2024));
            System.out.println(Bisestile(2025));
        }
    }
}

