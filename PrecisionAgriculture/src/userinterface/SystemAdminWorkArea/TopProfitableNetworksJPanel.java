/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Farmer.Farmer;
import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author aksha
 */
public class TopProfitableNetworksJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
private EcoSystem system;
    /**
     * Creates new form TopProfitableNetworksJPanel
     */
   
    TopProfitableNetworksJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        calculateProfit();
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();

        barChartData.setValue(profitIndia, "Profit", "India");
        barChartData.setValue(profitBoston, "Profit", "Boston");

       // barChartData.setValue(30000, "Contribution Amount", "MARCH");
        JFreeChart barChart = ChartFactory.createBarChart("Walmart Network Profit", "Network", "Profit in thousand $", barChartData, PlotOrientation.VERTICAL, false, true , false );
        CategoryPlot barChrt = barChart.getCategoryPlot();
        barChrt.setRangeGridlinePaint(Color.ORANGE);
        
        ChartPanel barPanel = new ChartPanel(barChart);
        panelChart.removeAll();
        panelChart.add(barPanel);
        panelChart.validate();
    }
    
    public int profitIndia =0;
    public int profitBoston =0;
public void calculateProfit() {
    for(Network network : system.getNetworkList())
    {
        if(network.getName().equalsIgnoreCase("India"))
        {
        for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
        {
           for(Farmer farmer : enterprise.getFarmerDirectory().getFarmerList())
           {
               profitIndia =+ farmer.getCropPrice();
           }
        }
    } else if(network.getName().equalsIgnoreCase("Boston"))
    {
        for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
        {
           for(Farmer farmer : enterprise.getFarmerDirectory().getFarmerList())
           {
               profitBoston =+ farmer.getCropPrice();
           }
        }
    }
}
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        panelChart = new javax.swing.JPanel();

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        panelChart.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addContainerGap(774, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 571, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
//                Component[] componentArray = userProcessContainer.getComponents();
//                Component component = componentArray[componentArray.length - 1];
//                SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
//        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JPanel panelChart;
    // End of variables declaration//GEN-END:variables
}
