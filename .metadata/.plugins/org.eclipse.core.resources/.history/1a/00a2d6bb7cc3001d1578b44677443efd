package Tema6;

import java.util.*;

/*
Diseñar la clase Cuentas para crear un vector de 100 objetos (de la clase CuentaCorriente,
modificada). Escribir un programa (que utilice la clase Cuentas) que permita obtener el titular y
código de la cuenta con mayor saldo.
Para ello,se sugiere crear un vector de saldos, ordenarlo en orden creciente y, tomando el último
valor que almacene, compararlo con el saldo de los diferentes objetos, mostrando por pantalla
los que sean iguales que el saldo máximo.
Modificación: los códigos de cuenta deben ser únicos; deberá existir un método getSaldo.
*/

//Clase Principal
public class Ejercicio8T6 {
    public static void main(String[] args) {
        // Generar 100 cuentas bancarias con saldos aleatorios
        List<CuentaBancaria> cuentas = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            int idPropietario = i;
            double saldo = Math.random() * 10000;
            cuentas.add(new CuentaBancaria(idPropietario, saldo));
        }

        // Encontrar la cuenta con el saldo más alto
        CuentaBancaria cuentaConMaximoSaldo = cuentas.get(0);
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getSaldo() > cuentaConMaximoSaldo.getSaldo()) {
                cuentaConMaximoSaldo = cuenta;
            }
        }

        // Mostrar la cuenta con el saldo más alto
        System.out.println("Cuenta con el saldo más alto:");
        System.out.println("ID de Propietario: " + cuentaConMaximoSaldo.getIdPropietario());
        System.out.println("Saldo: " + ((double) Math.round(cuentaConMaximoSaldo.getSaldo() * 100d) / 100d) + "€");
    }

}

class CuentaBancaria {
    private int idPropietario;
    private double saldo;

    public CuentaBancaria(int idPropietario, double saldo) {
        this.idPropietario = idPropietario;
        this.saldo = saldo;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public double getSaldo() {
        return saldo;
    }
}