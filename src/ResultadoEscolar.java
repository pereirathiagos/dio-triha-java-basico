public class ResultadoEscolar {

    public static void main(String[] args) {

       int nota = 10;
       
       if (nota >= 0 && nota <= 10) {
           if (nota >= 9) {
               System.out.println("Aprovado com louvor");
           } else if (nota >= 7) {
               System.out.println("Aprovado");
           } else {
               System.out.println("Reprovado");
           }
       } else {
           System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
       }
    }
}
