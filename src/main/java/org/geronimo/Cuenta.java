package org.geronimo;

public interface Cuenta {
    public double saldo();

    public void ingresar(double cantidad);

    public void retirar(double cantidad);

    public Cliente getCliente();

    public Fecha getFecApe();

    @Override
    public String toString();

    public void aplicaIntereses();
}
