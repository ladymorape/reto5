package reto5.Modelo.VO;
import java.sql.*;
import java.util.ArrayList;

import reto5.Modelo.DAO.*;
public class Consulta3VO {
    public static ArrayList<String[]> valores() {
        //ResultSet rs=null;
        ArrayList<String[]> salida_vo=new ArrayList<String[]>();
        try {
            ResultSet rs=Consulta3DAO.consulta();
            while(rs.next()){
                
                int ID=rs.getInt("ID_Compra");
                String constructora=rs.getString("Constructora");
                String banco=rs.getString("Banco_Vinculado");
                //System.out.println(String.format("%5d %15s %15s %15s", ID,nombre,apellido,ciudad));
                salida_vo.add(new String[]{ID+"",constructora,banco});
        }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return salida_vo;
    }
    
}
