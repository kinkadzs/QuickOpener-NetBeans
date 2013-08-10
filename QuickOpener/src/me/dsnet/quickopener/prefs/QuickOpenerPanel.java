/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.quickopener.prefs;

import java.awt.CardLayout;
import java.awt.LayoutManager;

public final class QuickOpenerPanel extends javax.swing.JPanel {

    private final QuickOpenerOptionsPanelController controller;
    

    QuickOpenerPanel(QuickOpenerOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        jList1.setSelectedIndex(0);
        commandsPanel1.setVisible(false);
        placesPanel1.setVisible(true);
        generalPanel1.setVisible(false);
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jRightPanel = new javax.swing.JPanel();
        placesPanel1 = new me.dsnet.quickopener.prefs.PlacesPanel();
        commandsPanel1 = new me.dsnet.quickopener.prefs.CommandsPanel();
        generalPanel1 = new me.dsnet.quickopener.prefs.GeneralPanel();

        jSplitPane1.setBorder(null);
        jSplitPane1.setDividerSize(0);

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Places", "Commands", "General Options" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(QuickOpenerPanel.class, "QuickOpenerPanel.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jList1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jList1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jRightPanel.setLayout(new java.awt.CardLayout());
        jRightPanel.add(placesPanel1, "placesPanel1");
        jRightPanel.add(commandsPanel1, "commandsPanel1");
        jRightPanel.add(generalPanel1, "generalPanel1");

        jSplitPane1.setRightComponent(jRightPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSplitPane1)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
            LayoutManager layout = jRightPanel.getLayout();
            if (layout instanceof CardLayout) {
                CardLayout cardLayout = (CardLayout) layout;
                
                
        if(jList1.getSelectedIndex()==0){
            cardLayout.show(jRightPanel, "placesPanel1");
        }else if(jList1.getSelectedIndex()==1){
            cardLayout.show(jRightPanel, "commandsPanel1");
        }else{
            cardLayout.show(jRightPanel, "generalPanel1");
            }
        }
    }//GEN-LAST:event_jList1ValueChanged

    
    
    void load() {
    }

    void store() {        
    }

    boolean valid() {        
        return true;
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private me.dsnet.quickopener.prefs.CommandsPanel commandsPanel1;
    private me.dsnet.quickopener.prefs.GeneralPanel generalPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jRightPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private me.dsnet.quickopener.prefs.PlacesPanel placesPanel1;
    // End of variables declaration//GEN-END:variables
}
