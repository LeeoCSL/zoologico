package zoo;

public class Papagaio extends Animal {
    
    public Papagaio (int estaIdade){
      if (idade >= 0 && idade <= 80){
        this.idade = estaIdade;
       } else {
        idade = 0;
      }
      System.out.println ("A idade do papagaio �: " + idade);
      especie = "papagaio";
      
    }
    
     public void emitirSom (){
     System.out.println ("Barulho de papagaio");
     
    }
    
    public void Movimento (){
       System.out.println ("O papagaio est� se movimentando"); 
    }
}