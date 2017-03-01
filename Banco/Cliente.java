
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    String nombre;
    int edad;
    CuentaBancaria cuenta;
    
    public Cliente(String nom, int ed)
    {
        nombre=nom;
        edad=ed;
    }
    
    public void abrirCuenta()
    {
        cuenta=new CuentaBancaria();
        
        System.out.println("Creamos una cuenta bancaria");
    }
    
    public void consultarSaldo()
    {
        cuenta.consultarSaldo();
    }
    
    public void ingresarDinero(double cantidad)
    {
        cuenta.ingresarDinero(cantidad);
    }
    
    public void sacarDinero(double cantidad)
    {
        cuenta.sacarDinero(cantidad);
    }
}
