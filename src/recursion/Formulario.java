/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package recursion;

import javax.swing.JOptionPane;

/**
 *
 * @author Charly
 */
public class Formulario extends javax.swing.JFrame {

    Recursion recursion = new Recursion();

    public Formulario() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0: Numeros Primos", "1: Suma de numeros", "2: Suma de numeros pares", "3: Suma de numeros impares", "4: Factorial", "5: Fibonacci", "6: Multiplicacion", "7: Potencia", "8: Invertir", "9: Contar digitos", "10: Contar digitos pares", "11: Sumar digitos factoriales", "12: Sumar factoriales", "13: Sumar digitos factoriales pares", "14: Sumar digitos factoriales impares", "15: Sumar factoriales pares", "16: Sumar factoriales impares", "17: [Mostrar todo]" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numeros: "));
        int[] array = new int[n];
        switch (jComboBox1.getSelectedIndex()) {
            case 0 -> {
                recursion.generarPrimos(array.length, 1, array, 0);
                for (int i = 0; i < array.length; i++) {
                    jTextArea1.append(array[i] + ", ");
                }
            }
            case 1 -> {
                jTextArea1.setText(recursion.sumaDeNumeros(n) + "");
            }
            case 2 -> {
                jTextArea1.setText(recursion.sumaDeNumerosPares(n) + "");
            }
            case 3 -> {
                jTextArea1.setText(recursion.sumaDeNumerosImpares(n) + "");
            }
            case 4 -> {
                jTextArea1.setText(recursion.factorial(n) + "");
            }
            case 5 -> {
                jTextArea1.setText(recursion.fibonacci(n) + "");
            }
            case 6 -> {
                int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numeros: "));
                jTextArea1.setText(recursion.multiplicar(n, b) + "");
            }
            case 7 -> {
                int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numeros: "));
                jTextArea1.setText(recursion.potencia(n, b) + "");
            }
            case 8 -> {
                jTextArea1.setText(recursion.invertir(n, (n + "").length() - 1) + "");
            }
            case 9 -> {
                jTextArea1.setText(recursion.contarDigitos(n) + "");
            }
            case 10 -> {
                jTextArea1.setText(recursion.contarDigitosPares(n) + "");
            }
            case 11 -> {
                jTextArea1.setText(recursion.sumarDigitosFactoriales(n) + "");
            }
            case 12 -> {
                jTextArea1.setText(recursion.sumarFactoriales(n) + "");
            }
            case 13 -> {
                jTextArea1.setText(recursion.sumarDigitosFactorialesPares(n) + "");
            }
            case 14 -> {
                jTextArea1.setText(recursion.sumarDigitosFactorialesImpares(n) + "");
            }
            case 15 -> {
                jTextArea1.setText(recursion.sumarFactorialesPares(n) + "\n");
            }
            case 16 -> {
                jTextArea1.setText(recursion.sumarFactorialesImpares(n) + "\n");
            }
        }
//        System.out.println("1 suma de numeros: " + sumaDeNumeros(3));
//        System.out.println("2 suma de numeros pares: " + sumaDeNumerosPares(6));
//        System.out.println("3 suma de numeros impares: " + sumaDeNumerosImpares(6));
//        System.out.println("4 factorial: " + factorial(2));
//        System.out.println("5 fibonacci: " + fibonacci(5 - 1));
//        System.out.println("6 multiplicacion: " + multiplicar(5, 4));
//        System.out.println("7 potencia: " + potencia(5, 4));
//        System.out.println("8 invertir: " + invertir(12345, 4));
//        System.out.println("9 digitos: " + contarDigitos(12345));
//        System.out.println("10 digitos pares: " + contarDigitosPares(1234));
//        System.out.println("11 suma de digitos factoriales: " + sumarDigitosFactoriales(7));
//        System.out.println("12 sumar factoriales: " + sumarFactoriales(7));
//        System.out.println("13 sumar digitos factoriales pares: " + sumarDigitosFactorialesPares(4780));
//        System.out.println("14 sumar digitos factoriales impares: " + sumarDigitosFactorialesImpares(1357));
//        System.out.println("15 sumar factoriales pares: " + sumarFactorialesPares(3));
//        System.out.println("16 sumar factoriales impares: " + sumarFactorialesImpares(3));
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
