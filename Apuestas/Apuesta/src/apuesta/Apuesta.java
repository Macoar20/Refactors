package apuesta;
/**
 * En la clase apuesta guardamos toda la información 
 * acerca de la apuesta, precios, goles etc
 * @author Macocar
 */
public class Apuesta {
	/** dinero que ganas por disparo */
    private int dinerodisp;
    /**
     * goles marcados por el equipo local
     */
    private int goleslocal;
    /**
     * goles marcados por el equipo visitante
     */
    private int golesvisitante;
    /**
     * dinero apostado por el usuario
     */
    private int apostado;

    /*Contructor por defecto*/
    /**
     * Constructor para apuesta
     */
    public Apuesta() {
    }

    /*Contructor con par�metros*/
    /**
     * 
     * @param dinerodisp
     * @param goleslocal
     * @param golesvisitante
     */
    public Apuesta(int dinerodisp, int goleslocal, int golesvisitante) {
        this.dinerodisp = dinerodisp;
        this.goleslocal = goleslocal;
        this.golesvisitante = golesvisitante;
        this.apostado = 0;
    }
    
    /*M�todo para obtener el valor del atributo dinero_disp*/
    public int getDinerodisp() {
        return dinerodisp;
    }
    
    /*M�todo para modificar el valor del atributo dinero_disp*/
    public void setDinerodisp(int dinerodisp) {
        this.dinerodisp = dinerodisp;
    }

    /* M�todo para apostar.
     * Permite elegir la cantidad a apostar
     * no pudiendo ser inferior a 1 ni superior a tu saldo disponible
     */
    public void apostar(int dinero) throws Exception {
        if (dinero <= 0) {
            throw new Exception("No se puede apostar menos de 1�");
        }

        if (dinero > dinerodisp) {
            throw new Exception("No se puede apostar m�s de lo que tienes");
        }
        {
            dinerodisp = dinero - dinerodisp;
            apostado = dinero;
        }
    }
    
    /* M�todo que comprueba si se ha acertado el resultado del partido
     * En caso de que lo haya acertado devuelve true. 
     * Chequea que no se metan menos de 0 goles
     */
    public boolean comprobarresultado(int local, int visitante) throws Exception {
        boolean acertado = false;
        if (local < 0 || visitante < 0) {
            throw new Exception("Un equipo no puede meter menos de 0 goles, por malo que sea");
        }

        if (goleslocal == local && golesvisitante == visitante) {
            acertado = true;
        }
        return acertado;
    }
    
    /* M�todo para cobrar la apuesta.
     * Comprueba que se acert� el resultado y, en ese caso,
     *  a�ade el valor apostado multiplicado por 10
     * al saldo disponible
     */
    void cobrarapuesta(int cgoleslocal, int cgolesvisit) throws Exception {

        if (!comprobarresultado(cgoleslocal, cgolesvisit)) {
            throw new Exception("No se puede cobrar una apuesta no acertada");
        }
        dinerodisp = dinerodisp * 10;

    }
}
