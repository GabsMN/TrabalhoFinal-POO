package corpoPrograma;

import interfaceDeUso.PaginaInicial;
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
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
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
            String vaga = ID + "--" + nome + "--" + empresa + "--" + area + "--" + salario + "--" + horario + "--" + descricao;
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
                String[] dados = linha.split("--");
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

    public void carregarVagasTabela(JTable tabela) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0); // Limpa a tabela antes de inserir os dados

        try (BufferedReader leitor = new BufferedReader(new FileReader(nome_arquivo))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split("--"); // Divide a linha pelas vírgulas de acordo como está sendo salvo no arquivo
                if (dados.length >= 6) { // Garante que há 5 colunas
                    modelo.addRow(dados); // Adiciona a linha à tabela
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void carregarVagasTabelaFiltrada(JTable tabela, String area, String horario, String valor) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setRowCount(0);

        int valorMinimo = Integer.MIN_VALUE;
        int valorMaximo = Integer.MAX_VALUE;

        // Define o intervalo de valores com base na seleção do usuário
        if (valor.equals("500-1000")) {
            valorMinimo = 500;
            valorMaximo = 1000;
        } else if (valor.equals("1000-1500")) {
            valorMinimo = 1000;
            valorMaximo = 1500;
        } else if (valor.equals("1500-2000")) {
            valorMinimo = 1500;
            valorMaximo = 2000;
        } else if (valor.equals("2000 +")) {
            valorMinimo = 2000;
            valorMaximo = Integer.MAX_VALUE; // Para valores acima de 2000
        }

        try (BufferedReader leitor = new BufferedReader(new FileReader(nome_arquivo))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split("--");  // Divide a linha pelas vírgulas

                if (dados.length >= 6) {  // Verifica se há pelo menos 6 colunas de dados
                    String areaArquivo = dados[3].trim();    // A área está na coluna 4 (índice 3)
                    String valorArquivoStr = dados[4].trim();   // O valor está na coluna 5 (índice 4)
                    String horarioArquivo = dados[5].trim(); // O horário está na coluna 6 (índice 5)

                    // Converte o valor do arquivo para um número inteiro
                    Integer valorArquivo = null;
                    try {
                        valorArquivo = Integer.parseInt(valorArquivoStr);  // Converte o valor para inteiro
                    } catch (NumberFormatException e) {
                        System.out.println("Erro ao tentar converter o valor para número: " + valorArquivoStr);
                        continue;  // Se não for possível converter, pula essa linha
                    }

                    // Comparação de valor: verifica se o valor do arquivo está dentro do intervalo selecionado
                    boolean valorMatch = valor.equals("Todos") || valorArquivo >= valorMinimo && valorArquivo <= valorMaximo;

                    // Comparação de área: caso o filtro seja "Todos", aceita qualquer área
                    boolean areaMatch = area.equals("Todos") || area.equals(areaArquivo);

                    // Comparação de horário: caso o filtro seja "Todos", aceita qualquer horário
                    boolean horarioMatch = horario.equals("Todos") || horario.equals(horarioArquivo);

                    // Se a área, o valor e o horário corresponderem, adiciona à tabela
                    if (areaMatch && valorMatch && horarioMatch) {
                        modelo.addRow(dados);  // Adiciona a linha inteira à tabela se corresponder
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean carregaVagaPesquisada(String Id, JTextField nomeVg, JTextField empresaVg, JComboBox<String> areaVg, JTextField salarioVg, JComboBox<String> turnoVg, JTextArea descricaoVg) {
        try (BufferedReader leitor = new BufferedReader(new FileReader(nome_arquivo))) {
            String linha;

            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split("--"); // Divide a linha pelas vírgulas de acordo como está sendo salvo no arquivo
                if (dados.length >= 7 && dados[0].equals(Id)) {
                    nomeVg.setText(dados[1]);
                    empresaVg.setText(dados[2]);
                    areaVg.setSelectedItem(dados[3]);
                    salarioVg.setText(dados[4]);
                    turnoVg.setSelectedItem(dados[5]);
                    descricaoVg.setText(dados[6]);
                    return true;
                }
            }
            JOptionPane.showMessageDialog(null, "Vaga não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void removerVagaPesquisada(String aux) {
        File arquivo = new File(nome_arquivo);
        ArrayList<String> linhas = new ArrayList<>();

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            boolean encontrado = false;

            // Ler todo o conteúdo do arquivo e adicionar na lista
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split("--");
                if (dados.length >= 7 && dados[0].equals(aux)) {
                    encontrado = true; // Encontramos a vaga que queremos remover
                    continue; // Ignorar a linha que queremos remover
                }
                linhas.add(linha); // Adiciona a linha que não deve ser removida
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Vaga não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                // Reescrever o arquivo com as linhas restantes
                try (BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivo))) {
                    for (String linhaFinal : linhas) {
                        escritor.write(linhaFinal);
                        escritor.newLine();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ajustarIDs() {
        ArrayList<String> linhas = new ArrayList<>();
        int novoID = 1; // O ID começa de 1

        try (BufferedReader leitor = new BufferedReader(new FileReader(nome_arquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dados = linha.split("--", 7);
                if (dados.length > 0) {
                    try {
                        int idAtual = Integer.parseInt(dados[0]);

                        // Verifica se os IDs estão contínuos. Caso contrário, ajusta
                        if (idAtual >= novoID) {
                            novoID = idAtual + 1; // Próximo ID será o maior encontrado + 1
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro ao converter ID: " + dados[0]);
                    }
                }
                linhas.add(linha); // Guarda todas as linhas do arquivo
            }
        } catch (IOException e) {
            System.out.println("Arquivo ainda não criado. Começando com ID 1.");
        }

        // Ajusta o próximo ID de forma sequencial sem lacunas
        int contadorID = 1; // Começa com o ID 1

        // Reescreve os IDs de volta no arquivo, caso haja alguma lacuna
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nome_arquivo))) {
            for (String linha : linhas) {
                String[] dados = linha.split("--", 7);
                if (dados.length > 0) {
                    // Reformula os IDs de maneira contínua
                    dados[0] = String.valueOf(contadorID);
                    escritor.write(String.join("--", dados));
                    escritor.newLine();
                    contadorID++; // Incrementa o ID para o próximo
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
