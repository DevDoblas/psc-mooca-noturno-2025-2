public class PessoaFisica {
    public static void main(String[] args) {
       
     Pessoa pessoa = new Pessoa();
     boolean nasceu = true;
     
     if(nasceu){
        pessoa.chorar();
    }
    }
    public void criarPessoa(){
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("patapim");
        pessoa.getNome();
        pessoa.setCpf("58437318807");
        pessoa.getCpf();
        boolean nasceu = true;

        if(nasceu = true){
            pessoa.chorar();
        }else{
            System.out.println("Não masceu");
        }
       
    
    }
    public  void exibirPessoa() {
        Pessoa pessoa = new Pessoa();
        System.out.println("Bem vindo "+ pessoa.getNome());
        
    }


    
}