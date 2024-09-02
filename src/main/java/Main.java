import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

double altura = sc.nextDouble();
double massa = sc.nextDouble();
double inc = massa / (altura * altura);

  System.out.printf("O seu imc é de %f kg/m²" , imc );
 if( 25 < imc) {
  System.out.println(" Você esta acima do peso.");
}

if( 30 < imc){
System.out.println("Você apresenta Obesidade de grau I");
}
    

sc.closed();
}


}