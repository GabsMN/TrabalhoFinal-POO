package interfaceDeUso;

import corpoPrograma.Principal;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Nascimento, Guilherme Dias, Pedro Henrique Oliveira, Maria
 * Luiza, Luca Magni
 */
public class PaginaInicial extends javax.swing.JFrame {

    public PaginaInicial() {
        initComponents();
        setTitle("VagasExpress");
        controle = new Principal(painelPrincipal); // É preciso passar o painel no construtor por causa da verificação da senha
        controle.carregarVagasTabela(TableFiltro);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        painelPrincipal = new javax.swing.JPanel();
        paginaPrincipal = new javax.swing.JPanel();
        TitlePag = new javax.swing.JLabel();
        BotaoAluno = new javax.swing.JButton();
        BotaoAdm = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        paginaFiltro = new javax.swing.JPanel();
        BotaoLupa = new javax.swing.JButton();
        SlcArea = new javax.swing.JComboBox<>();
        SlcHora = new javax.swing.JComboBox<>();
        SlcValor = new javax.swing.JComboBox<>();
        BotaoVoltar = new javax.swing.JButton();
        TitleFiltro = new javax.swing.JLabel();
        IntrFiltro = new javax.swing.JLabel();
        IDFiltro = new javax.swing.JTextField();
        VisualFiltro = new javax.swing.JButton();
        ScrollTable = new javax.swing.JScrollPane();
        TableFiltro = new javax.swing.JTable();
        labelAreaFiltro = new javax.swing.JLabel();
        labelTurnoFiltro = new javax.swing.JLabel();
        labelSalFiltro = new javax.swing.JLabel();
        paginaAdm = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BotaoAdc = new javax.swing.JButton();
        BotaoEditar = new javax.swing.JButton();
        BotaoRmv = new javax.swing.JButton();
        BotaoVoltarAdm = new javax.swing.JButton();
        TitleAdm = new javax.swing.JLabel();
        paginaAdc = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        TitleAdc = new javax.swing.JLabel();
        TitleNome = new javax.swing.JLabel();
        NomeVg = new javax.swing.JTextField();
        TitleArea = new javax.swing.JLabel();
        AreaCad = new javax.swing.JComboBox<>();
        TitleSal = new javax.swing.JLabel();
        SalarioCad = new javax.swing.JTextField();
        TitleHora = new javax.swing.JLabel();
        HorarioCad = new javax.swing.JComboBox<>();
        BotaoCancel = new javax.swing.JButton();
        BotaoCadastra = new javax.swing.JButton();
        TitleEmpresa = new javax.swing.JLabel();
        NomeEmpresa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TexCad = new javax.swing.JTextArea();
        paginaRemove = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        BotaoLupaRmv = new javax.swing.JButton();
        SlcAreaRmv = new javax.swing.JComboBox<>();
        SlcHoraRmv = new javax.swing.JComboBox<>();
        SlcValorRmv = new javax.swing.JComboBox<>();
        TitleRmv = new javax.swing.JLabel();
        IntrRmv = new javax.swing.JLabel();
        IDRmv = new javax.swing.JTextField();
        RemoveVg = new javax.swing.JButton();
        BotaoVoltarRmv = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableRmv = new javax.swing.JTable();
        labelAreaRmv = new javax.swing.JLabel();
        labelTurnoRvm = new javax.swing.JLabel();
        labelSalRmv = new javax.swing.JLabel();
        paginaEdit = new javax.swing.JPanel();
        SlcAreaEdit = new javax.swing.JComboBox<>();
        SlcHoraEdit = new javax.swing.JComboBox<>();
        SlcValorEdit = new javax.swing.JComboBox<>();
        TitleEdit = new javax.swing.JLabel();
        IntrEdit = new javax.swing.JLabel();
        IDEdit = new javax.swing.JTextField();
        EditVg = new javax.swing.JButton();
        BotaoVoltarEdit = new javax.swing.JButton();
        BotaoLupaEdit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableEdit = new javax.swing.JTable();
        labelAreaEdt = new javax.swing.JLabel();
        labelTurnoEdt = new javax.swing.JLabel();
        labelSalEdt = new javax.swing.JLabel();
        paginaVagaPesquisada = new javax.swing.JPanel();
        TituloVgPes = new javax.swing.JLabel();
        NomeVgPes = new javax.swing.JLabel();
        nomeVg = new javax.swing.JTextField();
        EmpresaVgPes = new javax.swing.JLabel();
        empresaVg = new javax.swing.JTextField();
        AreaVgPes = new javax.swing.JLabel();
        TurnoVgPes = new javax.swing.JLabel();
        SalarioVgPes = new javax.swing.JLabel();
        salarioVg = new javax.swing.JTextField();
        DescricaoVgPes = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        descricaoVg = new javax.swing.JTextArea();
        BotaoVoltarVg = new javax.swing.JButton();
        areaVg = new javax.swing.JComboBox<>();
        turnoVg = new javax.swing.JComboBox<>();
        paginaEditar = new javax.swing.JPanel();
        TitleEdtVg = new javax.swing.JLabel();
        SalarioVgEdt = new javax.swing.JLabel();
        salarioEdtVg = new javax.swing.JTextField();
        DescricaoVgEdt = new javax.swing.JLabel();
        NomeVgEdt = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        descricaoEdtVg = new javax.swing.JTextArea();
        nomeEdtVg = new javax.swing.JTextField();
        EmpresaVgEdt = new javax.swing.JLabel();
        empresaEdtVg = new javax.swing.JTextField();
        AreaVgEdt = new javax.swing.JLabel();
        TurnoVgEdt = new javax.swing.JLabel();
        BotaoCancelEdt = new javax.swing.JButton();
        BotaoEdtVg = new javax.swing.JButton();
        areaEdtVg = new javax.swing.JComboBox<>();
        turnoEdtVg = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelPrincipal.setLayout(new java.awt.CardLayout());

        paginaPrincipal.setBackground(new java.awt.Color(255, 228, 196));
        paginaPrincipal.setPreferredSize(new java.awt.Dimension(700, 600));

        TitlePag.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TitlePag.setText("Bem vindo ao VagasExpress!");

        BotaoAluno.setBackground(new java.awt.Color(46, 139, 87));
        BotaoAluno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoAluno.setText("Aluno");
        BotaoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlunoActionPerformed(evt);
            }
        });

        BotaoAdm.setBackground(new java.awt.Color(46, 139, 87));
        BotaoAdm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoAdm.setText("Administrar");
        BotaoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdmActionPerformed(evt);
            }
        });

        BotaoSair.setBackground(new java.awt.Color(255, 0, 0));
        BotaoSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoSair.setText("Sair");
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paginaPrincipalLayout = new javax.swing.GroupLayout(paginaPrincipal);
        paginaPrincipal.setLayout(paginaPrincipalLayout);
        paginaPrincipalLayout.setHorizontalGroup(
            paginaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paginaPrincipalLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(TitlePag)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paginaPrincipalLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(BotaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paginaPrincipalLayout.createSequentialGroup()
                .addContainerGap(290, Short.MAX_VALUE)
                .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        paginaPrincipalLayout.setVerticalGroup(
            paginaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paginaPrincipalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(TitlePag)
                .addGap(170, 170, 170)
                .addGroup(paginaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        painelPrincipal.add(paginaPrincipal, "card2");

        paginaFiltro.setBackground(new java.awt.Color(255, 228, 196));
        paginaFiltro.setPreferredSize(new java.awt.Dimension(700, 600));

        BotaoLupa.setBackground(new java.awt.Color(60, 179, 113));
        BotaoLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loupe.png"))); // NOI18N
        BotaoLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLupaActionPerformed(evt);
            }
        });

        SlcArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Computação", "Direito", "Administração", "Mecânica" }));

        SlcHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Manhã", "Tarde", "Noite" }));

        SlcValor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "500-1000", "1000-1500", "1500-2000", "2000 +" }));

        BotaoVoltar.setBackground(new java.awt.Color(176, 224, 230));
        BotaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });

        TitleFiltro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleFiltro.setText("Filtre entre as vagas disponíveis:");

        IntrFiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IntrFiltro.setText("Digite o ID da vaga:");

        VisualFiltro.setBackground(new java.awt.Color(60, 179, 113));
        VisualFiltro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loupe.png"))); // NOI18N
        VisualFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualFiltroActionPerformed(evt);
            }
        });

        ScrollTable.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        TableFiltro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Empresa", "Área", "Salário (R$)", "Turno"
            }
        ));
        ScrollTable.setViewportView(TableFiltro);

        labelAreaFiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAreaFiltro.setText("Área :");

        labelTurnoFiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTurnoFiltro.setText("Turno :");

        labelSalFiltro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelSalFiltro.setText("Salário :");

        javax.swing.GroupLayout paginaFiltroLayout = new javax.swing.GroupLayout(paginaFiltro);
        paginaFiltro.setLayout(paginaFiltroLayout);
        paginaFiltroLayout.setHorizontalGroup(
            paginaFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paginaFiltroLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(paginaFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleFiltro)
                    .addComponent(ScrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paginaFiltroLayout.createSequentialGroup()
                        .addComponent(BotaoLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(paginaFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SlcArea, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAreaFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(paginaFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SlcHora, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTurnoFiltro))
                        .addGap(18, 18, 18)
                        .addGroup(paginaFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SlcValor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSalFiltro)))
                    .addGroup(paginaFiltroLayout.createSequentialGroup()
                        .addGroup(paginaFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paginaFiltroLayout.createSequentialGroup()
                                .addComponent(IntrFiltro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paginaFiltroLayout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(VisualFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        paginaFiltroLayout.setVerticalGroup(
            paginaFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paginaFiltroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TitleFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paginaFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAreaFiltro)
                    .addComponent(labelTurnoFiltro)
                    .addComponent(labelSalFiltro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paginaFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoLupa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SlcArea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SlcHora, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SlcValor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ScrollTable, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(paginaFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paginaFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IntrFiltro)
                        .addComponent(IDFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(VisualFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelPrincipal.add(paginaFiltro, "card3");

        paginaAdm.setBackground(new java.awt.Color(255, 228, 196));
        paginaAdm.setPreferredSize(new java.awt.Dimension(700, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BotaoAdc.setBackground(new java.awt.Color(46, 139, 87));
        BotaoAdc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoAdc.setText("Adicionar");
        BotaoAdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdcActionPerformed(evt);
            }
        });

        BotaoEditar.setBackground(new java.awt.Color(64, 224, 208));
        BotaoEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoEditar.setText("Editar");
        BotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarActionPerformed(evt);
            }
        });

        BotaoRmv.setBackground(new java.awt.Color(255, 0, 0));
        BotaoRmv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoRmv.setText("Remover");
        BotaoRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoRmvActionPerformed(evt);
            }
        });

        BotaoVoltarAdm.setBackground(new java.awt.Color(176, 224, 230));
        BotaoVoltarAdm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotaoVoltarAdm.setText("Voltar");
        BotaoVoltarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoAdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoRmv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoVoltarAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(BotaoAdc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(BotaoRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(BotaoVoltarAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        TitleAdm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleAdm.setText("Bem vindo a central de cadastro!");

        javax.swing.GroupLayout paginaAdmLayout = new javax.swing.GroupLayout(paginaAdm);
        paginaAdm.setLayout(paginaAdmLayout);
        paginaAdmLayout.setHorizontalGroup(
            paginaAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paginaAdmLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(paginaAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
        );
        paginaAdmLayout.setVerticalGroup(
            paginaAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paginaAdmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleAdm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        painelPrincipal.add(paginaAdm, "card4");

        paginaAdc.setBackground(new java.awt.Color(255, 228, 196));
        paginaAdc.setPreferredSize(new java.awt.Dimension(700, 600));

        jPanel2.setBackground(new java.awt.Color(255, 228, 196));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 600));

        TitleAdc.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TitleAdc.setText("Adicione as informações:");

        TitleNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TitleNome.setText("Nome :");

        TitleArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TitleArea.setText("Área :");

        AreaCad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computação", "Direito", "Administração", "Mecânica" }));

        TitleSal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TitleSal.setText("Salário(R$) :");

        TitleHora.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TitleHora.setText("Horário :");

        HorarioCad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));

        BotaoCancel.setBackground(new java.awt.Color(255, 0, 0));
        BotaoCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoCancel.setText("Cancelar");
        BotaoCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelActionPerformed(evt);
            }
        });

        BotaoCadastra.setBackground(new java.awt.Color(60, 179, 113));
        BotaoCadastra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoCadastra.setText("Cadastrar");
        BotaoCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastraActionPerformed(evt);
            }
        });

        TitleEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TitleEmpresa.setText("Empresa :");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Descrição :");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        TexCad.setColumns(20);
        TexCad.setLineWrap(true);
        TexCad.setRows(5);
        TexCad.setWrapStyleWord(true);
        jScrollPane4.setViewportView(TexCad);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(TitleAdc)
                .addContainerGap(255, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 180, Short.MAX_VALUE)
                .addComponent(BotaoCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(BotaoCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TitleSal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SalarioCad))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TitleNome)
                            .addComponent(TitleArea))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeVg)
                            .addComponent(AreaCad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TitleEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NomeEmpresa))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TitleHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HorarioCad, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(106, 106, 106))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleAdc)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleNome)
                    .addComponent(NomeVg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleEmpresa)
                    .addComponent(NomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleArea)
                    .addComponent(AreaCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleSal)
                    .addComponent(SalarioCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TitleHora)
                    .addComponent(HorarioCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout paginaAdcLayout = new javax.swing.GroupLayout(paginaAdc);
        paginaAdc.setLayout(paginaAdcLayout);
        paginaAdcLayout.setHorizontalGroup(
            paginaAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paginaAdcLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        paginaAdcLayout.setVerticalGroup(
            paginaAdcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paginaAdcLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelPrincipal.add(paginaAdc, "card5");

        paginaRemove.setPreferredSize(new java.awt.Dimension(700, 600));

        jPanel3.setBackground(new java.awt.Color(255, 228, 196));

        BotaoLupaRmv.setBackground(new java.awt.Color(60, 179, 113));
        BotaoLupaRmv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loupe.png"))); // NOI18N
        BotaoLupaRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLupaRmvActionPerformed(evt);
            }
        });

        SlcAreaRmv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Computação", "Direito", "Administração", "Mecânica" }));

        SlcHoraRmv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Manhã", "Tarde", "Noite" }));

        SlcValorRmv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "500-1000", "1000-1500", "1500-2000", "2000 +" }));

        TitleRmv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleRmv.setText("Filtre entre as vagas disponíveis:");

        IntrRmv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IntrRmv.setText("Digite o ID da vaga:");

        RemoveVg.setBackground(new java.awt.Color(255, 0, 0));
        RemoveVg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trash-can.png"))); // NOI18N
        RemoveVg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveVgActionPerformed(evt);
            }
        });

        BotaoVoltarRmv.setBackground(new java.awt.Color(176, 224, 230));
        BotaoVoltarRmv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoVoltarRmv.setText("Voltar");
        BotaoVoltarRmv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarRmvActionPerformed(evt);
            }
        });

        TableRmv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Empresa", "Área", "Salário (R$)", "Turno"
            }
        ));
        jScrollPane5.setViewportView(TableRmv);

        labelAreaRmv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAreaRmv.setText("Área :");

        labelTurnoRvm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTurnoRvm.setText("Turno :");

        labelSalRmv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelSalRmv.setText("Salário :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoVoltarRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(257, 257, 257))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(IntrRmv)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(IDRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(RemoveVg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(BotaoLupaRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SlcAreaRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelAreaRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SlcHoraRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelTurnoRvm))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SlcValorRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelSalRmv))))
                    .addComponent(TitleRmv))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TitleRmv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAreaRmv)
                    .addComponent(labelTurnoRvm)
                    .addComponent(labelSalRmv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoLupaRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SlcAreaRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SlcHoraRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SlcValorRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RemoveVg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IntrRmv)
                        .addComponent(IDRmv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoVoltarRmv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout paginaRemoveLayout = new javax.swing.GroupLayout(paginaRemove);
        paginaRemove.setLayout(paginaRemoveLayout);
        paginaRemoveLayout.setHorizontalGroup(
            paginaRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paginaRemoveLayout.setVerticalGroup(
            paginaRemoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelPrincipal.add(paginaRemove, "card6");

        paginaEdit.setBackground(new java.awt.Color(255, 228, 196));
        paginaEdit.setPreferredSize(new java.awt.Dimension(700, 600));

        SlcAreaEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Computação", "Direito", "Administração", "Mecânica" }));

        SlcHoraEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Manhã", "Tarde", "Noite", " " }));

        SlcValorEdit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "500-1000", "1000-1500", "1500-2000", "2000 +" }));

        TitleEdit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleEdit.setText("Filtre entre as vagas disponíveis:");

        IntrEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IntrEdit.setText("Digite o ID da vaga:");

        EditVg.setBackground(new java.awt.Color(60, 179, 113));
        EditVg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        EditVg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditVgActionPerformed(evt);
            }
        });

        BotaoVoltarEdit.setBackground(new java.awt.Color(176, 224, 230));
        BotaoVoltarEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoVoltarEdit.setText("Voltar");
        BotaoVoltarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarEditActionPerformed(evt);
            }
        });

        BotaoLupaEdit.setBackground(new java.awt.Color(60, 179, 113));
        BotaoLupaEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/loupe.png"))); // NOI18N
        BotaoLupaEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLupaEditActionPerformed(evt);
            }
        });

        TableEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Empresa", "Área", "Salário (R$)", "Turno"
            }
        ));
        jScrollPane3.setViewportView(TableEdit);

        labelAreaEdt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAreaEdt.setText("Área :");

        labelTurnoEdt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelTurnoEdt.setText("Turno :");

        labelSalEdt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelSalEdt.setText("Salário :");

        javax.swing.GroupLayout paginaEditLayout = new javax.swing.GroupLayout(paginaEdit);
        paginaEdit.setLayout(paginaEditLayout);
        paginaEditLayout.setHorizontalGroup(
            paginaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paginaEditLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(paginaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paginaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(paginaEditLayout.createSequentialGroup()
                            .addComponent(IntrEdit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(IDEdit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(EditVg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paginaEditLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(BotaoVoltarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TitleEdit)
                    .addGroup(paginaEditLayout.createSequentialGroup()
                        .addComponent(BotaoLupaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(paginaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SlcAreaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAreaEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(paginaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SlcHoraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTurnoEdt))
                        .addGap(18, 18, 18)
                        .addGroup(paginaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SlcValorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSalEdt))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        paginaEditLayout.setVerticalGroup(
            paginaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paginaEditLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(TitleEdit)
                .addGap(7, 7, 7)
                .addGroup(paginaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAreaEdt)
                    .addComponent(labelTurnoEdt)
                    .addComponent(labelSalEdt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paginaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoLupaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SlcAreaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SlcHoraEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SlcValorEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(paginaEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IntrEdit)
                    .addComponent(IDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditVg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoVoltarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelPrincipal.add(paginaEdit, "card7");

        paginaVagaPesquisada.setBackground(new java.awt.Color(255, 228, 196));

        TituloVgPes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloVgPes.setText("Vaga Pesquisada :");

        NomeVgPes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NomeVgPes.setText("Nome :");

        nomeVg.setEditable(false);

        EmpresaVgPes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EmpresaVgPes.setText("Empresa :");

        empresaVg.setEditable(false);

        AreaVgPes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AreaVgPes.setText("Área :");

        TurnoVgPes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TurnoVgPes.setText("Turno :");

        SalarioVgPes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SalarioVgPes.setText("Salário(R$) :");

        salarioVg.setEditable(false);

        DescricaoVgPes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DescricaoVgPes.setText("Descrição :");

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        descricaoVg.setEditable(false);
        descricaoVg.setColumns(20);
        descricaoVg.setLineWrap(true);
        descricaoVg.setRows(5);
        descricaoVg.setWrapStyleWord(true);
        jScrollPane6.setViewportView(descricaoVg);

        BotaoVoltarVg.setBackground(new java.awt.Color(176, 224, 230));
        BotaoVoltarVg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoVoltarVg.setText("Voltar");
        BotaoVoltarVg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarVgActionPerformed(evt);
            }
        });

        areaVg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computação", "Direito", "Administração", "Mecânica" }));
        areaVg.setEnabled(false);

        turnoVg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));
        turnoVg.setEnabled(false);

        javax.swing.GroupLayout paginaVagaPesquisadaLayout = new javax.swing.GroupLayout(paginaVagaPesquisada);
        paginaVagaPesquisada.setLayout(paginaVagaPesquisadaLayout);
        paginaVagaPesquisadaLayout.setHorizontalGroup(
            paginaVagaPesquisadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paginaVagaPesquisadaLayout.createSequentialGroup()
                .addGroup(paginaVagaPesquisadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paginaVagaPesquisadaLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(TituloVgPes))
                    .addGroup(paginaVagaPesquisadaLayout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(BotaoVoltarVg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paginaVagaPesquisadaLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(paginaVagaPesquisadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paginaVagaPesquisadaLayout.createSequentialGroup()
                                .addComponent(AreaVgPes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(areaVg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(paginaVagaPesquisadaLayout.createSequentialGroup()
                                .addComponent(EmpresaVgPes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empresaVg))
                            .addGroup(paginaVagaPesquisadaLayout.createSequentialGroup()
                                .addComponent(NomeVgPes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeVg, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paginaVagaPesquisadaLayout.createSequentialGroup()
                                .addComponent(TurnoVgPes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(turnoVg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(paginaVagaPesquisadaLayout.createSequentialGroup()
                                .addComponent(SalarioVgPes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salarioVg))
                            .addGroup(paginaVagaPesquisadaLayout.createSequentialGroup()
                                .addComponent(DescricaoVgPes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        paginaVagaPesquisadaLayout.setVerticalGroup(
            paginaVagaPesquisadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paginaVagaPesquisadaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(TituloVgPes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(paginaVagaPesquisadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeVgPes)
                    .addComponent(nomeVg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paginaVagaPesquisadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpresaVgPes)
                    .addComponent(empresaVg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paginaVagaPesquisadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AreaVgPes)
                    .addComponent(areaVg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paginaVagaPesquisadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalarioVgPes)
                    .addComponent(salarioVg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paginaVagaPesquisadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TurnoVgPes)
                    .addComponent(turnoVg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paginaVagaPesquisadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescricaoVgPes)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(BotaoVoltarVg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        painelPrincipal.add(paginaVagaPesquisada, "card8");

        paginaEditar.setBackground(new java.awt.Color(255, 228, 196));

        TitleEdtVg.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleEdtVg.setText("Edite a vaga :");

        SalarioVgEdt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SalarioVgEdt.setText("Salário :");

        DescricaoVgEdt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DescricaoVgEdt.setText("Descrição :");

        NomeVgEdt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NomeVgEdt.setText("Nome :");

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        descricaoEdtVg.setColumns(20);
        descricaoEdtVg.setLineWrap(true);
        descricaoEdtVg.setRows(5);
        descricaoEdtVg.setWrapStyleWord(true);
        jScrollPane7.setViewportView(descricaoEdtVg);

        EmpresaVgEdt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EmpresaVgEdt.setText("Empresa :");

        AreaVgEdt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AreaVgEdt.setText("Área :");

        TurnoVgEdt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TurnoVgEdt.setText("Turno :");

        BotaoCancelEdt.setBackground(new java.awt.Color(255, 0, 0));
        BotaoCancelEdt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoCancelEdt.setText("Cancelar");
        BotaoCancelEdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelEdtActionPerformed(evt);
            }
        });

        BotaoEdtVg.setBackground(new java.awt.Color(60, 179, 113));
        BotaoEdtVg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotaoEdtVg.setText("Editar");
        BotaoEdtVg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEdtVgActionPerformed(evt);
            }
        });

        areaEdtVg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computação", "Direito", "Administração", "Mecânica" }));

        turnoEdtVg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));

        javax.swing.GroupLayout paginaEditarLayout = new javax.swing.GroupLayout(paginaEditar);
        paginaEditar.setLayout(paginaEditarLayout);
        paginaEditarLayout.setHorizontalGroup(
            paginaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paginaEditarLayout.createSequentialGroup()
                .addGroup(paginaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paginaEditarLayout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(TitleEdtVg))
                    .addGroup(paginaEditarLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(paginaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(paginaEditarLayout.createSequentialGroup()
                                .addComponent(AreaVgEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(areaEdtVg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(paginaEditarLayout.createSequentialGroup()
                                .addComponent(EmpresaVgEdt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empresaEdtVg))
                            .addGroup(paginaEditarLayout.createSequentialGroup()
                                .addComponent(NomeVgEdt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeEdtVg, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paginaEditarLayout.createSequentialGroup()
                                .addComponent(TurnoVgEdt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(turnoEdtVg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(paginaEditarLayout.createSequentialGroup()
                                .addComponent(SalarioVgEdt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salarioEdtVg))
                            .addGroup(paginaEditarLayout.createSequentialGroup()
                                .addComponent(DescricaoVgEdt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(paginaEditarLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(BotaoCancelEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(BotaoEdtVg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        paginaEditarLayout.setVerticalGroup(
            paginaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paginaEditarLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(TitleEdtVg)
                .addGap(18, 18, 18)
                .addGroup(paginaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeVgEdt)
                    .addComponent(nomeEdtVg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paginaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpresaVgEdt)
                    .addComponent(empresaEdtVg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paginaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AreaVgEdt)
                    .addComponent(areaEdtVg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paginaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalarioVgEdt)
                    .addComponent(salarioEdtVg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paginaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TurnoVgEdt)
                    .addComponent(turnoEdtVg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paginaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescricaoVgEdt)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(paginaEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCancelEdt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoEdtVg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        painelPrincipal.add(paginaEditar, "card9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void BotaoAlunoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        CardLayout troca = (CardLayout) painelPrincipal.getLayout(); // Vai da pg Principal para a pg de Filtro
        controle.carregarVagasTabela(TableFiltro);
        troca.show(painelPrincipal, "card3");
    }                                          

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {                                          
        System.exit(0);
    }                                         

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        CardLayout troca = (CardLayout) painelPrincipal.getLayout(); // Vai da pg de Filtro para a pg Principal
        troca.show(painelPrincipal, "card2");
    }                                           

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        CardLayout troca = (CardLayout) painelPrincipal.getLayout();
        controle.carregarVagasTabela(TableEdit);
        troca.show(painelPrincipal, "card7");
    }                                           

    private void BotaoAdcActionPerformed(java.awt.event.ActionEvent evt) {                                         
        CardLayout troca = (CardLayout) painelPrincipal.getLayout();
        troca.show(painelPrincipal, "card5");
    }                                        

    private void BotaoRmvActionPerformed(java.awt.event.ActionEvent evt) {                                         
        CardLayout troca = (CardLayout) painelPrincipal.getLayout();
        controle.carregarVagasTabela(TableRmv);
        troca.show(painelPrincipal, "card6");
    }                                        

    private void BotaoVoltarAdmActionPerformed(java.awt.event.ActionEvent evt) {                                               
        CardLayout troca = (CardLayout) painelPrincipal.getLayout(); // Vai da pg de Adm para a pg Principal
        troca.show(painelPrincipal, "card2");
    }                                              

    private void BotaoAdmActionPerformed(java.awt.event.ActionEvent evt) {                                         
        controle.verificaSenha();
    }                                        

    private void BotaoCancelActionPerformed(java.awt.event.ActionEvent evt) {                                            
        CardLayout troca = (CardLayout) painelPrincipal.getLayout();
        troca.show(painelPrincipal, "card4");
    }                                           

    private void BotaoVoltarRmvActionPerformed(java.awt.event.ActionEvent evt) {                                               
        CardLayout troca = (CardLayout) painelPrincipal.getLayout();
        troca.show(painelPrincipal, "card4");
    }                                              

    private void BotaoVoltarEditActionPerformed(java.awt.event.ActionEvent evt) {                                                
        CardLayout troca = (CardLayout) painelPrincipal.getLayout();
        troca.show(painelPrincipal, "card4");
    }                                               

    private void BotaoCadastraActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String nome = NomeVg.getText();
        String empresa = NomeEmpresa.getText();
        String area = (String) AreaCad.getSelectedItem();
        String salario = SalarioCad.getText();
        String horario = (String) HorarioCad.getSelectedItem();
        String descricao = TexCad.getText();
        if (nome.isEmpty() || empresa.isEmpty() || salario.isEmpty() || descricao.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
        } else {
            controle.cadastrarVaga(nome, empresa, area, salario, horario, descricao);
            JOptionPane.showMessageDialog(this, "Vaga cadastrada com sucesso!");

            //Limpa os textField após pegar a informação
            NomeVg.setText("");
            NomeEmpresa.setText("");
            SalarioCad.setText("");
            TexCad.setText("");

            CardLayout troca = (CardLayout) painelPrincipal.getLayout();
            troca.show(painelPrincipal, "card4");
        }
    }                                             

    private void RemoveVgActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String Aux = IDRmv.getText();
        controle.removerVagaPesquisada(Aux);
        IDRmv.setText("");
        controle.ajustarIDs();
        controle.carregarVagasTabela(TableRmv);
    }                                        

    private void VisualFiltroActionPerformed(java.awt.event.ActionEvent evt) {                                             
        CardLayout troca = (CardLayout) painelPrincipal.getLayout();
        String Id = IDFiltro.getText();
        if (Id.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o ID.");
        } else {
            boolean resultado = controle.carregaVagaPesquisada(Id, nomeVg, empresaVg, areaVg, salarioVg, turnoVg, descricaoVg);
            if (resultado) {
                troca.show(painelPrincipal, "card8");
            }
        }
    }                                            

    private void BotaoLupaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Obter os valores selecionados nos componentes
        String areaSelecionada = SlcArea.getSelectedItem().toString();
        String horarioSelecionado = SlcHora.getSelectedItem().toString();
        String valorSelecionado = SlcValor.getSelectedItem().toString();

        // Chamar a função que carrega os dados filtrados na tabela
        //ATENÇÃO AO ESCREVER APOS MUDANCA NA INTERFACE MUDA O TABLEFILTRO POR TABLEREMOVE
        controle.carregarVagasTabelaFiltrada(TableFiltro, areaSelecionada, horarioSelecionado, valorSelecionado);
    }                                         

    private void BotaoLupaEditActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // Obter os valores selecionados nos componentes
        String areaSelecionadaEdit = SlcAreaEdit.getSelectedItem().toString();
        String horarioSelecionadoEdit = SlcHoraEdit.getSelectedItem().toString();
        String valorSelecionadoEdit = SlcValorEdit.getSelectedItem().toString();

        // Chamar a função que carrega os dados filtrados na tabela
        controle.carregarVagasTabelaFiltrada(TableEdit, areaSelecionadaEdit, horarioSelecionadoEdit, valorSelecionadoEdit);
    }                                             

    private void EditVgActionPerformed(java.awt.event.ActionEvent evt) {                                       
        CardLayout troca = (CardLayout) painelPrincipal.getLayout();
        String Id = IDEdit.getText();
        if (Id.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha o ID.");
        } else {
            boolean resultado = controle.carregaVagaPesquisada(Id, nomeEdtVg, empresaEdtVg, areaEdtVg, salarioEdtVg, turnoEdtVg, descricaoEdtVg);
            if (resultado) {
                troca.show(painelPrincipal, "card9");
            }
        }
    }                                      

    private void BotaoLupaRmvActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // Obter os valores selecionados nos componentes
        String areaSelecionadaRmv = SlcAreaRmv.getSelectedItem().toString();
        String horarioSelecionadoRvm = SlcHoraRmv.getSelectedItem().toString();
        String valorSelecionadoRmv = SlcValorRmv.getSelectedItem().toString();

        // Chamar a função que carrega os dados filtrados na tabela
        controle.carregarVagasTabelaFiltrada(TableEdit, areaSelecionadaRmv, horarioSelecionadoRvm, valorSelecionadoRmv);
    }                                            

    private void BotaoVoltarVgActionPerformed(java.awt.event.ActionEvent evt) {                                              
        CardLayout troca = (CardLayout) painelPrincipal.getLayout();
        IDFiltro.setText("");
        troca.show(painelPrincipal, "card3");
    }                                             

    private void BotaoCancelEdtActionPerformed(java.awt.event.ActionEvent evt) {                                               
        CardLayout troca = (CardLayout) painelPrincipal.getLayout();
        IDEdit.setText("");
        troca.show(painelPrincipal, "card7");
    }                                              

    private void BotaoEdtVgActionPerformed(java.awt.event.ActionEvent evt) {                                           
        CardLayout troca = (CardLayout) painelPrincipal.getLayout();

        String nome = nomeEdtVg.getText();
        String empresa = empresaEdtVg.getText();
        String area = (String) areaEdtVg.getSelectedItem();
        String salario = salarioEdtVg.getText();
        String horario = (String) turnoEdtVg.getSelectedItem();
        String descricao = descricaoEdtVg.getText();

        if (nome.isEmpty() || empresa.isEmpty() || salario.isEmpty() || descricao.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
        } else {
            String id = IDEdit.getText();
            controle.removerVagaPesquisada(id);
            controle.cadastrarVaga(nome, empresa, area, salario, horario, descricao);
            JOptionPane.showMessageDialog(this, "Vaga cadastrada com sucesso!");
            controle.ajustarIDs();
            controle.carregarVagasTabela(TableEdit);
            IDEdit.setText("");
            troca.show(painelPrincipal, "card7");
        }
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial().setVisible(true);
            }
        });
    }

    Principal controle;
    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> AreaCad;
    private javax.swing.JLabel AreaVgEdt;
    private javax.swing.JLabel AreaVgPes;
    private javax.swing.JButton BotaoAdc;
    private javax.swing.JButton BotaoAdm;
    private javax.swing.JButton BotaoAluno;
    private javax.swing.JButton BotaoCadastra;
    private javax.swing.JButton BotaoCancel;
    private javax.swing.JButton BotaoCancelEdt;
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton BotaoEdtVg;
    private javax.swing.JButton BotaoLupa;
    private javax.swing.JButton BotaoLupaEdit;
    private javax.swing.JButton BotaoLupaRmv;
    private javax.swing.JButton BotaoRmv;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JButton BotaoVoltarAdm;
    private javax.swing.JButton BotaoVoltarEdit;
    private javax.swing.JButton BotaoVoltarRmv;
    private javax.swing.JButton BotaoVoltarVg;
    private javax.swing.JLabel DescricaoVgEdt;
    private javax.swing.JLabel DescricaoVgPes;
    private javax.swing.JButton EditVg;
    private javax.swing.JLabel EmpresaVgEdt;
    private javax.swing.JLabel EmpresaVgPes;
    private javax.swing.JComboBox<String> HorarioCad;
    private javax.swing.JTextField IDEdit;
    private javax.swing.JTextField IDFiltro;
    private javax.swing.JTextField IDRmv;
    private javax.swing.JLabel IntrEdit;
    private javax.swing.JLabel IntrFiltro;
    private javax.swing.JLabel IntrRmv;
    private javax.swing.JTextField NomeEmpresa;
    private javax.swing.JTextField NomeVg;
    private javax.swing.JLabel NomeVgEdt;
    private javax.swing.JLabel NomeVgPes;
    private javax.swing.JButton RemoveVg;
    private javax.swing.JTextField SalarioCad;
    private javax.swing.JLabel SalarioVgEdt;
    private javax.swing.JLabel SalarioVgPes;
    private javax.swing.JScrollPane ScrollTable;
    private javax.swing.JComboBox<String> SlcArea;
    private javax.swing.JComboBox<String> SlcAreaEdit;
    private javax.swing.JComboBox<String> SlcAreaRmv;
    private javax.swing.JComboBox<String> SlcHora;
    private javax.swing.JComboBox<String> SlcHoraEdit;
    private javax.swing.JComboBox<String> SlcHoraRmv;
    private javax.swing.JComboBox<String> SlcValor;
    private javax.swing.JComboBox<String> SlcValorEdit;
    private javax.swing.JComboBox<String> SlcValorRmv;
    private javax.swing.JTable TableEdit;
    private javax.swing.JTable TableFiltro;
    private javax.swing.JTable TableRmv;
    private javax.swing.JTextArea TexCad;
    private javax.swing.JLabel TitleAdc;
    private javax.swing.JLabel TitleAdm;
    private javax.swing.JLabel TitleArea;
    private javax.swing.JLabel TitleEdit;
    private javax.swing.JLabel TitleEdtVg;
    private javax.swing.JLabel TitleEmpresa;
    private javax.swing.JLabel TitleFiltro;
    private javax.swing.JLabel TitleHora;
    private javax.swing.JLabel TitleNome;
    private javax.swing.JLabel TitlePag;
    private javax.swing.JLabel TitleRmv;
    private javax.swing.JLabel TitleSal;
    private javax.swing.JLabel TituloVgPes;
    private javax.swing.JLabel TurnoVgEdt;
    private javax.swing.JLabel TurnoVgPes;
    private javax.swing.JButton VisualFiltro;
    private javax.swing.JComboBox<String> areaEdtVg;
    private javax.swing.JComboBox<String> areaVg;
    private javax.swing.JTextArea descricaoEdtVg;
    private javax.swing.JTextArea descricaoVg;
    private javax.swing.JTextField empresaEdtVg;
    private javax.swing.JTextField empresaVg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelAreaEdt;
    private javax.swing.JLabel labelAreaFiltro;
    private javax.swing.JLabel labelAreaRmv;
    private javax.swing.JLabel labelSalEdt;
    private javax.swing.JLabel labelSalFiltro;
    private javax.swing.JLabel labelSalRmv;
    private javax.swing.JLabel labelTurnoEdt;
    private javax.swing.JLabel labelTurnoFiltro;
    private javax.swing.JLabel labelTurnoRvm;
    private javax.swing.JTextField nomeEdtVg;
    private javax.swing.JTextField nomeVg;
    private javax.swing.JPanel paginaAdc;
    private javax.swing.JPanel paginaAdm;
    private javax.swing.JPanel paginaEdit;
    private javax.swing.JPanel paginaEditar;
    private javax.swing.JPanel paginaFiltro;
    private javax.swing.JPanel paginaPrincipal;
    private javax.swing.JPanel paginaRemove;
    private javax.swing.JPanel paginaVagaPesquisada;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField salarioEdtVg;
    private javax.swing.JTextField salarioVg;
    private javax.swing.JComboBox<String> turnoEdtVg;
    private javax.swing.JComboBox<String> turnoVg;
    // End of variables declaration                   
}
