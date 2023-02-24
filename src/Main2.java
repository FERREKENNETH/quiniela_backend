import java.util.ArrayList;
import java.util.List;

public class Main2 {
    static String[] resultadoReal = new String[]{ "1","X","2","1","","X","","","","2","","","2","" };

    static List<List<String>> quiniela = new ArrayList<>();



    static int totalIguales = 0;
    public static void main(String[] args) {

        //addApuestas();
        quiniela.add(new ArrayList<String>() {
            { add("2");add("2");add("X"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("2");add("X");add("1"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("1");add("2");add("X"); }
        });


        List<List<String>> columnasIguales = new ArrayList<>();
        List<List<String>> columnasDiferentes = new ArrayList<>();
        int a = 0;
        int b = 0;
        loop1:
        for (List<String> col: quiniela) {
            System.out.println("col modelo " + col);


            loop2:
            for (List<String> colA: quiniela) {
                System.out.println("col test   " + quiniela.get(b));

                System.out.println("a = " + a + " b = " + b);

                if (col.equals(colA) && a!=b) {
                    columnasIguales.add(colA);
                    comparar2Columnas(col, colA, "IGUALES");
                    totalIguales++;
                } else if (!col.equals(colA) && a!=b) {
                    columnasDiferentes.add(colA);
                    comparar2Columnas(col, colA, "DIFERENTES");

                }
                b++;
                //PRINT COLUMNAS REPETIDAS
                //System.out.println("----------------- colsRepes = " + (columnasIguales.size()-1));

            }


            System.out.println("---------------------END---------------------");

            //RESET VARIABLES
            b = 0;
            a++;
            columnasIguales = new ArrayList<>();
            columnasDiferentes = new ArrayList<>();

        }


        System.out.println("totalIguales = " + totalIguales);
        System.out.println("+++++++++++++++++++");

    }

    public static void addApuestas() {
        quiniela.add(new ArrayList<String>() {
            { add("2");add("2");add("X"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("2");add("X");add("1"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("2");add("2");add("X"); }
        });
        /*quiniela.add(new ArrayList<String>() {
            { add("2");add("2");add("X");add("X");add("2");add("X");add("2");add("2");add("1");add("1");add("1");add("X");add("1");add("X"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("2");add("X");add("1");add("X");add("2");add("X");add("2");add("X");add("X");add("1");add("1");add("2");add("1");add("2"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("2");add("2");add("X");add("2");add("2");add("2");add("2");add("2");add("1");add("1");add("1");add("X");add("1");add("X"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("1");add("2");add("2");add("X");add("X");add("1");add("2");add("2");add("X");add("1");add("1");add("2");add("1");add("1"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("2");add("2");add("X");add("2");add("2");add("X");add("2");add("X");add("1");add("1");add("1");add("X");add("1");add("X"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("1");add("X");add("2");add("X");add("X");add("2");add("2");add("2");add("1");add("1");add("X");add("1");add("1");add("1"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("2");add("2");add("X");add("1");add("2");add("2");add("2");add("2");add("1");add("1");add("1");add("X");add("1");add("X"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("2");add("X");add("1");add("1");add("X");add("X");add("2");add("2");add("1");add("1");add("X");add("1");add("1");add("2"); }
        });

        quiniela.add(new ArrayList<String>() {
            { add("2");add("1");add("X");add("2");add("2");add("2");add("2");add("X");add("1");add("1");add("X");add("1");add("X");add("2"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("2");add("2");add("X");add("X");add("1");add("1");add("2");add("X");add("X");add("1");add("1");add("2");add("1");add("1"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("2");add("X");add("1");add("2");add("2");add("1");add("2");add("X");add("1");add("1");add("2");add("2");add("1");add("X"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("X");add("1");add("1");add("2");add("2");add("X");add("2");add("X");add("1");add("1");add("X");add("X");add("1");add("2"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("X");add("2");add("2");add("X");add("X");add("1");add("2");add("2");add("1");add("1");add("1");add("2");add("X");add("2"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("2");add("2");add("2");add("2");add("2");add("X");add("2");add("2");add("X");add("1");add("2");add("1");add("1");add("1"); }
        });
        quiniela.add(new ArrayList<String>() {
            { add("1");add("1");add("X");add("2");add("1");add("2");add("2");add("2");add("1");add("1");add("1");add("X");add("2");add("2"); }
        });

        quiniela.add(new ArrayList<String>() {
            { add("X");add("1");add("X");add("2");add("2");add("X");add("2");add("2");add("X");add("1");add("X");add("1");add("1");add("X"); }
        });*/

    }



    public static void comparar2Columnas(List<String> col1, List<String> col2, String titulo) {
        System.out.println("---------------------------------COLUMNAS " + titulo + "---------------------------------");
        int resultadosIguales = 0;
        int resultadosDiferentes = 0;
        for (int i = 0; i < col1.size(); i++) {
            if (col1.get(i).equalsIgnoreCase(col2.get(i))) {
                //System.out.println("RESULTADOS IGUALES PARA LA MISMA COLUMNA: INDEX= " + i + " col1=" + col1.get(i) + " col2=" + col2.get(i));
                resultadosIguales++;
            } else {
                resultadosDiferentes++;
            }

        }
        System.out.println("TOTAL REPETIDOS: " + resultadosIguales);
        System.out.println("TOTAL NO REPETIDOS: " + resultadosDiferentes);
        System.out.println("---------------------------------COLUMNAS " + titulo + "---------------------------------\n\n");

    }



}
