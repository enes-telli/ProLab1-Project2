package NewJFrame1;

import java.util.ArrayList;

public class PCvsPC extends javax.swing.JFrame {

    ArrayList<Pokemon> deste = new ArrayList<>();
    Oyuncu pc1 = new Bilgisayar(101010, "PC1", 0);
    Oyuncu pc2 = new Bilgisayar(010101, "PC2", 0);

    //Polymorphism
    Pokemon bulbasaur = new Bulbasaur("Bulbasaur", "Çim", "/images/Bulbasaur.jpg");
    Pokemon butterfree = new Butterfree("Butterfree", "Hava", "/images/Butterfree.jpg");
    Pokemon charmander = new Charmander("Charmander", "Ateş", "/images/Charmander.jpg");
    Pokemon jigglypuff = new Jigglypuff("Jigglypuff", "Ses", "/images/Jigglypuff.jpg");
    Pokemon meowth = new Meowth("Meowth", "Normal", "/images/Meowth.jpg");
    Pokemon pikachu = new Pikachu("Pikachu", "Elektrik", "/images/Pikachu.jpg");
    Pokemon psyduck = new Psyduck("Psyduck", "Su", "/images/Psyduck.jpg");
    Pokemon snorlax = new Snorlax("Snorlax", "Normal", "/images/Snorlax.jpg");
    Pokemon squirtle = new Squirtle("Squirtle", "Su", "/images/Squirtle.jpg");
    Pokemon zubat = new Zubat("Zubat", "Hava", "/images/Zubat.jpg");

    int bt2kontrol = 0;

    public void Kontrol1(int deger1) {
        if (deger1 == 0) {
            jLabel7.setIcon(jLabel1.getIcon());
            jLabel1.setIcon(jLabel2.getIcon());
            jLabel2.setIcon(jLabel3.getIcon());
            jLabel3.setIcon(null);
        } else if (deger1 == 1) {
            jLabel7.setIcon(jLabel2.getIcon());
            jLabel2.setIcon(jLabel3.getIcon());
            jLabel3.setIcon(null);
        } else if (deger1 == 2) {
            jLabel7.setIcon(jLabel3.getIcon());
            jLabel3.setIcon(null);
        }
    }

    public void Kontrol2(int deger2) {
        if (deger2 == 0) {
            jLabel8.setIcon(jLabel4.getIcon());
            jLabel4.setIcon(jLabel5.getIcon());
            jLabel5.setIcon(jLabel6.getIcon());
            jLabel6.setIcon(null);
        } else if (deger2 == 1) {
            jLabel8.setIcon(jLabel5.getIcon());
            jLabel5.setIcon(jLabel6.getIcon());
            jLabel6.setIcon(null);
        } else if (deger2 == 2) {
            jLabel8.setIcon(jLabel6.getIcon());
            jLabel6.setIcon(null);
        }
    }

    public void CardGame() {
        //kartlistesi 
        deste.add(bulbasaur);
        deste.add(butterfree);
        deste.add(charmander);
        deste.add(jigglypuff);
        deste.add(meowth);
        deste.add(pikachu);
        deste.add(psyduck);
        deste.add(snorlax);
        deste.add(squirtle);
        deste.add(zubat);

    }

