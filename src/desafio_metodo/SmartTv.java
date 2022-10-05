package desafio_metodo;

public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 50;

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
    public void pularCanal(int novoCanal){
        canal = novoCanal;
    }
    public void subirCanal(){
        canal++;
    }
    public void descerCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume()
    {
        volume--;
    }

}
