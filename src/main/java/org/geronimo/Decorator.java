package org.geronimo;

public abstract class Decorator implements Cuenta{
    private Cuenta cuenta;
    public Decorator(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public Cuenta getCuenta() {
        return cuenta;
    }
    public double saldo() {
        return cuenta.saldo();
    }
    public void ingresar(double cantidad) {
        cuenta.ingresar(cantidad);
    }
    public void retirar(double cantidad) {
        cuenta.retirar(cantidad);
    }
    public Cliente getCliente() {
        return cuenta.getCliente();
    }
    public Fecha getFecApe() {
        return cuenta.getFecApe();
    }
    @Override
    public String toString() {
        return cuenta.toString();
    }
    public abstract void aplicaIntereses();
}
