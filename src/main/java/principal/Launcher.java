package principal;

import views.VentanaPrincipal;

public class Launcher {
    public static void main(String[] args){
        inicializador();
    }

    public static void inicializador(){
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
    }
}
