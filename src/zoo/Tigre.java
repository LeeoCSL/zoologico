package zoo;

public class Tigre extends Animal {
    
    public Tigre (int estaIdade){
      if (idade >= 0 && idade <= 18){
        this.idade = estaIdade;
       } else {
        idade = 0;
      }
      System.out.println ("A idade do tigre é: " + idade);
      especie = "tigre";
    }
    
     public void emitirSom (){
     System.out.println ("barulho de tigre");
     
    }
    
    public void Movimento (){
       System.out.println ("O tigre está se movimentando"); 
    }
}
