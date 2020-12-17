/*
Esta clase se encarga de realizar la busqueda de los lugares turisticos
almacenados en la base de datos
el metodo principal es el metodo buscar 
tambien hay un metodo agregar y un metodo importarImagen
que sirven para agregar nuevos lugares turisticos.
*/
package Proyecto;

import Clases.Conectar;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Natalia
 */
public class BuscarLugar1 extends javax.swing.JFrame {

    public BuscarLugar1() {
        initComponents();
         this.setLocationRelativeTo(this);
       /* ImageIcon imagen = new ImageIcon(rutaImagenPerfil);
        Icon Icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabelImagenPerfil.getWidth(), jLabelImagenPerfil.getHeight(), Image.SCALE_DEFAULT));
        jLabelImagenPerfil.setIcon(Icono);
        this.repaint();*/
        ocultar();
        PanelGaleriaFondo.setVisible(false);
    }
    
    int xx,xy;
    Conectar con = new Conectar();
    
    public void limpiar(){
        //limpiamos los file txt nombre y grupo
        nombreLugar.setText("");
        direccion.setText("");
        horario.setText("");
        entrada.setText("");
        textDescripcion.setText("");
        jLabelImagenPerfil.setText("");
        rutaImagenPerfil.setText("");
        imagen1.setText("");
        imagen2.setText("");
        Imagen3.setText("");
        Imagen4.setText("");
    }

    public void ocultar()
{
    //panel.setVisible(false);
    setLocationRelativeTo(null);
    Buscador.setText("Buscar...");
    PanelGaleriaFondo.setVisible(false);
    PanelInformacion.setVisible(false);
    Resul.setVisible(false);
    sepa1.setVisible(false);
    sepa2.setVisible(false);
    descripcion.setVisible(false);
    informacion.setVisible(false);
    nombreLugar.setVisible(false);
    jLabelImagenPerfil.setVisible(true);
        PanelGaleriaFondo.setVisible(false);
        PanelGaleria.setVisible(false);
        imagen1.setVisible(false);
        imagen2.setVisible(true);
        Imagen3.setVisible(true);
        Imagen4.setVisible(true);
        descripcion1.setVisible(false);
        informacion1.setVisible(false);
        Contenido4.setVisible(true);
        descripcion1.setVisible(false);
        PanelInformacion.setVisible(false);
        jPanelDescripcion.setVisible(false);
        Resul.setVisible(false);
        sepa1.setVisible(false);
        sepa2.setVisible(false);
        galeria.setVisible(false);
        separador3.setVisible(false);      
        categoria.setVisible(false);
        informacion.setVisible(false);
        nombreLugar.setVisible(false);
        jButtonIngresar.setVisible(false);
        jButtonAgregar.setVisible(false);
        jLabelImagenPerfil.setVisible(false);
        textDescripcion.setVisible(false);
        rutaImagenPerfil.setVisible(false);
        rutaGaleria1.setVisible(false);
        rutaGaleria2.setVisible(false);
        rutaGaleria3.setVisible(false);
        rutaGaleria4.setVisible(false);        
        categoria.setVisible(false);
        Buscar.requestFocus();
}
    
    public void ImportarImagenPc(){
        JFileChooser archivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.PNG", "png","*.JPG","jpg");
        archivo.setFileFilter(filtro);//filtramos solo imagenes
        int ventana = archivo.showOpenDialog(null);
        if (ventana == JFileChooser.APPROVE_OPTION){
            File file = archivo.getSelectedFile();
            rutaImagenPerfil.setText(String.valueOf(file));
            Image foto = getToolkit().getImage(rutaImagenPerfil.getText());
            jLabelImagenPerfil.setIcon(new ImageIcon(foto));
        }    
    }
    
