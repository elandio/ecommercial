/*
 * EcommercialView.java
 */

package ecommercial;


import ecommercial.Classes.GrupoContas;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * The application's main frame.
 */
public class EcommercialView extends FrameView {

    public EcommercialView(SingleFrameApplication app) {
        super(app);

        initComponents();

        // status bar initialization - message timeout, idle icon and busy animation, etc
        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
        messageTimer = new Timer(messageTimeout, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusMessageLabel.setText("");
            }
        });
        messageTimer.setRepeats(false);
        int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate");
        for (int i = 0; i < busyIcons.length; i++) {
            busyIcons[i] = resourceMap.getIcon("StatusBar.busyIcons[" + i + "]");
        }
        busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
                statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
            }
        });
        idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
        statusAnimationLabel.setIcon(idleIcon);
        progressBar.setVisible(false);

        // connecting action tasks to status bar via TaskMonitor
        TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
        taskMonitor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                String propertyName = evt.getPropertyName();
                if ("started".equals(propertyName)) {
                    if (!busyIconTimer.isRunning()) {
                        statusAnimationLabel.setIcon(busyIcons[0]);
                        busyIconIndex = 0;
                        busyIconTimer.start();
                    }
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(true);
                } else if ("done".equals(propertyName)) {
                    busyIconTimer.stop();
                    statusAnimationLabel.setIcon(idleIcon);
                    progressBar.setVisible(false);
                    progressBar.setValue(0);
                } else if ("message".equals(propertyName)) {
                    String text = (String)(evt.getNewValue());
                    statusMessageLabel.setText((text == null) ? "" : text);
                    messageTimer.restart();
                } else if ("progress".equals(propertyName)) {
                    int value = (Integer)(evt.getNewValue());
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(false);
                    progressBar.setValue(value);
                }
            }
        });
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = EcommercialApp.getApplication().getMainFrame();
            aboutBox = new EcommercialAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        EcommercialApp.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        AdministrativojMenu = new javax.swing.JMenu();
        controlesjMenu = new javax.swing.JMenu();
        pessoasjMenuItem = new javax.swing.JMenuItem();
        localidadesjMenu = new javax.swing.JMenu();
        paisesjMenuItem = new javax.swing.JMenuItem();
        estadosjMenuItem = new javax.swing.JMenuItem();
        cidadesjMenuItem = new javax.swing.JMenuItem();
        bairrosjMenuItem = new javax.swing.JMenuItem();
        cadastrosjMenu = new javax.swing.JMenu();
        tiposLogradourosjMenuItem = new javax.swing.JMenuItem();
        LogradourosjMenuItem = new javax.swing.JMenuItem();
        ramoAtividadesjMenuItem = new javax.swing.JMenuItem();
        atividadesjMenuItem = new javax.swing.JMenuItem();
        representantesjMenuItem = new javax.swing.JMenuItem();
        tabelaPrecojMenuItem = new javax.swing.JMenuItem();
        tipoContasjMenuItem = new javax.swing.JMenuItem();
        grupoContasjMenuItem = new javax.swing.JMenuItem();
        planoContasjMenuItem = new javax.swing.JMenuItem();
        tipoFornecedoresjMenuItem = new javax.swing.JMenuItem();
        tiposClientesjMenuItem = new javax.swing.JMenuItem();
        departamentosjMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        statusPanel = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
        statusMessageLabel = new javax.swing.JLabel();
        statusAnimationLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        mainPanel.setName("mainPanel"); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );

        menuBar.setName("menuBar"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(ecommercial.EcommercialApp.class).getContext().getResourceMap(EcommercialView.class);
        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(ecommercial.EcommercialApp.class).getContext().getActionMap(EcommercialView.class, this);
        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setText(resourceMap.getString("exitMenuItem.text")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        AdministrativojMenu.setText(resourceMap.getString("AdministrativojMenu.text")); // NOI18N
        AdministrativojMenu.setName("AdministrativojMenu"); // NOI18N

        controlesjMenu.setText(resourceMap.getString("controlesjMenu.text")); // NOI18N
        controlesjMenu.setName("controlesjMenu"); // NOI18N

        pessoasjMenuItem.setIcon(resourceMap.getIcon("pessoasjMenuItem.icon")); // NOI18N
        pessoasjMenuItem.setText(resourceMap.getString("pessoasjMenuItem.text")); // NOI18N
        pessoasjMenuItem.setName("pessoasjMenuItem"); // NOI18N
        pessoasjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoasjMenuItemActionPerformed(evt);
            }
        });
        controlesjMenu.add(pessoasjMenuItem);

        AdministrativojMenu.add(controlesjMenu);

        localidadesjMenu.setText(resourceMap.getString("localidadesjMenu.text")); // NOI18N
        localidadesjMenu.setName("localidadesjMenu"); // NOI18N

        paisesjMenuItem.setText(resourceMap.getString("paisesjMenuItem.text")); // NOI18N
        paisesjMenuItem.setName("paisesjMenuItem"); // NOI18N
        paisesjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisesjMenuItemActionPerformed(evt);
            }
        });
        localidadesjMenu.add(paisesjMenuItem);

        estadosjMenuItem.setText(resourceMap.getString("estadosjMenuItem.text")); // NOI18N
        estadosjMenuItem.setName("estadosjMenuItem"); // NOI18N
        estadosjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadosjMenuItemActionPerformed(evt);
            }
        });
        localidadesjMenu.add(estadosjMenuItem);

        cidadesjMenuItem.setText(resourceMap.getString("cidadesjMenuItem.text")); // NOI18N
        cidadesjMenuItem.setName("cidadesjMenuItem"); // NOI18N
        cidadesjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadesjMenuItemActionPerformed(evt);
            }
        });
        localidadesjMenu.add(cidadesjMenuItem);

        bairrosjMenuItem.setText(resourceMap.getString("bairrosjMenuItem.text")); // NOI18N
        bairrosjMenuItem.setName("bairrosjMenuItem"); // NOI18N
        bairrosjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairrosjMenuItemActionPerformed(evt);
            }
        });
        localidadesjMenu.add(bairrosjMenuItem);

        AdministrativojMenu.add(localidadesjMenu);

        menuBar.add(AdministrativojMenu);

        cadastrosjMenu.setText(resourceMap.getString("cadastrosjMenu.text")); // NOI18N
        cadastrosjMenu.setName("cadastrosjMenu"); // NOI18N

        tiposLogradourosjMenuItem.setText(resourceMap.getString("tiposLogradourosjMenuItem.text")); // NOI18N
        tiposLogradourosjMenuItem.setName("tiposLogradourosjMenuItem"); // NOI18N
        tiposLogradourosjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiposLogradourosjMenuItemActionPerformed(evt);
            }
        });
        cadastrosjMenu.add(tiposLogradourosjMenuItem);

        LogradourosjMenuItem.setText(resourceMap.getString("LogradourosjMenuItem.text")); // NOI18N
        LogradourosjMenuItem.setName("LogradourosjMenuItem"); // NOI18N
        LogradourosjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogradourosjMenuItemActionPerformed(evt);
            }
        });
        cadastrosjMenu.add(LogradourosjMenuItem);

        ramoAtividadesjMenuItem.setText(resourceMap.getString("ramoAtividadesjMenuItem.text")); // NOI18N
        ramoAtividadesjMenuItem.setName("ramoAtividadesjMenuItem"); // NOI18N
        ramoAtividadesjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramoAtividadesjMenuItemActionPerformed(evt);
            }
        });
        cadastrosjMenu.add(ramoAtividadesjMenuItem);

        atividadesjMenuItem.setText(resourceMap.getString("atividadesjMenuItem.text")); // NOI18N
        atividadesjMenuItem.setName("atividadesjMenuItem"); // NOI18N
        atividadesjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atividadesjMenuItemActionPerformed(evt);
            }
        });
        cadastrosjMenu.add(atividadesjMenuItem);

        representantesjMenuItem.setText(resourceMap.getString("representantesjMenuItem.text")); // NOI18N
        representantesjMenuItem.setName("representantesjMenuItem"); // NOI18N
        representantesjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                representantesjMenuItemActionPerformed(evt);
            }
        });
        cadastrosjMenu.add(representantesjMenuItem);

        tabelaPrecojMenuItem.setText(resourceMap.getString("tabelaPrecojMenuItem.text")); // NOI18N
        tabelaPrecojMenuItem.setName("tabelaPrecojMenuItem"); // NOI18N
        tabelaPrecojMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabelaPrecojMenuItemActionPerformed(evt);
            }
        });
        cadastrosjMenu.add(tabelaPrecojMenuItem);

        tipoContasjMenuItem.setText(resourceMap.getString("tipoContasjMenuItem.text")); // NOI18N
        tipoContasjMenuItem.setName("tipoContasjMenuItem"); // NOI18N
        tipoContasjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoContasjMenuItemActionPerformed(evt);
            }
        });
        cadastrosjMenu.add(tipoContasjMenuItem);

        grupoContasjMenuItem.setText(resourceMap.getString("grupoContasjMenuItem.text")); // NOI18N
        grupoContasjMenuItem.setName("grupoContasjMenuItem"); // NOI18N
        grupoContasjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoContasjMenuItemActionPerformed(evt);
            }
        });
        cadastrosjMenu.add(grupoContasjMenuItem);

        planoContasjMenuItem.setText(resourceMap.getString("planoContasjMenuItem.text")); // NOI18N
        planoContasjMenuItem.setName("planoContasjMenuItem"); // NOI18N
        planoContasjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planoContasjMenuItemActionPerformed(evt);
            }
        });
        cadastrosjMenu.add(planoContasjMenuItem);

        tipoFornecedoresjMenuItem.setText(resourceMap.getString("tipoFornecedoresjMenuItem.text")); // NOI18N
        tipoFornecedoresjMenuItem.setName("tipoFornecedoresjMenuItem"); // NOI18N
        tipoFornecedoresjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoFornecedoresjMenuItemActionPerformed(evt);
            }
        });
        cadastrosjMenu.add(tipoFornecedoresjMenuItem);

        tiposClientesjMenuItem.setText(resourceMap.getString("tiposClientesjMenuItem.text")); // NOI18N
        tiposClientesjMenuItem.setName("tiposClientesjMenuItem"); // NOI18N
        tiposClientesjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiposClientesjMenuItemActionPerformed(evt);
            }
        });
        cadastrosjMenu.add(tiposClientesjMenuItem);

        departamentosjMenuItem.setText(resourceMap.getString("departamentosjMenuItem.text")); // NOI18N
        departamentosjMenuItem.setName("departamentosjMenuItem"); // NOI18N
        departamentosjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentosjMenuItemActionPerformed(evt);
            }
        });
        cadastrosjMenu.add(departamentosjMenuItem);

        menuBar.add(cadastrosjMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setText(resourceMap.getString("aboutMenuItem.text")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        statusPanel.setName("statusPanel"); // NOI18N

        statusPanelSeparator.setName("statusPanelSeparator"); // NOI18N

        statusMessageLabel.setName("statusMessageLabel"); // NOI18N

        statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statusAnimationLabel.setName("statusAnimationLabel"); // NOI18N

        progressBar.setName("progressBar"); // NOI18N

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanelSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusAnimationLabel)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addComponent(statusPanelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusMessageLabel)
                    .addComponent(statusAnimationLabel)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        setComponent(mainPanel);
        setMenuBar(menuBar);
        setStatusBar(statusPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void pessoasjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoasjMenuItemActionPerformed
        try {
            // TODO add your handling code here:
            jFPessoas oPessoa = new jFPessoas();
            oPessoa.setDefaultCloseOperation(jFPessoas.DO_NOTHING_ON_CLOSE);
            oPessoa.pack();
            oPessoa.setLocationRelativeTo(null);
            oPessoa.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(EcommercialView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pessoasjMenuItemActionPerformed

    private void paisesjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisesjMenuItemActionPerformed
        // TODO add your handling code here:
        jFPaises oPais = new jFPaises();
        oPais.setDefaultCloseOperation(jFPaises.DO_NOTHING_ON_CLOSE);
        oPais.pack();
        oPais.setLocationRelativeTo(null);
        oPais.setVisible(true);
    }//GEN-LAST:event_paisesjMenuItemActionPerformed

    private void estadosjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadosjMenuItemActionPerformed
        // TODO add your handling code here:
        jFEstados oEstado = new jFEstados();
        oEstado.setDefaultCloseOperation(jFEstados.DO_NOTHING_ON_CLOSE);
        oEstado.pack();
        oEstado.setLocationRelativeTo(null);
        oEstado.setVisible(true);
    }//GEN-LAST:event_estadosjMenuItemActionPerformed

    private void cidadesjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadesjMenuItemActionPerformed
        // TODO add your handling code here:
        jFCidades oCidade = new jFCidades();
        oCidade.setDefaultCloseOperation(jFCidades.DO_NOTHING_ON_CLOSE);
        oCidade.pack();
        oCidade.setLocationRelativeTo(null);
        oCidade.setVisible(true);
    }//GEN-LAST:event_cidadesjMenuItemActionPerformed

    private void bairrosjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairrosjMenuItemActionPerformed
        // TODO add your handling code here:
        jFBairros oBairro = new jFBairros();
        oBairro.setDefaultCloseOperation(jFBairros.DO_NOTHING_ON_CLOSE);
        oBairro.pack();
        oBairro.setLocationRelativeTo(null);
        oBairro.setVisible(true);
    }//GEN-LAST:event_bairrosjMenuItemActionPerformed

    private void tiposLogradourosjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiposLogradourosjMenuItemActionPerformed
        // TODO add your handling code here:
        jFTiposLogradouros oTipoLogradouro = new jFTiposLogradouros();

        oTipoLogradouro.setDefaultCloseOperation(jFTiposLogradouros.DO_NOTHING_ON_CLOSE);
        oTipoLogradouro.pack();
        oTipoLogradouro.setLocationRelativeTo(null);
        oTipoLogradouro.setVisible(true);
    }//GEN-LAST:event_tiposLogradourosjMenuItemActionPerformed

    private void LogradourosjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogradourosjMenuItemActionPerformed
        // TODO add your handling code here:
        jFLogradouros oLogradouro = new jFLogradouros();

        oLogradouro.setDefaultCloseOperation(jFLogradouros.DO_NOTHING_ON_CLOSE);
        oLogradouro.pack();
        oLogradouro.setLocationRelativeTo(null);
        oLogradouro.setVisible(true);
    }//GEN-LAST:event_LogradourosjMenuItemActionPerformed

    private void ramoAtividadesjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramoAtividadesjMenuItemActionPerformed
        // TODO add your handling code here:
        jFRamoAtividades oRamoAtividade = new jFRamoAtividades();

        oRamoAtividade.setDefaultCloseOperation(jFRamoAtividades.DO_NOTHING_ON_CLOSE);
        oRamoAtividade.pack();
        oRamoAtividade.setLocationRelativeTo(null);
        oRamoAtividade.setVisible(true);
    }//GEN-LAST:event_ramoAtividadesjMenuItemActionPerformed

    private void atividadesjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atividadesjMenuItemActionPerformed
        // TODO add your handling code here:
        jFAtividades oAtividade = new jFAtividades();

        oAtividade.setDefaultCloseOperation(jFAtividades.DO_NOTHING_ON_CLOSE);
        oAtividade.pack();
        oAtividade.setLocationRelativeTo(null);
        oAtividade.setVisible(true);
    }//GEN-LAST:event_atividadesjMenuItemActionPerformed

    private void representantesjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_representantesjMenuItemActionPerformed
        // TODO add your handling code here:
        jFRepresentantes oRepresentante = new jFRepresentantes();

        oRepresentante.setTitle("Representantes");
        oRepresentante.setDefaultCloseOperation(jFRepresentantes.DO_NOTHING_ON_CLOSE);
        oRepresentante.pack();
        oRepresentante.setLocationRelativeTo(null);
        oRepresentante.setVisible(true);
    }//GEN-LAST:event_representantesjMenuItemActionPerformed

    private void tabelaPrecojMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabelaPrecojMenuItemActionPerformed
        // TODO add your handling code here:
        jFTabelaPreco oFormTabelaPreco = new jFTabelaPreco();

        oFormTabelaPreco.setTitle("Tabela de Preços");
        oFormTabelaPreco.setDefaultCloseOperation(jFTabelaPreco.DO_NOTHING_ON_CLOSE);
        oFormTabelaPreco.pack();
        oFormTabelaPreco.setLocationRelativeTo(null);
        oFormTabelaPreco.setVisible(true);
    }//GEN-LAST:event_tabelaPrecojMenuItemActionPerformed

    private void tipoContasjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoContasjMenuItemActionPerformed
        // TODO add your handling code here:
        jFTipoContas oFormTipoContas = new jFTipoContas();

        oFormTipoContas.setTitle("Tipo Contas");
        oFormTipoContas.setDefaultCloseOperation(jFTipoContas.DO_NOTHING_ON_CLOSE);
        oFormTipoContas.pack();
        oFormTipoContas.setLocationRelativeTo(null);
        oFormTipoContas.setVisible(true);
    }//GEN-LAST:event_tipoContasjMenuItemActionPerformed

    private void grupoContasjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoContasjMenuItemActionPerformed
        // TODO add your handling code here:
        jFGrupoContas oGrupoConta = new jFGrupoContas();

        oGrupoConta.setTitle("Grupo Contas");
        oGrupoConta.setDefaultCloseOperation(jFTipoContas.DO_NOTHING_ON_CLOSE);
        oGrupoConta.pack();
        oGrupoConta.setLocationRelativeTo(null);
        oGrupoConta.setVisible(true);
    }//GEN-LAST:event_grupoContasjMenuItemActionPerformed

    private void planoContasjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planoContasjMenuItemActionPerformed
        // TODO add your handling code here:
        jFPlanoContas oFormPlanoContas = new jFPlanoContas();

        oFormPlanoContas.setTitle("Plano de Contas");
        oFormPlanoContas.setDefaultCloseOperation(jFPlanoContas.DO_NOTHING_ON_CLOSE);
        oFormPlanoContas.pack();
        oFormPlanoContas.setLocationRelativeTo(null);
        oFormPlanoContas.setVisible(true);
    }//GEN-LAST:event_planoContasjMenuItemActionPerformed

    private void tipoFornecedoresjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoFornecedoresjMenuItemActionPerformed
        // TODO add your handling code here:
        jFTipoFornecedor oFormTipoFornecedor = new jFTipoFornecedor();

        oFormTipoFornecedor.setTitle("Tipo Fornecedores");
        oFormTipoFornecedor.setDefaultCloseOperation(jFTipoFornecedor.DO_NOTHING_ON_CLOSE);
        oFormTipoFornecedor.pack();
        oFormTipoFornecedor.setLocationRelativeTo(null);
        oFormTipoFornecedor.setVisible(true);
    }//GEN-LAST:event_tipoFornecedoresjMenuItemActionPerformed

    private void tiposClientesjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiposClientesjMenuItemActionPerformed
        // TODO add your handling code here:
        jFTiposClientes oFormTiposClietnes = new jFTiposClientes();

        oFormTiposClietnes.setTitle("Cadastro Tipos de Clientes");
        oFormTiposClietnes.setDefaultCloseOperation(jFTiposClientes.DO_NOTHING_ON_CLOSE);
        oFormTiposClietnes.pack();
        oFormTiposClietnes.setLocationRelativeTo(null);
        oFormTiposClietnes.setVisible(true);
    }//GEN-LAST:event_tiposClientesjMenuItemActionPerformed

    private void departamentosjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentosjMenuItemActionPerformed
        // TODO add your handling code here:
        jFDepartamento oFormDepartamento = new jFDepartamento();

        oFormDepartamento.setTitle("Cadastro Departamentos");
        oFormDepartamento.setDefaultCloseOperation(jFDepartamento.DO_NOTHING_ON_CLOSE);
        oFormDepartamento.pack();
        oFormDepartamento.setLocationRelativeTo(null);
        oFormDepartamento.setVisible(true);
    }//GEN-LAST:event_departamentosjMenuItemActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdministrativojMenu;
    private javax.swing.JMenuItem LogradourosjMenuItem;
    private javax.swing.JMenuItem atividadesjMenuItem;
    private javax.swing.JMenuItem bairrosjMenuItem;
    private javax.swing.JMenu cadastrosjMenu;
    private javax.swing.JMenuItem cidadesjMenuItem;
    private javax.swing.JMenu controlesjMenu;
    private javax.swing.JMenuItem departamentosjMenuItem;
    private javax.swing.JMenuItem estadosjMenuItem;
    private javax.swing.JMenuItem grupoContasjMenuItem;
    private javax.swing.JMenu localidadesjMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem paisesjMenuItem;
    private javax.swing.JMenuItem pessoasjMenuItem;
    private javax.swing.JMenuItem planoContasjMenuItem;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JMenuItem ramoAtividadesjMenuItem;
    private javax.swing.JMenuItem representantesjMenuItem;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JMenuItem tabelaPrecojMenuItem;
    private javax.swing.JMenuItem tipoContasjMenuItem;
    private javax.swing.JMenuItem tipoFornecedoresjMenuItem;
    private javax.swing.JMenuItem tiposClientesjMenuItem;
    private javax.swing.JMenuItem tiposLogradourosjMenuItem;
    // End of variables declaration//GEN-END:variables

    private final Timer messageTimer;
    private final Timer busyIconTimer;
    private final Icon idleIcon;
    private final Icon[] busyIcons = new Icon[15];
    private int busyIconIndex = 0;

    private JDialog aboutBox;
}
