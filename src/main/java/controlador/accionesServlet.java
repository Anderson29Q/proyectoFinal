/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.formulario;
import modelo.formularioDAO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.gestion;
import modelo.gestionDAO;

/**
 *
 * @author USUARIO
 */
public class accionesServlet extends HttpServlet {

    String mensaje;
    formularioDAO formdao;
    gestionDAO gestiondao;

    public void init() throws ServletException {
        String jdbcURL = getServletContext().getInitParameter("jdbcURL");
        String jdbcUsername = getServletContext().getInitParameter("jdbcUSERName");
        String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
        try {
//            Instancio el DAO para establecer conexion
            formdao = new formularioDAO(jdbcURL, jdbcUsername, jdbcPassword);
            gestiondao = new gestionDAO(jdbcURL, jdbcUsername, jdbcPassword);

            mensaje = "Se establecio la conexion segun la orden del controlaldor";
            System.out.println("Conectados");
        } catch (SQLException e) {
            System.out.println("No conectados");
            Logger.getLogger(accionesServlet.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println(jdbcURL + " " + jdbcUsername + " " + jdbcPassword);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);

        String accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("editar-formulario")) {
            String idformulario = request.getParameter("idform");
            if (idformulario != null && !idformulario.isEmpty()) {
                try {
                    idformulario = idformulario.replace("\"", ""); // quita las dobles comillas
                    int forid = Integer.parseInt(idformulario);
                    formulario ediform = formdao.editform(forid);
                    request.setAttribute("editarformulario", ediform);
                    request.setAttribute("mensaje", mensaje);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("edtformulario.jsp");
                    dispatcher.forward(request, response);
                } catch (Exception e) {
                    System.out.println("Error al editar el dato" + e);
                    mensaje = "Error al editar el dato";
                }
            }
        } else if (accion.equalsIgnoreCase("eliminar-formulario")) {
            String IdElimi = request.getParameter("idelim");
            int idEliminar = Integer.parseInt(IdElimi);
            try {
                formdao.Eliminarform(idEliminar);
                mensaje = "Los datos se eliminaron correctamente";
            } catch (Exception e) {
                System.out.println("Error al eliminar los datos: " + e);
                mensaje = "Error al eliminar los datos";
            }

            List<formulario> listaformulario = formdao.listarform();
            request.setAttribute("mensaje", mensaje);
            request.setAttribute("listaformulario", listaformulario);
            RequestDispatcher dispatcher = request.getRequestDispatcher("formulario.jsp");
            dispatcher.forward(request, response);
        }

        if (accion.equalsIgnoreCase("editar-ges")) {
            String idgestion = request.getParameter("ids");
            if (idgestion != null && !idgestion.isEmpty()) {
                try {
                    int gesid = Integer.parseInt(idgestion);
                    gestion editges = gestiondao.editgestion(gesid);
                    request.setAttribute("editargestion", editges);
                    request.setAttribute("mensaje", mensaje);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("editGestion.jsp");
                    dispatcher.forward(request, response);
                } catch (Exception e) {
                    System.out.println("Error al editar el dato" + e);
                    mensaje = "Error al editar el dato";
                }
            }
        } else if (accion.equalsIgnoreCase("eliminar-gestion")) {
            String idgest = request.getParameter("idgest");
            int idelim = Integer.parseInt(idgest);
            try {
                gestiondao.eliminargestion(idelim);
                mensaje = "Los datos se eliminaron correctamente";
            } catch (Exception e) {
                System.out.println("Error al eliminar los datos: " + e);
                mensaje = "Error al eliminar los datos";
            }
            List<gestion> listareport = gestiondao.listargestion();
            request.setAttribute("mensaje", mensaje);
            request.setAttribute("listareporte", listareport);
            RequestDispatcher dispatcher = request.getRequestDispatcher("listGestion.jsp");
            dispatcher.forward(request, response);
         
        }

        if (accion.equalsIgnoreCase("seleccionar-formulario")) {
            String idformu = request.getParameter("id");
            if (idformu != null && !idformu.isEmpty()) {
                try {
                    int forid = Integer.parseInt(idformu);
                    formulario ediform = formdao.editform(forid);
                    request.setAttribute("editarformulario", ediform);
                    request.setAttribute("mensaje", mensaje);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("addGestion.jsp");
                    dispatcher.forward(request, response);
                } catch (Exception e) {
                    System.out.println("Error al editar el dato" + e);
                    mensaje = "Error al editar el dato";
                }
            }
        }
        if (accion.equalsIgnoreCase("formulario")) {
            request.getRequestDispatcher("formulario.jsp").forward(request, response);
        }
        if (accion.equalsIgnoreCase("inicio")) {
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
        if (accion.equalsIgnoreCase("solicitud")) {
            System.out.println("Estamos listando desde accionesServlet");
            List<formulario> listaformulario = formdao.listarform();
            request.setAttribute("listaformulario", listaformulario);
            RequestDispatcher dispatcher = request.getRequestDispatcher("solicitud.jsp");
            dispatcher.forward(request, response);
        }

        if (accion.equalsIgnoreCase("listar-formulario")) {
            System.out.println("Estamos listando desde accionesServlet");
            List<formulario> listaformulario = formdao.listarform();
            request.setAttribute("listaformulario", listaformulario);
            RequestDispatcher dispatcher = request.getRequestDispatcher("solicitud.jsp");
            dispatcher.forward(request, response);
        }

        if (accion.equalsIgnoreCase("buscarformulario")) {
            String foid = request.getParameter("busq");
            int idBusfor = Integer.parseInt(foid);
            List<formulario> listabusqform = formdao.buscarform(idBusfor);
            request.setAttribute("listaformulario", listabusqform);
            RequestDispatcher dispatcher = request.getRequestDispatcher("solicitud.jsp");
            dispatcher.forward(request, response);
        }

        if (accion.equalsIgnoreCase("listar-reportes")) {
            System.out.println("Estamos listando desde accionesServlet");
            List<gestion> listareport = gestiondao.listargestion();
            request.setAttribute("listareporte", listareport);
            RequestDispatcher dispatcher = request.getRequestDispatcher("listGestion.jsp");
            dispatcher.forward(request, response);
        }

        if (accion.equalsIgnoreCase("buscarreporte")) {
            String foid = request.getParameter("busqreport");
            int idBusges = Integer.parseInt(foid);
            List<gestion> listabusquedages = gestiondao.busqgestion(idBusges);
            request.setAttribute("listareporte", listabusquedages);
            RequestDispatcher dispatcher = request.getRequestDispatcher("listGestion.jsp");
            dispatcher.forward(request, response);
        }

        if (accion.equalsIgnoreCase("listar-gestion")) {
            System.out.println("Estamos listando desde accionesServlet");
            List<gestion> listagestion2 = gestiondao.listargestion();
            request.setAttribute("listareporte", listagestion2);
            RequestDispatcher dispatcher = request.getRequestDispatcher("listGestion.jsp");
            dispatcher.forward(request, response);
        }

        if (accion.equalsIgnoreCase("buscargestion")) {
            String foid = request.getParameter("buscarid");
            int idbus = Integer.parseInt(foid);
            List<gestion> listabuscargestion = gestiondao.busqgestion(idbus);
            request.setAttribute("listareporte", listabuscargestion);
            RequestDispatcher dispatcher = request.getRequestDispatcher("addGestion.jsp");
            dispatcher.forward(request, response);
        }

        if (accion.equalsIgnoreCase("editar-gestion")) {
            editargestion(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        RequestDispatcher dispatcher = request.getRequestDispatcher("formulario.jsp");
        if (accion.equalsIgnoreCase("create")) {
            String idform = request.getParameter("id");
            if (idform == null || idform.isEmpty()) {
                System.out.println("Insertar");
                formulario newform = new formulario();

                String tipoIden = request.getParameter("tipoIden");
                String numCedula = request.getParameter("numCedula");
                String apellido1 = request.getParameter("apellido1");
                String apellido2 = request.getParameter("apellido2");
                String nombre1 = request.getParameter("nombre1");
                String nombre2 = request.getParameter("nombre2");
                String fechanac = request.getParameter("fechanac");
                String generoEstu = request.getParameter("generoEstu");
                String estadoCi = request.getParameter("estadoCi");
                String etnia = request.getParameter("etnia");
                String txtPueblo = request.getParameter("txtPueblo");
                String tipoSangre = request.getParameter("tipoSangre");
                String discapacidad = request.getParameter("discapacidad");
                String porDisc = request.getParameter("porDisc");
                String numCarnet = request.getParameter("numCarnet");
                String tipoDisca = request.getParameter("tipoDisca");
                String proNaci = request.getParameter("proNaci");
                String cantNaci = request.getParameter("cantNaci");
                String proRes = request.getParameter("proRes");
                String cantRes = request.getParameter("cantRes");
                String correo = request.getParameter("correo");
                String numcelular = request.getParameter("numcelular");
                String formacionPadre = request.getParameter("formacionPadre");
                String formacionMadre = request.getParameter("formacionMadre");
                String totalHogar = request.getParameter("totalHogar");
                String numHogar = request.getParameter("numHogar");
                String tipoColegio = request.getParameter("tipoColegio");
                String modalidad = request.getParameter("modalidad");
                String jornada = request.getParameter("jornada");
                String fechaInicio = request.getParameter("fechaInicio");
                String fechamatricula = request.getParameter("fechamatricula");
                String tipoMatricula = request.getParameter("tipoMatricula");
                String nivelAca = request.getParameter("nivelAca");
                String semanasDuracion = request.getParameter("semanasDuracion");
                String repetidoMateria = request.getParameter("repetidoMateria");
                String carrera = request.getParameter("carrera");
                String paralelo = request.getParameter("paralelo");
                String perdidoGratuidad = request.getParameter("perdidoGratuidad");
                String pension = request.getParameter("pension");
                String seEncuentra = request.getParameter("seEncuentra");
                String empleIngresos = request.getParameter("empleIngresos");
                String recibeBono = request.getParameter("recibeBono");
                String realizoPracticas = request.getParameter("realizoPracticas");
                String horasprac = request.getParameter("horasprac");
                String instprac = request.getParameter("instprac");
                String econprac = request.getParameter("econprac");
                String participadoVincu = request.getParameter("participadoVincu");
                String alcanceVin = request.getParameter("alcanceVin");
                String nombreComponente = request.getParameter("nombreComponente");
                String requi = request.getParameter("requi");

                newform = new formulario(0, tipoIden, numCedula, apellido1, apellido2, nombre1, nombre2, fechanac, generoEstu, estadoCi, etnia, txtPueblo, tipoSangre, discapacidad, porDisc, numCarnet, tipoDisca, proNaci, cantNaci, proRes, cantRes, correo, numcelular, formacionPadre, formacionMadre, totalHogar, numHogar, tipoColegio, modalidad, jornada, fechaInicio, fechamatricula, tipoMatricula, nivelAca, semanasDuracion, repetidoMateria, carrera, paralelo, perdidoGratuidad, pension, seEncuentra, empleIngresos, recibeBono, realizoPracticas, horasprac, instprac, econprac, participadoVincu, alcanceVin, nombreComponente, requi);
                try {
                    formdao.insertarformulario(newform);
                    mensaje = "Los datos se insertaron correctamente";
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                    mensaje = "Ocurrio un error al insertar los datos";
                }
            }
            List<formulario> listaformulario = formdao.listarform();
            request.setAttribute("mensaje", mensaje);
            request.setAttribute("listaformulario", listaformulario);
            dispatcher = request.getRequestDispatcher("solicitud.jsp");
            dispatcher.forward(request, response);
        }

        if (accion.equalsIgnoreCase("editar-formulario")) {
            response.setContentType("text/html;charset=UTF-8");
            editarformulario(request, response);
        }

        if (accion.equalsIgnoreCase("create-reporte")) {
            
            crearreporte(request, response);
        }

        if (accion.equalsIgnoreCase("actualizar-reporte")) {
            editargestion(request, response);
        }
    }

    private void crearreporte(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String docentre = request.getParameter("docent");
        String docval = request.getParameter("docval");
        String docsen = request.getParameter("docsen");
        String estbeca = request.getParameter("estbeca");
        String fechrev = request.getParameter("fechrev");
        String ncomp = request.getParameter("ncomp");
        int idrep = Integer.parseInt(request.getParameter("idre"));
        System.out.println(idrep);
        // Crea un nuevo objeto de consultas con los datos del formulario
        gestion newgestion = new gestion(0, docentre, docval, docsen, estbeca, fechrev, ncomp, idrep);
        try {
            // Intenta insertar la nueva consulta en la base de datos
            gestiondao.insertargestion(newgestion);
            System.out.println("REPORTE CREADO CON EXITO");
            mensaje = "Los datos se insertaron correctamente";
        } catch (Exception e) {
            System.out.println("Error: " + e);
            mensaje = "Ocurrió un error al insertar los datos";
        }

        List<gestion> listareport = gestiondao.listargestion();
        request.setAttribute("mensaje", mensaje);
        request.setAttribute("listareporte", listareport);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listGestion.jsp");
        dispatcher.forward(request, response);
    
    }

    private void editarformulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String tipoIden = request.getParameter("tipoIden");
        String numCedula = request.getParameter("numCedula");
        String apellido1 = request.getParameter("apellido1");
        String apellido2 = request.getParameter("apellido2");
        String nombre1 = request.getParameter("nombre1");
        String nombre2 = request.getParameter("nombre2");
        String fechanac = request.getParameter("fechanac");
        String generoEstu = request.getParameter("generoEstu");
        String estadoCi = request.getParameter("estadoCi");
        String etnia = request.getParameter("etnia");
        String txtPueblo = request.getParameter("txtPueblo");
        String tipoSangre = request.getParameter("tipoSangre");
        String discapacidad = request.getParameter("discapacidad");
        String porDisc = request.getParameter("porDisc");
        String numCarnet = request.getParameter("numCarnet");
        String tipoDisca = request.getParameter("tipoDisca");
        String proNaci = request.getParameter("proNaci");
        String cantNaci = request.getParameter("cantNaci");
        String proRes = request.getParameter("proRes");
        String cantRes = request.getParameter("cantRes");
        String correo = request.getParameter("correo");
        String numcelular = request.getParameter("numcelular");
        String formacionPadre = request.getParameter("formacionPadre");
        String formacionMadre = request.getParameter("formacionMadre");
        String totalHogar = request.getParameter("totalHogar");
        String numHogar = request.getParameter("numHogar");
        String tipoColegio = request.getParameter("tipoColegio");
        String modalidad = request.getParameter("modalidad");
        String jornada = request.getParameter("jornada");
        String fechaInicio = request.getParameter("fechaInicio");
        String fechamatricula = request.getParameter("fechamatricula");
        String tipoMatricula = request.getParameter("tipoMatricula");
        String nivelAca = request.getParameter("nivelAca");
        String semanasDuracion = request.getParameter("semanasDuracion");
        String repetidoMateria = request.getParameter("repetidoMateria");
        String carrera = request.getParameter("carrera");
        String paralelo = request.getParameter("paralelo");
        String perdidoGratuidad = request.getParameter("perdidoGratuidad");
        String pension = request.getParameter("pension");
        String seEncuentra = request.getParameter("seEncuentra");
        String empleIngresos = request.getParameter("empleIngresos");
        String recibeBono = request.getParameter("recibeBono");
        String realizoPracticas = request.getParameter("realizoPracticas");
        String horasprac = request.getParameter("horasprac");
        String instprac = request.getParameter("instprac");
        String econprac = request.getParameter("econprac");
        String participadoVincu = request.getParameter("participadoVincu");
        String alcanceVin = request.getParameter("alcanceVin");
        String nombreComponente = request.getParameter("nombreComponente");
        String requi = request.getParameter("requi");
        String idfic = request.getParameter("idf");
        System.out.println("actualizando gestion");
        response.setContentType("text/html;charset=UTF-8");
        int form = Integer.parseInt(idfic);
        formulario ediform = new formulario(form, tipoIden, numCedula, apellido1, apellido2, nombre1, nombre2, fechanac, generoEstu, estadoCi, etnia, txtPueblo, tipoSangre, discapacidad, porDisc, numCarnet, tipoDisca, proNaci, cantNaci, proRes, cantRes, correo, numcelular, formacionPadre, formacionMadre, totalHogar, numHogar, tipoColegio, modalidad, jornada, fechaInicio, fechamatricula, tipoMatricula, nivelAca, semanasDuracion, repetidoMateria, carrera, paralelo, perdidoGratuidad, pension, seEncuentra, empleIngresos, recibeBono, realizoPracticas, horasprac, instprac, econprac, participadoVincu, alcanceVin, nombreComponente, requi);
        try {
            formdao.editarFormularios(ediform);
            mensaje = "Los datos se insertaron correctamente";
        } catch (Exception e) {
            System.out.println("Error: " + e);
            mensaje = "Ocurrio un error al insertar los datos";
        }

        List<formulario> listaformulario = formdao.listarform();
        request.setAttribute("mensaje", mensaje);
        request.setAttribute("listaformulario", listaformulario);
        RequestDispatcher dispatcher = request.getRequestDispatcher("solicitud.jsp");
        dispatcher.forward(request, response);

    }

    private void editargestion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String docentre = request.getParameter("docent");
        String docval = request.getParameter("docval");
        String docsen = request.getParameter("docsen");
        String estbeca = request.getParameter("estbeca");
        String fechrev = request.getParameter("fechrev");
        String ncomp = request.getParameter("ncomp");
        String idr = request.getParameter("idr");

        System.out.println("Editando el dato de gestion");
        int idrepor = Integer.parseInt(idr);
        // Crea un nuevo objeto de consultas con los datos del formulario
        gestion newges = new gestion(idrepor, docentre, docval, docsen, estbeca, fechrev, ncomp);
        try {
            // Intenta insertar la nueva consulta en la base de datos
            gestiondao.editargestion(newges);
            mensaje = "Los datos se editaron correctamente";
        } catch (Exception e) {
            System.out.println("Error: " + e);
            mensaje = "Ocurrió un error al editar los datos";
        }
        List<gestion> listagestion2 = gestiondao.listargestion();
        request.setAttribute("mensaje", mensaje);
        request.setAttribute("listareporte", listagestion2);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listGestion.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
