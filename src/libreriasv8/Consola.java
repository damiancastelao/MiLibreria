package libreriasv8;

/**
 * Esta clase es un producto
 */
public class Consola implements InterfaceMetodosComunes {

    private String msg;
    //modificacion nuria
    //mod yago
    /**
     * Constructor
     *
     * @param msg mensaje que queremos imprimir
     */
    public Consola(String msg) {
        this.msg = msg;
    }

    ;

    /**
     * Visualizamos mensaje por consola
     */
    @Override
    public void visualiza() {
        System.out.println("Sale por la consola " + msg);
        
        //Comentrio para clase
    }
    //CHIMICHANGAS
}
