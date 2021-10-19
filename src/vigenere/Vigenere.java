/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vigenere;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author will
 */
public class Vigenere extends javax.swing.JFrame {

    /**
     * Creates new form Vigene
     */
    public Vigenere() {
        initComponents();
        setLocation(200, 200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        decifrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        input = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        chaveField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        cifrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vigenere");

        decifrar.setText("Decifrar");
        decifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decifrarActionPerformed(evt);
            }
        });

        input.setColumns(20);
        input.setRows(5);
        jScrollPane1.setViewportView(input);

        jLabel1.setText("Chave");

        output.setColumns(20);
        output.setRows(5);
        jScrollPane2.setViewportView(output);

        cifrar.setText("Cifrar");
        cifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cifrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(cifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(decifrar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chaveField))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chaveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decifrar)
                    .addComponent(cifrar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cifrarActionPerformed
        output.setText("");
        new Thread(cifrarV).start();
    }//GEN-LAST:event_cifrarActionPerformed

    private void decifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decifrarActionPerformed
        new Thread(decifrarV).start();
        output.setText("");
    }//GEN-LAST:event_decifrarActionPerformed

    private final Runnable cifrarV = new Runnable() {
        @Override
        public void run() {
            String texto = input.getText();
            String chave = chaveField.getText();
            int ascii = 0, contKey = 0, sizeKey = chave.length() - 1, sizeChar = texto.length();
            output.setText("");
            if (!chave.equals("")) {
                for (int i = 0; i < sizeChar; i++) {
                    ascii = (int) texto.charAt(i);
                    ascii += (int) chave.charAt(contKey);
                    output.append(""+((char) ascii));
                    if (contKey != sizeKey) {
                        contKey++;
                    } else {
                        contKey = 0;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null,"Defina sua chave");
            }
        }
    };

    private final Runnable decifrarV = new Runnable() {
        @Override
        public void run() {
            String texto = input.getText();
            String chave = chaveField.getText();
            int ascii = 0, contKey = 0, sizeKey = chave.length() - 1, sizeChar = texto.length();
            output.setText("");
            if (!chave.equals("")) {
                for (int i = 0; i < sizeChar; i++) {
                    ascii = (int) texto.charAt(i);
                    ascii -= (int) chave.charAt(contKey);
                    output.append(""+((char) ascii));
                    if (contKey != sizeKey) {
                        contKey++;
                    } else {
                        contKey = 0;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null,"Defina sua chave!");
            }
        }
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vigenere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chaveField;
    private javax.swing.JButton cifrar;
    private javax.swing.JButton decifrar;
    private javax.swing.JTextArea input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea output;
    // End of variables declaration//GEN-END:variables
}
