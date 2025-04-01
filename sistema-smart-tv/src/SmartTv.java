public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;    
// a televisão é o objeto e o usuario que usufrui desse objeto, são duas etapas

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;

    }
    public void diminuirCanal(){
        canal--;

    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);

        //essa implementação corresponde a volume = volume + 1
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);

        //essa implementação corresponde a volume = volume - 1
    }
    public void ligar(){
        ligada = true;
    }    
    public void desligar(){
        ligada = false;
    }    
    
}
