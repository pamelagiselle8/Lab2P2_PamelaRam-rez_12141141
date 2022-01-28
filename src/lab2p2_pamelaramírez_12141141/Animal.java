
package lab2p2_pamelaramírez_12141141;


public class Animal {
    String nomCie = "";
    String nomCom = "";
    String habitat = "";
    String alim = "";
    String desc = "";
    String dist = "";
    int vida = 0;
    
    public Animal(){
        
    }
    
    public Animal(String nomCie, String nomCom, String habitat, String alim, String desc, String dist, int vida){
        this.nomCie = nomCie;
        this.nomCom = nomCom;
        this.habitat = habitat;
        this.alim = alim;
        this.desc = desc;
        this.dist = dist;
        this.vida = vida;
    }

    public String getNomCie() {
        return nomCie;
    }

    public void setNomCie(String nomCie) {
        this.nomCie = nomCie;
    }

    public String getNomCom() {
        return nomCom;
    }

    public void setNomCom(String nomCom) {
        this.nomCom = nomCom;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlim() {
        return alim;
    }

    public void setAlim(String alim) {
        this.alim = alim;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public String toString(){
        return "Nombre científico: " + nomCie + ", nombre común: " + nomCom + ", hábitat: " + habitat + ", alimentación: " + alim + ", descripción: " + desc + ", distribución geográfica: " + dist + ", vida: " + vida + "." + "\n";
    }
    
}
