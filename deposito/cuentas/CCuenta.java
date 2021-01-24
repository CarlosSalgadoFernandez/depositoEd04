package cuentas;

/**
 * Clase CCuenta
 * Inicializa cuenta con el nombre del titular, nombre de la cuenta, saldo y tipo de interes
 * @author carlos salgado fernandez
 *
 */

public class CCuenta {

	
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
     * método constructor vacío CCuenta() sin parámetros
     */
    public CCuenta()
    {
    }
    /**
     * Método constructor con todos los parámetros de la clase
     * nom y cue variables String para nombre y cuenta
     * y sal, tipo variables double para saldo y tipoInteres
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Metodo estado() retorna el saldo de la cuenta
     * @return saldo double
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * metodo ingresar toma una cantidad (double)
     * cantidad ha de ser mayor que cero
     * la cantidad se añade al saldo
     * @param cantidad double
     * @throws Exception si la cantidad es menor a 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * metodo retirar retira una cantidad (double) del saldo
     * la cantidad ha de ser mayor que cero y menor que el saldo
     * @param cantidad
     * @throws Exception si la cantidad es cero o negativa o mayor que el saldo actual
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    /**
     * métodos de consulta y actualización (get y set) para las variables 
     * nombre, cuenta, saldo y tipoInteres
     * @return retornan cada una de las variables en su formato
     */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
