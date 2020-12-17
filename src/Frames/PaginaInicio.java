/*
Clase PaginaIncio: es la clase inicio a la cual se accede despues de inicar sesion.
contiene imagenes representativas de pereira y el menu
*/
package Proyecto;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class PaginaInicio extends javax.swing.JFrame {


    public PaginaInicio() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        barraPrincipal = new javax.swing.JPanel();
        barraSecundaria = new javax.swing.JPanel();
        jButtonMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nombre1 = new javax.swing.JLabel();
        jLabelImagen1 = new javax.swing.JLabel();
        jLabelImagen4 = new javax.swing.JLabel();
        jLabelImagen5 = new javax.swing.JLabel();
        jLabelImagen6 = new javax.swing.JLabel();
        jLabelImagen7 = new javax.swing.JLabel();
        jLabelImagen8 = new javax.swing.JLabel();
        jLabelImagen9 = new javax.swing.JLabel();
        jLabelImagen10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        panelMenu1 = new javax.swing.JPanel();
        seis = new rsbuttom.RSButtonMetro();
        cinco = new rsbuttom.RSButtonMetro();
        cuatro = new rsbuttom.RSButtonMetro();
        tres = new rsbuttom.RSButtonMetro();
        dos = new rsbuttom.RSButtonMetro();
        uno = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(255, 255, 255));

        barraPrincipal.setBackground(new java.awt.Color(255, 51, 51));

        barraSecundaria.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout barraSecundariaLayout = new javax.swing.GroupLayout(barraSecundaria);
        barraSecundaria.setLayout(barraSecundariaLayout);
        barraSecundariaLayout.setHorizontalGroup(
            barraSecundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barraSecundariaLayout.setVerticalGroup(
            barraSecundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jButtonMenu.setBackground(new java.awt.Color(255, 0, 0));
        jButtonMenu.setBorder(null);
        jButtonMenu.setContentAreaFilled(false);
        jButtonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inicio");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos color 2/usuario mini.png"))); // NOI18N

        javax.swing.GroupLayout barraPrincipalLayout = new javax.swing.GroupLayout(barraPrincipal);
        barraPrincipal.setLayout(barraPrincipalLayout);
        barraPrincipalLayout.setHorizontalGroup(
            barraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraSecundaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(barraPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        barraPrincipalLayout.setVerticalGroup(
            barraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jButtonMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(barraPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(630, 2500));

        nombre1.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        nombre1.setForeground(new java.awt.Color(51, 51, 51));
        nombre1.setText("Querendona, trasnochadora y morena");

        jLabelImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes foto/alquiler-de-carros-en-pereira.jpg"))); // NOI18N
        jLabelImagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagen1MouseClicked(evt);
            }
        });

        jLabelImagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes bases de datos/12963915893_783cf01d37_z.jpg"))); // NOI18N
        jLabelImagen4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagen4MouseClicked(evt);
            }
        });

        jLabelImagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes bases de datos/6891314861_277b98d86f_b.jpg"))); // NOI18N
        jLabelImagen5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagen5MouseClicked(evt);
            }
        });

        jLabelImagen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes bases de datos/12963915893_783cf01d37_z.jpg"))); // NOI18N
        jLabelImagen6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagen6MouseClicked(evt);
            }
        });

        jLabelImagen7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes bases de datos/fiestas_pereira.jpg"))); // NOI18N
        jLabelImagen7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagen7MouseClicked(evt);
            }
        });

        jLabelImagen8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes bases de datos/DSC_3177.JPG"))); // NOI18N
        jLabelImagen8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagen8MouseClicked(evt);
            }
        });

        jLabelImagen9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes bases de datos/Portada-2.jpg"))); // NOI18N
        jLabelImagen9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagen9MouseClicked(evt);
            }
        });

        jLabelImagen10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagen10MouseClicked(evt);
            }
        });

        jLabel4.setText("Como Brilla la perla");

        jLabel5.setText("Pereira es fiesta y cultura");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelImagen5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelImagen6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelImagen7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelImagen8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelImagen9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelImagen10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabelImagen1))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jLabelImagen4))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImagen6, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelImagen7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelImagen8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabelImagen9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelImagen10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMenu.setBackground(new java.awt.Color(204, 204, 204));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu1.setBackground(new java.awt.Color(204, 204, 204));
        panelMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelMenu.add(panelMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));

        seis.setBackground(new java.awt.Color(204, 204, 204));
        seis.setForeground(new java.awt.Color(102, 102, 102));
        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos color/exit 1.png"))); // NOI18N
        seis.setText("Cerrar sesión");
        seis.setColorHover(new java.awt.Color(255, 153, 153));
        seis.setColorNormal(new java.awt.Color(204, 204, 204));
        seis.setColorPressed(new java.awt.Color(255, 204, 153));
        seis.setColorTextNormal(new java.awt.Color(102, 102, 102));
        seis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seis.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });
        panelMenu.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 210, 70));

        cinco.setBackground(new java.awt.Color(204, 204, 204));
        cinco.setForeground(new java.awt.Color(102, 102, 102));
        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos color/map.png"))); // NOI18N
        cinco.setText("Google maps");
        cinco.setColorHover(new java.awt.Color(255, 153, 153));
        cinco.setColorNormal(new java.awt.Color(204, 204, 204));
        cinco.setColorPressed(new java.awt.Color(255, 204, 153));
        cinco.setColorTextNormal(new java.awt.Color(102, 102, 102));
        cinco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cinco.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cinco.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });
        panelMenu.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 210, 70));

        cuatro.setBackground(new java.awt.Color(204, 204, 204));
        cuatro.setForeground(new java.awt.Color(102, 102, 102));
        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos color/hot-air-balloon - copia.png"))); // NOI18N
        cuatro.setText("Categorias");
        cuatro.setColorHover(new java.awt.Color(255, 153, 153));
        cuatro.setColorNormal(new java.awt.Color(204, 204, 204));
        cuatro.setColorPressed(new java.awt.Color(255, 204, 153));
        cuatro.setColorTextNormal(new java.awt.Color(102, 102, 102));
        cuatro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cuatro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cuatro.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });
        panelMenu.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 210, 70));

        tres.setBackground(new java.awt.Color(204, 204, 204));
        tres.setForeground(new java.awt.Color(102, 102, 102));
        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos color/Favoritos.png"))); // NOI18N
        tres.setText("Favoritos");
        tres.setColorHover(new java.awt.Color(255, 153, 153));
        tres.setColorNormal(new java.awt.Color(204, 204, 204));
        tres.setColorPressed(new java.awt.Color(255, 204, 153));
        tres.setColorTextNormal(new java.awt.Color(102, 102, 102));
        tres.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tres.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });
        panelMenu.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 210, 70));

        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos color/Buscar.png"))); // NOI18N
        dos.setText("Buscar");
        dos.setColorHover(new java.awt.Color(255, 153, 153));
        dos.setColorNormal(new java.awt.Color(204, 204, 204));
        dos.setColorPressed(new java.awt.Color(255, 204, 153));
        dos.setColorTextNormal(new java.awt.Color(102, 102, 102));
        dos.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        dos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });
        panelMenu.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 70));

        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos color/house.png"))); // NOI18N
        uno.setText("Inicio");
        uno.setColorHover(new java.awt.Color(255, 153, 153));
        uno.setColorNormal(new java.awt.Color(204, 204, 204));
        uno.setColorPressed(new java.awt.Color(255, 204, 153));
        uno.setColorTextHover(new java.awt.Color(102, 102, 102));
        uno.setColorTextNormal(new java.awt.Color(102, 102, 102));
        uno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        panelMenu.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos color 2/usuario.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        panelMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 160));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addComponent(barraPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        int posicion = this.panelMenu.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(0, -170, 2, 2, panelMenu);
        }else{
            Animacion.Animacion.mover_derecha(-170, 0, 2, 2, panelMenu);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jLabelImagen10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelImagen10MouseClicked

    private void jLabelImagen9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelImagen9MouseClicked

    private void jLabelImagen8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelImagen8MouseClicked

    private void jLabelImagen7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelImagen7MouseClicked

    private void jLabelImagen6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelImagen6MouseClicked

    private void jLabelImagen5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelImagen5MouseClicked

    private void jLabelImagen4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelImagen4MouseClicked

    private void jLabelImagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen1MouseClicked

    }//GEN-LAST:event_jLabelImagen1MouseClicked

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        PaginaInicio acceso = new PaginaInicio();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        BuscarLugar1 acceso = new BuscarLugar1();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        Favoritos acceso = new Favoritos();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        Categorias acceso = new Categorias();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
         String link = "";
        try {
            Desktop.getDesktop().browse(new URI("https://www.google.com/maps/place/Pereira,+Risaralda/"
                + "@4.804771,-75.7838021,12z/data=!3m1!4b1!4m5!3m4!1s0x8e388748eb56c1fd:0x95b39410f9f1dfbc!8m2!3d4.8087174!4d-75.690601"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con google maps"
                + "Sin conexion internet!");

        }
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        LoginForm acceso = new LoginForm();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_seisActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel barraPrincipal;
    private javax.swing.JPanel barraSecundaria;
    private rsbuttom.RSButtonMetro cinco;
    private rsbuttom.RSButtonMetro cuatro;
    private rsbuttom.RSButtonMetro dos;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabelImagen1;
    public javax.swing.JLabel jLabelImagen10;
    public javax.swing.JLabel jLabelImagen4;
    public javax.swing.JLabel jLabelImagen5;
    public javax.swing.JLabel jLabelImagen6;
    public javax.swing.JLabel jLabelImagen7;
    public javax.swing.JLabel jLabelImagen8;
    public javax.swing.JLabel jLabelImagen9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel nombre1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenu1;
    private rsbuttom.RSButtonMetro seis;
    private rsbuttom.RSButtonMetro tres;
    private rsbuttom.RSButtonMetro uno;
    // End of variables declaration//GEN-END:variables
}
