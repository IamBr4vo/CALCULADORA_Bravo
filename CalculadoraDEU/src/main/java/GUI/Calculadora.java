/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.*;

/**
 *
 * @author Bravo
 */
public class Calculadora extends javax.swing.JFrame {
    private double numeroEnMemoria = 0;
    private List<Double> numeros = new ArrayList<>();
    private List<String> operadores = new ArrayList<>();
    private String ultimoOperador = "";

    /**
     * Creates new form Caalculadora
     */
    public Calculadora() {
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
        btnSumar = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        btnRestar = new javax.swing.JButton();
        txtCalcular = new javax.swing.JTextField();
        btnC = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivicion = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnMOD = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnMSuma = new javax.swing.JButton();
        btnMResta = new javax.swing.JButton();
        btnNegativo = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnSumar.setBackground(new java.awt.Color(102, 102, 102));
        btnSumar.setForeground(new java.awt.Color(255, 255, 255));
        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnOcho.setBackground(new java.awt.Color(153, 153, 153));
        btnOcho.setForeground(new java.awt.Color(255, 255, 255));
        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(102, 102, 102));
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnCuatro.setBackground(new java.awt.Color(153, 153, 153));
        btnCuatro.setForeground(new java.awt.Color(255, 255, 255));
        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnNueve.setBackground(new java.awt.Color(153, 153, 153));
        btnNueve.setForeground(new java.awt.Color(255, 255, 255));
        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(153, 153, 153));
        btnCinco.setForeground(new java.awt.Color(255, 255, 255));
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setBackground(new java.awt.Color(153, 153, 153));
        btnSeis.setForeground(new java.awt.Color(255, 255, 255));
        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnUno.setBackground(new java.awt.Color(153, 153, 153));
        btnUno.setForeground(new java.awt.Color(255, 255, 255));
        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnTres.setBackground(new java.awt.Color(153, 153, 153));
        btnTres.setForeground(new java.awt.Color(255, 255, 255));
        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnDos.setBackground(new java.awt.Color(153, 153, 153));
        btnDos.setForeground(new java.awt.Color(255, 255, 255));
        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnCero.setBackground(new java.awt.Color(153, 153, 153));
        btnCero.setForeground(new java.awt.Color(255, 255, 255));
        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Title.setText("Calculadora");

        btnRestar.setBackground(new java.awt.Color(102, 102, 102));
        btnRestar.setForeground(new java.awt.Color(255, 255, 255));
        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        txtCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalcularActionPerformed(evt);
            }
        });

        btnC.setBackground(new java.awt.Color(255, 51, 51));
        btnC.setForeground(new java.awt.Color(255, 255, 255));
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnMultiplicacion.setBackground(new java.awt.Color(102, 102, 102));
        btnMultiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicacion.setText("X");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnDivicion.setBackground(new java.awt.Color(102, 102, 102));
        btnDivicion.setForeground(new java.awt.Color(255, 255, 255));
        btnDivicion.setText("/");
        btnDivicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivicionActionPerformed(evt);
            }
        });

        btnSiete.setBackground(new java.awt.Color(153, 153, 153));
        btnSiete.setForeground(new java.awt.Color(255, 255, 255));
        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnPorcentaje.setBackground(new java.awt.Color(102, 102, 102));
        btnPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        btnPorcentaje.setText("%");
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });

        btnMOD.setBackground(new java.awt.Color(102, 102, 102));
        btnMOD.setForeground(new java.awt.Color(255, 255, 255));
        btnMOD.setText("MOD");
        btnMOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODActionPerformed(evt);
            }
        });

        btnCE.setBackground(new java.awt.Color(102, 102, 102));
        btnCE.setForeground(new java.awt.Color(255, 255, 255));
        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(102, 102, 102));
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("<--");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnMC.setBackground(new java.awt.Color(102, 102, 102));
        btnMC.setForeground(new java.awt.Color(255, 255, 255));
        btnMC.setText("MC");
        btnMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCActionPerformed(evt);
            }
        });

        btnMR.setBackground(new java.awt.Color(102, 102, 102));
        btnMR.setForeground(new java.awt.Color(255, 255, 255));
        btnMR.setText("MR");
        btnMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRActionPerformed(evt);
            }
        });

        btnMS.setBackground(new java.awt.Color(102, 102, 102));
        btnMS.setForeground(new java.awt.Color(255, 255, 255));
        btnMS.setText("MS");
        btnMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSActionPerformed(evt);
            }
        });

        btnMSuma.setBackground(new java.awt.Color(102, 102, 102));
        btnMSuma.setForeground(new java.awt.Color(255, 255, 255));
        btnMSuma.setText("M+");
        btnMSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSumaActionPerformed(evt);
            }
        });

        btnMResta.setBackground(new java.awt.Color(102, 102, 102));
        btnMResta.setForeground(new java.awt.Color(255, 255, 255));
        btnMResta.setText("M-");
        btnMResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRestaActionPerformed(evt);
            }
        });

        btnNegativo.setBackground(new java.awt.Color(102, 102, 102));
        btnNegativo.setForeground(new java.awt.Color(255, 255, 255));
        btnNegativo.setText("+-");
        btnNegativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativoActionPerformed(evt);
            }
        });

        btnDecimal.setBackground(new java.awt.Color(153, 153, 153));
        btnDecimal.setForeground(new java.awt.Color(255, 255, 255));
        btnDecimal.setText(".");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMOD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMResta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDivicion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMResta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNegativo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivicion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMOD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        String textoActual = txtCalcular.getText();
        if (!textoActual.isEmpty()) {
            double numero = Double.parseDouble(textoActual);
            numeros.add(numero);
            operadores.add("+");
            ultimoOperador = "+";
            txtCalcular.setText("");
        }
        txtCalcular.setText("");
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        txtCalcular.setText(txtCalcular.getText() + "8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        String textoActual = txtCalcular.getText();
        if (!textoActual.isEmpty()) {
            double numero = Double.parseDouble(textoActual);
            numeros.add(numero);
        }
        double resultado = numeros.get(0);
        for (int i = 0; i < operadores.size(); i++) {
            String operador = operadores.get(i);
            double siguienteNumero = numeros.get(i + 1);
            switch (operador) {
                case "+":
                    resultado += siguienteNumero;
                    break;
                case "-":
                    resultado -= siguienteNumero;
                    break;
                case "*":
                    resultado *= siguienteNumero;
                    break;
                case "/":
                    if (siguienteNumero != 0) {
                        resultado /= siguienteNumero;
                    } else {
                        txtCalcular.setText("Error");
                        return;
                    }
                    break;
                case "%":
                    resultado %= siguienteNumero;
                    break;
                case "MOD":
                    if (siguienteNumero != 0) {
                        resultado = resultado % siguienteNumero;
                    } else {
                        // Manejar la división por cero
                        txtCalcular.setText("Error");
                    }
                    break;
                default:
                    txtCalcular.setText("Operación no válida");
                    break;
            }
        }
        txtCalcular.setText(Double.toString(resultado));
        numeros.clear();
        operadores.clear();
        ultimoOperador = "";

    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        txtCalcular.setText(txtCalcular.getText() + "4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        txtCalcular.setText(txtCalcular.getText() + "9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        txtCalcular.setText(txtCalcular.getText() + "5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        txtCalcular.setText(txtCalcular.getText() + "6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        txtCalcular.setText(txtCalcular.getText() + "1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        txtCalcular.setText(txtCalcular.getText() + "3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        txtCalcular.setText(txtCalcular.getText() + "2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        txtCalcular.setText(txtCalcular.getText() + "0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        String textoActual = txtCalcular.getText();
        if (!textoActual.isEmpty()) {
            double numero = Double.parseDouble(textoActual);
            numeros.add(numero);
            operadores.add("-");
            ultimoOperador = "-";
            txtCalcular.setText("");
        }
        txtCalcular.setText("");

    }//GEN-LAST:event_btnRestarActionPerformed

    private void txtCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalcularActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtCalcular.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        String textoActual = txtCalcular.getText();
        if (!textoActual.isEmpty()) {
            double numero = Double.parseDouble(textoActual);
            numeros.add(numero);
            operadores.add("*");
            ultimoOperador = "*";
            txtCalcular.setText("");
        }
        txtCalcular.setText("");

    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivicionActionPerformed
        String textoActual = txtCalcular.getText();
        if (!textoActual.isEmpty()) {
            double numero = Double.parseDouble(textoActual);
            numeros.add(numero);
            operadores.add("/");
            ultimoOperador = "/";
            txtCalcular.setText("");
        }
        txtCalcular.setText("");

    }//GEN-LAST:event_btnDivicionActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        txtCalcular.setText(txtCalcular.getText() + "7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        String textoActual = txtCalcular.getText();
        if (!textoActual.isEmpty()) {
            double numero = Double.parseDouble(textoActual);
            numeros.add(numero);
            operadores.add("%");
            ultimoOperador = "%";
            txtCalcular.setText("");
        }
        txtCalcular.setText("");
    }//GEN-LAST:event_btnPorcentajeActionPerformed

    private void btnMODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODActionPerformed
        String textoActual = txtCalcular.getText();
        if (!textoActual.isEmpty()) {
            double numero = Double.parseDouble(textoActual);
            numeros.add(numero);
            operadores.add("MOD");
            ultimoOperador = "MOD";
            txtCalcular.setText("");
        }
        txtCalcular.setText("");
    }//GEN-LAST:event_btnMODActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        String textoActual = txtCalcular.getText();
        if (!textoActual.isEmpty()) {
            txtCalcular.setText("");
        }
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        String textoActual = txtCalcular.getText();
        if (!textoActual.isEmpty()) {
            int ultimaPosicion = textoActual.length() - 1;
            if (ultimaPosicion >= 0) {
                String nuevoTexto = textoActual.substring(0, ultimaPosicion);
                txtCalcular.setText(nuevoTexto);
            }
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCActionPerformed
        numeroEnMemoria = 0;
    }//GEN-LAST:event_btnMCActionPerformed

    private void btnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRActionPerformed
        txtCalcular.setText(Double.toString(numeroEnMemoria));
    }//GEN-LAST:event_btnMRActionPerformed

    private void btnMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSActionPerformed
        int numero = Integer.parseInt(txtCalcular.getText());
        numeroEnMemoria = numero;
    }//GEN-LAST:event_btnMSActionPerformed

    private void btnMSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSumaActionPerformed
        double numeroEnPantalla = Double.parseDouble(txtCalcular.getText());
        numeroEnMemoria += numeroEnPantalla;
    }//GEN-LAST:event_btnMSumaActionPerformed

    private void btnMRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRestaActionPerformed
        double numeroEnPantalla = Double.parseDouble(txtCalcular.getText());
        numeroEnMemoria -= numeroEnPantalla;
    }//GEN-LAST:event_btnMRestaActionPerformed

    private void btnNegativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativoActionPerformed
        String textoActual = txtCalcular.getText();
        if (!textoActual.isEmpty()) {
            double numeroActual = Integer.parseInt(textoActual);
            double numeroNegativo = -numeroActual;
            txtCalcular.setText(Double.toString(numeroNegativo));
        }
    }//GEN-LAST:event_btnNegativoActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        String textoActual = txtCalcular.getText();
        if (!textoActual.contains(".")) {
            txtCalcular.setText(textoActual + ".");
        }
    }//GEN-LAST:event_btnDecimalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDivicion;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMOD;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMResta;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnMSuma;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnNegativo;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCalcular;
    // End of variables declaration//GEN-END:variables
}
