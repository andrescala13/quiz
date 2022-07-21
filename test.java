
import javafx.scene.effect.Light.Distant;

public class test
 
{

    public  static  void  main( String [] args )
    {
        Coordenada  c1 = new  Coordenada ();
        c1.setX(1.8); 
        c1.setY( 5.3 );
        System.out.println(c1);
        Coordenada  c2 = new Coordenada ( 1.3 , 5.3 );
        System.out.println( c2 );



        if(c1.equals(c2))
        {
            System.out.println( "fechas iguales" );
        }
        else
        {
            System.out.println( "fechas diferentes" );
        }
}
}
