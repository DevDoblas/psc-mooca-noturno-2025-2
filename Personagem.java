public class Personagem {
    
    String nome ;
    private int sono=0;
    private int energia=10;
    private int fome=0;
   
    public Personagem(String nome, int energia, int fome, int sono) {
    

        this.nome = nome; // Inicializa o nome diretamente
        if (energia >= 0 && energia <= 10) {
            this.energia = energia;
        }
        if (fome >= 0 && fome <= 10) {
            this.fome = fome;
        }
        if (sono >= 0 && sono <= 10) {
            this.sono = sono;
        }
    }
    public void caçar() {
        if (energia >= 2) {
            System.out.println(nome + " caçando");
            energia -= 2;
        } else {
            System.out.println(nome + " Sem energia para caçar");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 3, 10); // Incrementa o sono ainda mais ao caçar
    }

    public void comer() {
        if (fome >= 1) {
            System.out.println(nome + " comendo");
            energia = Math.min(energia + 2, 10);
            fome = Math.max(fome - 1, 0); // Reduz a fome corretamente
        } else {
            System.out.println(nome + " sem fome");
        }
    }

    public void dormir() {
        if (sono > 0) {
            System.out.println(nome + " dormindo");
            sono = Math.max(sono - 6, 0); // Reduz o sono de forma mais significativa
            energia = Math.min(energia + 3, 10); // Dormir recupera ainda mais energia
        } else {
            System.out.println(nome + " sem sono");
        }
    }
}
