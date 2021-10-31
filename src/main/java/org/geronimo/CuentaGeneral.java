package org.geronimo;

public class CuentaGeneral implements Cuenta{
    private double saldo;
    private Cliente cliente;
    private Fecha fecApertura;
    public CuentaGeneral(double saldoini, Cliente cliente) {
        this.saldo = saldoini;
        this.cliente = cliente;
        this.fecApertura = new Fecha();
    }
    COMPLETAR,
}
