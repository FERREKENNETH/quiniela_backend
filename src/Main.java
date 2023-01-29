import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static String[][] quiniela = new String[][]{
            /*{"2","2","2","2","2","2","2","2"},
            {"1","1","1","1","1","1","X","2"},
            {"2","2","2","2","2","2","X","2"},
            {"X","2","2","2","2","2","X","2"},
            {"X","X","X","1","2","2","2","X"},
            {"1","2","2","2","2","2","2","2"},
            {"X","2","2","2","2","2","X","1"},
            {"2","X","2","X","1","1","1","1"},
            {"X","2","2","2","2","2","2","2"},
            {"X","1","1","1","1","1","1","X"},
            {"1","X","1","1","1","1","1","1"},
            {"2","X","X","X","X","X","X","X"},
            {"1","1","1","1","1","1","1","1"},
            {"1","1","1","1","1","1","1","1"}*/
            /*{"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "X", "X", "X", "X", "X", "X", "X", "X"},
            {"X", "X", "X", "X", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "1", "1", "X", "X", "2", "2", "2", "2", "X", "X", "2", "2", "1", "2", "1", "X"},
            {"2", "X", "2", "X", "2", "X", "2", "X", "X", "X", "X", "X", "X", "X", "X", "X", "X", "2", "X", "X", "X", "X", "X", "1", "X", "X", "2", "2", "X", "1", "2", "1"},
            {"1", "1", "1", "1", "X", "X", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "X", "1", "X", "2", "1", "X", "1", "2", "1", "1", "2", "1"},
            {"1", "1", "1", "1", "X", "X", "X", "2", "1", "X", "2", "1", "X", "2", "1", "2", "X", "1", "X", "1", "2", "X", "2", "1", "1", "1", "X", "1", "1", "X", "X", "X"},
            {"X", "X", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "X", "X", "1", "2", "1", "1", "1", "1", "X", "1", "1", "X", "1", "1", "X", "1", "1", "1", "1"},
            {"2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "X", "X", "X", "2", "2", "2", "X", "X", "2", "2", "X", "2", "X", "2", "2", "2"},
            {"2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "X", "X", "X", "X", "X", "X", "X", "X", "2", "2", "2", "2", "2", "2", "2", "2"},
            {"2", "2", "X", "2", "X", "2", "1", "1", "X", "X", "2", "2", "X", "X", "2", "1", "1", "X", "2", "X", "2", "X", "1", "2", "X", "2", "X", "X", "X", "2", "2", "1"},
            {"2", "2", "X", "X", "2", "2", "2", "2", "2", "2", "2", "2", "X", "X", "X", "X", "2", "2", "X", "2", "2", "2", "X", "2", "2", "2", "X", "X", "2", "2", "X", "X"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "X", "X", "X", "X", "1", "1", "1", "1", "1", "1", "1", "1", "X", "1", "1", "1", "1", "X", "X", "X"},
            {"X", "1", "X", "1", "X", "1", "2", "X", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "X", "X", "X", "2", "1", "1", "X", "1", "1", "2", "X", "2", "X"},
            {"1", "1", "X", "1", "2", "X,", "2", "2", "X", "X", "X", "X", "X", "X", "X", "X", "2", "2", "2", "2", "X", "X", "X", "2", "X", "2", "1", "X", "X", "X", "1", "2"},
            {"1", "X", "1", "X", "1", "X", "2", "2", "X", "X", "2", "X", "X", "2", "X", "X", "2", "X", "2", "1", "X", "1", "2", "X", "1", "1", "1", "1", "X", "1", "1", "1"}*/
            {"2", "2", "2", "2", "2", "2", "2", "2", "X", "X", "X", "X", "X", "1", "1", "1", "2", "2", "2", "2", "2", "2", "2", "2"},
            {"2", "X", "X", "1", "2", "X", "1", "2", "1", "1", "1", "X", "X", "1", "X", "2", "2", "2", "2", "2", "X", "X", "X", "X"},
            {"X", "2", "2", "2", "2", "2", "2", "2", "1", "X", "2", "X", "2", "2", "X", "X", "1", "X", "X", "2", "1", "X", "X", "2"},
            {"2", "2", "2", "2", "2", "2", "2", "2", "X", "2", "2", "2", "X", "X", "2", "2", "2", "2", "X", "1", "1", "X", "2", "2"},
            {"2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "X", "X", "X"},
            {"X", "X", "2", "2", "2", "2", "X", "X", "1", "X", "2", "2", "2", "1", "1", "2", "1", "X", "2", "2", "2", "2", "1", "X"},
            {"X", "X", "1", "X", "1", "X", "X", "1", "1", "1", "X", "X", "X", "1", "X", "1", "1", "1", "1", "1", "1", "1", "X", "X"},
            {"1", "2", "1", "1", "1", "X", "X", "1", "1", "1", "1", "X", "1", "1", "X", "X", "1", "X", "1", "X", "1", "X", "1", "X"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "X", "X", "X", "X"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "X", "X", "X", "X", "2", "2", "X", "X", "1", "1", "1", "X", "X", "1", "1", "1"},
            {"2", "2", "2", "2", "X", "X", "2", "2", "2", "X", "2", "X", "2", "X", "2", "2", "X", "X", "X", "1", "1", "2", "2", "2"},
            {"1", "1", "1", "1", "1", "1", "X", "X", "1", "1", "1", "1", "1", "1", "X", "2", "1", "X", "1", "X", "1", "X", "1", "2"},
            {"X", "X", "X", "X", "1", "2", "1", "2", "1", "X", "1", "X", "1", "X", "1", "X", "X", "X", "X", "X", "1", "1", "2", "2"},
            {"1", "X", "1", "X", "1", "X", "2", "2", "2", "X", "2", "X", "2", "2", "X", "X", "1", "1", "X", "1", "1", "1", "X", "1"},
            /*{"2","2","2"},
            {"1","1","1"},
            {"2","2","2"},
            {"X","X","X"},
            {"X","X","X"},
            {"1","1","1"},
            {"X","X","X"},
            {"2","2","2"},
            {"X","X","X"},
            {"X","X","X"},
            {"1","1","1"},
            {"2","2","2"},
            {"1","1","1"},
            {"1","1","5"}*/

    };

    public static void main(String[] args) {
        buscarColumnasRepetidas(quiniela);
        //new Main ().printPorcentajes();
    }

    public void printPorcentajes( ) {
        System.out.println(quiniela[0].length);
        System.out.print("\t");
        for (int i = 0; i < 8; i++) {
            System.out.print(i+1 + "\t");
        }
        System.out.println("");

        for (int i = 0; i < quiniela.length; i++) {
            System.out.print(i+1 + "\t");
            int total1 = 0;
            int totalX = 0;
            int total2 = 0;

            for (int j = 0; j < quiniela[i].length; j++) {
               // System.out.print(quiniela[i][j] + "\t");

                switch (quiniela[i][j].toUpperCase()) {
                    case ("1"):
                        total1 +=1;
                        break;
                    case ("X"):
                        totalX +=1;
                        break;
                    case ("2"):
                        total2 +=1;
                }



                if (j == (quiniela[i].length -1)) {
                    String whiteSpace = "";
                    int totalPercent = ((total1*100)/ quiniela[i].length);
                    if (String.valueOf(totalPercent).length() == 1)
                        whiteSpace = "  ";
                    else if (String.valueOf(totalPercent).length() == 2)
                        whiteSpace = " ";

                    //System.out.print(String.format("[1]: %s [%s%%%s] \t", total1, ((total1*100)/quiniela[i].length), whiteSpace));
                    System.out.print(String.format("1: [%s%%%s] \t", ((total1*100)/quiniela[i].length), whiteSpace));


                    whiteSpace = "";
                    totalPercent = ((totalX*100)/ quiniela[i].length);
                    if (String.valueOf(totalPercent).length() == 1)
                        whiteSpace = "  ";
                    else if (String.valueOf(totalPercent).length() == 2)
                        whiteSpace = " ";
                    //System.out.print(String.format("[X]: %s [%s%%%s] \t", totalX, ((totalX*100)/ quiniela[i].length), whiteSpace));
                    System.out.print(String.format("X: [%s%%%s] \t", ((totalX*100)/ quiniela[i].length), whiteSpace));

                    whiteSpace = "";
                    totalPercent = ((total2*100)/ quiniela[i].length);
                    if (String.valueOf(totalPercent).length() == 1)
                        whiteSpace = "  ";
                    else if (String.valueOf(totalPercent).length() == 2)
                        whiteSpace = " ";
                    System.out.print(String.format("2:[%s%%%s]", ((total2*100)/ quiniela[i].length), whiteSpace));
                }

            }
            System.out.print("\n");
        }
    }

    public static void buscarColumnasRepetidas(String[][] quiniela) {

        int columnasRepetidas = 0;
        List<Boolean> igualesList= new ArrayList<>();
        List<String> mensajes = new ArrayList<>();
        int numRepeticionesFilas = 0;
        int numDiferentesColumna = 0;

        int j = 0;
        for (int i = 0; i<quiniela[0].length -1; i++){
            System.out.println("COMPARAMOS COLUMNA NUMERO " + i + " CON COLUMNA " + (i+1));
            for (j = 0; j<quiniela.length; j++){
                if (quiniela[j][i].equalsIgnoreCase(quiniela[j][i+1])) {
                    igualesList.add(true);
                    numRepeticionesFilas++;
                }
            }

            if (igualesList.stream().filter(r -> r.equals(Boolean.TRUE)).count() == 14 && numRepeticionesFilas ==14) {
                mensajes.add(String.format("Columna %s esta repetida con columna %s", i , (i+1)));
                System.out.println(String.format("Columna %s esta repetida con columna %s", i , (i+1)));
                columnasRepetidas++;
            } else {
                numDiferentesColumna++;
                System.out.println("COLUMNA NO REPETIDA PERO CON " + numRepeticionesFilas + " RESULTADOS IGUALES");
            }

            igualesList= new ArrayList<>();
            numRepeticionesFilas = 0;

            System.out.println(" ");
        }

        System.out.println("++++++++++++++++++++++++++++++++RESULTADO++++++++++++++++++++++++++++++++");
        System.out.println("COLUMNAS REPETIDAS = " + (columnasRepetidas+1) +" DE UN TOTAL DE " + quiniela[0].length +" COLUMNAS");
        System.out.println("COLUMNAS DIFERENTES = " + numDiferentesColumna);
        System.out.println(mensajes.toString());
    }
}
