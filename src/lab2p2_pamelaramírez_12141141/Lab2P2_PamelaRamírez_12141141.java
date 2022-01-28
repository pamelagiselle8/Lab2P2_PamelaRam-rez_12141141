
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
                borrarAnimal();
                ejecutar();
                break;
            }
            
            case 4: {
                toStringAnimales();
                ejecutar();
                break;
            }
            
            case 5: {
                alimentarAnimal();
                ejecutar();
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
        
        int valid = 0;
        for (Animal a : animales) {
            if (a.getNomCie() == nomCie) {
                valid++;
            }
        }
        if (valid == 0) {
            animales.add(new Animal(nomCie, nomCom, habitat, alim, desc, dist, vida));
        }
        else{
            System.out.println("\nNo pueden haber dos animales con el mismo nombre científico.\n");
        }
        
    }
    
    public static void modificarAnimal(){
        System.out.print("Ingrese el nombre científico del animal a editar: ");
        lea.nextLine();
        String nomCie = lea.nextLine();
        int pos = 0;
        boolean esta = false;
        
        for (Animal animal : animales) {
            if (nomCie.equalsIgnoreCase(animal.nomCie)){
                pos = animales.indexOf(animal);
                
                esta = true;
                break;
            }
        }
        if (esta) {
            System.out.print("Opciones de edición:\n"+
                            "1. Editar un atributo\n"+
                            "2. Editar todos los atributos\n"+
                            "Ingrese una opción: ");
            edicion(lea.nextInt(), pos);
            System.out.println("Modificación realizada exitosamente.\n");
        }
        else{
            System.out.println("\n" + "Animal no encontrado." + "\n");
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
        lea.nextLine();
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
        lea.nextLine();
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
        System.out.print("Ingrese el nombre científico del animal a eliminar: ");
        lea.nextLine();
        String nomCie = lea.nextLine();
        int pos = 0;
        boolean esta = false;
        
        for (Animal animal : animales) {
            if (nomCie.equalsIgnoreCase(animal.nomCie)){
                pos = animales.indexOf(animal);
                esta = true;
                break;
            }
        }
        if (esta) {
            animales.remove(pos);
            System.out.println("El animal ha sido eliminado exitosamente.\n");
        }
        else{
            System.out.println("\n" + "Animal no encontrado." + "\n");
        }
        System.out.println();
        
    }
    
    static void imprimir(){
        
    }
    
    static void alimentarAnimal(){
        System.out.print("Ingrese la posición del animal a alimentar (1 - " + animales.size() +  "): ");
        int come = lea.nextInt();
        come--;
        System.out.print("Ingrese la posición del animal devorado (1 - " + animales.size() +  "): ");
        int comido = lea.nextInt();
        comido--;
        if (come != comido) {
            if ((come >= 0 && come < animales.size()) && (comido >= 0 && comido < animales.size())) {
                int sumar = animales.get(comido).getVida() + animales.get(come).getVida();
                animales.get(come).setVida(sumar);
                animales.remove(comido);
                System.out.println("\nEl animal fue alimentado exitosamente.\n");
            }
        }
    }
    
    public static void toStringAnimales(){
        
        System.out.println(animales);
    }
}
