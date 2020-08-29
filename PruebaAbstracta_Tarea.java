package pruebaabstracta_tarea;
abstract  class Falla_Motor {
    private String cojinete;
    private String rin;
    private String pinion;
    private String valvula;
    private String piston;

    public Falla_Motor (String cojinete,String rin ,String pinion, String valvula,String piston)
    {
       System.out.println("\nIntegrando las Fallas del motor: ");
        this.cojinete=cojinete;
        this.rin=rin;
        this.pinion=pinion;
        this.valvula=valvula;
        this.piston=piston;
    }
    public String Deteccion()
    {
        System.out.println("Detección de la Falla en el Motor");
        return "";
    }
    public void ClasificacionFalla()
    {
        System.out.println("Falla Mecánica en: "
                +this.cojinete + "\n"+this.rin+"\n"+this.pinion+"\n"+this.valvula
                +"\n"+this.piston);
    }
    public String toString()
    {
        return cojinete +" "+rin+" "+pinion+" "+valvula+" "+piston;
    }
    public String getCojinete()
    {
        return cojinete;
    }
    public String getRin()
    {
        return rin;
    }
    public String getPinion()
    {
        return pinion;
    }
    public String getValvula()
    {
        return valvula;
    }
    public String getPiston()
    {
        return piston;
    }
}
class Reparacion extends Falla_Motor
{
    private String reparacion;
    public Reparacion(String cojinete,String rin,String pinion,String valvula,String piston,String reparacion)
    {
        super(cojinete,rin,pinion,valvula,piston);
        setReparacion(reparacion);
    }
    public void ClasificacionFalla()
    {
        System.out.println("Dentro del Metodo ClasificacionFalla de la clase Reparacion");
        System.out.println("Clasificar: \n--Por desgaste-- " +getValvula()+", "+getRin());
        System.out.println("Clasificar: \n--Por Falta de Lubricación-- "
                +getPinion()+", "+getCojinete()+", "+getPiston());

       // System.out.println("\nIntegrando las Fallas del Motor");
    }
        public String getReparacion()
        {
            return reparacion;
        }
        public void setReparacion(String nuevo)
        {
            reparacion=nuevo;
    }
    public String Deteccion()
    {
        System.out.println("Detectar las Fallas del motor: "+getCojinete()+""
        +getRin()+""+getPinion()+""+getValvula()+""+getPiston());
        return "";
    }

}
class NumeroFalla extends Falla_Motor
{
    private int numeroFalla;
    public NumeroFalla(String cojinete,String rin,String pinion,String valvula,String piston,int numeroFalla)
    {
        super(cojinete,rin,pinion,valvula,piston);
        setNumeroFalla(numeroFalla);
    }
    public void ClasificacionFalla()
    {
        System.out.println("\nDentro del Metodo ClasificacionFalla de la clase NumeroFalla");

        System.out.println("Enumerar Falla: \n1." +getCojinete()+"\n2."+getRin()+"\n3."
                +getPinion()+"\n4."+getValvula()+"\n5."+getPiston());
        System.out.println("Enumerando las Fallas Encontradas: "+getNumeroFalla());
    }
        public int getNumeroFalla()
        {
            return numeroFalla;
        }
        public void setNumeroFalla(int nuevo)
        {
            if(nuevo>=1)
                numeroFalla=nuevo;
        }
        public String Deteccion()
        {
            System.out.println("Enumerar Falla: 1." +getCojinete()+"\n2."+getRin()+"\n3."
                +getPinion()+"\n4."+getValvula()+"\n5."+getPiston());

             return "";
        }
}
public class PruebaAbstracta_Tarea {
    public static void main(String[] args) {

        Falla_Motor ObjetoFalla=new Reparacion("Válvula","Rin","Piñon","Cojinete","Pistón","");
        Reparacion ObjetoReparacion=new Reparacion("Válvula","Rin","Piñón","Cojinete","Pistón","");
        NumeroFalla ObjetoNumeroFalla=new NumeroFalla("Válvula","Rin","Piñón","Cojinete","Pistón",5);

        System.out.println("Registrando Las Fallas del motor a clasificación"
                + "Falla utilizando la referencia de la clase Falla_Motor ");
       ObjetoReparacion.ClasificacionFalla();
        System.out.println("Registrando Las Fallas del motor a clasificación"
                + "Falla utilizando la referencia de la clase Falla_Motor ");
        ObjetoNumeroFalla.ClasificacionFalla();

    }

}
