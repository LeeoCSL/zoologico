package zoo;

public class Zoologico extends Animal {
    int numJaulas = 6;
    Animal [] animais = new Animal [numJaulas];
    
    public Zoologico (){
    }
    
    
    public int getnumJaulas (){
        return numJaulas;
    }
    
    public void setnumJaulas (int numJaulas){
        this.numJaulas = numJaulas;
    }
    
    public void setAnimais(Animal[] animais) {
    	this.animais = animais;
    }
    
    public Animal[] getAnimais() {
    	return animais;
    }
    
    public void addAnimal (int i, Animal animal){
        this.animais[i] = animal;
    }
}
