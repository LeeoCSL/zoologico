package zoo;

public class Crocodilo extends Animal {
    
    public Crocodilo (int estaIdade){
      if (idade >= 0 && idade <= 100){
        this.idade = estaIdade;
       } else if(idade < 0){
        this.idade = 0;
      } else if(idade >100 ) {
    	  this.idade = 100;
      }
      System.out.println ("A idade do crocodilo é: " + idade);
      especie = "crocodilo";
    }
    
     public void emitirSom (){
     System.out.println ("Barulho de crocodilo!");
     
    }
    
    public void Movimento (){
       System.out.println ("O crocodilo está se movimentando"); 
    }
}