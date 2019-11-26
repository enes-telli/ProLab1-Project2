package NewJFrame1;

import java.util.ArrayList;

public class USERvsPC extends javax.swing.JFrame {

    ArrayList<Pokemon> deste = new ArrayList<>();
    Oyuncu pc = new Bilgisayar(101010, "PC", 0);
    Oyuncu user = new Kullanici(183299, "Robert", 0);

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

    public void Kontrol(int deger) {
        if (deger == 0) {
            jLabel8.setIcon(jLabel4.getIcon());
            jLabel4.setIcon(jLabel5.getIcon());
            jLabel5.setIcon(jLabel6.getIcon());
            jLabel6.setIcon(null);
        } else if (deger == 1) {
            jLabel8.setIcon(jLabel5.getIcon());
            jLabel5.setIcon(jLabel6.getIcon());
            jLabel6.setIcon(null);
        } else if (deger == 2) {
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

    public USERvsPC() {
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
        button2 = new java.awt.Button();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

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

        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        button2.setEnabled(false);
        button2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button2.setLabel("Kart Çek");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Ortadaki Kart Sayısı:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("10/10");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Skor: 0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Skor: 0");

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
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addGap(28, 28, 28)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked

        button1.setEnabled(false);
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        for (int i = 0; i < 3; i++) {
            user.KartDagit(deste);
            pc.KartDagit(deste);
        }

        jLabel1.setIcon(user.getKartDestesi().get(0).resim);
        jLabel2.setIcon(user.getKartDestesi().get(1).resim);
        jLabel3.setIcon(user.getKartDestesi().get(2).resim);
        jLabel4.setIcon(pc.getKartDestesi().get(0).resim);
        jLabel5.setIcon(pc.getKartDestesi().get(1).resim);
        jLabel6.setIcon(pc.getKartDestesi().get(2).resim);
        jLabel10.setText("4/10");

    }//GEN-LAST:event_button1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        //if (jLabel1.getIcon() != null) {
        jLabel7.setIcon(jLabel1.getIcon());
        jLabel1.setIcon(jLabel2.getIcon());
        jLabel2.setIcon(jLabel3.getIcon());
        jLabel3.setIcon(null);
        int deger = pc.KartSec();
        Kontrol(deger);

        if (pc.getKartDestesi().get(deger).hasarPuaniGoster() > user.getKartDestesi().get(0).hasarPuaniGoster()) {
            pc.setSkor(pc.getSkor() + 5);
            jLabel12.setText("Skor: " + pc.getSkor());
        } else if (pc.getKartDestesi().get(deger).hasarPuaniGoster() < user.getKartDestesi().get(0).hasarPuaniGoster()) {
            user.setSkor(user.getSkor() + 5);
            jLabel11.setText("Skor: " + user.getSkor());
        }

        user.getKartDestesi().remove(0);
        pc.getKartDestesi().remove(deger);

        if ((jLabel1.getIcon() == null || jLabel2.getIcon() == null || jLabel3.getIcon() == null) && bt2kontrol != 2 && user.getKartDestesi().size() != 3) {
            button2.setEnabled(true);
            button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }

        if (user.getKartDestesi().size() == 2) {
            jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        } else if (user.getKartDestesi().size() == 1) {
            jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        } else if (user.getKartDestesi().size() == 0) {
            jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }

        if (deste.size() == 0 && user.getKartDestesi().size() == 0) {
            javax.swing.JOptionPane j = new javax.swing.JOptionPane();
            if (user.getSkor() > pc.getSkor()) {
                j.showMessageDialog(jLabel13, "Tebrikler, Kazandınız!", "Oyun Sonu", javax.swing.JOptionPane.WARNING_MESSAGE);
            } else if (user.getSkor() < pc.getSkor()) {
                j.showMessageDialog(jLabel13, "Maalesef, Kaybettiniz!", "Oyun Sonu", javax.swing.JOptionPane.WARNING_MESSAGE);
            } else {
                j.showMessageDialog(jLabel13, "Ne Tesadüf, Berabere!", "Oyun Sonu", javax.swing.JOptionPane.WARNING_MESSAGE);
            }
            dispose();
        }
        //}
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jLabel7.setIcon(jLabel2.getIcon());
        jLabel2.setIcon(jLabel3.getIcon());
        jLabel3.setIcon(null);
        int deger = pc.KartSec();
        Kontrol(deger);

        if (pc.getKartDestesi().get(deger).hasarPuaniGoster() > user.getKartDestesi().get(1).hasarPuaniGoster()) {
            pc.setSkor(pc.getSkor() + 5);
            jLabel12.setText("Skor: " + pc.getSkor());
        } else if (pc.getKartDestesi().get(deger).hasarPuaniGoster() < user.getKartDestesi().get(1).hasarPuaniGoster()) {
            user.setSkor(user.getSkor() + 5);
            jLabel11.setText("Skor: " + user.getSkor());
        }

        user.getKartDestesi().remove(1);
        pc.getKartDestesi().remove(deger);

        if ((jLabel1.getIcon() == null || jLabel2.getIcon() == null || jLabel3.getIcon() == null) && bt2kontrol != 2 && user.getKartDestesi().size() != 3) {
            button2.setEnabled(true);
            button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }

        if (user.getKartDestesi().size() == 2) {
            jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        } else if (user.getKartDestesi().size() == 1) {
            jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        jLabel7.setIcon(jLabel3.getIcon());
        jLabel3.setIcon(null);
        int deger = pc.KartSec();
        Kontrol(deger);

        if (pc.getKartDestesi().get(deger).hasarPuaniGoster() > user.getKartDestesi().get(2).hasarPuaniGoster()) {
            pc.setSkor(pc.getSkor() + 5);
            jLabel12.setText("Skor: " + pc.getSkor());
        } else if (pc.getKartDestesi().get(deger).hasarPuaniGoster() < user.getKartDestesi().get(2).hasarPuaniGoster()) {
            user.setSkor(user.getSkor() + 5);
            jLabel11.setText("Skor: " + user.getSkor());
        }

        user.getKartDestesi().remove(2);
        pc.getKartDestesi().remove(deger);

        if ((jLabel1.getIcon() == null || jLabel2.getIcon() == null || jLabel3.getIcon() == null) && bt2kontrol != 2 && user.getKartDestesi().size() != 3) {
            button2.setEnabled(true);
            button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }

        if (user.getKartDestesi().size() == 2) {
            jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }

    }//GEN-LAST:event_jLabel3MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        // TODO add your handling code here:
        bt2kontrol++;

        int a = (int) (Math.random() * deste.size());
        user.getKartDestesi().add(deste.get(a));
        deste.get(a).setKartKullanildiMi(true);
        deste.remove(a);
        int b = (int) (Math.random() * deste.size());
        pc.getKartDestesi().add(deste.get(b));
        deste.get(b).setKartKullanildiMi(true);
        deste.remove(b);

        if (user.getKartDestesi().size() == 3) {
            jLabel3.setIcon(user.getKartDestesi().get(2).resim);
            jLabel6.setIcon(pc.getKartDestesi().get(2).resim);
            jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        } else if (user.getKartDestesi().size() == 2) {
            jLabel2.setIcon(user.getKartDestesi().get(1).resim);
            jLabel5.setIcon(pc.getKartDestesi().get(1).resim);
            jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        } else if (user.getKartDestesi().size() == 1) {
            jLabel1.setIcon(user.getKartDestesi().get(0).resim);
            jLabel4.setIcon(pc.getKartDestesi().get(0).resim);
            jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }

        if (bt2kontrol >= 2 || user.getKartDestesi().size() == 3) {
            button2.setEnabled(false);
            button2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
        
        jLabel10.setText(deste.size() + "/10");
        
    }//GEN-LAST:event_button2MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new USERvsPC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
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
