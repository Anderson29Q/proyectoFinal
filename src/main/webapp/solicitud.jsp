

<%@page import="java.util.List"%>
<%@page import="modelo.formulario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SAGBI | Solicitud de Becas</title>


        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&amp;display=fallback">

        <link rel="stylesheet" href="https://adminlte.io/themes/v3/plugins/fontawesome-free/css/all.min.css">

        <link rel="stylesheet" href="https://adminlte.io/themes/v3/dist/css/adminlte.min.css?v=3.2.0">
        <script defer="" referrerpolicy="origin" src="https://adminlte.io/cdn-cgi/zaraz/s.js?z=JTdCJTIyZXhlY3V0ZWQlMjIlM0ElNUIlNUQlMkMlMjJ0JTIyJTNBJTIyQWRtaW5MVEUlMjAzJTIwJTdDJTIwSW52b2ljZSUyMiUyQyUyMnglMjIlM0EwLjQ5MzQ1MDYzOTIzNzQzMDkzJTJDJTIydyUyMiUzQTc0MSUyQyUyMmglMjIlM0E1NzIlMkMlMjJqJTIyJTNBNTY2JTJDJTIyZSUyMiUzQTczNCUyQyUyMmwlMjIlM0ElMjJodHRwcyUzQSUyRiUyRmFkbWlubHRlLmlvJTJGdGhlbWVzJTJGdjMlMkZwYWdlcyUyRmV4YW1wbGVzJTJGaW52b2ljZS5odG1sJTIyJTJDJTIyciUyMiUzQSUyMmh0dHBzJTNBJTJGJTJGYWRtaW5sdGUuaW8lMkZ0aGVtZXMlMkZ2MyUyRmluZGV4My5odG1sJTIyJTJDJTIyayUyMiUzQTI0JTJDJTIybiUyMiUzQSUyMlVURi04JTIyJTJDJTIybyUyMiUzQTMwMCUyQyUyMnElMjIlM0ElNUIlNUQlN0Q="></script><script nonce="5e2d77a4-9548-4c3a-86dd-adaf93b02d13">(function(w, d){!function(dp, dq, dr, ds){dp[dr] = dp[dr] || {}; dp[dr].executed = []; dp.zaraz = {deferred:[], listeners:[]}; dp.zaraz.q = []; dp.zaraz._f = function(dt){return async function(){var du = Array.prototype.slice.call(arguments); dp.zaraz.q.push({m:dt, a:du})}}; for (const dv of["track", "set", "debug"])dp.zaraz[dv] = dp.zaraz._f(dv); dp.zaraz.init = () => {var dw = dq.getElementsByTagName(ds)[0], dx = dq.createElement(ds), dy = dq.getElementsByTagName("title")[0]; dy && (dp[dr].t = dq.getElementsByTagName("title")[0].text); dp[dr].x = Math.random(); dp[dr].w = dp.screen.width; dp[dr].h = dp.screen.height; dp[dr].j = dp.innerHeight; dp[dr].e = dp.innerWidth; dp[dr].l = dp.location.href; dp[dr].r = dq.referrer; dp[dr].k = dp.screen.colorDepth; dp[dr].n = dq.characterSet; dp[dr].o = (new Date).getTimezoneOffset(); if (dp.dataLayer)for (const dC of Object.entries(Object.entries(dataLayer).reduce(((dD, dE) => ({...dD[1], ...dE[1]})), {})))zaraz.set(dC[0], dC[1], {scope:"page"}); dp[dr].q = []; for (; dp.zaraz.q.length; ){const dF = dp.zaraz.q.shift(); dp[dr].q.push(dF)}dx.defer = !0; for (const dG of[localStorage, sessionStorage])Object.keys(dG || {}).filter((dI => dI.startsWith("_zaraz_"))).forEach((dH => {try{dp[dr]["z_" + dH.slice(7)] = JSON.parse(dG.getItem(dH))} catch {dp[dr]["z_" + dH.slice(7)] = dG.getItem(dH)}})); dx.referrerPolicy = "origin"; dx.src = "/cdn-cgi/zaraz/s.js?z=" + btoa(encodeURIComponent(JSON.stringify(dp[dr]))); dw.parentNode.insertBefore(dx, dw)}; ["complete", "interactive"].includes(dq.readyState)?zaraz.init():dp.addEventListener("DOMContentLoaded", zaraz.init)}(w, d, "zarazData", "script"); })(window, document);</script>
    </head>

    <body class="dark-mode sidebar-mini sidebar-closed sidebar-collapse" style="height: auto;">
        <div class="wrapper">
            <aside class="main-sidebar sidebar-dark-primary elevation-4">

                <a href="home.jsp" class="brand-link">
                    <img data-cfsrc="../../dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" data-cfstyle="opacity: .8" style="opacity: .8" src="https://adminlte.io/themes/v3/dist/img/AdminLTELogo.png">
                    <span class="brand-text font-weight-light">SAGBI</span>
                </a>

                <div class="sidebar">

                    <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                         <div class="image">
                            <img src="img/retrato-3d-personas.jpg" class="img-circle elevation-2" alt=""/>

                        </div>
                        <div class="info">
                            <a href="#" class="d-block">Administrador</a>
                        </div>
                    </div>


                    <nav class="mt-2">
                        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">

                            <li class="nav-item">
                                <a href="home.jsp" class="nav-link">
                                    <i class="nav-icon fas fa-home"></i>
                                    <p>
                                        Inicio
                                        <!-- <span class="right badge badge-danger">New</span>-->

                                    </p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="formulario.jsp" class="nav-link">
                                    <i class="nav-icon fas fa-pen"></i>
                                    <p>
                                        Nuevos Estudiantes
                                        <span class="right badge badge-danger">New</span>
                                    </p>
                                </a>
                            </li>
                            <li class="nav-item menu-open">
                                <a href="#" class="nav-link active">
                                    <i class="nav-icon fas fa-award"></i>
                                    <p>
                                        Becas
                                        <i class="right fas fa-angle-left"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="accionesServlet?accion=listar-formulario" class="nav-link active">
                                            <i class="nav-icon fas fa-table"></i>

                                            <p>
                                                Reporte de Estudiantes
                                                <!-- <span class="right badge badge-danger">New</span>-->
                                            </p>
                                        </a>
                                    </li>

                                    <li class="nav-item">
                                        <a href="accionesServlet?accion=listar-reportes" class="nav-link">
                                            <i class="nav-icon fas fa-check"></i>
                                            <p>
                                                Reporte de Becas
                                                <!-- <span class="right badge badge-danger">New</span>-->
                                            </p>
                                        </a>
                                    </li>
                                </ul>
                            </li>

                            <li class="nav-item">
                                <a href="index.jsp" class="nav-link">
                                    <i class="nav-icon fas fa-sign-out-alt"></i>
                                    <p>
                                        Cerrar Sesión
                                        <!-- <span class="right badge badge-danger">New</span>-->
                                    </p>
                                </a>
                            </li>
                            <li class="nav-item">
                            <center>
                                <a class="nav-link" data-widget="pushmenu" href="#" role="button" style="width: 30px;">
                                    <i class="fa fa-bars"></i>
                                </a>
                            </center>
                            </li>
                        </ul>
                    </nav>
                </div>
            </aside>
            <div class="content-wrapper" style="min-height: 2646.44px;">
                <div class="container">
                    <div class="col-md-offset-1 col-md-15">
                        <form action="accionesServlet" method="GET">
                            <div class="panel">
                                <br>
                                <div class="container mt-20">
                                    <div class="card text-center border-dark">
                                        <div class="card-header text-white">
                                            <h2>Solicitud de Estudiantes</h2>
                                        </div>
                                    </div>
                                </div>
                                <div class="container">
                                    <!-- Espacio para buscar -->
                                    <input name="busq" type="number" class="ml-5 w-50" style="    border-radius: 5px; /* Ajusta según sea necesario para redondear los bordes */
                                           background-color: #343a40; /* Color de fondo oscuro */
                                           color: #ffffff; /* Color del texto en claro */
                                           padding: 8px; /* Ajusta según sea necesario para el espacio interno */
                                           border: none; /* Elimina el borde predeterminado */" placeholder="Buscar por número de identificación" id="inputapellido">

                                    <button name="accion" value="buscarformulario" class="btn btn-dark">
                                        <i class="fas fa-search mx-1"></i> Buscar
                                    </button>
                                </div>
                                <br>
                                <div class="panel-body table-responsive" >
                                    <div class="panel-body table-responsive">
                                        <table class="table table-bordered custom-table scrollable-table">
                                            <thead class="bg-dark">
                                                <tr>   
                                                    <th>Numero de Identificacion</th>
                                                    <th>Nombre</th>
                                                    <th>Apellido</th>
                                                    <th>Postula a Beca</th>
                                                    <th>Carrera</th>
                                                    <th>Correo</th>
                                                    <th>Número de Celular</th>
                                                    <th>Género</th>
                                                    <th>Etnia</th>
                                                    <th>Estado Civil</th>
                                                    <th>Acciones</th>

                                                </tr>
                                            </thead>
                                            <!-- Contenido de la tabla (puedes llenar con datos reales) -->
                                            <tbody>
                                                <% List<formulario> listaformulario = (List<formulario>) request.getAttribute("listaformulario");
                                                    if (listaformulario != null && !listaformulario.isEmpty()) {
                                                        for (formulario form : listaformulario) {%>
                                                <tr> 

                                                    <td><%=form.getNUMIDENTIFICACIONESTUDIANTE()%></td>
                                                    <td><%=form.getPRIMERNOMBREESTUDIANTE()%></td>
                                                    <td><%=form.getPRIMERAPELLIDOESTUDIANTE()%></td>
                                                    <td><%=form.getCOMPONENTEESTUDIANTE()%></td>
                                                    <td><%=form.getCARRERAESTUDIANTE()%></td>
                                                    <td><%=form.getCORREOESTUDIANTE()%></td>
                                                    <td><%=form.getNUMEROCELULARESTUDIANTE()%></td>
                                                    <td><%=form.getGENEROESTUDIANTE()%></td>
                                                    <td><%=form.getETNIAESTUDIANTE()%></td>
                                                    <td><%=form.getESTADOCIVILESTUDIANTE()%></td>
                                                    <td>  
                                                        <a href="accionesServlet?accion=editar-formulario&idform=<%=form.getIDESTUDIANTE()%>" class="btn btn-warning btn-sm  mb-2"> 
                                                            <i class="fas fa-edit"></i> Editar</a> 

                                                        <a href="accionesServlet?accion=seleccionar-formulario&id=<%=form.getIDESTUDIANTE()%>" class="btn btn-info btn-sm  mb-2">
                                                            <i class="fas fa-check"></i> Añadir
                                                        </a>

                                                        <a href="#" class="btn btn-danger btn-sm" onclick="confirmarEliminar(<%=form.getIDESTUDIANTE()%>)">
                                                            <i class="fas fa-trash"></i> Eliminar
                                                        </a>

                                                        <script>
                                                            function confirmarEliminar(idEstudiante) {
                                                            var confirmacion = confirm("¿Estás seguro de eliminar este Estudiantes?");
                                                            if (confirmacion) {
                                                            window.location.href = "accionesServlet?accion=eliminar-formulario&idelim=" + idEstudiante;
                                                            } else {
                                                            }
                                                            }
                                                        </script>
                                                    </td>
                                                </tr>
                                                <%
                                                    }
                                                } else {
                                                %>
                                                <tr>
                                                    <td colspan="8">No hay datos registrados.</td>
                                                </tr>
                                                <%
                                                    }
                                                %>
                                                <!-- Puedes agregar más filas según sea necesario -->                

                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <footer class="main-footer no-print">
                <strong>Copyright © 2024 <a href="#">SAGBI</a>.</strong>
            </footer>

        </div>

        <script src="https://adminlte.io/themes/v3/plugins/jquery/jquery.min.js"></script>

        <script src="https://adminlte.io/themes/v3/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>

        <script src="https://adminlte.io/themes/v3/dist/js/adminlte.min.js?v=3.2.0"></script>



        <!-- Script para cambiar dinámicamente el ícono del menú -->
        <script>
                                                            $(document).ready(function () {
                                                            // Agrega un evento clic al enlace del menú
                                                            $(".nav-link[data-widget='pushmenu']").click(function () {
                                                            // Alterna la clase 'menu-open' en el body para determinar si el menú está abierto
                                                            $("body").toggleClass("menu-open");
                                                            // Cambia dinámicamente el ícono en función del estado del menú
                                                            var isOpen = $("body").hasClass("menu-open");
                                                            var icon = isOpen ? "fas fa-times" : "fas fa-bars";
                                                            // Actualiza el ícono del enlace del menú
                                                            $(this).html('<i class="' + icon + '"></i>');
                                                            });
                                                            });
        </script>

    </body>
</html>