    public PCvsPC() {
        initComponents();
        CardGame();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button1.setLabel("Kart Dağıt");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Ortadaki Kart Sayısı:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("10/10");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Skor: 0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Skor: 0");

        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button2.setEnabled(false);
        button2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button2.setLabel("Kart Çek");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });

        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button3.setEnabled(false);
        button3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button3.setLabel("Kart At");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(184, 184, 184)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(397, 397, 397))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(177, 177, 177))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(62, 62, 62)
                .addComponent(jLabel13)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addGap(21, 21, 21)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked

        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(true);
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        for (int i = 0; i < 3; i++) {
            pc1.KartDagit(deste);
            pc2.KartDagit(deste);
        }

        jLabel1.setIcon(pc1.getKartDestesi().get(0).resim);
        jLabel2.setIcon(pc1.getKartDestesi().get(1).resim);
        jLabel3.setIcon(pc1.getKartDestesi().get(2).resim);
        jLabel4.setIcon(pc2.getKartDestesi().get(0).resim);
        jLabel5.setIcon(pc2.getKartDestesi().get(1).resim);
        jLabel6.setIcon(pc2.getKartDestesi().get(2).resim);
        jLabel10.setText("4/10");

    }//GEN-LAST:event_button1MouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        // TODO add your handling code here:
        bt2kontrol++;

        int a = (int) (Math.random() * deste.size());
        pc1.getKartDestesi().add(deste.get(a));
        deste.remove(a);
        int b = (int) (Math.random() * deste.size());
        pc2.getKartDestesi().add(deste.get(b));
        deste.remove(b);

        if (pc1.getKartDestesi().size() == 3) {
            jLabel3.setIcon(pc1.getKartDestesi().get(2).resim);
            jLabel6.setIcon(pc2.getKartDestesi().get(2).resim);
        } else if (pc1.getKartDestesi().size() == 2) {
            jLabel2.setIcon(pc1.getKartDestesi().get(1).resim);
            jLabel5.setIcon(pc2.getKartDestesi().get(1).resim);
        } else if (pc1.getKartDestesi().size() == 1) {
            jLabel1.setIcon(pc1.getKartDestesi().get(0).resim);
            jLabel4.setIcon(pc2.getKartDestesi().get(0).resim);
        }

        if (bt2kontrol >= 2 || pc1.getKartDestesi().size() == 3) {
            button2.setEnabled(false);
            button2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }

        if ((jLabel1.getIcon() == null || jLabel2.getIcon() == null || jLabel3.getIcon() == null) && bt2kontrol <= 2 && pc1.getKartDestesi().size() != 3) {
            button3.setEnabled(true);
            button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }

        jLabel10.setText(deste.size() + "/10");

    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        // TODO add your handling code here:
        int deger1 = pc1.KartSec();
        Kontrol1(deger1);
        int deger2 = pc2.KartSec();
        Kontrol2(deger2);

        if (pc1.getKartDestesi().get(deger1).hasarPuaniGoster() > pc2.getKartDestesi().get(deger2).hasarPuaniGoster()) {
            pc1.setSkor(pc1.getSkor() + 5);
            jLabel11.setText("Skor: " + pc1.getSkor());
        } else if (pc1.getKartDestesi().get(deger1).hasarPuaniGoster() < pc2.getKartDestesi().get(deger2).hasarPuaniGoster()) {
            pc2.setSkor(pc2.getSkor() + 5);
            jLabel12.setText("Skor: " + pc2.getSkor());
        }

        pc1.getKartDestesi().remove(deger1);
        pc2.getKartDestesi().remove(deger2);

        if ((jLabel1.getIcon() == null || jLabel2.getIcon() == null || jLabel3.getIcon() == null) && bt2kontrol != 2 && pc1.getKartDestesi().size() != 3) {
            button2.setEnabled(true);
            button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }

        if (jLabel1.getIcon() == null && jLabel2.getIcon() == null && jLabel3.getIcon() == null) {
            button3.setEnabled(false);
            button3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }

        if (deste.size() == 0 && pc1.getKartDestesi().size() == 0) {
            javax.swing.JOptionPane j = new javax.swing.JOptionPane();
            if (pc1.getSkor() > pc2.getSkor()) {
                j.showMessageDialog(jLabel13, "PC1 Kazandı!", "Oyun Sonu", javax.swing.JOptionPane.WARNING_MESSAGE);
            } else if (pc1.getSkor() < pc2.getSkor()) {
                j.showMessageDialog(jLabel13, "PC2 Kazandı!", "Oyun Sonu", javax.swing.JOptionPane.WARNING_MESSAGE);
            } else {
                j.showMessageDialog(jLabel13, "Ne Tesadüf, Berabere!", "Oyun Sonu", javax.swing.JOptionPane.WARNING_MESSAGE);
            }
            dispose();
        }

    }//GEN-LAST:event_button3MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PCvsPC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
