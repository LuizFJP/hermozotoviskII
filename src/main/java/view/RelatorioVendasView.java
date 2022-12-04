/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.VendaDAO;
import java.awt.Color;
import java.util.Collections;
import java.util.List;
import model.Venda;

/**
 *
 * @author sonho
 */
public class RelatorioVendasView extends javax.swing.JFrame {
    VendaDAO vendinha = new VendaDAO();
    Venda venda;
    /**
     * Creates new form RelatorioVendasView
     */
    public RelatorioVendasView() {
        initComponents();
        this.setTitle("Relatório de Vendas");
        decoracao();
        List<Venda> vendas = this.vendinha.getVendas();
        Collections.sort(vendas, venda);
        double total = 0;
        for(Venda v : vendinha.getVendas()){
            taMostraVenda.append(v.toString() + "\n");
            total += v.getValorTotal();
        }
        taTotalVendas.append("R$"+Double.toString(total));
    }
    public void abrirTela(){
        this.setVisible(true);
    }
    
    private void decoracao(){
        getContentPane().setBackground(Color.decode("#3f3f46"));
        lbLista.setForeground(Color.decode("#fafaf9"));
        lbTotal.setForeground(Color.decode("#fafaf9"));
        lbVendas.setForeground(Color.decode("#fafaf9"));
        lbPesquisa.setForeground(Color.decode("#fafaf9"));
        tfBuscaCodigo.setBackground(Color.decode("#f3f4f6"));
        tfBuscaCodigo.setForeground(Color.decode("#18181b"));
        btPesquisar.setBackground(Color.decode("#38bdf8"));
        btPesquisar.setForeground(Color.decode("#fafaf9"));
        taTotalVendas.setBackground(Color.decode("#f3f4f6"));
        taTotalVendas.setForeground(Color.decode("#18181b"));
        taMostraVenda.setBackground(Color.decode("#f3f4f6"));
        taMostraVenda.setForeground(Color.decode("#18181b"));
        taListaVenda.setBackground(Color.decode("#f3f4f6"));
        taListaVenda.setForeground(Color.decode("#18181b"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taMostraVenda = new javax.swing.JTextArea();
        lbVendas = new javax.swing.JLabel();
        tfBuscaCodigo = new javax.swing.JTextField();
        lbPesquisa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taListaVenda = new javax.swing.JTextArea();
        btPesquisar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        taTotalVendas = new javax.swing.JTextArea();
        lbTotal = new javax.swing.JLabel();
        lbLista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(63, 63, 70));

        taMostraVenda.setEditable(false);
        taMostraVenda.setColumns(20);
        taMostraVenda.setLineWrap(true);
        taMostraVenda.setRows(5);
        jScrollPane1.setViewportView(taMostraVenda);

        lbVendas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbVendas.setText("Relatório de Vendas");

        tfBuscaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscaCodigoActionPerformed(evt);
            }
        });

        lbPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPesquisa.setText("Pesquisar por código");

        taListaVenda.setEditable(false);
        taListaVenda.setColumns(20);
        taListaVenda.setRows(5);
        jScrollPane2.setViewportView(taListaVenda);

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        taTotalVendas.setEditable(false);
        taTotalVendas.setColumns(20);
        taTotalVendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        taTotalVendas.setLineWrap(true);
        taTotalVendas.setRows(1);
        taTotalVendas.setAutoscrolls(false);
        jScrollPane3.setViewportView(taTotalVendas);

        lbTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotal.setText("Total:");

        lbLista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbLista.setText("Lista de Vendas no Sistema");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfBuscaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbPesquisa)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTotal)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLista)
                    .addComponent(lbVendas))
                .addGap(457, 457, 457))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lbVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(lbLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTotal)
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPesquisa)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBuscaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(tfBuscaCodigo.getText());
        for(Venda v : vendinha.getVendas()){
            if(codigo == v.getCodigo()){
                taListaVenda.append(v.toString());
            }
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tfBuscaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscaCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscaCodigoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbLista;
    private javax.swing.JLabel lbPesquisa;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbVendas;
    private javax.swing.JTextArea taListaVenda;
    private javax.swing.JTextArea taMostraVenda;
    private javax.swing.JTextArea taTotalVendas;
    private javax.swing.JTextField tfBuscaCodigo;
    // End of variables declaration//GEN-END:variables
}
