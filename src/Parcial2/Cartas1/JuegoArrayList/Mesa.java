package Parcial2.Cartas1.JuegoArrayList;
import java.util.List;
import java.util.ArrayList;
import java.security.SecureRandom;
public class Mesa {
    private final Mazo mazo;
    private final List<Carta>  descartes = new ArrayList<>();
    private String paloJuego;

    public Mesa(Mazo mazo){
        this.mazo=mazo;
    }

    public Mazo getMazo() {
        return mazo;
    }

    public List<Carta> getDescartes() {
        return descartes;
    }

    public String getPaloJuego() {
        return paloJuego;
    }

    public void setPaloJuego(String paloJuego) {
        this.paloJuego = paloJuego;
    }

    public void inicioDescartes(Carta primera){
        descartes.add(primera);
        paloJuego = primera.getPalo();
    }
    public Carta tope(){
        return descartes.get(descartes.size()-1);
    }
}
