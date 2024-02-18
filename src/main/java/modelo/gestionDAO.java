package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class gestionDAO {

    private conexion con;
    Connection conn;

    public gestionDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
        con = new conexion(jdbcURL, jdbcUsername, jdbcPassword);
        conn = con.connection();
        con.getjdbcConnection();
    }

    PreparedStatement ps;
    ResultSet rs;

    public boolean insertargestion(gestion objges) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("CALL insertgestion ( ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, objges.getId());
            ps.setString(2, objges.getDocumentacion_entregada());
            ps.setString(3, objges.getDocumentacion_validada());
            ps.setString(4, objges.getDocumentacion_senescyt());
            ps.setString(5, objges.getEstado_beca());
            ps.setString(6, objges.getFecha_revision());
            ps.setString(7, objges.getNumero_documento_senescyt());
            ps.setInt(8, objges.getFk_forrmulario());
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException e) {
            System.out.println("------------------------------------------------");
            System.out.println("Ha ocurrido un error al insertar la gestion " + e);
            System.out.println("------------------------------------------------");
        }
        return false;
    }

    public boolean editargestion(gestion objge) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("call updategestion ( ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, objge.getDocumentacion_entregada());
            ps.setString(2, objge.getDocumentacion_validada());
            ps.setString(3, objge.getDocumentacion_senescyt());
            ps.setString(4, objge.getEstado_beca());
            ps.setString(5, objge.getFecha_revision());
            ps.setString(6, objge.getNumero_documento_senescyt());
            ps.setInt(7, objge.getId());
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException e) {
            System.out.println("------------------------------------------------");
            System.out.println("Ha ocurrido un error al editar el reporte " + e);
            System.out.println("------------------------------------------------");
        }
        return false;
    }

    public List listargestion() {
        List<gestion> listagestion = new ArrayList<>();;
        String sSQL;
        sSQL = "Select * from viewgestion ORDER BY id DESC";
        try {
            ps = conn.prepareStatement(sSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                gestion ges = new gestion();
                ges.setId(Integer.parseInt(rs.getString("id")));
                ges.setNombre(rs.getString("PRIMERNOMBREESTUDIANTE"));
                ges.setApellido(rs.getString("PRIMERAPELLIDOESTUDIANTE"));
                ges.setCedula(rs.getString("NUMIDENTIFICACIONESTUDIANTE"));
                ges.setCarrera(rs.getString("CARRERAESTUDIANTE"));
                ges.setTipo(rs.getString("COMPONENTEESTUDIANTE"));
                ges.setDocumentacion_entregada(rs.getString("documentacion_entregada"));
                ges.setDocumentacion_validada(rs.getString("documentacion_validada"));
                ges.setDocumentacion_senescyt(rs.getString("documentacion_senescyt"));
                ges.setFecha_revision(rs.getString("fecha_revision"));
                ges.setEstado_beca(rs.getString("estado_beca"));
                ges.setNumero_documento_senescyt(rs.getString("numero_documento_senescyt"));
                listagestion.add(ges);
            }
            System.out.println("------------------------------------------");
            System.out.println(sSQL);
            System.out.println("Se ha listado en gestion:");
            System.out.println("------------------------------------------");
        } catch (SQLException e) {
            System.out.println("------------------------------------------");
            System.out.println("Error al listar en gestion: " + e);
            System.out.println("------------------------------------------");
        }
        return listagestion;
    }


    public List busqgestion(int id) {
        List<gestion> listabuscargestion = new ArrayList<>();;
        String sSQL;
        sSQL = "Select * from viewgestion WHERE NUMIDENTIFICACIONESTUDIANTE=" + id;
        try {
            ps = conn.prepareStatement(sSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                gestion ges = new gestion();
                ges.setId(Integer.parseInt(rs.getString("id")));
                ges.setNombre(rs.getString("PRIMERNOMBREESTUDIANTE"));
                ges.setApellido(rs.getString("PRIMERAPELLIDOESTUDIANTE"));
                ges.setCedula(rs.getString("NUMIDENTIFICACIONESTUDIANTE"));
                ges.setTipo(rs.getString("COMPONENTEESTUDIANTE"));
                ges.setDocumentacion_entregada(rs.getString("documentacion_entregada"));
                ges.setDocumentacion_validada(rs.getString("documentacion_validada"));
                ges.setDocumentacion_senescyt(rs.getString("documentacion_senescyt"));
                ges.setEstado_beca(rs.getString("estado_beca"));
                ges.setFecha_revision(rs.getString("fecha_revision"));
                listabuscargestion.add(ges);
            }
            System.out.println("------------------------------------------");
            System.out.println(sSQL);
            System.out.println("Se ha listado en gestion:");
            System.out.println("------------------------------------------");
        } catch (SQLException e) {
            System.out.println("------------------------------------------");
            System.out.println("Error al listar en gestion: " + e);
            System.out.println("------------------------------------------");
        }
        return listabuscargestion;
    }

    public boolean eliminargestion(int id) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM gestion_de_becas WHERE idgestion = ?");
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException e) {
            System.out.println("------------------------------------------------");
            System.out.println("Ha ocurrido un error al eliminar la gestion " + e);
            System.out.println("------------------------------------------------");
        }
        return false;

    }

    public gestion editgestion(int id) {
        gestion ges = new gestion();
        String sSQL = "SELECT * FROM viewgestion WHERE id=" + id;
        try {
            ps = conn.prepareStatement(sSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                ges.setId(Integer.parseInt(rs.getString("id")));
                ges.setNombre(rs.getString("PRIMERNOMBREESTUDIANTE"));
                ges.setApellido(rs.getString("PRIMERAPELLIDOESTUDIANTE"));
                ges.setCedula(rs.getString("NUMIDENTIFICACIONESTUDIANTE"));
                ges.setCarrera(rs.getString("CARRERAESTUDIANTE"));
                ges.setTipo(rs.getString("COMPONENTEESTUDIANTE"));
                ges.setDocumentacion_entregada(rs.getString("documentacion_entregada"));
                ges.setDocumentacion_validada(rs.getString("documentacion_validada"));
                ges.setDocumentacion_senescyt(rs.getString("documentacion_senescyt"));
                ges.setEstado_beca(rs.getString("estado_beca"));
                ges.setFecha_revision(rs.getString("fecha_revision"));
                ges.setNumero_documento_senescyt(rs.getString("numero_documento_senescyt"));
            }
            System.out.println("------------------------------------------");
            System.out.println(sSQL);
            System.out.println("Se ha listado las gestiones:");
            System.out.println("------------------------------------------");
        } catch (SQLException e) {
            System.out.println("------------------------------------------");
            System.out.println("Error al listar la gestion: " + e);
            System.out.println("------------------------------------------");
        }
        return ges;
    }

    
}
