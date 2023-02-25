import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    static String[] resultadoReal = new String[]{ "1","X","2","1","","X","","","","2","","","2","" };

    static List<List<String>> quiniela = new ArrayList<>();

    static Map<Integer, List<Integer>> coincidencias = new HashMap<>();

    static void inicializarCoincidencias() {
        int idx = 0;
        for (List<String> ignored : quiniela) {
            coincidencias.put(idx, new ArrayList<>());
            idx++;
        }
    }

    public static void main(String[] args) {

        addApuestas();

        inicializarCoincidencias();

        int colTestIndex = 1;
        int colTestIndexInterno = 1;
        int colActualIndex = 0;

        List<String>  colTest;


        for (List<String> colActual: quiniela) {
            for (colTestIndexInterno = colTestIndex; colTestIndexInterno < quiniela.size(); colTestIndexInterno++) {
                colTest = quiniela.get(colTestIndexInterno);

                boolean sonIguales = sonColumnasIguales(colActual, colTest, "");

                if (sonIguales) {
                    //COMPROBAMOS SI YA EXISTEN CONINCIDENCIAS
                    boolean existeConicidencia = false;
                    for (Map.Entry<Integer,List<Integer>> entry : coincidencias.entrySet()) {
                        List<Integer> repetidos = entry.getValue();

                        existeConicidencia = repetidos.contains(colTestIndexInterno);
                        if (existeConicidencia) {
                            break;
                        }

                        //System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

                    }

                    if (!existeConicidencia)
                        coincidencias.get(colActualIndex).add(colTestIndexInterno);
                }
            }

            colTestIndex++;
            colActualIndex++;
            colTestIndexInterno = colTestIndex;

        }

        System.out.println(coincidencias);
        System.out.println("TRALALA");

    }

    public static void addApuestas() {
        quiniela.add(new ArrayList<String>() {
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
        });

    }



    public static boolean sonColumnasIguales(List<String> col1, List<String> col2, String titulo) {
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

        return resultadosDiferentes == 0;

    }



}
