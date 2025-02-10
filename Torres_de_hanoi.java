package Algoritmo;

public class Torres_de_hanoi {
	public void torresHanoi(int discos, int torre1, int torre2, int torre3){
       
     
        if (discos==1){
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
        } else {
        
            torresHanoi(discos-1, torre1, torre3, torre2);
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
       
            torresHanoi(discos-1, torre2, torre1, torre3);
        }
     
    }
}
