import java.util.ArrayList;
public class TestCafe {
    public static void main( String[] args ) {
        CafeUtil cafe = new CafeUtil();
    	
        /* ============ Casos de prueba de la App ============= */
        System.out.println( "\n----- Prueba Meta café -----" );
        System.out.printf( "Compras necesarias para la semana 10: %s \n\n", cafe.getStreakGoal( 10 ) );
    
        System.out.println( "----- Prueba Total Orden -----" );
        double[] lineItems = { 3.5, 1.5, 4.0, 4.5 };
        System.out.printf( "Total orden: %s \n\n",cafe.getOrderTotal( lineItems ) );
        
        System.out.println( "----- Prueba Mostrar Menú-----" );
        ArrayList<String> menu = new ArrayList<String>();
        menu.add( "café de goteo" );
        menu.add( "capuchino" );
        menu.add( "latte" );
        menu.add( "moka" );
        cafe.displayMenu( menu );
    
        System.out.println( "\n----- Prueba Agregar cliente-----" );
        ArrayList<String> customers = new ArrayList<String>();
        // --- Probar 4 veces ---
        for ( int i = 0; i < 4; i++ ) {
            cafe.addCustomer( customers );
            System.out.println( "\n" );
         }
    }
}