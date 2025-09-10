import java.lang.Thread;
public class Jogo {
    public static void main(String[] args) {
        Personagem caçador = new Personagem();
        caçador.nome = "jok";
        int vezes=0;
        while(vezes<=10){
            vezes=+1;
        caçador.caçar();
        caçador.comer();
        caçador.dormir();
        caçador.caçar();
        caçador.caçar();
        caçador.caçar();
     System.out.println("=============================");
     try {
        Thread.sleep(2000); // pausa de 2 segundos
    } catch (InterruptedException e) {
        e.printStackTrace();
    }        }
    }
}
