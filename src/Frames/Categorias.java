/*
Clase categorias: encargada de mostrar los lugares turisticos por secciones.
Esta clase no es importante ya que no se termino como se queria.
Ademas, puede presentar multiples errores debido a librerias faltantes,
que no permiten reconocer los componentes de jFrame.
*/

package Proyecto;

import Clases.Conectar;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import javax.swing.JOptionPane;
/**
 *
 * @author Natalia
 */
public class Categorias extends javax.swing.JFrame {

    /**
     * Creates new form Categorias
     */
    public Categorias() {
        initComponents();
    }
    Conectar con = new Conectar();        

    public String getListaCultura(){//agregamos las categorias a un comboBox
        
        rSComboCultura.addItem("Jardín botánico Universidad Tecnológica de Pereira");
        rSComboCultura.addItem("Bioparque Ukumarí");
        rSComboCultura.addItem("Museo de Arte de Pereira");
        rSComboCultura.addItem("Catedral de Nuestra Señora de la Pobreza de Pereir");
        rSComboCultura.addItem("Viaducto César Gaviria Trujillo");
        return null;
    }
    public void getListaCompras(){//agregamos las categorias a un comboBox
        rSComboCultura.addItem("Centro Comercial Bolívar Plaza");
        rSComboCultura.addItem("Centro Comercial Plaza Victoria ");
        rSComboCultura.addItem("Centro Comercial Parque Arboleda");
        rSComboCultura.addItem("Centro Comercial Unicentro");
        rSComboCultura.addItem("Centro Comercial Alcides Arevalo");
    }    
    
/*public void ListarTablas(){
        try{
            Class.forName("com.mysql.jdbc.Driver");            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/AppPererira", "root", "");//se conecta a la base de datos local,usuario,contraseña
            Statement s = con.conect().createStatement();//busca la tabla correspondiente, selecciona y compara el dato buscado
            //rSComboAireLibre.RemoveAllItems();  //show TablaLugares
            try ( //pst.setString(1, Buscador.getText().trim());//recupera el texto ingresado.elimina los espacios innecesarios
                    ResultSet resultado = s.executeQuery("show tables;"); //si son iguales muestra el resultado
            ) {
                rSComboAireLibre.removeAllItems();  //show TablaLugares
                while (resultado.next()){
                    
                        rSComboAireLibre.addItem(resultado.getString(1));                  
                       }
                //con.close();
            }           
        }catch (HeadlessException | SQLException e){
            Logger.getLogger(BuscarLugar.class.getName()).log(Level.SEVERE, null, e);
        }catch (ClassNotFoundException e) {
            Logger.getLogger(Categorias.class.getName()).log(Level.SEVERE, null, e);
        }    
} */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        barraPrincipal = new javax.swing.JPanel();
        barraSecundaria = new javax.swing.JPanel();
        jButtonMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        rSButtonCulturaVerdadero = new org.netbeans.modules.form.InvalidComponent();
        rSButtonNoche = new org.netbeans.modules.form.InvalidComponent();
        rSButtonRecreacionVerdadero = new org.netbeans.modules.form.InvalidComponent();
        rSButtonCompras = new org.netbeans.modules.form.InvalidComponent();
        rSButtonRestaurantes = new org.netbeans.modules.form.InvalidComponent();
        rSButtonAireLibre = new org.netbeans.modules.form.InvalidComponent();
        rSComboCultura = new org.netbeans.modules.form.InvalidComponent();
        rSComboRecreacion = new org.netbeans.modules.form.InvalidComponent();
        rSComboNoche = new org.netbeans.modules.form.InvalidComponent();
        rSComboCompras = new org.netbeans.modules.form.InvalidComponent();
        rSComboRestaurantes = new org.netbeans.modules.form.InvalidComponent();
        rSComboAireLibre = new org.netbeans.modules.form.InvalidComponent();
        panelMenu = new javax.swing.JPanel();
        panelMenu1 = new javax.swing.JPanel();
        seis = new rsbuttom.RSButtonMetro();
        cinco = new rsbuttom.RSButtonMetro();
        cuatro = new rsbuttom.RSButtonMetro();
        tres = new rsbuttom.RSButtonMetro();
        dos = new rsbuttom.RSButtonMetro();
        uno = new rsbuttom.RSButtonMetro();
        rSFotoSquare2 = new org.netbeans.modules.form.InvalidComponent();

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
            .addGap(0, 21, Short.MAX_VALUE)
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
        jLabel1.setText("Secciones");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(barraSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 0));

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

        panelMenu.add(rSFotoSquare2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 190));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSComboRestaurantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonNoche, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSComboNoche, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonRestaurantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSButtonCompras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSComboCompras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonAireLibre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSComboAireLibre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(rSComboCultura, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(rSComboRecreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rSButtonCulturaVerdadero, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonRecreacionVerdadero, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonCulturaVerdadero, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRecreacionVerdadero, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSComboCultura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSComboRecreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSButtonCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(rSButtonNoche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSComboNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSComboCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSButtonAireLibre, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(rSButtonRestaurantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSComboAireLibre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSComboRestaurantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 297, Short.MAX_VALUE))
        );

        rSButtonCulturaVerdadero.getAccessibleContext().setAccessibleParent(jLabel1);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addComponent(barraPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void rSButtonCulturaVerdaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonCulturaVerdaderoActionPerformed
    }//GEN-LAST:event_rSButtonCulturaVerdaderoActionPerformed

    private void rSButtonNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonNocheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonNocheActionPerformed

    private void rSButtonRecreacionVerdaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRecreacionVerdaderoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRecreacionVerdaderoActionPerformed

    private void rSButtonComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonComprasActionPerformed
        getListaCompras();
    }//GEN-LAST:event_rSButtonComprasActionPerformed

    private void rSButtonRestaurantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRestaurantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonRestaurantesActionPerformed

    private void rSButtonAireLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonAireLibreActionPerformed
        //ListarSeccion();
    }//GEN-LAST:event_rSButtonAireLibreActionPerformed

    private void rSComboRecreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSComboRecreacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSComboRecreacionActionPerformed

    private void rSComboAireLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSComboAireLibreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSComboAireLibreActionPerformed

    private void rSComboCulturaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rSComboCulturaItemStateChanged
       getListaCultura();
    }//GEN-LAST:event_rSComboCulturaItemStateChanged

    private void rSComboCulturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSComboCulturaMouseClicked

    }//GEN-LAST:event_rSComboCulturaMouseClicked

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
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categorias().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenu1;
    private org.netbeans.modules.form.InvalidComponent rSButtonAireLibre;
    private org.netbeans.modules.form.InvalidComponent rSButtonCompras;
    private org.netbeans.modules.form.InvalidComponent rSButtonCulturaVerdadero;
    private org.netbeans.modules.form.InvalidComponent rSButtonNoche;
    private org.netbeans.modules.form.InvalidComponent rSButtonRecreacionVerdadero;
    private org.netbeans.modules.form.InvalidComponent rSButtonRestaurantes;
    private org.netbeans.modules.form.InvalidComponent rSComboAireLibre;
    private org.netbeans.modules.form.InvalidComponent rSComboCompras;
    public static org.netbeans.modules.form.InvalidComponent rSComboCultura;
    private org.netbeans.modules.form.InvalidComponent rSComboNoche;
    private org.netbeans.modules.form.InvalidComponent rSComboRecreacion;
    private org.netbeans.modules.form.InvalidComponent rSComboRestaurantes;
    private org.netbeans.modules.form.InvalidComponent rSFotoSquare2;
    private rsbuttom.RSButtonMetro seis;
    private rsbuttom.RSButtonMetro tres;
    private rsbuttom.RSButtonMetro uno;
    // End of variables declaration//GEN-END:variables
}
