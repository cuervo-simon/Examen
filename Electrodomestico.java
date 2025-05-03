package Electrodomesticos;

public class Electrodomestico {
    private String marca, modelo;
    
    public Electrodomestico(String marca, String modelo) { this.marca = marca; this.modelo = modelo; } 
    
    public String getMarca() { return marca; }  public void setMarca(String marca) { this.marca = marca; }
   
    public String getModelo() { return modelo; }  public void setModelo(String modelo) { this.modelo = modelo; }
   
    public void encender() { System.out.println("Electrodoméstico encendido"); }

    public class Lavadora extends Electrodomestico { 
        
    	private int cargaKg; public Lavadora(String marca, String modelo, int cargaKg) { super(marca, modelo); this.cargaKg = cargaKg; }
       
    	
    	public int getCargaKg() { return cargaKg; } public void setCargaKg(int cargaKg) { this.cargaKg = cargaKg; }
       
  
    	public void iniciarCiclo() { System.out.println("Ciclo de lavado iniciado"); }
    }

}
