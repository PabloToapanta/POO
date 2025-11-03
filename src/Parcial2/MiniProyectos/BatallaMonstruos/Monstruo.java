package Parcial2.MiniProyectos.BatallaMonstruos;

public class Monstruo {
    private final String nombre;
    private int vida=100;
    private int ataque;

    public Monstruo(String nombre, int ataque){
        if (nombre==null || nombre.isBlank()) throw new IllegalArgumentException("El nombre no puede estar vacio o nulo");
        this.nombre=nombre;
        this.ataque=ataque;
    }
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void recibirAtaque(Monstruo monstruo){
        if(monstruo.ataque>this.vida)this.vida=0;
        this.vida=this.vida- monstruo.ataque;
    }
    public void realizarAtaque(Monstruo monstruo){
        if(this.ataque>monstruo.vida)monstruo.setVida(0);
        monstruo.setVida(monstruo.getVida()-this.ataque);
    }
    @Override
    public String toString(){
        return String.format("Monstruo: %s%nVida: %d%nAtaque: %d%n",this.nombre,this.vida,this.ataque);
    }
}
