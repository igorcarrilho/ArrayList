package ArrayList;
import javax.swing.*;
import java.util.ArrayList;

public class ArrayListCarros {
    public static void main(String[] args){
        //Construindo um arraylist para os carros
        ArrayList<String> carros = new ArrayList<>();

        //Adicinando Carros ao arraylist
        carros.add("Lamborghini");
        carros.add("Kombi");
        carros.add("Jaguar");
        carros.add("BMW");
        carros.add("Mercedes");
        carros.add("GTR");
        carros.add("Supra");
        carros.add("Land Rover");
        //Mostrar array
        System.out.println(carros);

        //Substituir Mercedes por Ferrari
        carros.set(4, "Ferrari");
        //Mostrar Array
        System.out.println(carros);

        //Remover a Kombi
        carros.remove("Kombi");
        //Mostrar Array
        System.out.println(carros);

        //Adicionando carros ao ArrayList com JOptionpane
        carros.add(JOptionPane.showInputDialog("Informe o Carro a ser adicionado: "));
        //Mostra Array
        System.out.println(carros);
        /*
        //Esvaziando o Array
        carros.clear();
        //Mostra array
        System.out.println(carros);

        //Verificar se o Array está vazio
        if(carros.isEmpty()){
            System.out.println("O vetor está vazio");
        }
        */
        System.out.println(carros.size());
        boolean achei = false;
        if(carros.contains("BMW M3")){
            //Substituindo quando não se sabe a posição
            for(int i = 0; i < carros.size(); i++) {
                if ("BMW M3".equals(carros.get(i))) {
                    carros.set(i, "Bugatti");
                    break;
                }
            }
        }
        if(!achei){
            System.out.println("Não encontrei o argumento procurado");
        }else{
            System.out.println("Achei o argumento procurado" + carros.indexOf("BMW"));
        }
        System.out.println(carros);
    }
}
