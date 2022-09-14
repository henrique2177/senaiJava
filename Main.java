import java.util.Scanner;

public class Main {
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double numGaloes;
    double numLitros = 37854;

    System.out.print("Coloque o numero de galões:");
    numGaloes = sc.nextDouble();

    
    System.out.print("numero de galoes:" +numGaloes);

    numGaloes *= numLitros;
    System.out.print("\nnumero de litros:" +numGaloes);

    sc.close();
    }
}
