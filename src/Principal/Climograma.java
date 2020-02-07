
package Principal;

import java.awt.BorderLayout;

/**
 *
 * @author munchi
 */
public class Climograma extends javax.swing.JFrame {
    int[] humedad = new int[12];
    int[] temperatura = new int[12];
    MyCanvas canvas ;
    /**
     * Creates new form Climograma
     */
    public Climograma() {
        initComponents();
        canvas = new MyCanvas();
        getContentPane().setLayout(new BorderLayout());
        canvasPanel.setLayout(new BorderLayout());
        canvasPanel.add(canvas, BorderLayout.CENTER);
        canvas.setVisible(true);
        canvas.repaint();
        
        
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        HumEn = new javax.swing.JTextField();
        HumFe = new javax.swing.JTextField();
        HumMar = new javax.swing.JTextField();
        HumAb = new javax.swing.JTextField();
        HumMay = new javax.swing.JTextField();
        HumJun = new javax.swing.JTextField();
        HumJul = new javax.swing.JTextField();
        HumAg = new javax.swing.JTextField();
        HumSep = new javax.swing.JTextField();
        HumOc = new javax.swing.JTextField();
        HumNo = new javax.swing.JTextField();
        HumDi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TemEn = new javax.swing.JTextField();
        TemFe = new javax.swing.JTextField();
        TemMar = new javax.swing.JTextField();
        TemAb = new javax.swing.JTextField();
        TemMay = new javax.swing.JTextField();
        TemJun = new javax.swing.JTextField();
        TemJul = new javax.swing.JTextField();
        TemAg = new javax.swing.JTextField();
        TemSe = new javax.swing.JTextField();
        TemOc = new javax.swing.JTextField();
        TemNo = new javax.swing.JTextField();
        TemDi = new javax.swing.JTextField();
        canvasPanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        actualizarB = new javax.swing.JButton();
        tituloTF = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enero:");

        jLabel2.setText("Febrero:");

        jLabel3.setText("Marzo:");

        jLabel4.setText("Abril:");

        jLabel5.setText("Mayo:");

        jLabel6.setText("Junio:");

        jLabel7.setText("Julio:");

        jLabel8.setText("Agosto:");

        jLabel9.setText("Septiembre:");

        jLabel10.setText("Octubre:");

        jLabel11.setText("Noviembre:");

        jLabel12.setText("Diciembre:");

        HumFe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HumFeActionPerformed(evt);
            }
        });

        HumAb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HumAbActionPerformed(evt);
            }
        });

        HumOc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HumOcActionPerformed(evt);
            }
        });

        HumNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HumNoActionPerformed(evt);
            }
        });

        HumDi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HumDiActionPerformed(evt);
            }
        });

        jLabel13.setText("Humedad (%)");

        jLabel14.setText("Temperatura (ºC)");

        TemAb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemAbActionPerformed(evt);
            }
        });

        TemJul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemJulActionPerformed(evt);
            }
        });

        TemAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemAgActionPerformed(evt);
            }
        });

        TemSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemSeActionPerformed(evt);
            }
        });

        TemNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemNoActionPerformed(evt);
            }
        });

        TemDi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemDiActionPerformed(evt);
            }
        });

        canvasPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout canvasPanelLayout = new javax.swing.GroupLayout(canvasPanel);
        canvasPanel.setLayout(canvasPanelLayout);
        canvasPanelLayout.setHorizontalGroup(
            canvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        canvasPanelLayout.setVerticalGroup(
            canvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("0");

        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("10");

        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("20");

        jLabel15.setForeground(new java.awt.Color(255, 0, 51));
        jLabel15.setText("30");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("40");

        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("50");

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("60");

        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("70");

        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("ºC");

        jLabel22.setForeground(new java.awt.Color(0, 0, 255));
        jLabel22.setText("60");

        jLabel26.setForeground(new java.awt.Color(0, 0, 255));
        jLabel26.setText("80");

        jLabel27.setForeground(new java.awt.Color(0, 0, 255));
        jLabel27.setText("100");

        jLabel28.setForeground(new java.awt.Color(0, 0, 255));
        jLabel28.setText("120");

        jLabel29.setForeground(new java.awt.Color(0, 0, 255));
        jLabel29.setText("140");

        jLabel30.setForeground(new java.awt.Color(0, 0, 255));
        jLabel30.setText("20");

        jLabel31.setForeground(new java.awt.Color(0, 0, 255));
        jLabel31.setText("40");

        jLabel32.setForeground(new java.awt.Color(0, 0, 255));
        jLabel32.setText("0");

        jLabel33.setForeground(new java.awt.Color(0, 0, 255));
        jLabel33.setText("mm");

        actualizarB.setText("Actualizar Datos Climograma");
        actualizarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarBActionPerformed(evt);
            }
        });

        tituloTF.setText("Ejemplo de Climograma de Buenos Aires (Argentina)");

        jLabel34.setText("ENE");

        jLabel35.setText("FEB");

        jLabel36.setText("MAR");

        jLabel37.setText("ABR");

        jLabel38.setText("MAY");

        jLabel39.setText("JUN");

        jLabel40.setText("JUL");

        jLabel41.setText("AGO");

        jLabel42.setText("SEP");

        jLabel43.setText("OCT");

        jLabel44.setText("NOV");

        jLabel45.setText("DIC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(tituloTF, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel28)
                                .addComponent(jLabel29))
                            .addComponent(jLabel27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel22)
                                .addComponent(jLabel26)
                                .addComponent(jLabel30)
                                .addComponent(jLabel31)
                                .addComponent(jLabel32)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(22, 22, 22))))
                    .addComponent(jLabel33))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HumFe, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HumEn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HumMar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HumAb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HumMay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HumJun, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HumJul, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HumAg, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HumSep, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HumOc, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HumNo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HumDi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TemDi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(TemNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TemOc, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TemSe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TemAg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TemJul, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TemJun, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TemMay, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TemAb, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TemMar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TemEn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TemFe, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel35)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel36)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel37)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel38)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel39)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel40)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel41)
                        .addGap(18, 18, 18))
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42)
                .addGap(26, 26, 26)
                .addComponent(jLabel43)
                .addGap(26, 26, 26)
                .addComponent(jLabel44)
                .addGap(30, 30, 30)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actualizarB)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel19)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel18)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel17)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel16)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel15)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel25)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel24)
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel23))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel33))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(canvasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TemEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TemFe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TemMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TemAb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TemMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TemJun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TemJul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TemAg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(TemSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TemOc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TemNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(TemDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel1)
                                                    .addComponent(HumEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel2)
                                                            .addComponent(HumFe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel3)
                                                            .addComponent(HumMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel4)
                                                            .addComponent(HumAb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel5)
                                                            .addComponent(HumMay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel6)
                                                            .addComponent(HumJun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel7)
                                                            .addComponent(HumJul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel8)
                                                            .addComponent(HumAg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(13, 13, 13)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel9)
                                                            .addComponent(HumSep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(17, 17, 17)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(HumOc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel11)
                                                            .addComponent(HumNo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel12)
                                                            .addComponent(HumDi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(7, 7, 7)
                                                        .addComponent(jLabel29)
                                                        .addGap(44, 44, 44)
                                                        .addComponent(jLabel28)
                                                        .addGap(43, 43, 43)
                                                        .addComponent(jLabel27)
                                                        .addGap(46, 46, 46)
                                                        .addComponent(jLabel26)
                                                        .addGap(44, 44, 44)
                                                        .addComponent(jLabel22)
                                                        .addGap(43, 43, 43)
                                                        .addComponent(jLabel31)
                                                        .addGap(48, 48, 48)
                                                        .addComponent(jLabel30)
                                                        .addGap(41, 41, 41)
                                                        .addComponent(jLabel32))))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(tituloTF)))
                        .addGap(18, 18, 18)
                        .addComponent(actualizarB)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45))
                        .addGap(29, 29, 29)))
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HumNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HumNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HumNoActionPerformed

    private void actualizarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarBActionPerformed
        recogerHumedad();
        canvas.setHumedad(humedad);
        recogerTemperatura();
        canvas.setTemperatura(temperatura);
        tituloTF.setText("Climograma creado con datos otrogados por el usuario.");
        
    }//GEN-LAST:event_actualizarBActionPerformed

    private void HumFeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HumFeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HumFeActionPerformed

    private void HumAbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HumAbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HumAbActionPerformed

    private void HumOcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HumOcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HumOcActionPerformed

    private void HumDiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HumDiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HumDiActionPerformed

    private void TemJulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemJulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemJulActionPerformed

    private void TemDiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemDiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemDiActionPerformed

    private void TemAbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemAbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemAbActionPerformed

    private void TemAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemAgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemAgActionPerformed

    private void TemSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemSeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemSeActionPerformed

    private void TemNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TemNoActionPerformed

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
            java.util.logging.Logger.getLogger(Climograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Climograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Climograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Climograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Climograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HumAb;
    private javax.swing.JTextField HumAg;
    private javax.swing.JTextField HumDi;
    private javax.swing.JTextField HumEn;
    private javax.swing.JTextField HumFe;
    private javax.swing.JTextField HumJul;
    private javax.swing.JTextField HumJun;
    private javax.swing.JTextField HumMar;
    private javax.swing.JTextField HumMay;
    private javax.swing.JTextField HumNo;
    private javax.swing.JTextField HumOc;
    private javax.swing.JTextField HumSep;
    private javax.swing.JTextField TemAb;
    private javax.swing.JTextField TemAg;
    private javax.swing.JTextField TemDi;
    private javax.swing.JTextField TemEn;
    private javax.swing.JTextField TemFe;
    private javax.swing.JTextField TemJul;
    private javax.swing.JTextField TemJun;
    private javax.swing.JTextField TemMar;
    private javax.swing.JTextField TemMay;
    private javax.swing.JTextField TemNo;
    private javax.swing.JTextField TemOc;
    private javax.swing.JTextField TemSe;
    private javax.swing.JButton actualizarB;
    private javax.swing.JPanel canvasPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel tituloTF;
    // End of variables declaration//GEN-END:variables

    public void recogerHumedad(){
        int hum=0;
        
        hum=Integer.parseInt(HumEn.getText());
        humedad[0]= hum;
        hum=Integer.parseInt(HumFe.getText());
        humedad[1]= hum;
        hum=Integer.parseInt(HumMar.getText());
        humedad[2]= hum;
        hum=Integer.parseInt(HumAb.getText());
        humedad[3]= hum;
        hum=Integer.parseInt(HumMay.getText());
        humedad[4]= hum;
        hum=Integer.parseInt(HumJun.getText());
        humedad[5]= hum;
        hum=Integer.parseInt(HumJul.getText());
        humedad[6]= hum;
        hum=Integer.parseInt(HumAg.getText());
        humedad[7]= hum;
        hum=Integer.parseInt(HumSep.getText());
        humedad[8]= hum;
        hum=Integer.parseInt(HumOc.getText());
        humedad[9]= hum;
        hum=Integer.parseInt(HumNo.getText());
        humedad[10]= hum;
        hum=Integer.parseInt(HumDi.getText());
        humedad[11]= hum;
        
    }
    public void recogerTemperatura(){
        int tem =0;
        
        tem=Integer.parseInt(TemEn.getText());
        temperatura[0]= tem;
        tem=Integer.parseInt(TemFe.getText());
        temperatura[1]= tem;
        tem=Integer.parseInt(TemMar.getText());
        temperatura[2]= tem;
        tem=Integer.parseInt(TemAb.getText());
        temperatura[3]= tem;
        tem=Integer.parseInt(TemMay.getText());
        temperatura[4]= tem;
        tem=Integer.parseInt(TemJun.getText());
        temperatura[5]= tem;
        tem=Integer.parseInt(TemJul.getText());
        temperatura[6]= tem;
        tem=Integer.parseInt(TemAg.getText());
        temperatura[7]= tem;
        tem=Integer.parseInt(TemSe.getText());
        temperatura[8]= tem;
        tem=Integer.parseInt(TemOc.getText());
        temperatura[9]= tem;
        tem=Integer.parseInt(TemNo.getText());
        temperatura[10]= tem;
        tem=Integer.parseInt(TemDi.getText());
        temperatura[11]= tem;

    }

}
