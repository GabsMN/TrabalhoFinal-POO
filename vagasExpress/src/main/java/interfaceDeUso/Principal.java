package corpoPrograma;

import java.awt.CardLayout;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class Principal {

    private static final String nome_arquivo = "vagas.txt";
    private String IDPrinc;
    private String IDFiltro;
    private String IDRemove;
    private String IDEdit;
    private static final String senha = "123456";
    private JPanel painelPrincipal;

    public Principal(JPanel painel) {
        this.painelPrincipal = painel;
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

    public void verificaSenha() {
        JPasswordField tentativa = new JPasswordField();

        int resposta = JOptionPane.showConfirmDialog(null, tentativa, "Digite a senha de administrador", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (resposta == JOptionPane.OK_OPTION) {
            String senhaDig = new String(tentativa.getPassword());

            if (senhaDig.equals(senha)) { // Se a senha for correta, troca o Card para o de Adm
                CardLayout troca = (CardLayout) painelPrincipal.getLayout();
                troca.show(painelPrincipal, "card4");
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}
