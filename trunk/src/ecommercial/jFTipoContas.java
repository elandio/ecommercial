/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jFTipoContas.java
 *
 * Created on 20/09/2012, 23:40:46
 */

package ecommercial;

import ecommercial.Classes.ClassConecta;
import ecommercial.Classes.Funcoes;
import ecommercial.Classes.TipoContas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano Carrafa Benfica
 */
public class jFTipoContas extends javax.swing.JDialog {

    /** Creates new form jFTipoContas */
    public jFTipoContas() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        buscarjButton = new javax.swing.JButton();
        novojButton = new javax.swing.JButton();
        editarjButton = new javax.swing.JButton();
        salvarjButton = new javax.swing.JButton();
        salvarMaisjButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        alterarjButton = new javax.swing.JButton();
        excluirjButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        sairjButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gradeTiposContasjTable = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codigoContabiljTextField = new javax.swing.JTextField();
        tipoContajComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        naturezaSaldojComboBox = new javax.swing.JComboBox();
        indicadorTipojComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setName("Form"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(ecommercial.EcommercialApp.class).getContext().getResourceMap(jFTipoContas.class);
        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        buscarjButton.setBackground(resourceMap.getColor("buscarjButton.background")); // NOI18N
        buscarjButton.setIcon(resourceMap.getIcon("buscarjButton.icon")); // NOI18N
        buscarjButton.setText(resourceMap.getString("buscarjButton.text")); // NOI18N
        buscarjButton.setFocusable(false);
        buscarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarjButton.setName("buscarjButton"); // NOI18N
        buscarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(buscarjButton);

        novojButton.setBackground(resourceMap.getColor("novojButton.background")); // NOI18N
        novojButton.setIcon(resourceMap.getIcon("novojButton.icon")); // NOI18N
        novojButton.setText(resourceMap.getString("novojButton.text")); // NOI18N
        novojButton.setFocusable(false);
        novojButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        novojButton.setName("novojButton"); // NOI18N
        novojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        novojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(novojButton);

        editarjButton.setBackground(resourceMap.getColor("editarjButton.background")); // NOI18N
        editarjButton.setIcon(resourceMap.getIcon("editarjButton.icon")); // NOI18N
        editarjButton.setText(resourceMap.getString("editarjButton.text")); // NOI18N
        editarjButton.setFocusable(false);
        editarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editarjButton.setName("editarjButton"); // NOI18N
        editarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(editarjButton);

        salvarjButton.setBackground(resourceMap.getColor("salvarjButton.background")); // NOI18N
        salvarjButton.setIcon(resourceMap.getIcon("salvarjButton.icon")); // NOI18N
        salvarjButton.setText(resourceMap.getString("salvarjButton.text")); // NOI18N
        salvarjButton.setFocusable(false);
        salvarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salvarjButton.setName("salvarjButton"); // NOI18N
        salvarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(salvarjButton);

        salvarMaisjButton.setBackground(resourceMap.getColor("salvarMaisjButton.background")); // NOI18N
        salvarMaisjButton.setIcon(resourceMap.getIcon("salvarMaisjButton.icon")); // NOI18N
        salvarMaisjButton.setText(resourceMap.getString("salvarMaisjButton.text")); // NOI18N
        salvarMaisjButton.setFocusable(false);
        salvarMaisjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salvarMaisjButton.setName("salvarMaisjButton"); // NOI18N
        salvarMaisjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salvarMaisjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarMaisjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(salvarMaisjButton);

        jSeparator1.setName("jSeparator1"); // NOI18N
        jToolBar1.add(jSeparator1);

        alterarjButton.setBackground(resourceMap.getColor("alterarjButton.background")); // NOI18N
        alterarjButton.setIcon(resourceMap.getIcon("alterarjButton.icon")); // NOI18N
        alterarjButton.setText(resourceMap.getString("alterarjButton.text")); // NOI18N
        alterarjButton.setFocusable(false);
        alterarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        alterarjButton.setName("alterarjButton"); // NOI18N
        alterarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alterarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(alterarjButton);

        excluirjButton.setBackground(resourceMap.getColor("excluirjButton.background")); // NOI18N
        excluirjButton.setIcon(resourceMap.getIcon("excluirjButton.icon")); // NOI18N
        excluirjButton.setText(resourceMap.getString("excluirjButton.text")); // NOI18N
        excluirjButton.setFocusable(false);
        excluirjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        excluirjButton.setName("excluirjButton"); // NOI18N
        excluirjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(excluirjButton);

        jSeparator2.setName("jSeparator2"); // NOI18N
        jToolBar1.add(jSeparator2);

        sairjButton.setBackground(resourceMap.getColor("sairjButton.background")); // NOI18N
        sairjButton.setIcon(resourceMap.getIcon("sairjButton.icon")); // NOI18N
        sairjButton.setText(resourceMap.getString("sairjButton.text")); // NOI18N
        sairjButton.setFocusable(false);
        sairjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sairjButton.setName("sairjButton"); // NOI18N
        sairjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sairjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(sairjButton);

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPanel2.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), resourceMap.getColor("jPanel2.border.titleColor"))); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        gradeTiposContasjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#Id", "Cod. Contábil", "Tipo Conta", "Natureza Saldo", "Ind. Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gradeTiposContasjTable.setName("gradeTiposContasjTable"); // NOI18N
        gradeTiposContasjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradeTiposContasjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gradeTiposContasjTable);
        gradeTiposContasjTable.getColumnModel().getColumn(0).setResizable(false);
        gradeTiposContasjTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        gradeTiposContasjTable.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("gradeTiposContasjTable.columnModel.title0")); // NOI18N
        gradeTiposContasjTable.getColumnModel().getColumn(1).setResizable(false);
        gradeTiposContasjTable.getColumnModel().getColumn(1).setPreferredWidth(30);
        gradeTiposContasjTable.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("gradeTiposContasjTable.columnModel.title1")); // NOI18N
        gradeTiposContasjTable.getColumnModel().getColumn(2).setResizable(false);
        gradeTiposContasjTable.getColumnModel().getColumn(2).setPreferredWidth(40);
        gradeTiposContasjTable.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("gradeTiposContasjTable.columnModel.title2")); // NOI18N
        gradeTiposContasjTable.getColumnModel().getColumn(3).setResizable(false);
        gradeTiposContasjTable.getColumnModel().getColumn(3).setPreferredWidth(40);
        gradeTiposContasjTable.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("gradeTiposContasjTable.columnModel.title3")); // NOI18N
        gradeTiposContasjTable.getColumnModel().getColumn(4).setResizable(false);
        gradeTiposContasjTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        gradeTiposContasjTable.getColumnModel().getColumn(4).setHeaderValue(resourceMap.getString("gradeTiposContasjTable.columnModel.title4")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setName("jPanel3"); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setForeground(resourceMap.getColor("jLabel1.foreground")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        codigoContabiljTextField.setText(resourceMap.getString("codigoContabiljTextField.text")); // NOI18N
        codigoContabiljTextField.setName("codigoContabiljTextField"); // NOI18N

        tipoContajComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "ATIVO", "PASSIVO", "RECEITA", "DESPESA", "NÃO USAR COMBO" }));
        tipoContajComboBox.setName("tipoContajComboBox"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setForeground(resourceMap.getColor("jLabel2.foreground")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel3.setForeground(resourceMap.getColor("jLabel4.foreground")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        naturezaSaldojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "CREDOR", "DEVEDOR" }));
        naturezaSaldojComboBox.setName("naturezaSaldojComboBox"); // NOI18N

        indicadorTipojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "S - Sintética (grupo de contas)", "A - Analítica (conta)" }));
        indicadorTipojComboBox.setName("indicadorTipojComboBox"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setForeground(resourceMap.getColor("jLabel4.foreground")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(naturezaSaldojComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(codigoContabiljTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(indicadorTipojComboBox, 0, 211, Short.MAX_VALUE)
                        .addComponent(tipoContajComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoContabiljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoContajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(naturezaSaldojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indicadorTipojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel3.TabConstraints.tabTitle"), jPanel3); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ClassConecta conexao = new ClassConecta();

    int cod_tipo_conta;


    //******************************************************************************************************
    public void getGradeTiposContas() throws ParseException{
       //Consultar Tipos Contas
        TipoContas oTipoConta = new TipoContas();


//        if ( tabelajTextField.getText().length() > 0 ){
//            oTabelaPreco.setTabela(tabelajTextField.getText()+"%");
//        }

        ResultSet resultSet = null;

        String[] colunasTabela = new String[]{"#Id", "Cod. Contábil", "Tipo Conta", "Natureza Saldo", "Ind. Tipo."};
        DefaultTableModel modeloTabela = new DefaultTableModel(null, colunasTabela) {

            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        gradeTiposContasjTable.setModel(modeloTabela);
        gradeTiposContasjTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        gradeTiposContasjTable.getColumnModel().getColumn(1).setPreferredWidth(30);
        gradeTiposContasjTable.getColumnModel().getColumn(2).setPreferredWidth(40);
        gradeTiposContasjTable.getColumnModel().getColumn(3).setPreferredWidth(40);
        gradeTiposContasjTable.getColumnModel().getColumn(4).setPreferredWidth(100);

try {


            resultSet = oTipoConta.getConsultar();

            if (resultSet.getRow() == 1){
             resultSet.first();
            }


        } catch (SQLException ex) {
            Logger.getLogger(TipoContas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            while (resultSet.next()) {

                modeloTabela.addRow(new String[]{
                    Funcoes.getCodigoFormat(resultSet.getInt("COD_TIPO_CONTA")),
                    resultSet.getString("COD_CONTABIL"),
                    resultSet.getString("TIPO_CONTA") ,
                    resultSet.getString("NATUREZA_SALDO"),
                    resultSet.getString("INDICADOR_TIPO"),
                });

            }

        } catch (SQLException ex) {
            Logger.getLogger(TipoContas.class.getName()).log(Level.SEVERE, null, ex);
        }

           }


    public void getFieldTipoContas(int cod_tipo_conta) throws ParseException{

        TipoContas oTipoConta = new TipoContas();
        ResultSet rs = null;
        oTipoConta.setCod_tipo_conta(cod_tipo_conta);

        try {
            rs = oTipoConta.getConsultar();
            rs.next();

            //Pegar campos
            codigoContabiljTextField.setText(rs.getString("COD_TIPO_CONTA"));
            tipoContajComboBox.setSelectedItem(rs.getString("TIPO_CONTA"));
            naturezaSaldojComboBox.setSelectedItem(rs.getString("NATUREZA_SALDO"));
            indicadorTipojComboBox.setSelectedItem(rs.getString("INDICADOR_TIPO"));

        } catch (SQLException ex) {
            Logger.getLogger(TipoContas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        salvarjButton.setEnabled(false);
        salvarMaisjButton.setEnabled(false);
        alterarjButton.setEnabled(false);
        excluirjButton.setEnabled(false);
        editarjButton.setEnabled(false);
        novojButton.setEnabled(true);
        codigoContabiljTextField.grabFocus();

        ClassConecta.conecta();

        try {
            getGradeTiposContas();
        } catch (ParseException ex) {
            Logger.getLogger(jFTipoContas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowOpened

    private void sairjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairjButtonActionPerformed
        // TODO add your handling code here:
        if (!novojButton.isEnabled()){
                Object[] options = {"Sim", "Não"};
                int sd = JOptionPane.showOptionDialog(null, "Deseja realmente SAIR?", "Confirmação do Sistema!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                if (sd != 0) {
                    return;
                }

                this.dispose();

            }else{

                this.dispose();

            }
    }//GEN-LAST:event_sairjButtonActionPerformed

    private void novojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novojButtonActionPerformed
        // TODO add your handling code here:
        novojButton.setEnabled(false);
        alterarjButton.setEnabled(false);
        editarjButton.setEnabled(false);
        excluirjButton.setEnabled(false);
        buscarjButton.setEnabled(true);
        salvarjButton.setEnabled(true);
        salvarMaisjButton.setEnabled(true);
        codigoContabiljTextField.grabFocus();
        try {
            ClassConecta.con.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(jFTabelaPreco.class.getName()).log(Level.SEVERE, null, ex);
        }
        codigoContabiljTextField.setText("");
        tipoContajComboBox.setSelectedItem("...");
        naturezaSaldojComboBox.setSelectedItem("...");
        indicadorTipojComboBox.setSelectedItem("...");
    }//GEN-LAST:event_novojButtonActionPerformed

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        // TODO add your handling code here:
            salvarjButton.setEnabled(false);
            salvarMaisjButton.setEnabled(false);
            alterarjButton.setEnabled(false);
            excluirjButton.setEnabled(false);
            novojButton.setEnabled(true);
            editarjButton.setEnabled(true);

            TipoContas oTipoConta = new TipoContas();

            if (codigoContabiljTextField.getText().equals("")){

                JOptionPane.showMessageDialog(null, "Atenção! \n O campo CÓDIGO CONTÁBIL está vazio", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            }else if (tipoContajComboBox.getSelectedItem().equals("...")){

                JOptionPane.showMessageDialog(null, "Atenção! \n O campo TIPO DE CONTA está vazio", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            }else if (naturezaSaldojComboBox.getSelectedItem().equals("...")){

                JOptionPane.showMessageDialog(null, "Atenção! \n O campo NATUREZA SALDO está vazio", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            }else if (indicadorTipojComboBox.getSelectedItem().equals("...")){

                JOptionPane.showMessageDialog(null, "Atenção! \n O campo INDICADOR SALDO está vazio", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            }else{

                oTipoConta.setCod_contabil(codigoContabiljTextField.getText());
                oTipoConta.setTipo_conta(tipoContajComboBox.getSelectedItem().toString());
                oTipoConta.setNatureza_saldo(naturezaSaldojComboBox.getSelectedItem().toString());
                oTipoConta.setIndicador_tipo(indicadorTipojComboBox.getSelectedItem().toString());
                oTipoConta.setCadastrar();
            try {
                ClassConecta.con.commit();
                ClassConecta.con.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(jFTipoContas.class.getName()).log(Level.SEVERE, null, ex);
            }

            }
        try {
            getGradeTiposContas();
        } catch (ParseException ex) {
            Logger.getLogger(jFTipoContas.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_salvarjButtonActionPerformed

    private void buscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarjButtonActionPerformed
        try {
            // TODO add your handling code here:
            getGradeTiposContas();
        } catch (ParseException ex) {
            Logger.getLogger(jFTipoContas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarjButtonActionPerformed

    private void gradeTiposContasjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeTiposContasjTableMouseClicked
        // TODO add your handling code here:
        editarjButton.setEnabled(true);
            cod_tipo_conta = Integer.parseInt(gradeTiposContasjTable.getValueAt(gradeTiposContasjTable.getSelectedRow(), 0).toString());
            if (cod_tipo_conta == 0) {
                return;
            }
        try {
            getFieldTipoContas(cod_tipo_conta);
        } catch (ParseException ex) {
            Logger.getLogger(jFTabelaPreco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gradeTiposContasjTableMouseClicked

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        // TODO add your handling code here:
            novojButton.setEnabled(false);
            salvarjButton.setEnabled(false);
            salvarMaisjButton.setEnabled(false);
            editarjButton.setEnabled(false);
            alterarjButton.setEnabled(true);
            excluirjButton.setEnabled(true);
        try {
            ClassConecta.con.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(jFPessoas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void salvarMaisjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarMaisjButtonActionPerformed
        // TODO add your handling code here:
        salvarjButtonActionPerformed(null);
        novojButtonActionPerformed(null);
    }//GEN-LAST:event_salvarMaisjButtonActionPerformed

    private void alterarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarjButtonActionPerformed
        // TODO add your handling code here:
        alterarjButton.setEnabled(false);
        editarjButton.setEnabled(true);
        excluirjButton.setEnabled(false);
        novojButton.setEnabled(true);

        TipoContas oTipoConta = new TipoContas();

        if (codigoContabiljTextField.getText().equals("")){

                JOptionPane.showMessageDialog(null, "Atenção! \n O campo CÓDIGO CONTÁBIL está vazio", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            }else if (tipoContajComboBox.getSelectedItem().equals("...")){

                JOptionPane.showMessageDialog(null, "Atenção! \n O campo TIPO DE CONTA está vazio", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            }else if (naturezaSaldojComboBox.getSelectedItem().equals("...")){

                JOptionPane.showMessageDialog(null, "Atenção! \n O campo NATUREZA SALDO está vazio", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            }else if (indicadorTipojComboBox.getSelectedItem().equals("...")){

                JOptionPane.showMessageDialog(null, "Atenção! \n O campo INDICADOR SALDO está vazio", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            }else{

                oTipoConta.setCod_tipo_conta(cod_tipo_conta);

                oTipoConta.setCod_contabil(codigoContabiljTextField.getText());
                oTipoConta.setTipo_conta(tipoContajComboBox.getSelectedItem().toString());
                oTipoConta.setNatureza_saldo(naturezaSaldojComboBox.getSelectedItem().toString());
                oTipoConta.setIndicador_tipo(indicadorTipojComboBox.getSelectedItem().toString());
                oTipoConta.setAlterar(conexao);
            try {
                ClassConecta.con.commit();
                ClassConecta.con.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(jFTipoContas.class.getName()).log(Level.SEVERE, null, ex);
            }

            }
        try {
            getGradeTiposContas();
        } catch (ParseException ex) {
            Logger.getLogger(jFTipoContas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_alterarjButtonActionPerformed

    private void excluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirjButtonActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Sim", "Não"};
        int sd =
                JOptionPane.showOptionDialog(null, "Deseja realmente EXCLUIR esse registro?", "Confirmação do Sistema!", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (sd != 0) {
            return;
        }
        alterarjButton.setEnabled(false);
        editarjButton.setEnabled(true);
        excluirjButton.setEnabled(false);
        novojButton.setEnabled(true);

        TipoContas oTipoConta = new TipoContas();
        oTipoConta.setCod_tipo_conta(cod_tipo_conta);

        oTipoConta.setExcluir();
        try {
            ClassConecta.con.commit();
            ClassConecta.con.setAutoCommit(true);
        } catch (SQLException ex) {
            Logger.getLogger(jFTipoContas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            getGradeTiposContas();
        } catch (ParseException ex) {
            Logger.getLogger(jFTipoContas.class.getName()).log(Level.SEVERE, null, ex);
        }
        codigoContabiljTextField.setText("");
        tipoContajComboBox.setSelectedItem("...");
        naturezaSaldojComboBox.setSelectedItem("...");
        indicadorTipojComboBox.setSelectedItem("...");
    }//GEN-LAST:event_excluirjButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFTipoContas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarjButton;
    private javax.swing.JButton buscarjButton;
    private javax.swing.JTextField codigoContabiljTextField;
    private javax.swing.JButton editarjButton;
    private javax.swing.JButton excluirjButton;
    private javax.swing.JTable gradeTiposContasjTable;
    private javax.swing.JComboBox indicadorTipojComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox naturezaSaldojComboBox;
    private javax.swing.JButton novojButton;
    private javax.swing.JButton sairjButton;
    private javax.swing.JButton salvarMaisjButton;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JComboBox tipoContajComboBox;
    // End of variables declaration//GEN-END:variables

}
