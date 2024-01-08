import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int coelho = 0;
        int rato = 0;
        int sapo = 0;
        int cobaia = 0;
        int qtd = 0;

        for(int i = 0; i < a; i++){
            String entrada = br.readLine();
            String[] arr = entrada.split(" ");
            qtd = Integer.parseInt(arr[0]);
            String animal = arr[1];

            cobaia += qtd;

            if(animal.equals("C")){
                coelho = coelho + qtd;
            }else if(animal.equals("R")){
                rato = rato + qtd;
            }else if(animal.equals("S")){
                sapo = sapo + qtd;
            }

        }

        double cobaia1 = cobaia; 
        double coelho1 = coelho;
        double rato1 = rato;
        double sapo1 = sapo;


        double porcentageC = coelho1 / cobaia1 * 100 ;
        double porcentageR = rato1 / cobaia1 * 100 ;
        double porcentageS = sapo1 / cobaia1 *100; 


        System.out.println("Total: " +cobaia +" cobaias");
        System.out.println("Total de coelhos: " +coelho);
        System.out.println("Total de ratos: " +rato);
        System.out.println("Total de sapos: " +sapo);
        System.out.printf("Percentual de coelhos: %.2f %%%n",porcentageC);
        System.out.printf("Percentual de ratos: %.2f %%%n" ,porcentageR);
        System.out.printf("Percentual de sapos: %.2f %%%n" ,porcentageS);
    }

}
