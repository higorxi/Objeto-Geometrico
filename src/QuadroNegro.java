public class QuadroNegro {
 private Quadrado quadrado;
 private Retangulo retangulo;
 private Circunferencia circunferencia;
 private Triangulo triangulo;

 public void limpaQuadro ( ) {

 }

 public void criaQuadrado ( double l) {
 quadrado = new Quadrado(l);
 }

 public void criaRetangulo ( double c, double a) {
 retangulo = new Retangulo(c, a);
 }

 public void criaCircunferencia ( double r) {
 circunferencia = new Circunferencia(r);
 }

 public void criaTriangulo ( double b, double a) {
 triangulo = new Triangulo(b, a);
 }
 
 public void mostraAreaObjetos ( ) {
 System.out.println("Quadrado. Área: " + quadrado.getArea());
 System.out.println("Retângulo. Área: " + retangulo.getArea());
 System.out.println("Triângulo. Área: " + (triangulo.base * triangulo.altura)/2);
 System.out.println("Circunferência. Área: " + circunferencia.getArea());
 }

 public void mostraPerimetroObjetos ( ) {

 }

 public void mostraCorObjetos ( ) {

 }

 public static void main ( String args[]) {
 QuadroNegro quadroNegro = new QuadroNegro();
 quadroNegro.criaQuadrado(10.6);
 quadroNegro.criaRetangulo(50.5,20.4);
 quadroNegro.criaTriangulo(6.7,5.5);
 quadroNegro.criaCircunferencia(10);
 quadroNegro.mostraAreaObjetos();

 }
}
