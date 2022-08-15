package reto5.Vista;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import reto5.Modelo.VO.Consulta1VO;

import java.awt.*;
import java.util.ArrayList;
public class Interfaz1 extends JFrame {
    JPanel panelg;
    JTable tabla;
    JScrollPane scpanel01;
    DefaultTableModel modelo;
    
    public Interfaz1(){
        setTitle("Consultan 1");
        setSize(500,500);
        setResizable(false);
        
        panelg= new JPanel();
        panelg.setBackground(new Color(20,30,81));
        
        String[] columnas={"ID","Nombre","Apellido","Ciudad"};
        ArrayList<String[]> d=Consulta1VO.valores();
        String[][] Datos=new String[d.size()][4];
        
        for (int i = 0; i < d.size(); i++) {
            int j=0;
            for (String s : d.get(i)) {
                Datos[i][j]=s;
                j++;
                
            }
            
        }


        //String[][] Datos={{"","","",""},{"","","",""}};
        modelo=new DefaultTableModel(Datos,columnas);
        tabla=new JTable(modelo);

        scpanel01=new JScrollPane(tabla);
        scpanel01.setBounds(20,20,440,420);
        add(scpanel01);
        
        add(panelg);


        
        setVisible(true);

    } 
    
    
}
