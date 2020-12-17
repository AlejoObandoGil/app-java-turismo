/*
Esta clase es irrelevante. No se pudo terminar.

package Clases;

/**
 *
 * @author Natalia
 

import Clases.Consultas;
import Clases.LugaresTuristicos;
import Proyecto.BuscarLugar1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Control implements ActionListener {

    private LugaresTuristicos lugares;
    private Consultas consultas;
    private BuscarLugar1 lugarJFrame;

    public Control(LugaresTuristicos lugares, Consultas consultas, BuscarLugar1 lugarJFrame) {
        this.lugares = lugares;
        this.consultas = consultas;
        this.lugarJFrame = lugarJFrame;
        this.lugarJFrame.jButtonIngresar.addActionListener(this);
        this.lugarJFrame.Buscador.addActionListener(this);
    } 

    public Control() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void iniciar() {
        lugarJFrame.setTitle("AppPereira");
        lugarJFrame.setLocationRelativeTo(null);
        //lugarJFrame.Buscador.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == lugarJFrame.jButtonIngresar) {
            lugares.setNombreLugar(lugarJFrame.nombreLugar.getText());
            lugares.setDireccion(lugarJFrame.direccion.getText());
            lugares.setHorario(lugarJFrame.direccion.getText());
            lugares.setEntrada(lugarJFrame.direccion.getText());
            lugares.setDescripcion(lugarJFrame.direccion.getText());
            lugares.setRutaImagenPerfil(lugarJFrame.direccion.getText());          
            try {
                if(consultas.registrar(lugares))
                {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    //limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                    //limpiar();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        /*if (e.getSource() == frm.btnModificar) {
            mod.setId(Integer.parseInt(frm.txtId.getText()));
            mod.setCodigo(frm.txtCodigo.getText());
            mod.setNombre(frm.txtNombre.getText());
            mod.setPrecio(Double.parseDouble(frm.txtPrecio.getText()));
            mod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
            
            if(modC.modificar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        }
        
        if (e.getSource() == frm.btnEliminar) {
            mod.setId(Integer.parseInt(frm.txtId.getText()));
            
            if(modC.eliminar(mod))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
        
        if (e.getSource() == lugarJFrame.Buscar) {
            try {
                if(consultas.registrar(lugares))
                {
                    lugarJFrame.nombreLugar.setText(String.valueOf(lugares.getNombreLugar()));
                    lugarJFrame.direccion.setText(String.valueOf(lugares.getDireccion()));
                    lugarJFrame.horario.setText(String.valueOf(lugares.getHorario()));
                    lugarJFrame.entrada.setText(String.valueOf(lugares.getEntrada()));
                    lugarJFrame.descripcion.setText(String.valueOf(lugares.getDescripcion()));
                    lugarJFrame.rutaImagenPerfil.setText(String.valueOf(lugares.getRutaImagenPerfil()));
                    
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontro nada");
                    // limpiar();
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }

    public void actionPerformed(JLabel Buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    
    
    /*public void limpiar()
    {
        frm.txtId.setText(null);
        frm.txtCodigo.setText(null);
        frm.txtNombre.setText(null);
        frm.txtPrecio.setText(null);
        frm.txtCantidad.setText(null);
    }

}*/

