package corpoPrograma;

import java.awt.CardLayout;
import java.awt.TextArea;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.io.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal {

    private static final String nome_arquivo = "vagas.txt";
    private String IDPrinc;
    private String IDFiltro;
    private String IDRemove;
    private String IDEdit;
    private static final String senha = "123456";
    private JPanel painelPrincipal;
    private int ID = 1;

    public Principal(JPanel painel) {
        this.painelPrincipal = painel;
        IDPrinc = "";
        IDFiltro = "";
        IDRemove = "";
        IDEdit = "";
        ID = recuperarUltimoID() + 1;
    }

    public void cadastrarVaga(String nome, String empresa, String area, String salario, String horario, String descricao) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nome_arquivo, true))) {
            String vaga = ID + "," + nome + "," + empresa + "," + area + "," + salario + "," + horario + "," + descricao;
            writer.write(vaga);
            writer.newLine();
            ID++;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int recuperarUltimoID() {
        int ultimoID = 0;
        try (BufferedReader leitor = new BufferedReader(new FileReader(nome_arquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length > 0) {
                    try {
                        ultimoID = Math.max(ultimoID, Integer.parseInt(dados[0])); // Pega o maior ID já registrado
                    } catch (NumberFormatException e) {
                        System.out.println("Erro ao converter ID: " + dados[0]);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Arquivo ainda não criado. Começando com ID 1.");
        }
        return ultimoID;
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

    public static void carregarVagasTabela(JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0); // Limpa a tabela antes de inserir os dados

        try (BufferedReader leitor = new BufferedReader(new FileReader(nome_arquivo))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split(","); // Divide a linha pelas vírgulas de acordo como está sendo salvo no arquivo
                if (dados.length >= 6) { // Garante que há 5 colunas
                    modelo.addRow(dados); // Adiciona a linha à tabela
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
