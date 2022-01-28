
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
        System.out.print("1. Agregar animal\n" +
                        "2. Modificar animal\n" +
                        "3. Eliminar animal\n" +
                        "4. Opciones de impresión\n" +
                        "5. Alimentar animal\n" +
                        "0. Salir\n" +
                        "Ingrese una opcion: ");
        System.out.println();
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
                modificarAnimal();
                ejecutar();
                break;
            }
            
            case 3: {
                
                break;
            }
            
            case 4: {
                toStringAnimales();
                ejecutar();
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
        //alim = lea.nextLine();
        
        System.out.print("Ingrese la descripción: ");
        String desc = lea.nextLine();
        //desc = lea.nextLine();
        
        System.out.print("Ingrese la distribución geográfica: ");
        String dist = lea.nextLine();
        //dist = lea.nextLine();
        
        System.out.print("Ingrese la vida: ");
        int vida = lea.nextInt();
        System.out.println("\n" + "Animal agregado exitosamente." + "\n");
        
        animales.add(new Animal(nomCie, nomCom, habitat, alim, desc, dist, vida));
    }
    
    public static void modificarAnimal(){
        System.out.print("Ingrese el nombre científico del animal a editar: ");
        String nomCie = lea.nextLine();
        lea.nextLine();
        for (Animal animal : animales) {
            //System.out.println(animal.nomCie);
            if (nomCie.equalsIgnoreCase(animal.nomCie)) {
                System.out.print("Opciones de edición:\n"+
                                "1. Editar un atributo\n"+
                                "2. Editar todos los atributos\n"+
                                "Ingrese una opción: ");
                edicion(lea.nextInt(), animales.indexOf(animal));
                System.out.println("Modificación realizada exitosamente.\n");
                break;
            }
        }
        System.out.println();
    }
    
    public static void edicion(int op, int pos){
        switch(op){
            case 1: {
                System.out.println("Atributos:\n"+
                        "1. Nombre científico\n" +
                        "2. Nombre común\n" +
                        "3. Habitat\n" +
                        "4. Alimentación\n" +
                        "5. Descripción\n" +
                        "6. Distribución geográfica\n" +
                        "7. Vida\n" +
                        "Ingrese una opcion: ");
                System.out.println();
                editarAtributo(lea.nextInt(), pos);
                break;
            }
            
            case 2: {
                editarTodo(pos);
                break;
            }
            
            default: {
                System.out.println("\n" + "Ingrese una opción válida." + "\n");
                break;
            }
        }
    }
    
    public static void editarAtributo(int at, int pos){
        switch(at){
            case 1: {
                System.out.print("Ingrese nuevo nombre científico: ");
                //String dato = lea.nextLine();
                animales.get(pos).setNomCie(lea.nextLine());
                break;
            }
            case 2: {
                System.out.print("Ingrese nuevo nombre común: ");
                animales.get(pos).setNomCom(lea.nextLine());
                break;
            }
            case 3: {
                System.out.print("Ingrese nuevo hábitat: ");
                animales.get(pos).setHabitat(lea.nextLine());
                break;
            }
            case 4: {
                System.out.print("Ingrese nueva alimentación: ");
                animales.get(pos).setAlim(lea.nextLine());
                break;
            }
            case 5: {
                System.out.print("Ingrese nueva descripción: ");
                animales.get(pos).setDesc(lea.nextLine());
                break;
            }
            case 6: {
                System.out.print("Ingrese nueva distribución geográfica: ");
                animales.get(pos).setDist(lea.nextLine());
                break;
            }
            case 7: {
                System.out.print("Ingrese nueva vida: ");
                animales.get(pos).setVida(lea.nextInt());
                break;
            }
            default: {
                System.out.println("\n" + "Ingrese una opción válida." + "\n");
                break;
            }
            
        }
    }
    
    static void editarTodo(int pos){
        System.out.print("Ingrese el nuevo nombre científico: ");
        String nomCie = lea.nextLine();
        nomCie = lea.nextLine();
        
        System.out.print("Ingrese el nuevo nombre común: ");
        String nomCom = lea.next();
        
        System.out.print("Ingrese el nuevo hábitat: ");
        String habitat = lea.nextLine();
        habitat = lea.nextLine();
        
        System.out.print("Ingrese la nueva alimentación: ");
        String alim = lea.nextLine();
        
        System.out.print("Ingrese la nueva descripción: ");
        String desc = lea.nextLine();
        
        System.out.print("Ingrese la nueva distribución geográfica: ");
        String dist = lea.nextLine();
        
        System.out.print("Ingrese la nueva vida: ");
        int vida = lea.nextInt();
        
        animales.get(pos).setNomCie(nomCie);
        animales.get(pos).setNomCom(nomCom);
        animales.get(pos).setHabitat(habitat);
        animales.get(pos).setAlim(alim);
        animales.get(pos).setDesc(desc);
        animales.get(pos).setDist(dist);
        animales.get(pos).setVida(vida);
        
        System.out.println("\n" + "Animal editado exitosamente." + "\n");
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
