
package lab2p2_pamelaramírez_12141141;


public class Animal {
    String nomCie = "";
    String nomCom = "";
    String habitat = "";
    String alim = "";
    String desc = "";
    String distGeo = "";
    int vida = 0;
    
    public Animal(){
        
    }
    
    public Animal(String nomCie, String nomCom, String habitat, String alim, String desc, String distGeo, int vida){
        this.nomCie = nomCie;
        this.nomCom = nomCom;
        this.habitat = habitat;
        this.alim = alim;
        this.desc = desc;
        this.distGeo = distGeo;
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

    public String getDistGeo() {
        return distGeo;
    }

    public void setDistGeo(String distGeo) {
        this.distGeo = distGeo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
}
