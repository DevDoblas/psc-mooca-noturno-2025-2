public class Personagem {
    
    String nome ;
    int sono=0;
    int energia=10;
    int fome=0;

    PessoaFisica pessoaFisica = new PessoaFisica();




public void caçar(){
    if(energia>=2){
System.out.println(nome+" caçando");
energia=-2;
    }
else {
  System.out.println(nome + "Sem energia para caçar");
 
}
  fome = Math.min(fome+1, 10);
  sono = Math.min(sono+1, 10);

}
public void comer(){
  if (fome>=1) {
    
  
    System.out.println(nome+" comendo");
    energia = Math.min(energia+2, 10);
    fome=-1;
}else{
    System.out.println(" Sem fome");
}

}
public void dormir(){
     if(sono>=1){
    System.out.println(nome+" dormindo");
    sono=-1;
    energia = Math.min(energia+1, 10);
 //energia = energia + 1
}else{
    System.out.println(" Sem sono");
}
}
}
