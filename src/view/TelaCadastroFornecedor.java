/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.FornecedorDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Fornecedor;

/**
 *
 * @author Geral
 */
public class TelaCadastroFornecedor extends javax.swing.JFrame {
    
    public void habilitarBotoes() {
        jBttnNovo.setEnabled(false);
        jBttnSalvar.setEnabled(true);
        jBttnExcluir.setEnabled(true);
        jBttnEditar.setEnabled(true);

    }

    public void desabilitarBotoes() {
        jBttnNovo.setEnabled(true);
        jBttnSalvar.setEnabled(false);
        jBttnExcluir.setEnabled(false);
        jBttnEditar.setEnabled(false);

    }

    public void listar() {

        FornecedorDAO dao = new FornecedorDAO();
        List<Fornecedor> lista = dao.listarFornecedores();
        DefaultTableModel dados = (DefaultTableModel) jTblFornecedores.getModel();
        dados.setNumRows(0);

        for (Fornecedor c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });

        }

    }
    /**
     * Creates new form TelaCliente
     */
    public TelaCadastroFornecedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JtbPaneDadosPessoais = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtNome = new javax.swing.JTextField();
        jBttnPesquisar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTxtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTxtCelular = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jFormattedTxtTelefoneFixo = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedCEP = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTxtEndereco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTxtNumeroCasa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTxtCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTxtComplemento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jCmbBoxEstado = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jFormattedRG = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jFormattedCNPJ = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTxtNomePesquisa = new javax.swing.JTextField();
        jBttnPesquisarNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblFornecedores = new javax.swing.JTable();
        jBttnNovo = new javax.swing.JButton();
        jBttnSalvar = new javax.swing.JButton();
        jBttnEditar = new javax.swing.JButton();
        jBttnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Fornecedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel2.setText("Código:");

        jLabel3.setText("Nome:");

        jBttnPesquisar.setText("Pesquisar");
        jBttnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnPesquisarActionPerformed(evt);
            }
        });

        jLabel4.setText("E-mail:");

        jLabel5.setText("Celular:");

        try {
            jFormattedTxtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Telefone(Fixo):");

        try {
            jFormattedTxtTelefoneFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #### - ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("CEP:");

        try {
            jFormattedCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.### - ###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFormattedCEPKeyPressed(evt);
            }
        });

        jLabel8.setText("Endereço:");

        jLabel9.setText("N°:");

        jLabel10.setText("Bairro:");

        jLabel11.setText("Cidade:");

        jLabel12.setText("Complemento:");

        jLabel13.setText("UF:");

        jCmbBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Estado:", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel14.setText("RG:");

        try {
            jFormattedRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####### - #")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel15.setText("CNPJ:");

        try {
            jFormattedCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.### / #### - ##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTxtTelefoneFixo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBttnPesquisar))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jFormattedCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTxtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 361, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtBairro)
                            .addComponent(jFormattedRG, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jFormattedCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(4, 4, 4)
                                .addComponent(jCmbBoxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnPesquisar))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTxtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTxtTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTxtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTxtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTxtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jCmbBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFormattedRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jFormattedCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JtbPaneDadosPessoais.addTab("Dados Fornecedor", jPanel2);

        jLabel16.setText("Nome:");

        jTxtNomePesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTxtNomePesquisaKeyPressed(evt);
            }
        });

        jBttnPesquisarNome.setText("Pesquisar");
        jBttnPesquisarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnPesquisarNomeActionPerformed(evt);
            }
        });

        jTblFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "RG", "CNPJ", "E-mail", "Telefone", "Celular", "CEP", "Endereço", "N°", "Comp11", "Bairro", "Cidade", "UF"
            }
        ));
        jTblFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblFornecedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblFornecedores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTxtNomePesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(jBttnPesquisarNome)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTxtNomePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnPesquisarNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        JtbPaneDadosPessoais.addTab("Consulta de Fornecedor", jPanel3);

        jBttnNovo.setText("+ Novo");
        jBttnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnNovoActionPerformed(evt);
            }
        });

        jBttnSalvar.setText("Salvar");
        jBttnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnSalvarActionPerformed(evt);
            }
        });

        jBttnEditar.setText("Editar");
        jBttnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnEditarActionPerformed(evt);
            }
        });

        jBttnExcluir.setText("Excluir");
        jBttnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JtbPaneDadosPessoais)
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jBttnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jBttnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jBttnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jBttnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBttnEditar, jBttnExcluir, jBttnNovo, jBttnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JtbPaneDadosPessoais)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBttnNovo)
                    .addComponent(jBttnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBttnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBttnEditar, jBttnExcluir, jBttnNovo, jBttnSalvar});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBttnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnSalvarActionPerformed
        // botao salvar 
        desabilitarBotoes();

        Fornecedor obj = new Fornecedor();

        obj.setNome(jTxtNome.getText());
        obj.setRg(jFormattedRG.getText());
        obj.setCnpj(jFormattedCNPJ.getText());
        obj.setEmail(jTxtEmail.getText());
        obj.setTelefone(jFormattedTxtTelefoneFixo.getText());
        obj.setCelular(jFormattedTxtCelular.getText());
        obj.setCep(jFormattedCEP.getText());
        obj.setEndereco(jTxtEndereco.getText());
        obj.setNumero(Integer.parseInt(jTxtNumeroCasa.getText()));
        obj.setComplemento(jTxtComplemento.getText());
        obj.setBairro(jTxtBairro.getText());
        obj.setCidade(jTxtCidade.getText());
        obj.setUf(jCmbBoxEstado.getSelectedItem().toString());

        FornecedorDAO dao = new FornecedorDAO();

        dao.cadastrarFornecedor(obj);
    }//GEN-LAST:event_jBttnSalvarActionPerformed

    private void jBttnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnNovoActionPerformed
        habilitarBotoes();
    }//GEN-LAST:event_jBttnNovoActionPerformed

    private void jBttnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnEditarActionPerformed
        // botao editar
        desabilitarBotoes();
        Fornecedor obj = new Fornecedor();

        obj.setNome(jTxtNome.getText());
        obj.setRg(jFormattedRG.getText());
        obj.setCnpj(jFormattedCNPJ.getText());
        obj.setEmail(jTxtEmail.getText());
        obj.setTelefone(jFormattedTxtTelefoneFixo.getText());
        obj.setCelular(jFormattedTxtCelular.getText());
        obj.setCep(jFormattedCEP.getText());
        obj.setEndereco(jTxtEndereco.getText());
        obj.setNumero(Integer.parseInt(jTxtNumeroCasa.getText()));
        obj.setComplemento(jTxtComplemento.getText());
        obj.setBairro(jTxtBairro.getText());
        obj.setCidade(jTxtCidade.getText());
        obj.setUf(jCmbBoxEstado.getSelectedItem().toString());

        obj.setId(Integer.parseInt(jTxtCodigo.getText()));

        FornecedorDAO dao = new FornecedorDAO();

        dao.alterarFornecedor(obj);
    }//GEN-LAST:event_jBttnEditarActionPerformed

    private void jTblFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTblFornecedoresMouseClicked
        // TODO add your handling code here:

        habilitarBotoes();
        JtbPaneDadosPessoais.setSelectedIndex(0);

        jTxtCodigo.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 0).toString());
        jTxtNome.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 1).toString());
        jFormattedRG.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 2).toString());
        jFormattedCNPJ.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 3).toString());
        jTxtEmail.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 4).toString());
        jFormattedTxtTelefoneFixo.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 5).toString());
        jFormattedTxtCelular.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 6).toString());
        jFormattedCEP.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 7).toString());
        jTxtEndereco.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 8).toString());
        jTxtNumeroCasa.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 9).toString());
        jTxtComplemento.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 10).toString());
        jTxtBairro.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 11).toString());
        jTxtCidade.setText(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 12).toString());
        jCmbBoxEstado.setSelectedItem(jTblFornecedores.getValueAt(jTblFornecedores.getSelectedRow(), 13).toString());
    }//GEN-LAST:event_jTblFornecedoresMouseClicked

    private void jBttnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnExcluirActionPerformed
        // botao excluir
        desabilitarBotoes();

        Fornecedor obj = new Fornecedor();

        obj.setId(Integer.parseInt(jTxtCodigo.getText()));

        FornecedorDAO dao = new FornecedorDAO();

        dao.excluirFornecedor(obj);
    }//GEN-LAST:event_jBttnExcluirActionPerformed

    private void jTxtNomePesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtNomePesquisaKeyPressed
        String nome = "%" + jTxtNomePesquisa.getText() + "%";

        FornecedorDAO dao = new FornecedorDAO();
        List<Fornecedor> lista = dao.buscaFornecedorPorNome(nome);

        DefaultTableModel dados = (DefaultTableModel) jTblFornecedores.getModel();
        dados.setNumRows(0);

        for (Fornecedor c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });

        }
    }//GEN-LAST:event_jTxtNomePesquisaKeyPressed

    private void jBttnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnPesquisarActionPerformed
        // botao buscar cliente por nome

        String nome = jTxtNome.getText();
        Fornecedor obj = new Fornecedor();
        FornecedorDAO dao = new FornecedorDAO();

        obj = dao.consultaPorNome(nome);

        if (obj.getNome() != null) {

//Exibi os dados do obj nos campos de texto
            jTxtCodigo.setText(String.valueOf(obj.getId()));
            jTxtNome.setText(obj.getNome());
            jFormattedRG.setText(obj.getRg());
            jFormattedCNPJ.setText(obj.getCnpj());
            jTxtEmail.setText(obj.getEmail());
            jFormattedTxtTelefoneFixo.setText(obj.getTelefone());
            jFormattedTxtCelular.setText(obj.getCelular());
            jFormattedCEP.setText(obj.getCep());
            jTxtEndereco.setText(obj.getEndereco());
            jTxtNumeroCasa.setText(String.valueOf(obj.getNumero()));
            jTxtComplemento.setText(obj.getComplemento());
            jTxtBairro.setText(obj.getBairro());
            jTxtCidade.setText(obj.getCidade());
            jCmbBoxEstado.setSelectedItem(obj.getUf());
        } else {
            JOptionPane.showMessageDialog(null, "Fornecedor não encontrado!");
        }
    }//GEN-LAST:event_jBttnPesquisarActionPerformed

    private void jBttnPesquisarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnPesquisarNomeActionPerformed
        // Botao pesquisar
        String nome = "%" + jTxtNomePesquisa.getText() + "%";

        FornecedorDAO dao = new FornecedorDAO();
        List<Fornecedor> lista = dao.buscaFornecedorPorNome(nome);

        DefaultTableModel dados = (DefaultTableModel) jTblFornecedores.getModel();
        dados.setNumRows(0);

        for (Fornecedor c : lista) {
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCnpj(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getUf()
            });

        }
    }//GEN-LAST:event_jBttnPesquisarNomeActionPerformed

    private void jFormattedCEPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedCEPKeyPressed
        //Programacao do keypress
      /*  if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Fornecedor obj = new Fornecedor();
            FornecedorDAO dao = new FornecedorDAO();
            obj = dao.buscaCep(jTxtCep.getText());

            jTxtEndereco.setText(obj.getEndereco());
            jTxtBairro.setText(obj.getBairro());
            jTxtCidade.setText(obj.getCidade());
            jCBXUF.setSelectedItem(obj.getUf());

        }*/
    }//GEN-LAST:event_jFormattedCEPKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        listar();
        desabilitarBotoes();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JtbPaneDadosPessoais;
    private javax.swing.JButton jBttnEditar;
    private javax.swing.JButton jBttnExcluir;
    private javax.swing.JButton jBttnNovo;
    private javax.swing.JButton jBttnPesquisar;
    private javax.swing.JButton jBttnPesquisarNome;
    private javax.swing.JButton jBttnSalvar;
    private javax.swing.JComboBox<String> jCmbBoxEstado;
    private javax.swing.JFormattedTextField jFormattedCEP;
    private javax.swing.JFormattedTextField jFormattedCNPJ;
    private javax.swing.JFormattedTextField jFormattedRG;
    private javax.swing.JFormattedTextField jFormattedTxtCelular;
    private javax.swing.JFormattedTextField jFormattedTxtTelefoneFixo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblFornecedores;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtComplemento;
    private javax.swing.JTextField jTxtEmail;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtNomePesquisa;
    private javax.swing.JTextField jTxtNumeroCasa;
    // End of variables declaration//GEN-END:variables
}
