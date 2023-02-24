import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static String[] resultadoReal = new String[]{
            "1","X","2","1","","X","","","","2","","","2",""
    };
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
            /*{"2", "2", "2", "2", "2", "2", "2", "2", "X", "X", "X", "X", "X", "1", "1", "1", "2", "2", "2", "2", "2", "2", "2", "2"},
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
            {"1", "X", "1", "X", "1", "X", "2", "2", "2", "X", "2", "X", "2", "2", "X", "X", "1", "1", "X", "1", "1", "1", "X", "1"},*/
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

            {"1","1","Q02","Q02"},
            {"2","2","Q12","Q12"},
            {"2","2","Q22","Q22"},
            {"1","1","Q32","Q32"}
            {"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "X"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "X", "X", "1", "1", "1", "1", "X", "X", "X", "X", "X", "1", "1", "X", "1", "1", "X", "2", "1"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "1", "X", "X", "2", "X", "2", "1", "X", "1", "X", "2", "X", "2", "X", "X", "2", "X", "1", "2"},
            {"2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "X", "1"},
            {"2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "X"},
            {"2", "2", "2", "2", "2", "2", "2", "2", "2", "1", "X", "X", "1", "1", "2", "2", "X", "X", "X", "X", "2", "2", "2", "2", "1", "X", "2"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
            {"2", "2", "2", "2", "2", "2", "2", "2", "1", "2", "1", "2", "X", "2", "X", "X", "X", "2", "X", "2", "X", "2", "X", "2", "1", "X", "2"},
            {"1", "1", "1", "1", "1", "1", "1", "1", "1", "X", "1", "X", "1", "X", "1", "X", "1", "X", "1", "X", "1", "X", "1", "X", "1", "X", "1"},
            {"X", "X", "X", "2", "2", "X", "2", "2", "1", "X", "2", "1", "X", "2", "1", "2", "1", "X", "2", "1", "X", "2", "2", "X", "2", "X", "1"},
            {"2", "2", "2", "X", "2", "X", "2", "X", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "2", "X", "2", "2", "X", "X"},
            {"2", "2", "2", "2", "X", "2", "X", "2", "2", "2", "2", "2", "X", "X", "1", "1", "X", "X", "X", "X", "1", "1", "1", "1", "X", "2", "2"},
            {"2", "X", "2", "1", "2", "X", "1", "X", "X", "1", "X", "2", "X", "1", "X", "2", "2", "1", "2", "X", "2", "X", "2", "2", "2", "X", "1"},
            {"X", "X", "1", "X", "X", "1", "1", "1", "1", "X", "1", "X", "1", "X", "1", "X", "1", "X", "1", "1", "1", "X", "1", "X", "X", "2", "X"}*/
            {"2","2","2","1","2","1","2","2"},
            {"2","X","2","2","2","X","2","X"},
            {"X","1","X","2","X","2","X","1"},
            {"X","X","2","X","2","X","1","1"},
            {"2","2","2","X","2","X","2","X"},
            {"X","X","2","1","X","2","2","X"},
            {"2","2","2","2","2","2","2","2"},
            {"2","X","2","2","X","2","2","2"},
            {"1","X","1","X","1","1","1","1"},
            {"1","1","1","1","1","1","1","1"},
            {"1","1","1","1","1","X","1","X"},
            {"X","2","X","2","X","1","X","1"},
            {"1","1","1","1","1","1","1","1"},
            {"X","2","X","1","X","1","X","2"}

    };

    public static void main(String[] args) {
        //buscarColumnasRepetidasTodas(quiniela);

        new Main ().printPorcentajes();
        //printQuiniela();


    }

    public static void printQuiniela() {
        System.out.println(quiniela[0].length);
        System.out.print("\t");
        for (int i = 0; i < quiniela[0].length; i++) {
            System.out.print(i+1 + "\t");
        }

        System.out.println(" ");

        for (int i = 0; i < quiniela.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < quiniela[i].length; j++) {
                System.out.print( quiniela[i][j] + "\t");
            }
            System.out.println(" ");
        }


    }

    public void printPorcentajes( ) {
        System.out.println(quiniela[0].length);
        System.out.print("\t");
        for (int i = 0; i < quiniela[0].length; i++) {
            System.out.print(i+1 + "\t");
        }
        System.out.print("   RESULTADO");
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
                    System.out.print(String.format("2:[%s%%%s]", ((total2*100)/ quiniela[i].length), whiteSpace) );


                    // COMPARATIVA
                    /*if (resultadoReal[i].equalsIgnoreCase("")) {
                        System.out.print(whiteSpace+"NO INFORMADO");

                    } else {
                        System.out.print(whiteSpace+ resultadoReal[i]);*/


                        /*if (total1 > totalX && total1 > total2) {
                            if (resultadoReal[i].equalsIgnoreCase("1"))
                                System.out.print(whiteSpace+ConsoleColors.ANSI_GREEN_BACKGROUND + ConsoleColors.ANSI_BLACK  + resultadoReal[i] + ConsoleColors.ANSI_RESET);
                            else
                                System.out.print(whiteSpace+ConsoleColors.ANSI_RED_BACKGROUND + ConsoleColors.ANSI_BLACK  + resultadoReal[i] + ConsoleColors.ANSI_RESET);

                        } else if(totalX > total1 && totalX > total2) {
                            if (resultadoReal[i].equalsIgnoreCase("X"))
                                System.out.print(whiteSpace+ConsoleColors.ANSI_GREEN_BACKGROUND + ConsoleColors.ANSI_BLACK  + resultadoReal[i] + ConsoleColors.ANSI_RESET);
                            else
                                System.out.print(whiteSpace+ConsoleColors.ANSI_RED_BACKGROUND + ConsoleColors.ANSI_BLACK  + resultadoReal[i] + ConsoleColors.ANSI_RESET);
                        } else if (total2 > total1 && total2 > totalX) {
                            if (resultadoReal[i].equalsIgnoreCase("2"))
                                System.out.print(whiteSpace+ConsoleColors.ANSI_GREEN_BACKGROUND + ConsoleColors.ANSI_BLACK  + resultadoReal[i] + ConsoleColors.ANSI_RESET);
                            else
                                System.out.print(whiteSpace+ConsoleColors.ANSI_RED_BACKGROUND + ConsoleColors.ANSI_BLACK  + resultadoReal[i] + ConsoleColors.ANSI_RESET);
                        } else {
                            System.out.println("asdasd");
                        }

                        //System.out.print(whiteSpace+ resultadoReal[i]);
                    }*/
                }

            }
            System.out.print("\n");
        }
        System.out.println("TOTAL COLUMNAS JUGADAS: " +  quiniela[0].length);
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


    int firstBucle = 0;
    int secondBucle = firstBucle + 1;


    public static void buscarColsRepetidasDefinitiva(String[][] quiniela){

        for (int i = 0; i < quiniela.length; i++) {
            for (int j = 0; j < quiniela.length; j++) {


            }

        }
    }

    public static void buscarColumnasRepetidasTodas(String[][] quiniela) {

        System.out.println("COMPARACION COL 1 Y COL 2");
        if (
                quiniela[0][0].equalsIgnoreCase(quiniela[0][1]) &&
                quiniela[1][0].equalsIgnoreCase(quiniela[1][1]) &&
                quiniela[2][0].equalsIgnoreCase(quiniela[2][1]) &&
                quiniela[3][0].equalsIgnoreCase(quiniela[3][1])
        )
            System.out.println("columnas 0 y 1 iguales!");
        else
            System.out.println("columnas 0 y 1 NO iguales!");

        if (
                quiniela[0][0].equalsIgnoreCase(quiniela[0][2]) &&
                quiniela[1][0].equalsIgnoreCase(quiniela[1][2]) &&
                quiniela[2][0].equalsIgnoreCase(quiniela[2][2]) &&
                quiniela[3][0].equalsIgnoreCase(quiniela[3][2])
        )
            System.out.println("columnas 0 y 2 iguales!");
        else
            System.out.println("columnas 0 y 2 NO iguales!");

        if (
                quiniela[0][0].equalsIgnoreCase(quiniela[0][3]) &&
                quiniela[1][0].equalsIgnoreCase(quiniela[1][3]) &&
                quiniela[2][0].equalsIgnoreCase(quiniela[2][3]) &&
                quiniela[3][0].equalsIgnoreCase(quiniela[3][3])
        )
            System.out.println("columnas 0 y 3 iguales!");
        else
            System.out.println("columnas 0 y 3 NO iguales!");

        System.out.println("END COMPARACION COL 1 Y COL 2\n\n");




        System.out.println("COMPARACION COL 2 Y COL 3");
        if (
                quiniela[0][1].equalsIgnoreCase(quiniela[0][2]) &&
                quiniela[1][1].equalsIgnoreCase(quiniela[1][2]) &&
                quiniela[2][1].equalsIgnoreCase(quiniela[2][2]) &&
                quiniela[3][1].equalsIgnoreCase(quiniela[3][2])
        )
            System.out.println("columnas 1 y 2 iguales!");
        else
            System.out.println("columnas 1 y 2 NO iguales!");

        if (
                quiniela[0][1].equalsIgnoreCase(quiniela[0][3]) &&
                quiniela[1][1].equalsIgnoreCase(quiniela[1][3]) &&
                quiniela[2][1].equalsIgnoreCase(quiniela[2][3]) &&
                quiniela[3][1].equalsIgnoreCase(quiniela[3][3])
        )
            System.out.println("columnas 1 y 3 iguales!");
        else
            System.out.println("columnas 1 y 3 NO iguales!");


        System.out.println("END COMPARACION COL 2 Y COL 3\n\n");

        System.out.println("COMPARACION COL 3 Y COL 4");
        if (
                quiniela[0][2].equalsIgnoreCase(quiniela[0][3]) &&
                quiniela[1][2].equalsIgnoreCase(quiniela[1][3]) &&
                quiniela[2][2].equalsIgnoreCase(quiniela[2][3]) &&
                quiniela[3][2].equalsIgnoreCase(quiniela[3][3])
        )
            System.out.println("columnas 3 y 4 iguales!");
        else
            System.out.println("columnas 3 y 4 NO iguales!");


        System.out.println("END COMPARACION COL 3 Y COL 4\n\n");
    }


    public static boolean isEqual(String[][] data, int rowColumn, boolean row){
        int i = 1;
        int limit = (row) ? data[0].length : data.length;
        while(i<limit){
            if ((row) ? !data[rowColumn][i].equals(data[rowColumn][0])
                    : !data[i][rowColumn].equals(data[0][rowColumn]))
                return false;
        }
        return true;
    }

}
