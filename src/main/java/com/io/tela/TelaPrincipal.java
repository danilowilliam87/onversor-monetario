/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.io.tela;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.io.dominio.Moeda;
import com.io.excecao.ConversorException;
import com.io.excecao.UtilException;
import com.io.impl.ConversorImpl;

/**
 *
 * @author Danil
 */
public class TelaPrincipal extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Creates new form TelaPrincipal
	 */
	public TelaPrincipal() {
		initComponents();
		carregarCombo();
		inputSaida.setEditable(false);
		desabilitarComponentes();
	}

	private void carregarCombo() {
		List<String> lista = new ArrayList<>();
		lista.add("Escolha uma opção");
		lista.add("Dolar");
		lista.add("Real");
		lista.add("Euro");
		lista.add("Peso Argentino");
		lista.add("Peso Chileno");
		lista.add("Libra Esterlina");

		lista.forEach(item -> {
			cbMoedaOrigem.addItem(item);
			cbMoedaDestino.addItem(item);
		});
	}

	private void desabilitarComponentes() {
		btNovaOperacao.setEnabled(false);
		cbMoedaDestino.setEnabled(false);
		inputValor.setEditable(false);
	}

	private void habilitarComponentes() {
		btNovaOperacao.setEnabled(true);
		cbMoedaDestino.setEnabled(true);
		inputValor.setEditable(true);
	}
        
        private void desabilitarCamposDeEntrada(){
            inputValor.setEditable(false);
            cbMoedaOrigem.setSelectedIndex(0);
            cbMoedaDestino.setSelectedIndex(0);
            cbMoedaOrigem.setEnabled(false);
            cbMoedaDestino.setEnabled(false);
            btNovaOperacao.setEnabled(true);
        }
        
        private void habilitarCamposDeEntrada(){
             inputValor.setEditable(true);
              cbMoedaOrigem.setEnabled(true);
              inputValor.setEditable(true);
              inputValor.setText("");
              inputSaida.setText("");
        }
        

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbMoedaOrigem = new javax.swing.JComboBox<>();
        inputValor = new javax.swing.JTextField();
        cbMoedaDestino = new javax.swing.JComboBox<>();
        inputSaida = new javax.swing.JTextField();
        lblSaida = new javax.swing.JLabel();
        btNovaOperacao = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Conversor de Moedas");

        cbMoedaOrigem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbMoedaOrigem.setForeground(new java.awt.Color(102, 51, 255));
        cbMoedaOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMoedaOrigemActionPerformed(evt);
            }
        });

        inputValor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inputValor.setForeground(new java.awt.Color(0, 102, 255));

        cbMoedaDestino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbMoedaDestino.setForeground(new java.awt.Color(0, 0, 255));
        cbMoedaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMoedaDestinoActionPerformed(evt);
            }
        });

        inputSaida.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        inputSaida.setForeground(new java.awt.Color(0, 0, 255));

        lblSaida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSaida.setForeground(new java.awt.Color(0, 153, 0));
        lblSaida.setText("Resultado");

        btNovaOperacao.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btNovaOperacao.setForeground(new java.awt.Color(0, 51, 255));
        btNovaOperacao.setText("NOVA CONVERSÃO");
        btNovaOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaOperacaoActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btSair.setForeground(new java.awt.Color(0, 51, 255));
        btSair.setText("SAIR");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblSaida)
                        .addGap(31, 31, 31)
                        .addComponent(inputSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btNovaOperacao)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbMoedaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbMoedaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMoedaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMoedaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaida)
                    .addComponent(btNovaOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovaOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaOperacaoActionPerformed
        // TODO add your handling code here:
        habilitarCamposDeEntrada();
    }//GEN-LAST:event_btNovaOperacaoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btSairActionPerformed
	


	private void cbMoedaDestinoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbMoedaDestinoActionPerformed
		// TODO add your handling code here:
		try {
			if (cbMoedaOrigem.getSelectedIndex() > 0 && cbMoedaDestino.getSelectedIndex() > 0) {
				String pacoteBase = "com.io.dominio.";
				String moedaOrigem = pacoteBase.concat(cbMoedaOrigem.getSelectedItem().toString().trim().replace(" ","" ));
				String moedaDestino = pacoteBase.concat(cbMoedaDestino.getSelectedItem().toString().trim().replace(" ","" ));

				Class<?> classeMoedaOrigem = Class.forName(moedaOrigem);
				Class<?> classeMoedaDestino = Class.forName(moedaDestino);

				Constructor<?> construtor1 = classeMoedaOrigem.getConstructor();
				Constructor<?> construtor2 = classeMoedaDestino.getConstructor();

				Object object1 = construtor1.newInstance();
				Object object2 = construtor2.newInstance();

				Moeda moeda1 = (Moeda) object1;
				Moeda moeda2 = (Moeda) object2;
                                
                                double valor = Double.parseDouble(inputValor.getText());

				BigDecimal bigDecimal = new BigDecimal(valor);
				moeda1.setValor(bigDecimal);

				ConversorImpl impl = new ConversorImpl();
				inputSaida.setText(impl.converter(moeda1, moeda2).toString());
                                
                                desabilitarCamposDeEntrada();
                                
			}
		} catch (UtilException e) {
			JOptionPane.showMessageDialog(null, "Api nao dispoe da cotacao desta moeda");
		} catch (ConversorException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Erro ao tentar realizar conversao");
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "voce nao informou quanto deseja converter");
                        inputValor.requestFocus(true);
		}

	}// GEN-LAST:event_cbMoedaDestinoActionPerformed

	private void cbMoedaOrigemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbMoedaOrigemActionPerformed
		// TODO add your handling code here:
		if (cbMoedaOrigem.getSelectedIndex() != 0) {
			habilitarComponentes();
		} else {
			desabilitarComponentes();
		}
	}// GEN-LAST:event_cbMoedaOrigemActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaPrincipal().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovaOperacao;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cbMoedaDestino;
    private javax.swing.JComboBox<String> cbMoedaOrigem;
    private javax.swing.JTextField inputSaida;
    private javax.swing.JTextField inputValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSaida;
    // End of variables declaration//GEN-END:variables
}
