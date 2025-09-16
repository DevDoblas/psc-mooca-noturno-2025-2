import java.lang.Thread;
public class Jogo {
    public static void main(String[] args) {
        Personagem caçador = new Personagem("Mir", 10, 0, 1);
        Personagem soneca = new Personagem("mimir", 10, 0, 1);
       while (true) {
       
            caçador.caçar();
            caçador.comer();
            soneca.dormir();
            soneca.caçar();
            soneca.comer();
          
            System.out.println("=============================");
           
            try {
                Thread.sleep(2000); // pausa de 2 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
                   }
                }
            }
       }