 public void AgregarLugar(){
     try{
            // Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/AppPererira", "root", "");//se conecta a la base de datos local,usuario,contraseña
            PreparedStatement pst = con.getConnect().prepareStatement("insert INTO TablaLugares VALUES(?,?,?,?,?,?,?,?)");//busca la tabla correspondiente, inserta(cantidad de variables)

            pst.setString(1, "0");//inicia conteo de llave primaria
            pst.setString(2, nombreLugar.getText().trim());//recupera el texto ingresado.elimina los espacios innecesarios
            pst.setString(3, direccion.getText().trim());
            pst.setString(4, horario.getText().trim());
            pst.setString(5, entrada.getText().trim());
            pst.setString(6, textDescripcion.getText().trim());
            FileInputStream archivoImagenPerfil;
            archivoImagenPerfil = new FileInputStream(rutaImagenPerfil.getText());
            pst.setBinaryStream(7, archivoImagenPerfil);
            pst.setString(8,rutaImagenPerfil.getText());
            int i = pst.executeUpdate();
            if(i > 0){
                JOptionPane.showMessageDialog(null, "Registrado!");
            }else{
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error cuando se intentaba registrar");
            }
        limpiar();
        }catch (HeadlessException | IOException | SQLException e){
            Logger.getLogger(BuscarLugar1.class.getName()).log(Level.SEVERE, null, e);
        }
 }
    public void Buscar(){
        try{
            //consultar.buscar();
            //Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/AppColombiaTravel", "root", "");//se conecta a la base de datos local,usuario,contraseña
            Statement s = con.getConnect().createStatement();//busca la tabla correspondiente, selecciona y compara el dato buscado
            //pst.setString(1, Buscador.getText().trim());//recupera el texto ingresado.elimina los espacios innecesarios
            ResultSet resultado = s.executeQuery("select * from visitar where NombreLugar ='"+Buscador.getText()+"'");//si son iguales muestra el resultado

            if(resultado.next()){
                nombreLugar.setText(resultado.getString("NombreLugar"));
                Resul.setText(resultado.getString("NombreLugar"));
                Image i = null;
                Blob blob = resultado.getBlob("ImagenPerfil");
                i = javax.imageio.ImageIO.read(blob.getBinaryStream());
                ImageIcon image = new ImageIcon(i);
                jLabelImagenPerfil.setIcon(image);
                rutaImagenPerfil.setText(resultado.getString(4));
                textDescripcion.setText(resultado.getString("Descripcion"));                
                direccion.setText(resultado.getString("Direccion"));
                horario.setText(resultado.getString("Horario"));
                entrada.setText(resultado.getString("ValorEntrada"));                
                categoria.setText(resultado.getString("Categoria")); 
               
                Image i1 = null;
                Blob blob1 = resultado.getBlob("Galeria");
                i1 = javax.imageio.ImageIO.read(blob1.getBinaryStream());
                ImageIcon image1 = new ImageIcon(i1);
                imagen1.setIcon(image1);
                rutaGaleria1.setText(resultado.getString(11));
                Image i2 = null;
                Blob blob2 = resultado.getBlob("Galeria1");
                i2 = javax.imageio.ImageIO.read(blob2.getBinaryStream());
                ImageIcon image2 = new ImageIcon(i2);
                imagen2.setIcon(image2);
                rutaGaleria2.setText(resultado.getString(13));
                Image i3 = null;
                Blob blob3 = resultado.getBlob("Galeria2");
                i3 = javax.imageio.ImageIO.read(blob3.getBinaryStream());
                ImageIcon image3 = new ImageIcon(i3);
                Imagen3.setIcon(image3);
                rutaGaleria3.setText(resultado.getString(15));
                Image i4 = null;
                Blob blob4 = resultado.getBlob("Galeria3");
                i4 = javax.imageio.ImageIO.read(blob4.getBinaryStream());
                ImageIcon image4 = new ImageIcon(i4);
                Imagen4.setIcon(image4);
                rutaGaleria4.setText(resultado.getString(17));
            }
            else{
                JOptionPane.showMessageDialog(null,"No se encontro nada.");
            }
        }catch (HeadlessException | IOException | SQLException e){
            Logger.getLogger(BuscarLugar1.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        barraPrincipal = new javax.swing.JPanel();
        barraSegundaria = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Buscar = new javax.swing.JLabel();
        Resul = new javax.swing.JLabel();
        Buscador = new javax.swing.JTextField();
        jLabelRegistrado = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        panelMenu1 = new javax.swing.JPanel();
        seis = new rsbuttom.RSButtonMetro();
        cinco = new rsbuttom.RSButtonMetro();
        cuatro = new rsbuttom.RSButtonMetro();
        tres = new rsbuttom.RSButtonMetro();
        dos = new rsbuttom.RSButtonMetro();
        uno = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();
        Contenido4 = new javax.swing.JPanel();
        informacion = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        galeria = new javax.swing.JLabel();
        jButtonIngresar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        separador3 = new javax.swing.JSeparator();
        jLabelImagenPerfil = new javax.swing.JLabel();
        sepa1 = new javax.swing.JSeparator();
        sepa2 = new javax.swing.JSeparator();
        rutaImagenPerfil = new javax.swing.JTextField();
        nombreLugar = new javax.swing.JLabel();
        jPanelDescripcion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescripcion = new javax.swing.JTextArea();
        rutaGaleria1 = new javax.swing.JTextField();
        rutaGaleria2 = new javax.swing.JTextField();
        rutaGaleria3 = new javax.swing.JTextField();
        rutaGaleria4 = new javax.swing.JTextField();
        categoria = new javax.swing.JLabel();
        PanelInformacion = new javax.swing.JPanel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelHorario = new javax.swing.JLabel();
        jLabelEntrada = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        horario = new javax.swing.JLabel();
        entrada = new javax.swing.JLabel();
        PanelGaleriaFondo = new javax.swing.JScrollPane();
        PanelGaleria = new javax.swing.JPanel();
        imagen1 = new javax.swing.JLabel();
        imagen2 = new javax.swing.JLabel();
        Imagen3 = new javax.swing.JLabel();
        Imagen4 = new javax.swing.JLabel();
        descripcion1 = new javax.swing.JLabel();
        sepa7 = new javax.swing.JSeparator();
        informacion1 = new javax.swing.JLabel();
        sepa8 = new javax.swing.JSeparator();
        separador4 = new javax.swing.JSeparator();
        Galeria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(900, 725));

        barraPrincipal.setBackground(new java.awt.Color(255, 51, 51));
        barraPrincipal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraPrincipalMouseDragged(evt);
            }
        });
        barraPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraPrincipalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                barraPrincipalMouseReleased(evt);
            }
        });

        barraSegundaria.setBackground(new java.awt.Color(255, 204, 102));

        javax.swing.GroupLayout barraSegundariaLayout = new javax.swing.GroupLayout(barraSegundaria);
        barraSegundaria.setLayout(barraSegundariaLayout);
        barraSegundariaLayout.setHorizontalGroup(
            barraSegundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        barraSegundariaLayout.setVerticalGroup(
            barraSegundariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscador-musical.png"))); // NOI18N
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
        });

        Resul.setBackground(new java.awt.Color(204, 204, 204));
        Resul.setFont(new java.awt.Font("Gotham Light", 0, 18)); // NOI18N
        Resul.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Resul.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Resul.setOpaque(true);
        Resul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResulMouseClicked(evt);
            }
        });

        Buscador.setForeground(new java.awt.Color(102, 102, 102));
        Buscador.setText("Buscar...");
        Buscador.setBorder(null);
        Buscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuscadorFocusLost(evt);
            }
        });

        javax.swing.GroupLayout barraPrincipalLayout = new javax.swing.GroupLayout(barraPrincipal);
        barraPrincipal.setLayout(barraPrincipalLayout);
        barraPrincipalLayout.setHorizontalGroup(
            barraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraSegundaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(barraPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(barraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraPrincipalLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Resul, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(barraPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        barraPrincipalLayout.setVerticalGroup(
            barraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraPrincipalLayout.createSequentialGroup()
                .addGroup(barraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(barraPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(barraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(barraPrincipalLayout.createSequentialGroup()
                                .addComponent(Buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Resul, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraSegundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        Contenido4.setBackground(new java.awt.Color(255, 255, 255));
        Contenido4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informacion.setBackground(new java.awt.Color(255, 255, 255));
        informacion.setFont(new java.awt.Font("Gotham Light", 0, 18)); // NOI18N
        informacion.setForeground(new java.awt.Color(0, 51, 51));
        informacion.setText("Mas Información");
        informacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        informacion.setOpaque(true);
        informacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                informacion7informaciondetallesMouseClicked(evt);
            }
        });
        Contenido4.add(informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 140, 20));

        descripcion.setBackground(new java.awt.Color(255, 255, 255));
        descripcion.setFont(new java.awt.Font("Gotham Light", 0, 18)); // NOI18N
        descripcion.setForeground(new java.awt.Color(0, 51, 51));
        descripcion.setText("Descripción");
        descripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        descripcion.setOpaque(true);
        descripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descripcion7descripcionMouseClicked(evt);
            }
        });
        Contenido4.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 100, 20));

        galeria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        galeria.setForeground(new java.awt.Color(0, 0, 51));
        galeria.setText("Galeria ");
        galeria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                galeria6galeriaMouseClicked(evt);
            }
        });
        Contenido4.add(galeria, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 90, 20));

        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresar6jButtonIngresarActionPerformed(evt);
            }
        });
        Contenido4.add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 30));

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregar6jButtonAgregarActionPerformed(evt);
            }
        });
        Contenido4.add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));
        Contenido4.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 70, 10));
        Contenido4.add(jLabelImagenPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 610, 260));
        Contenido4.add(sepa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 138, 10));
        Contenido4.add(sepa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 100, 10));
        Contenido4.add(rutaImagenPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 190, 20));

        nombreLugar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nombreLugar.setForeground(new java.awt.Color(51, 51, 51));
        Contenido4.add(nombreLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 520, 40));

        jPanelDescripcion.setBackground(new java.awt.Color(255, 255, 255));

        textDescripcion.setColumns(20);
        textDescripcion.setRows(5);
        jScrollPane1.setViewportView(textDescripcion);

        rutaGaleria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaGaleria25rutaGaleria1rutaGaleria1ActionPerformed(evt);
            }
        });

        rutaGaleria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaGaleria26rutaGaleria2rutaGaleria2ActionPerformed(evt);
            }
        });

        categoria.setFont(new java.awt.Font("Javanese Text", 1, 18)); // NOI18N
        categoria.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanelDescripcionLayout = new javax.swing.GroupLayout(jPanelDescripcion);
        jPanelDescripcion.setLayout(jPanelDescripcionLayout);
        jPanelDescripcionLayout.setHorizontalGroup(
            jPanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescripcionLayout.createSequentialGroup()
                .addGroup(jPanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDescripcionLayout.createSequentialGroup()
                        .addComponent(rutaGaleria1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutaGaleria2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rutaGaleria3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rutaGaleria4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188))
        );
        jPanelDescripcionLayout.setVerticalGroup(
            jPanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDescripcionLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rutaGaleria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rutaGaleria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rutaGaleria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rutaGaleria4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        Contenido4.add(jPanelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        PanelInformacion.setBackground(new java.awt.Color(255, 255, 255));
        PanelInformacion.setForeground(new java.awt.Color(255, 255, 255));

        jLabelDireccion.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setFont(new java.awt.Font("Gotham Light", 0, 20)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(0, 51, 51));
        jLabelDireccion.setText("Dirección");
        jLabelDireccion.setOpaque(true);

        jLabelHorario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHorario.setFont(new java.awt.Font("Gotham Light", 0, 20)); // NOI18N
        jLabelHorario.setForeground(new java.awt.Color(0, 51, 51));
        jLabelHorario.setText("Horario");
        jLabelHorario.setOpaque(true);

        jLabelEntrada.setBackground(new java.awt.Color(255, 255, 255));
        jLabelEntrada.setFont(new java.awt.Font("Gotham Light", 0, 20)); // NOI18N
        jLabelEntrada.setForeground(new java.awt.Color(0, 51, 51));
        jLabelEntrada.setText("Valor entrada");
        jLabelEntrada.setOpaque(true);

        javax.swing.GroupLayout PanelInformacionLayout = new javax.swing.GroupLayout(PanelInformacion);
        PanelInformacion.setLayout(PanelInformacionLayout);
        PanelInformacionLayout.setHorizontalGroup(
            PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInformacionLayout.createSequentialGroup()
                                .addComponent(jLabelEntrada)
                                .addGap(0, 461, Short.MAX_VALUE))
                            .addComponent(horario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDireccion)
                            .addComponent(jLabelHorario))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(entrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelInformacionLayout.setVerticalGroup(
            PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInformacionLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Contenido4.add(PanelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 600, -1));

        PanelGaleria.setBackground(new java.awt.Color(255, 255, 255));
        PanelGaleria.setPreferredSize(new java.awt.Dimension(600, 600));

        imagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen1MouseClicked(evt);
            }
        });

        imagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagen2MouseClicked(evt);
            }
        });

        Imagen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen3MouseClicked(evt);
            }
        });

        Imagen4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen4MouseClicked(evt);
            }
        });

        descripcion1.setBackground(new java.awt.Color(255, 255, 255));
        descripcion1.setFont(new java.awt.Font("Gotham Light", 0, 18)); // NOI18N
        descripcion1.setForeground(new java.awt.Color(0, 51, 51));
        descripcion1.setText("Descripción");
        descripcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        descripcion1.setOpaque(true);
        descripcion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descripcion1MouseClicked(evt);
            }
        });

        informacion1.setBackground(new java.awt.Color(255, 255, 255));
        informacion1.setFont(new java.awt.Font("Gotham Light", 0, 18)); // NOI18N
        informacion1.setForeground(new java.awt.Color(0, 51, 51));
        informacion1.setText("Mas Información");
        informacion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        informacion1.setOpaque(true);
        informacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                informacion1detallesMouseClicked(evt);
            }
        });

        Galeria.setBackground(new java.awt.Color(255, 255, 255));
        Galeria.setFont(new java.awt.Font("Gotham Light", 0, 18)); // NOI18N
        Galeria.setForeground(new java.awt.Color(0, 51, 51));
        Galeria.setText("Galeria");
        Galeria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Galeria.setOpaque(true);

        javax.swing.GroupLayout PanelGaleriaLayout = new javax.swing.GroupLayout(PanelGaleria);
        PanelGaleria.setLayout(PanelGaleriaLayout);
        PanelGaleriaLayout.setHorizontalGroup(
            PanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGaleriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelGaleriaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(PanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelGaleriaLayout.createSequentialGroup()
                                .addComponent(sepa7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sepa8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(separador4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelGaleriaLayout.createSequentialGroup()
                                .addComponent(descripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(informacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Galeria))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelGaleriaLayout.createSequentialGroup()
                        .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelGaleriaLayout.createSequentialGroup()
                        .addComponent(Imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelGaleriaLayout.setVerticalGroup(
            PanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGaleriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(informacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Galeria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separador4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sepa7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sepa8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelGaleriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Imagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        PanelGaleriaFondo.setViewportView(PanelGaleria);

        Contenido4.add(PanelGaleriaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 810, -1));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Contenido4, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
            .addComponent(barraPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addComponent(barraPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Contenido4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRegistrado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int posicion = this.panelMenu.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(0, -190, 2, 2, panelMenu);
        }else{
            Animacion.Animacion.mover_derecha(-190, 0, 2, 2, panelMenu);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
        Buscar();
        Resul.setVisible(true);
        descripcion.setVisible(false);
        jPanelDescripcion.setVisible(false);
        Buscador.setText("Buscar...");
        PanelInformacion.setVisible(false);
        sepa1.setVisible(false);
        sepa2.setVisible(false);
        informacion.setVisible(false);
        nombreLugar.setVisible(false);
        jLabelImagenPerfil.setVisible(false);
        descripcion1.setVisible(false);
        informacion1.setVisible(false);
        Contenido4.setVisible(false);
        descripcion.setVisible(false);
        sepa1.setVisible(false);
        sepa2.setVisible(false);
        galeria.setVisible(false);
        separador3.setVisible(false);
        categoria.setVisible(false);
        nombreLugar.setVisible(false);
        textDescripcion.setVisible(false);
        categoria.setVisible(false);
        Buscar.requestFocus();
    }//GEN-LAST:event_BuscarMouseClicked

    private void ResulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResulMouseClicked
        descripcion.setVisible(true);
        jPanelDescripcion.setVisible(true);
        Buscador.setText("Buscar...");
        PanelInformacion.setVisible(false);
        Resul.setVisible(false);
        sepa1.setVisible(true);
        sepa2.setVisible(true);
        informacion.setVisible(true);
        nombreLugar.setVisible(true);
        jLabelImagenPerfil.setVisible(true);
        descripcion1.setVisible(false);
        informacion1.setVisible(false);
        Contenido4.setVisible(true);
        descripcion.setVisible(true);
        sepa1.setVisible(true);
        sepa2.setVisible(true);
        galeria.setVisible(true);
        separador3.setVisible(true);
        categoria.setVisible(false);
        nombreLugar.setVisible(true);
        textDescripcion.setVisible(true);
        categoria.setVisible(true);
        Buscar.requestFocus();
        
    }//GEN-LAST:event_ResulMouseClicked

    private void BuscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscadorFocusGained
        if(("Buscar...").equals(Buscador.getText())){
            Buscador.setText("");
        }
    }//GEN-LAST:event_BuscadorFocusGained

    private void BuscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscadorFocusLost
        if(("").equals(Buscador.getText())){
            Buscador.setText("Buscar...");
        }
    }//GEN-LAST:event_BuscadorFocusLost

    private void barraPrincipalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPrincipalMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_barraPrincipalMouseDragged

    private void barraPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPrincipalMousePressed
        setOpacity((float)0.8);
        xx=evt.getX();
        xy=evt.getY();
    }//GEN-LAST:event_barraPrincipalMousePressed

    private void barraPrincipalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPrincipalMouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_barraPrincipalMouseReleased

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        BuscarLugar1 acceso = new BuscarLugar1();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_seisActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        String link = "";
        try {
            Desktop.getDesktop().browse(new URI("https://www.google.com/maps/place/Pereira,+Risaralda/"
                + "@4.804771,-75.7838021,12z/data=!3m1!4b1!4m5!3m4!1s0x8e388748eb56c1fd:0x95b39410f9f1dfbc!8m2!3d4.8087174!4d-75.690601"));
        } catch (IOException | URISyntaxException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con google maps"
                + "Sin conexion internet!");

        }
        this.setVisible(false);
    }//GEN-LAST:event_cincoActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        Categorias acceso = new Categorias();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cuatroActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        Favoritos acceso = new Favoritos();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tresActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        BuscarLugar1 acceso = new BuscarLugar1();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_dosActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        PaginaInicio acceso = new PaginaInicio();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_unoActionPerformed

    private void informacion7informaciondetallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacion7informaciondetallesMouseClicked
        descripcion.setVisible(true);
        Buscador.setText("Buscar...");
        jPanelDescripcion.setVisible(false);
        PanelInformacion.setVisible(true);
        Resul.setVisible(false);
        PanelGaleriaFondo.setVisible(false);
        Buscar.requestFocus();
        textDescripcion.setVisible(false);
        rutaImagenPerfil.setVisible(false);
        rutaGaleria1.setVisible(false);
        rutaGaleria2.setVisible(false);
        rutaGaleria3.setVisible(false);
        rutaGaleria4.setVisible(false);

        // Nuevabusq.setVisible(false);
    }//GEN-LAST:event_informacion7informaciondetallesMouseClicked

    private void descripcion7descripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descripcion7descripcionMouseClicked
        descripcion.setVisible(true);
        Buscador.setText("Buscar...");
        jPanelDescripcion.setVisible(true);
        PanelInformacion.setVisible(false);
        Resul.setVisible(false);
        textDescripcion.setVisible(true);
        PanelGaleriaFondo.setVisible(false);
        rutaImagenPerfil.setVisible(false);
        rutaGaleria1.setVisible(false);
        rutaGaleria2.setVisible(false);
        rutaGaleria3.setVisible(false);
        rutaGaleria4.setVisible(false);
        Buscar.requestFocus();
        //Nuevabusq.setVisible(false);
    }//GEN-LAST:event_descripcion7descripcionMouseClicked

    private void galeria6galeriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_galeria6galeriaMouseClicked
        PanelGaleriaFondo.setVisible(true);
        PanelGaleria.setVisible(true);
        imagen1.setVisible(true);
        imagen2.setVisible(true);
        Imagen3.setVisible(true);
        Imagen4.setVisible(true);
        descripcion1.setVisible(true);
        informacion1.setVisible(true);
        Contenido4.setVisible(true);
        descripcion.setVisible(false);
        Buscador.setText("Buscar...");
        PanelInformacion.setVisible(false);
        jPanelDescripcion.setVisible(false);
        Resul.setVisible(false);
        sepa1.setVisible(false);
        sepa2.setVisible(false);
        galeria.setVisible(false);
        separador3.setVisible(false);
        categoria.setVisible(false);
        informacion.setVisible(false);
        nombreLugar.setVisible(false);
        jButtonIngresar.setVisible(false);
        jButtonAgregar.setVisible(false);
        jLabelImagenPerfil.setVisible(false);
        textDescripcion.setVisible(false);
        rutaImagenPerfil.setVisible(false);
        rutaGaleria1.setVisible(false);
        rutaGaleria2.setVisible(false);
        rutaGaleria3.setVisible(false);
        rutaGaleria4.setVisible(false);
        categoria.setVisible(false);
        Buscar.requestFocus();
    }//GEN-LAST:event_galeria6galeriaMouseClicked

    private void jButtonIngresar6jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresar6jButtonIngresarActionPerformed
        AgregarLugar();
    }//GEN-LAST:event_jButtonIngresar6jButtonIngresarActionPerformed

    private void jButtonAgregar6jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregar6jButtonAgregarActionPerformed
        ImportarImagenPc();
    }//GEN-LAST:event_jButtonAgregar6jButtonAgregarActionPerformed

    private void rutaGaleria25rutaGaleria1rutaGaleria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaGaleria25rutaGaleria1rutaGaleria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaGaleria25rutaGaleria1rutaGaleria1ActionPerformed

    private void rutaGaleria26rutaGaleria2rutaGaleria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaGaleria26rutaGaleria2rutaGaleria2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaGaleria26rutaGaleria2rutaGaleria2ActionPerformed

    private void imagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MouseClicked

    }//GEN-LAST:event_imagen1MouseClicked

    private void imagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imagen2MouseClicked

    private void Imagen3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen3MouseClicked

    private void Imagen4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen4MouseClicked

    private void descripcion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descripcion1MouseClicked
        PanelGaleriaFondo.setVisible(false);
        PanelGaleria.setVisible(false);
        Contenido4.setVisible(true);
        descripcion.setVisible(true);
        Resul.setVisible(true);
        sepa1.setVisible(true);
        sepa2.setVisible(true);
        galeria.setVisible(true);
        separador3.setVisible(true);
        informacion.setVisible(true);
        nombreLugar.setVisible(true);
        jButtonIngresar.setVisible(false);
        jButtonAgregar.setVisible(false);
        jLabelImagenPerfil.setVisible(true);
        rutaImagenPerfil.setVisible(true);
        rutaGaleria1.setVisible(false);
        rutaGaleria2.setVisible(false);
        rutaGaleria3.setVisible(false);
        rutaGaleria4.setVisible(false);
        jPanelDescripcion.setVisible(true);
        textDescripcion.setVisible(true);
        categoria.setVisible(true);
        Buscador.setText("Buscar...");
        PanelInformacion.setVisible(true);
        Resul.setVisible(false);
        PanelGaleriaFondo.setVisible(false);
        imagen1.setVisible(false);
        imagen2.setVisible(false);
        Imagen3.setVisible(false);
        Imagen4.setVisible(false);
        descripcion1.setVisible(false);
        informacion1.setVisible(false);
        Buscar.requestFocus();
    }//GEN-LAST:event_descripcion1MouseClicked

    private void informacion1detallesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_informacion1detallesMouseClicked
        PanelGaleriaFondo.setVisible(false);
        PanelGaleria.setVisible(false);
        imagen1.setVisible(false);
        imagen2.setVisible(false);
        Imagen3.setVisible(false);
        Imagen4.setVisible(false);
        descripcion1.setVisible(false);
        informacion1.setVisible(false);
        Contenido4.setVisible(true);
        descripcion.setVisible(true);
        Buscador.setText("Buscar...");
        sepa1.setVisible(true);
        sepa2.setVisible(true);
        galeria.setVisible(true);
        separador3.setVisible(true);
        categoria.setVisible(true);
        informacion.setVisible(true);
        nombreLugar.setVisible(true);
        jButtonIngresar.setVisible(false);
        jButtonAgregar.setVisible(false);
        jLabelImagenPerfil.setVisible(true);
        textDescripcion.setVisible(false);
        rutaImagenPerfil.setVisible(false);
        rutaGaleria1.setVisible(false);
        rutaGaleria2.setVisible(false);
        rutaGaleria3.setVisible(false);
        rutaGaleria4.setVisible(false);
        jPanelDescripcion.setVisible(false);
        PanelInformacion.setVisible(true);
        Resul.setVisible(false);
        Buscar.requestFocus();
    }//GEN-LAST:event_informacion1detallesMouseClicked

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
            java.util.logging.Logger.getLogger(BuscarLugar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarLugar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarLugar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarLugar1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarLugar1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Buscador;
    public static javax.swing.JLabel Buscar;
    public javax.swing.JPanel Contenido4;
    public static javax.swing.JLabel Galeria;
    public static javax.swing.JLabel Imagen3;
    public static javax.swing.JLabel Imagen4;
    private javax.swing.JPanel PanelGaleria;
    private javax.swing.JScrollPane PanelGaleriaFondo;
    public static javax.swing.JPanel PanelInformacion;
    public static javax.swing.JLabel Resul;
    private javax.swing.JPanel barraPrincipal;
    public static javax.swing.JPanel barraSegundaria;
    public static javax.swing.JLabel categoria;
    private rsbuttom.RSButtonMetro cinco;
    private rsbuttom.RSButtonMetro cuatro;
    public static javax.swing.JLabel descripcion;
    public static javax.swing.JLabel descripcion1;
    public static javax.swing.JLabel direccion;
    private rsbuttom.RSButtonMetro dos;
    public static javax.swing.JLabel entrada;
    public static javax.swing.JLabel galeria;
    public static javax.swing.JLabel horario;
    public static javax.swing.JLabel imagen1;
    public static javax.swing.JLabel imagen2;
    public static javax.swing.JLabel informacion;
    public static javax.swing.JLabel informacion1;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButtonAgregar;
    public static javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabelDireccion;
    public static javax.swing.JLabel jLabelEntrada;
    public static javax.swing.JLabel jLabelHorario;
    public static javax.swing.JLabel jLabelImagenPerfil;
    private javax.swing.JLabel jLabelRegistrado;
    public static javax.swing.JPanel jPanelDescripcion;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel nombreLugar;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenu1;
    public static javax.swing.JTextField rutaGaleria1;
    public static javax.swing.JTextField rutaGaleria2;
    public static javax.swing.JTextField rutaGaleria3;
    public static javax.swing.JTextField rutaGaleria4;
    public static javax.swing.JTextField rutaImagenPerfil;
    private rsbuttom.RSButtonMetro seis;
    public static javax.swing.JSeparator sepa1;
    public static javax.swing.JSeparator sepa2;
    public static javax.swing.JSeparator sepa7;
    public static javax.swing.JSeparator sepa8;
    public static javax.swing.JSeparator separador3;
    public static javax.swing.JSeparator separador4;
    public static javax.swing.JTextArea textDescripcion;
    private rsbuttom.RSButtonMetro tres;
    private rsbuttom.RSButtonMetro uno;
    // End of variables declaration//GEN-END:variables
}
