package tottus;
import GUI.PantallaPrincipalLogin;

public class Tottus {

    public static void main(String[] args) {
        Empleados.InicioListaEmpleados();
        PantallaPrincipalLogin PPL =  new PantallaPrincipalLogin();
        PPL.setVisible(true);
        
    }
}
