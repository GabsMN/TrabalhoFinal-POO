package corpoPrograma;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

    private static final String nome_arquivo = "vagas.txt";
    private String IDPrinc;
    private String IDFiltro;
    private String IDRemove;
    private String IDEdit;

    public Principal() {
        IDPrinc = "";
        IDFiltro = "";
        IDRemove = "";
        IDEdit = "";
    }

    public void cadastrarVaga(String nome, String empresa, String area, String salario, String horario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nome_arquivo, true))) {
            String vaga = nome + "," + empresa + "," + area + "," + salario + "," + horario;
            writer.write(vaga);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
