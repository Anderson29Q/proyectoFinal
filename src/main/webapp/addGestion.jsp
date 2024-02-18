
<%@page import="modelo.gestion"%>
<%@page import="java.util.List"%>
<%@page import="modelo.formulario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SAGBI | Verificar Beca</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>

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
                                <a href="#" class="nav-link">
                                    <i class="nav-icon fas fa-award"></i>
                                    <p>
                                        Becas
                                        <i class="right fas fa-angle-left"></i>
                                    </p>
                                </a>
                                <ul class="nav nav-treeview">
                                    <li class="nav-item">
                                        <a href="accionesServlet?accion=listar-formulario" class="nav-link">
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
                        <div class="container">
                            <br>
                            <div class="container">
                                <div class="card text-center border-dark">
                                    <div class="card-header text-white">
                                        <h2>Añadir Beca al Estudiante</h2>
                                    </div>
                                </div>
                            </div>

                            <form action="accionesServlet?accion=create-reporte" method="POST">
                                <%
                                    formulario ediform = (formulario) request.getAttribute("editarformulario");

                                    if (ediform != null) {%>

                                <input type="hidden" value="<%=ediform.getIDESTUDIANTE()%>" name="idre">

                                <div class="container">
                                    <!-- Botón de Guardar con Icono -->
                                    <button name="accion" class="btn btn-info">
                                        <i class="fas fa-save mx-1"></i> Guardar
                                    </button>
                                </div>
                                <br>
                                <div class="card card-primary card-tabs"> 
                                    <div class="card-header p-0 pt-1">
                                        <ul class="nav nav-tabs" id="custom-tabs-one-tab" role="tablist">
                                            <li class="nav-item">
                                                <a class="nav-link active" id="custom-tabs-one-home-tab" data-toggle="pill" href="#custom-tabs-one-home" role="tab" aria-controls="custom-tabs-one-home" aria-selected="false">Datos del Estudiante</a>
                                            </li>
                                        </ul>
                                    </div>
                                    <div class="card-body">
                                        <div class="tab-content" id="custom-tabs-one-tabContent">
                                            <div class="tab-pane fade active show" id="custom-tabs-one-home" role="tabpanel" aria-labelledby="custom-tabs-one-home-tab">
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label for="inputnombre1" class="form-label">Nombre</label>
                                                        <input value="<%=ediform.getPRIMERNOMBREESTUDIANTE()%>" type="text" class="form-control" id="input-nombre" name="nombre" readonly>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <label for="inputnombre1" class="form-label">Apellido</label>
                                                        <input value="<%=ediform.getPRIMERAPELLIDOESTUDIANTE()%>" type="text" class="form-control" id="input-nombre"name="apellido" readonly>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label for="inputapellido" class="form-label">Numero de indentificacion</label>
                                                        <input value="<%=ediform.getNUMIDENTIFICACIONESTUDIANTE()%>" type="text" class="form-control" id="input-nombre" name="cedula" readonly>
                                                    </div>
                                                    <div class="col-md-6">
                                                        <label for="inputapellido" class="form-label">Tipo de Beca</label>
                                                        <input value="<%=ediform.getCOMPONENTEESTUDIANTE()%>" type="text" class="form-control" id="input-nombre" name="tipo" readonly>
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6">
                                                        <label for="input-nombre" class="form-label fw-bold">Documentacion Entregada</label>
                                                        <input type="text" class="form-control" id="input-nombre" name="docent">
                                                    </div>
                                                    <div class="col-md-6">

                                                        <label for="input-nombre" class="form-label fw-bold">Documentacion Validada </label>
                                                        <input type="text" class="form-control" id="input-nombre"name="docval">

                                                    </div>
                                                </div>

                                                <div class="row">
                                                    <div class="col-md-6" >
                                                        <label for="input-nombre" class="form-label fw-bold">Documentacion a SENESCYT</label>
                                                        <input type="text" class="form-control" id="input-nombre" name="docsen">
                                                    </div>
                                                    <div class="col-md-6">
                                                        <label for="input-nombre" class="form-label fw-bold">Estado de Beca </label>
                                                        <input type="text" class="form-control" id="input-nombre" name="estbeca">
                                                    </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-md-6" >
                                                        <label for="input-nombre" class="form-label fw-bold">Fecha de Revision</label>
                                                        <input type="date" class="form-control" id="input-nombre" name="fechrev">
                                                    </div>
                                                    <div class="col-md-6">
                                                        <label for="input-nombre" class="form-label fw-bold">N° Comprobante SENESCYT</label>
                                                        <input type="text" class="form-control" id="input-nombre" name="ncomp">
                                                    </div>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <%}%>
                            </form>



                        </div>
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

        <script src="https://adminlte.io/themes/v3/plugins/select2/js/select2.full.min.js"></script>
        <script src="https://adminlte.io/themes/v3/plugins/bootstrap4-duallistbox/jquery.bootstrap-duallistbox.min.js"></script>
        <script src="https://adminlte.io/themes/v3/plugins/moment/moment.min.js"></script>
        <script src="https://adminlte.io/themes/v3/plugins/inputmask/jquery.inputmask.min.js"></script>
        <script src="https://adminlte.io/themes/v3/plugins/daterangepicker/daterangepicker.js"></script>
        <script src="https://adminlte.io/themes/v3/plugins/bootstrap-colorpicker/js/bootstrap-colorpicker.min.js"></script>
        <script src="https://adminlte.io/themes/v3/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>



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