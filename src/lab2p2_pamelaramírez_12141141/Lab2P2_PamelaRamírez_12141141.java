
package lab2p2_pamelaramírez_12141141;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab2P2_PamelaRamírez_12141141 {

    public static Scanner lea = new Scanner(System.in);
    public static ArrayList<Animal> animales = new ArrayList();
    public static Animal perrito = new Animal();
    public static Animal gatito = new Animal();
    public static Animal hamster = new Animal();
    
    public static void main(String[] args) {
        perrito = new Animal("Canis lupus familiaris", "Perro", "Silvestre", "Croquetas", "Adorables y peludos", "Mundial", 200);
        gatito = new Animal("Felis catus", "Gato", "Silvestre", "Pescado", "Sigilosos", "Mundial", 100);
        hamster = new Animal("Cricetinae", "Hámster", "Silvestre", "Semillas de girasol", "Chiquitos", "Mundial", 50);
        animales.add(perrito);
        animales.add(gatito);
        animales.add(hamster);
        ejecutar();
    }
    
    public static int menu(){
        System.out.println("");
        System.out.println("");
        System.out.println("1. Agregar animal\n" +
                            "2. Modificar animal\n" +
                            "3. Eliminar animal\n" +
                            "4. Opciones de impresión\n" +
                            "5. Alimentar animal\n" +
                            "0. Salir\n" +
                            "Ingrese una opcion: ");
        return lea.nextInt();
    }
    
    public static void ejecutar(){
        switch(menu()){
            case 1: {
                agregarAnimal();
                ejecutar();
                break;
            }
            
            case 2: {
                
                break;
            }
            
            case 3: {
                
                break;
            }
            
            case 4: {
                toStringAnimales();
                break;
            }
            
            case 5: {
                
                break;
            }
            
            case 0: {
                System.exit(0);
                break;
            }
        }
    }
    
    public static void agregarAnimal(){
        System.out.print("Ingrese el nombre científico: ");
        String nomCie = lea.nextLine();
        nomCie = lea.nextLine();
        
        System.out.print("Ingrese el nombre común: ");
        String nomCom = lea.next();
        
        System.out.print("Ingrese el hábitat: ");
        String habitat = lea.nextLine();
        habitat = lea.nextLine();
        
        System.out.print("Ingrese la alimentación: ");
        String alim = lea.nextLine();
        alim = lea.nextLine();
        
        System.out.print("Ingrese la descripción: ");
        String desc = lea.nextLine();
        desc = lea.nextLine();
        
        System.out.print("Ingrese la distribución geográfica: ");
        String dist = lea.nextLine();
        dist = lea.nextLine();
        
        System.out.print("Ingrese la vida: ");
        int vida = lea.nextInt();
        System.out.println("\n" + "Animal agregado exitosamente." + "\n");
        
        animales.add(new Animal(nomCie, nomCom, habitat, alim, desc, dist, vida));
    }
    
    public static void modificarAnimal(){
        
    }
    
    static void borrarAnimal(){
        
    }
    
    static void imprimir(){
        
    }
    
    static void alimentarAnimal(){
        
    }
    
    public static void toStringAnimales(){
        System.out.println(animales);
    }
}
