package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class formularioDAO {

    private conexion con;
    Connection conn;

    public formularioDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
        con = new conexion(jdbcURL, jdbcUsername, jdbcPassword);
        conn = con.connection();
        con.getjdbcConnection();
    }

    PreparedStatement ps;
    ResultSet rs;

    public boolean insertarformulario(formulario objfi) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("CALL InsertarEstudiante (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, objfi.getIDESTUDIANTE());
            ps.setString(2, objfi.getTIPOIDENTIFICACIONESTUDIANTE());
            ps.setString(3, objfi.getNUMIDENTIFICACIONESTUDIANTE());
            ps.setString(4, objfi.getPRIMERAPELLIDOESTUDIANTE());
            ps.setString(5, objfi.getSEGUNDOAPELLIDOESTUDIANTE());
            ps.setString(6, objfi.getPRIMERNOMBREESTUDIANTE());
            ps.setString(7, objfi.getSEGUNDONOMBREESTUDIANTE());
            ps.setString(8, objfi.getFECHANACIMIENTOESTUDIANTE());
            ps.setString(9, objfi.getGENEROESTUDIANTE());
            ps.setString(10, objfi.getESTADOCIVILESTUDIANTE());
            ps.setString(11, objfi.getETNIAESTUDIANTE());
            ps.setString(12, objfi.getPUEBLOESTUDIANTE());
            ps.setString(13, objfi.getTIPOSANGREESTUDIANTE());
            ps.setString(14, objfi.getTIENEDISCAPACIDAD());
            ps.setString(15, objfi.getPORCENTAJEDISCAPACIDADESTUDIANTE());
            ps.setString(16, objfi.getNUMCARNETESTUDIANTE());
            ps.setString(17, objfi.getTIPODISCAPACIDAD());
            ps.setString(18, objfi.getPROVINCIANACIMIENTOESTUDIANTE());
            ps.setString(19, objfi.getCANTONNACIMIENTOESTUDIANTE());
            ps.setString(20, objfi.getPROVINCIARESIDENCIAESTUDIANTE());
            ps.setString(21, objfi.getCANTONRESIDENCIAESTUDIANTE());
            ps.setString(22, objfi.getCORREOESTUDIANTE());
            ps.setString(23, objfi.getNUMEROCELULARESTUDIANTE());
            ps.setString(24, objfi.getNIVELFORMACIONPADREDEESTUDIANTE());
            ps.setString(25, objfi.getNIVELFORMACIONMADREDEESTUDIANTE());
            ps.setString(26, objfi.getINGRESOTOTALHOGARESTUDIANTE());
            ps.setString(27, objfi.getNUMEROMIEMBROSHOGARESTUDIANTE());
            ps.setString(28, objfi.getTIPOCOLEGIOESTUDIANTE());
            ps.setString(29, objfi.getMODALIDADCARRERAESTUDIANTE());
            ps.setString(30, objfi.getJORNADACARRERAESTUDIANTE());
            ps.setString(31, objfi.getFECHAINICIOCARRERAESTUDIANTE());
            ps.setString(32, objfi.getFECHAMATRICULAESTUDIANTE());
            ps.setString(33, objfi.getTIPOMATRICULAESTUDIANTE());
            ps.setString(34, objfi.getNIVELACADEMICOESTUDIANTE());
            ps.setString(35, objfi.getSEMANASDURACIONPERIODOESTUDIANTE());
            ps.setString(36, objfi.getREPETIDOMATERIAESTUDIANTE());
            ps.setString(37, objfi.getCARRERAESTUDIANTE());
            ps.setString(38, objfi.getPARALELOESTUDIANTE());
            ps.setString(39, objfi.getPERDIDOGRATUIDADESTUDIANTE());
            ps.setString(40, objfi.getPOSEEPENSIONESTUDIANTE());
            ps.setString(41, objfi.getENCUENTRADEDICADOESTUDIANTE());
            ps.setString(42, objfi.getEMPLEAINGRESOSESTUDIANTE());
            ps.setString(43, objfi.getFAMILIARECIBEBONODESARROLLOHUMANOESTUDIANTE());
            ps.setString(44, objfi.getREALIZADOPRACTICASESTUDIANTE());
            ps.setString(45, objfi.getHORASPRACTICAREALIZOESTUDIANTE());
            ps.setString(46, objfi.getTIPOINSTITUCIONREALIZAPRACTICASESTUDIANTE());
            ps.setString(47, objfi.getSECTORECONOMICOPRACTICASESTUDIANTE());
            ps.setString(48, objfi.getPARTICIPADOPROYECTODEVINCULACIONESTUDIANTE());
            ps.setString(49, objfi.getALCANCEPROYECTOVINCULACIONESTUDIANTE());
            ps.setString(50, objfi.getCOMPONENTEESTUDIANTE());
            ps.setString(51, objfi.getREQUISITOSCOMPONENTEESTUDIANTE());
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException e) {
            System.out.println("------------------------------------------------");
            System.out.println("Ha ocurrido un error al insertar el formulario " + e);
            System.out.println("------------------------------------------------");
        }
        return false;
    }

    //============================= METODO PARA LISTAR EN LA TABLA========================// 
    public List listarform() {
        List<formulario> listaformulario = new ArrayList<>();;
        String sSQL;
        sSQL = "Select * from estudiantes ORDER BY NUMIDENTIFICACIONESTUDIANTE DESC";
        try {
            ps = conn.prepareStatement(sSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                formulario form = new formulario();
                form.setIDESTUDIANTE(Integer.parseInt(rs.getString("IDESTUDIANTE")));
                form.setTIPOIDENTIFICACIONESTUDIANTE(rs.getString("TIPOIDENTIFICACIONESTUDIANTE"));
                form.setNUMIDENTIFICACIONESTUDIANTE(rs.getString("NUMIDENTIFICACIONESTUDIANTE"));
                form.setPRIMERAPELLIDOESTUDIANTE(rs.getString("PRIMERAPELLIDOESTUDIANTE"));
                form.setSEGUNDOAPELLIDOESTUDIANTE(rs.getString("SEGUNDOAPELLIDOESTUDIANTE"));
                form.setPRIMERNOMBREESTUDIANTE(rs.getString("PRIMERNOMBREESTUDIANTE"));
                form.setSEGUNDONOMBREESTUDIANTE(rs.getString("SEGUNDONOMBREESTUDIANTE"));
                form.setFECHANACIMIENTOESTUDIANTE(rs.getString("FECHANACIMIENTOESTUDIANTE"));
                form.setGENEROESTUDIANTE(rs.getString("GENEROESTUDIANTE"));
                form.setESTADOCIVILESTUDIANTE(rs.getString("ESTADOCIVILESTUDIANTE"));
                form.setETNIAESTUDIANTE(rs.getString("ETNIAESTUDIANTE"));
                form.setPUEBLOESTUDIANTE(rs.getString("PUEBLOESTUDIANTE"));
                form.setTIPOSANGREESTUDIANTE(rs.getString("TIPOSANGREESTUDIANTE"));
                form.setTIENEDISCAPACIDAD(rs.getString("TIENEDISCAPACIDAD"));
                form.setPORCENTAJEDISCAPACIDADESTUDIANTE(rs.getString("PORCENTAJEDISCAPACIDADESTUDIANTE"));
                form.setNUMCARNETESTUDIANTE(rs.getString("NUMCARNETESTUDIANTE"));
                form.setTIPODISCAPACIDAD(rs.getString("TIPODISCAPACIDAD"));
                form.setPROVINCIANACIMIENTOESTUDIANTE(rs.getString("PROVINCIANACIMIENTOESTUDIANTE"));
                form.setCANTONNACIMIENTOESTUDIANTE(rs.getString("CANTONNACIMIENTOESTUDIANTE"));
                form.setPROVINCIARESIDENCIAESTUDIANTE(rs.getString("PROVINCIARESIDENCIAESTUDIANTE"));
                form.setCANTONRESIDENCIAESTUDIANTE(rs.getString("CANTONRESIDENCIAESTUDIANTE"));
                form.setCORREOESTUDIANTE(rs.getString("CORREOESTUDIANTE"));
                form.setNUMEROCELULARESTUDIANTE(rs.getString("NUMEROCELULARESTUDIANTE"));
                form.setNIVELFORMACIONPADREDEESTUDIANTE(rs.getString("NIVELFORMACIONPADREDEESTUDIANTE"));
                form.setNIVELFORMACIONMADREDEESTUDIANTE(rs.getString("NIVELFORMACIONMADREDEESTUDIANTE"));
                form.setINGRESOTOTALHOGARESTUDIANTE(rs.getString("INGRESOTOTALHOGARESTUDIANTE"));
                form.setNUMEROMIEMBROSHOGARESTUDIANTE(rs.getString("NUMEROMIEMBROSHOGARESTUDIANTE"));
                form.setTIPOCOLEGIOESTUDIANTE(rs.getString("TIPOCOLEGIOESTUDIANTE"));
                form.setMODALIDADCARRERAESTUDIANTE(rs.getString("MODALIDADCARRERAESTUDIANTE"));
                form.setJORNADACARRERAESTUDIANTE(rs.getString("JORNADACARRERAESTUDIANTE"));
                form.setFECHAINICIOCARRERAESTUDIANTE(rs.getString("FECHAINICIOCARRERAESTUDIANTE"));
                form.setFECHAMATRICULAESTUDIANTE(rs.getString("FECHAMATRICULAESTUDIANTE"));
                form.setTIPOMATRICULAESTUDIANTE(rs.getString("TIPOMATRICULAESTUDIANTE"));
                form.setNIVELACADEMICOESTUDIANTE(rs.getString("NIVELACADEMICOESTUDIANTE"));
                form.setSEMANASDURACIONPERIODOESTUDIANTE(rs.getString("SEMANASDURACIONPERIODOESTUDIANTE"));
                form.setREPETIDOMATERIAESTUDIANTE(rs.getString("REPETIDOMATERIAESTUDIANTE"));
                form.setCARRERAESTUDIANTE(rs.getString("CARRERAESTUDIANTE"));
                form.setPARALELOESTUDIANTE(rs.getString("PARALELOESTUDIANTE"));
                form.setPERDIDOGRATUIDADESTUDIANTE(rs.getString("PERDIDOGRATUIDADESTUDIANTE"));
                form.setPOSEEPENSIONESTUDIANTE(rs.getString("POSEEPENSIONESTUDIANTE"));
                form.setENCUENTRADEDICADOESTUDIANTE(rs.getString("ENCUENTRADEDICADOESTUDIANTE"));
                form.setEMPLEAINGRESOSESTUDIANTE(rs.getString("EMPLEAINGRESOSESTUDIANTE"));
                form.setFAMILIARECIBEBONODESARROLLOHUMANOESTUDIANTE(rs.getString("FAMILIARECIBEBONODESARROLLOHUMANOESTUDIANTE"));
                form.setREALIZADOPRACTICASESTUDIANTE(rs.getString("REALIZADOPRACTICASESTUDIANTE"));
                form.setHORASPRACTICAREALIZOESTUDIANTE(rs.getString("HORASPRACTICAREALIZOESTUDIANTE"));
                form.setTIPOINSTITUCIONREALIZAPRACTICASESTUDIANTE(rs.getString("TIPOINSTITUCIONREALIZAPRACTICASESTUDIANTE"));
                form.setSECTORECONOMICOPRACTICASESTUDIANTE(rs.getString("SECTORECONOMICOPRACTICASESTUDIANTE"));
                form.setPARTICIPADOPROYECTODEVINCULACIONESTUDIANTE(rs.getString("PARTICIPADOPROYECTODEVINCULACIONESTUDIANTE"));
                form.setALCANCEPROYECTOVINCULACIONESTUDIANTE(rs.getString("ALCANCEPROYECTOVINCULACIONESTUDIANTE"));
                form.setCOMPONENTEESTUDIANTE(rs.getString("COMPONENTEESTUDIANTE"));
                form.setREQUISITOSCOMPONENTEESTUDIANTE(rs.getString("REQUISITOSCOMPONENTEESTUDIANTE"));
                listaformulario.add(form);
            }
            System.out.println("------------------------------------------");
            System.out.println(sSQL);
            System.out.println("Se ha listado el formulario:");
            System.out.println("------------------------------------------");
        } catch (SQLException e) {
            System.out.println("------------------------------------------");
            System.out.println("Error al listar el formulario: " + e);
            System.out.println("------------------------------------------");
        }
        return listaformulario;
    }

    //============================= METODO PARA BUSCAR EN LA TABLA POR ID========================// 
    public List buscarform(int id) {
        List<formulario> listabusqform = new ArrayList<>();;
        String sSQL;
        sSQL = "Select * from estudiantes WHERE NUMIDENTIFICACIONESTUDIANTE LIKE '%" + id + "%'";
        try {
            ps = conn.prepareStatement(sSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                formulario form = new formulario();
                form.setIDESTUDIANTE(Integer.parseInt(rs.getString("IDESTUDIANTE")));
                form.setTIPOIDENTIFICACIONESTUDIANTE(rs.getString("TIPOIDENTIFICACIONESTUDIANTE"));
                form.setNUMIDENTIFICACIONESTUDIANTE(rs.getString("NUMIDENTIFICACIONESTUDIANTE"));
                form.setPRIMERAPELLIDOESTUDIANTE(rs.getString("PRIMERAPELLIDOESTUDIANTE"));
                form.setSEGUNDOAPELLIDOESTUDIANTE(rs.getString("SEGUNDOAPELLIDOESTUDIANTE"));
                form.setPRIMERNOMBREESTUDIANTE(rs.getString("PRIMERNOMBREESTUDIANTE"));
                form.setSEGUNDONOMBREESTUDIANTE(rs.getString("SEGUNDONOMBREESTUDIANTE"));
                form.setFECHANACIMIENTOESTUDIANTE(rs.getString("FECHANACIMIENTOESTUDIANTE"));
                form.setGENEROESTUDIANTE(rs.getString("GENEROESTUDIANTE"));
                form.setESTADOCIVILESTUDIANTE(rs.getString("ESTADOCIVILESTUDIANTE"));
                form.setETNIAESTUDIANTE(rs.getString("ETNIAESTUDIANTE"));
                form.setPUEBLOESTUDIANTE(rs.getString("PUEBLOESTUDIANTE"));
                form.setTIPOSANGREESTUDIANTE(rs.getString("TIPOSANGREESTUDIANTE"));
                form.setTIENEDISCAPACIDAD(rs.getString("TIENEDISCAPACIDAD"));
                form.setPORCENTAJEDISCAPACIDADESTUDIANTE(rs.getString("PORCENTAJEDISCAPACIDADESTUDIANTE"));
                form.setNUMCARNETESTUDIANTE(rs.getString("NUMCARNETESTUDIANTE"));
                form.setTIPODISCAPACIDAD(rs.getString("TIPODISCAPACIDAD"));
                form.setPROVINCIANACIMIENTOESTUDIANTE(rs.getString("PROVINCIANACIMIENTOESTUDIANTE"));
                form.setCANTONNACIMIENTOESTUDIANTE(rs.getString("CANTONNACIMIENTOESTUDIANTE"));
                form.setPROVINCIARESIDENCIAESTUDIANTE(rs.getString("PROVINCIARESIDENCIAESTUDIANTE"));
                form.setCANTONRESIDENCIAESTUDIANTE(rs.getString("CANTONRESIDENCIAESTUDIANTE"));
                form.setCORREOESTUDIANTE(rs.getString("CORREOESTUDIANTE"));
                form.setNUMEROCELULARESTUDIANTE(rs.getString("NUMEROCELULARESTUDIANTE"));
                form.setNIVELFORMACIONPADREDEESTUDIANTE(rs.getString("NIVELFORMACIONPADREDEESTUDIANTE"));
                form.setNIVELFORMACIONMADREDEESTUDIANTE(rs.getString("NIVELFORMACIONMADREDEESTUDIANTE"));
                form.setINGRESOTOTALHOGARESTUDIANTE(rs.getString("INGRESOTOTALHOGARESTUDIANTE"));
                form.setNUMEROMIEMBROSHOGARESTUDIANTE(rs.getString("NUMEROMIEMBROSHOGARESTUDIANTE"));
                form.setTIPOCOLEGIOESTUDIANTE(rs.getString("TIPOCOLEGIOESTUDIANTE"));
                form.setMODALIDADCARRERAESTUDIANTE(rs.getString("MODALIDADCARRERAESTUDIANTE"));
                form.setJORNADACARRERAESTUDIANTE(rs.getString("JORNADACARRERAESTUDIANTE"));
                form.setFECHAINICIOCARRERAESTUDIANTE(rs.getString("FECHAINICIOCARRERAESTUDIANTE"));
                form.setFECHAMATRICULAESTUDIANTE(rs.getString("FECHAMATRICULAESTUDIANTE"));
                form.setTIPOMATRICULAESTUDIANTE(rs.getString("TIPOMATRICULAESTUDIANTE"));
                form.setNIVELACADEMICOESTUDIANTE(rs.getString("NIVELACADEMICOESTUDIANTE"));
                form.setSEMANASDURACIONPERIODOESTUDIANTE(rs.getString("SEMANASDURACIONPERIODOESTUDIANTE"));
                form.setREPETIDOMATERIAESTUDIANTE(rs.getString("REPETIDOMATERIAESTUDIANTE"));
                form.setCARRERAESTUDIANTE(rs.getString("CARRERAESTUDIANTE"));
                form.setPARALELOESTUDIANTE(rs.getString("PARALELOESTUDIANTE"));
                form.setPERDIDOGRATUIDADESTUDIANTE(rs.getString("PERDIDOGRATUIDADESTUDIANTE"));
                form.setPOSEEPENSIONESTUDIANTE(rs.getString("POSEEPENSIONESTUDIANTE"));
                form.setENCUENTRADEDICADOESTUDIANTE(rs.getString("ENCUENTRADEDICADOESTUDIANTE"));
                form.setEMPLEAINGRESOSESTUDIANTE(rs.getString("EMPLEAINGRESOSESTUDIANTE"));
                form.setFAMILIARECIBEBONODESARROLLOHUMANOESTUDIANTE(rs.getString("FAMILIARECIBEBONODESARROLLOHUMANOESTUDIANTE"));
                form.setREALIZADOPRACTICASESTUDIANTE(rs.getString("REALIZADOPRACTICASESTUDIANTE"));
                form.setHORASPRACTICAREALIZOESTUDIANTE(rs.getString("HORASPRACTICAREALIZOESTUDIANTE"));
                form.setTIPOINSTITUCIONREALIZAPRACTICASESTUDIANTE(rs.getString("TIPOINSTITUCIONREALIZAPRACTICASESTUDIANTE"));
                form.setSECTORECONOMICOPRACTICASESTUDIANTE(rs.getString("SECTORECONOMICOPRACTICASESTUDIANTE"));
                form.setPARTICIPADOPROYECTODEVINCULACIONESTUDIANTE(rs.getString("PARTICIPADOPROYECTODEVINCULACIONESTUDIANTE"));
                form.setALCANCEPROYECTOVINCULACIONESTUDIANTE(rs.getString("ALCANCEPROYECTOVINCULACIONESTUDIANTE"));
                form.setCOMPONENTEESTUDIANTE(rs.getString("COMPONENTEESTUDIANTE"));
                form.setREQUISITOSCOMPONENTEESTUDIANTE(rs.getString("REQUISITOSCOMPONENTEESTUDIANTE"));
                listabusqform.add(form);
            }
            System.out.println("------------------------------------------");
            System.out.println(sSQL);
            System.out.println("Se ha listado el formulario:");
            System.out.println("------------------------------------------");
        } catch (SQLException e) {
            System.out.println("------------------------------------------");
            System.out.println("Error al listar el formulario: " + e);
            System.out.println("------------------------------------------");
        }
        return listabusqform;
    }

    //========================= METODO PARA ELIMINAR UN FORMULARIO ====================================//
    public boolean Eliminarform(int id) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM estudiantes WHERE IDESTUDIANTE = ?");
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException e) {
            System.out.println("------------------------------------------------");
            System.out.println("Ha ocurrido un error al eliminar el formulario " + e);
            System.out.println("------------------------------------------------");
        }
        return false;

    }

    //=================== METODO PARAR EDITAR UN REGISTRO EN LA TABLA FORMULARIO =======================//
    public boolean editarFormularios(formulario objfi) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("call ActualizarEstudiante ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, objfi.getTIPOIDENTIFICACIONESTUDIANTE());
            ps.setString(2, objfi.getNUMIDENTIFICACIONESTUDIANTE());
            ps.setString(3, objfi.getPRIMERAPELLIDOESTUDIANTE());
            ps.setString(4, objfi.getSEGUNDOAPELLIDOESTUDIANTE());
            ps.setString(5, objfi.getPRIMERNOMBREESTUDIANTE());
            ps.setString(6, objfi.getSEGUNDONOMBREESTUDIANTE());
            ps.setString(7, objfi.getFECHANACIMIENTOESTUDIANTE());
            ps.setString(8, objfi.getGENEROESTUDIANTE());
            ps.setString(9, objfi.getESTADOCIVILESTUDIANTE());
            ps.setString(10, objfi.getETNIAESTUDIANTE());
            ps.setString(11, objfi.getPUEBLOESTUDIANTE());
            ps.setString(12, objfi.getTIPOSANGREESTUDIANTE());
            ps.setString(13, objfi.getTIENEDISCAPACIDAD());
            ps.setString(14, objfi.getPORCENTAJEDISCAPACIDADESTUDIANTE());
            ps.setString(15, objfi.getNUMCARNETESTUDIANTE());
            ps.setString(16, objfi.getTIPODISCAPACIDAD());
            ps.setString(17, objfi.getPROVINCIANACIMIENTOESTUDIANTE());
            ps.setString(18, objfi.getCANTONNACIMIENTOESTUDIANTE());
            ps.setString(19, objfi.getPROVINCIARESIDENCIAESTUDIANTE());
            ps.setString(20, objfi.getCANTONRESIDENCIAESTUDIANTE());
            ps.setString(21, objfi.getCORREOESTUDIANTE());
            ps.setString(22, objfi.getNUMEROCELULARESTUDIANTE());
            ps.setString(23, objfi.getNIVELFORMACIONPADREDEESTUDIANTE());
            ps.setString(24, objfi.getNIVELFORMACIONMADREDEESTUDIANTE());
            ps.setString(25, objfi.getINGRESOTOTALHOGARESTUDIANTE());
            ps.setString(26, objfi.getNUMEROMIEMBROSHOGARESTUDIANTE());
            ps.setString(27, objfi.getTIPOCOLEGIOESTUDIANTE());
            ps.setString(28, objfi.getMODALIDADCARRERAESTUDIANTE());
            ps.setString(29, objfi.getJORNADACARRERAESTUDIANTE());
            ps.setString(30, objfi.getFECHAINICIOCARRERAESTUDIANTE());
            ps.setString(31, objfi.getFECHAMATRICULAESTUDIANTE());
            ps.setString(32, objfi.getTIPOMATRICULAESTUDIANTE());
            ps.setString(33, objfi.getNIVELACADEMICOESTUDIANTE());
            ps.setString(34, objfi.getSEMANASDURACIONPERIODOESTUDIANTE());
            ps.setString(35, objfi.getREPETIDOMATERIAESTUDIANTE());
            ps.setString(36, objfi.getCARRERAESTUDIANTE());
            ps.setString(37, objfi.getPARALELOESTUDIANTE());
            ps.setString(38, objfi.getPERDIDOGRATUIDADESTUDIANTE());
            ps.setString(39, objfi.getPOSEEPENSIONESTUDIANTE());
            ps.setString(40, objfi.getENCUENTRADEDICADOESTUDIANTE());
            ps.setString(41, objfi.getEMPLEAINGRESOSESTUDIANTE());
            ps.setString(42, objfi.getFAMILIARECIBEBONODESARROLLOHUMANOESTUDIANTE());
            ps.setString(43, objfi.getREALIZADOPRACTICASESTUDIANTE());
            ps.setString(44, objfi.getHORASPRACTICAREALIZOESTUDIANTE());
            ps.setString(45, objfi.getTIPOINSTITUCIONREALIZAPRACTICASESTUDIANTE());
            ps.setString(46, objfi.getSECTORECONOMICOPRACTICASESTUDIANTE());
            ps.setString(47, objfi.getPARTICIPADOPROYECTODEVINCULACIONESTUDIANTE());
            ps.setString(48, objfi.getALCANCEPROYECTOVINCULACIONESTUDIANTE());
            ps.setString(49, objfi.getCOMPONENTEESTUDIANTE());
            ps.setString(50, objfi.getREQUISITOSCOMPONENTEESTUDIANTE());
            ps.setInt(51, objfi.getIDESTUDIANTE());
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException e) {
            System.out.println("------------------------------------------------");
            System.out.println("Ha ocurrido un error al editar el formulario " + e);
            System.out.println("------------------------------------------------");
        }
        return false;
    }

    //========================= METODO PARA EXTRAER LOS DATOS PARA EDITARLOS =======================//
    public formulario editform(int id) {
        formulario form = new formulario();
        String sSQL = "SELECT * FROM estudiantes WHERE IDESTUDIANTE=?";
        try {
            ps = conn.prepareStatement(sSQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                form.setIDESTUDIANTE(Integer.parseInt(rs.getString("IDESTUDIANTE")));
                form.setTIPOIDENTIFICACIONESTUDIANTE(rs.getString("TIPOIDENTIFICACIONESTUDIANTE"));
                form.setNUMIDENTIFICACIONESTUDIANTE(rs.getString("NUMIDENTIFICACIONESTUDIANTE"));
                form.setPRIMERAPELLIDOESTUDIANTE(rs.getString("PRIMERAPELLIDOESTUDIANTE"));
                form.setSEGUNDOAPELLIDOESTUDIANTE(rs.getString("SEGUNDOAPELLIDOESTUDIANTE"));
                form.setPRIMERNOMBREESTUDIANTE(rs.getString("PRIMERNOMBREESTUDIANTE"));
                form.setSEGUNDONOMBREESTUDIANTE(rs.getString("SEGUNDONOMBREESTUDIANTE"));
                form.setFECHANACIMIENTOESTUDIANTE(rs.getString("FECHANACIMIENTOESTUDIANTE"));
                form.setGENEROESTUDIANTE(rs.getString("GENEROESTUDIANTE"));
                form.setESTADOCIVILESTUDIANTE(rs.getString("ESTADOCIVILESTUDIANTE"));
                form.setETNIAESTUDIANTE(rs.getString("ETNIAESTUDIANTE"));
                form.setPUEBLOESTUDIANTE(rs.getString("PUEBLOESTUDIANTE"));
                form.setTIPOSANGREESTUDIANTE(rs.getString("TIPOSANGREESTUDIANTE"));
                form.setTIENEDISCAPACIDAD(rs.getString("TIENEDISCAPACIDAD"));
                form.setPORCENTAJEDISCAPACIDADESTUDIANTE(rs.getString("PORCENTAJEDISCAPACIDADESTUDIANTE"));
                form.setNUMCARNETESTUDIANTE(rs.getString("NUMCARNETESTUDIANTE"));
                form.setTIPODISCAPACIDAD(rs.getString("TIPODISCAPACIDAD"));
                form.setPROVINCIANACIMIENTOESTUDIANTE(rs.getString("PROVINCIANACIMIENTOESTUDIANTE"));
                form.setCANTONNACIMIENTOESTUDIANTE(rs.getString("CANTONNACIMIENTOESTUDIANTE"));
                form.setPROVINCIARESIDENCIAESTUDIANTE(rs.getString("PROVINCIARESIDENCIAESTUDIANTE"));
                form.setCANTONRESIDENCIAESTUDIANTE(rs.getString("CANTONRESIDENCIAESTUDIANTE"));
                form.setCORREOESTUDIANTE(rs.getString("CORREOESTUDIANTE"));
                form.setNUMEROCELULARESTUDIANTE(rs.getString("NUMEROCELULARESTUDIANTE"));
                form.setNIVELFORMACIONPADREDEESTUDIANTE(rs.getString("NIVELFORMACIONPADREDEESTUDIANTE"));
                form.setNIVELFORMACIONMADREDEESTUDIANTE(rs.getString("NIVELFORMACIONMADREDEESTUDIANTE"));
                form.setINGRESOTOTALHOGARESTUDIANTE(rs.getString("INGRESOTOTALHOGARESTUDIANTE"));
                form.setNUMEROMIEMBROSHOGARESTUDIANTE(rs.getString("NUMEROMIEMBROSHOGARESTUDIANTE"));
                form.setTIPOCOLEGIOESTUDIANTE(rs.getString("TIPOCOLEGIOESTUDIANTE"));
                form.setMODALIDADCARRERAESTUDIANTE(rs.getString("MODALIDADCARRERAESTUDIANTE"));
                form.setJORNADACARRERAESTUDIANTE(rs.getString("JORNADACARRERAESTUDIANTE"));
                form.setFECHAINICIOCARRERAESTUDIANTE(rs.getString("FECHAINICIOCARRERAESTUDIANTE"));
                form.setFECHAMATRICULAESTUDIANTE(rs.getString("FECHAMATRICULAESTUDIANTE"));
                form.setTIPOMATRICULAESTUDIANTE(rs.getString("TIPOMATRICULAESTUDIANTE"));
                form.setNIVELACADEMICOESTUDIANTE(rs.getString("NIVELACADEMICOESTUDIANTE"));
                form.setSEMANASDURACIONPERIODOESTUDIANTE(rs.getString("SEMANASDURACIONPERIODOESTUDIANTE"));
                form.setREPETIDOMATERIAESTUDIANTE(rs.getString("REPETIDOMATERIAESTUDIANTE"));
                form.setCARRERAESTUDIANTE(rs.getString("CARRERAESTUDIANTE"));
                form.setPARALELOESTUDIANTE(rs.getString("PARALELOESTUDIANTE"));
                form.setPERDIDOGRATUIDADESTUDIANTE(rs.getString("PERDIDOGRATUIDADESTUDIANTE"));
                form.setPOSEEPENSIONESTUDIANTE(rs.getString("POSEEPENSIONESTUDIANTE"));
                form.setENCUENTRADEDICADOESTUDIANTE(rs.getString("ENCUENTRADEDICADOESTUDIANTE"));
                form.setEMPLEAINGRESOSESTUDIANTE(rs.getString("EMPLEAINGRESOSESTUDIANTE"));
                form.setFAMILIARECIBEBONODESARROLLOHUMANOESTUDIANTE(rs.getString("FAMILIARECIBEBONODESARROLLOHUMANOESTUDIANTE"));
                form.setREALIZADOPRACTICASESTUDIANTE(rs.getString("REALIZADOPRACTICASESTUDIANTE"));
                form.setHORASPRACTICAREALIZOESTUDIANTE(rs.getString("HORASPRACTICAREALIZOESTUDIANTE"));
                form.setTIPOINSTITUCIONREALIZAPRACTICASESTUDIANTE(rs.getString("TIPOINSTITUCIONREALIZAPRACTICASESTUDIANTE"));
                form.setSECTORECONOMICOPRACTICASESTUDIANTE(rs.getString("SECTORECONOMICOPRACTICASESTUDIANTE"));
                form.setPARTICIPADOPROYECTODEVINCULACIONESTUDIANTE(rs.getString("PARTICIPADOPROYECTODEVINCULACIONESTUDIANTE"));
                form.setALCANCEPROYECTOVINCULACIONESTUDIANTE(rs.getString("ALCANCEPROYECTOVINCULACIONESTUDIANTE"));
                form.setCOMPONENTEESTUDIANTE(rs.getString("COMPONENTEESTUDIANTE"));
                form.setREQUISITOSCOMPONENTEESTUDIANTE(rs.getString("REQUISITOSCOMPONENTEESTUDIANTE"));
            }
            System.out.println("------------------------------------------");
            System.out.println(sSQL);
            System.out.println("Se ha listado el formulario:");
            System.out.println("------------------------------------------");
        } catch (SQLException e) {
            System.out.println("------------------------------------------");
            System.out.println("Error al listar el formulario: " + e);
            System.out.println("------------------------------------------");
        }
        return form;
    }

}
