import java.util.ArrayList;

public class CafeUtil{
    public int getStreakGoal( int numWeeks ){
        int recompensas = 0;
        for( int i=1; i<=numWeeks; i++ ){
            recompensas += i;
        }
        return recompensas;
    }

    public double getOrderTotal( double[] prices ){
        double total = 0.0;
        for( int i=0; i<prices.length; i++ ){
            total += prices[i];
        }
        return total;
    }

    public void displayMenu( ArrayList<String> menuItems ){
        for( int i=0; i<menuItems.size(); i++ ){
            System.out.printf( i + " " + menuItems.get(i) + "\n" );
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.printf( "Por favor, ingresa tu nombre: " );
        String userName = System.console().readLine();
        System.out.printf( "¡Hola, %s!\n", userName );
        System.out.printf( "Hay %d personas frente a ti", customers.size() );
        customers.add( userName );
    }
}