
package bancojuan;


public class Cuenta {
    float saldo=0;
    private String titular;
    private float cantidad;
    private double dinero;
    public Cuenta(String titular){
        this(titular, 0);
        }
    public Cuenta(String nombre,float dinero){
        titular=nombre;
        cantidad=dinero;
}
    public String getTitular(){
        return titular;
    }
    public void setnombre(String nombre){
     titular=nombre;
             }
    public float getcantidad(){
        return cantidad;
    }
    public void setndinero(float dinero){
     cantidad=dinero;
             }
    public void ingresar (double dinero){
     if(dinero<0){
         System.out.println("...");
        } 
        else{
            dinero=dinero+saldo;  
}
}     
    public void retirar (double dinero){
        if (dinero-dinero<dinero){
            dinero=0;
            
        }else{
            dinero=dinero-dinero;
            
        }
    }
         
    
    
}
    