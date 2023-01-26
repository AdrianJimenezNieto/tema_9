public class Main {
    public static class Persona {

        // Atributos de clase
        private int edad;
        private int telefono;
        private String nombre;
        public String getNombre(){

            return nombre;
        }
        public int getEdad(){

            return edad;
        }
        public int getTelefono(){

            return telefono;
        }
        public void setEdad(int edad) {

            this.edad = edad;
        }
        public void setNombre(String nombre) {

            this.nombre = nombre;
        }
        public void setTelefono(int telefono) {

            this.telefono = telefono;
        }
    }

    public static class Cliente extends Persona{
        private int credito;
        public int getCredito(){
            return credito;
        }
        public void setCredito(int credito){
            this.credito = credito;
        }
    }

    public static class Trabajador extends Persona{
        private int salario;
        public int getSalario(){
            return salario;
        }
        public void setSalario(int salario){
            this.salario = salario;
        }
    }
    public static void main(String[] args) {

        Trabajador trabajador1 = new Trabajador();
        // Meto los datos en los paramemtros
        trabajador1.setEdad(43);
        trabajador1.setTelefono(624879123);
        trabajador1.setNombre("Felipe");
        trabajador1.setSalario(34);

        // Utilizo los getter para mostrarlos por pantalla
        System.out.println("TRABAJADOR:");
        System.out.println();
        System.out.println("Nombre: " + trabajador1.getNombre());
        System.out.println("Edad: " + trabajador1.getEdad());
        System.out.println("Telefono: " + trabajador1.getTelefono());
        System.out.println("Salario: " + trabajador1.getSalario());
        System.out.println();


        Cliente cliente1 = new Cliente();
        // Meto los datos en los paramemtros
        cliente1.setEdad(5);
        cliente1.setTelefono(654789123);
        cliente1.setNombre("Angela");
        cliente1.setCredito(21002);

        // Utilizo los getter para mostrarlos por pantalla
        System.out.println("CLIENTE:");
        System.out.println();
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Edad: " + cliente1.getEdad());
        System.out.println("Telefono: " + cliente1.getTelefono());
        System.out.println("Credito: " + cliente1.getCredito());
    }
}