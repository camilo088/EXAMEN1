package logica;

class TasaMetabolicaBasal {
    public static void main(String[] args) {
        Persona hombre = new Hombre(75, 180, 30);
        Persona mujer = new Mujer(60, 165, 25);
        
        System.out.println("Tasa metabólica basal para el hombre: " + hombre.calcularTMB());
        System.out.println("Tasa metabólica basal para la mujer: " + mujer.calcularTMB());
    }
}

abstract class Persona {
    protected double peso; // en kilos
    protected double altura; // en centímetros
    protected int edad; // en años
    
    public Persona(double peso, double altura, int edad) {
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }
    
    public abstract double calcularTMB();
}

class Hombre extends Persona {
    public Hombre(double peso, double altura, int edad) {
        super(peso, altura, edad);
    }
    
    @Override
    public double calcularTMB() {
        return 88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad);
    }
}

class Mujer extends Persona {
    public Mujer(double peso, double altura, int edad) {
        super(peso, altura, edad);
    }
    
    @Override
    public double calcularTMB() {
        return 447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad);
    }
}
