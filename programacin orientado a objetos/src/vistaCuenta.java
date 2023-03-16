import javax.swing.*;
import java.util.Scanner;

public class vistaCuenta {

    public static void main (String[] args){
        datosCuenta cuenta= new datosCuenta("francisco",0.0);
        cuenta.setNombre("FFFFF");
        cuenta.setSaldo(23.90);

        System.out.println("saldo:" +cuenta.getSaldo()+ "Nombre:"+ cuenta.getNombre());

                Scanner entra = new Scanner (System.in);

        System.out.println("sumando al " + "saldo de la cuenta" +montoDeposito);
        cuenta.depositar(montoDeposito);

        System.out.println("saldo:" +cuenta.getSaldo()+"nombre"+cuenta.getNombre());

        System.out.println("nonto a retirar");
        double ewtirar= entra.nextDouble();
        double total= cuenta.getSaldo() - ewtirar;
        System.out.println("saldo total;" +total);

    }

}
