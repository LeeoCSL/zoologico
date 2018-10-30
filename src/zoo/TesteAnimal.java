package zoo;

public class TesteAnimal extends Animal {
    
    public static void main (String [] args){
        
    	
    	
        Tigre tigre1 = new Tigre (6);
        Crocodilo crocodilo1 = new Crocodilo (30);
        Crocodilo crocodilo2 = new Crocodilo (3);
        Papagaio papagaio1 = new Papagaio (27);
        Tigre tigre2 = new Tigre (20);
        Tigre tigre3 = new Tigre (16);
        
        Zoologico zoo = new Zoologico();
        zoo.addAnimal(0, tigre1);
        zoo.addAnimal(1, crocodilo1);
        zoo.addAnimal(2, crocodilo2);
        zoo.addAnimal(3, papagaio1);
        zoo.addAnimal(4, tigre2);
        zoo.addAnimal(5, tigre3);
        
        Animal a;
        for(int i = 0; i < 6; i++) {
        	 a = zoo.animais[i];
        	System.out.println(i +"º animal: \nEspécie: " + a.getEspecie() +"\nIdade:  " + a.getIdade());
        	a.emitirSom();
        	a.Movimento();
        	System.out.println("");
        }
        
    }
}
