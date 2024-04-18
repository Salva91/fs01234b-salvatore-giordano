public class sim {

   public String numero;
   private int credito = 0;
   private chiamata[] listaChiamate;

   public sim (){

      numero = "3334127654";
      credito = 0;
      listaChiamate = new chiamata[5];
   }
   public sim (int numero){
      numero = numero;
   }
   public void StampareAVideo(){
      System.out.println("Numero di telefono: " + numero );
      System.out.println("il tuo credito residuo è : "+ credito);
      System.out.println("le ultime 5 chiamate sono: " );
      if (listaChiamate != null) {
         for (int i = 0; i < listaChiamate.length; i++) {
            System.out.println(listaChiamate[i]);
         }
      }
      else{
         System.out.println("Nessuna chiamata effettuata");
      }
   }

   }




