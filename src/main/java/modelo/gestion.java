package modelo;

public class gestion {
    
    private int id;
    private String documentacion_entregada;
    private String documentacion_validada;
    private String documentacion_senescyt;
    private String estado_beca;
    private String fecha_revision;
    private String numero_documento_senescyt;
    private int fk_forrmulario;
    
    private String nombre;
    private String apellido;
    private String carrera;
    private String cedula;
    private String tipo;

    public gestion() {
    }

    public gestion(int id, String documentacion_entregada, String documentacion_validada, String documentacion_senescyt, String estado_beca, String fecha_revision, String numero_documento_senescyt, int fk_forrmulario) {
        this.id = id;
        this.documentacion_entregada = documentacion_entregada;
        this.documentacion_validada = documentacion_validada;
        this.documentacion_senescyt = documentacion_senescyt;
        this.estado_beca = estado_beca;
        this.fecha_revision = fecha_revision;
        this.numero_documento_senescyt = numero_documento_senescyt;
        this.fk_forrmulario = fk_forrmulario;
    }

    public gestion(String documentacion_entregada, String documentacion_validada, String documentacion_senescyt, String estado_beca, String fecha_revision, String numero_documento_senescyt, int fk_forrmulario) {
        this.documentacion_entregada = documentacion_entregada;
        this.documentacion_validada = documentacion_validada;
        this.documentacion_senescyt = documentacion_senescyt;
        this.estado_beca = estado_beca;
        this.fecha_revision = fecha_revision;
        this.numero_documento_senescyt = numero_documento_senescyt;
        this.fk_forrmulario = fk_forrmulario;
    }

    public gestion(String documentacion_entregada, String documentacion_validada, String documentacion_senescyt, String estado_beca, String fecha_revision, String numero_documento_senescyt) {
        this.documentacion_entregada = documentacion_entregada;
        this.documentacion_validada = documentacion_validada;
        this.documentacion_senescyt = documentacion_senescyt;
        this.estado_beca = estado_beca;
        this.fecha_revision = fecha_revision;
        this.numero_documento_senescyt = numero_documento_senescyt;
    }

    public gestion(int id, String documentacion_entregada, String documentacion_validada, String documentacion_senescyt, String estado_beca, String fecha_revision, String numero_documento_senescyt) {
        this.id = id;
        this.documentacion_entregada = documentacion_entregada;
        this.documentacion_validada = documentacion_validada;
        this.documentacion_senescyt = documentacion_senescyt;
        this.estado_beca = estado_beca;
        this.fecha_revision = fecha_revision;
        this.numero_documento_senescyt = numero_documento_senescyt;
    }
    
    
    

    public gestion(String documentacion_entregada, String documentacion_validada, String documentacion_senescyt, String estado_beca, String fecha_revision, String numero_documento_senescyt, int fk_forrmulario, String nombre, String apellido, String carrera, String cedula,String tipo) {
        this.documentacion_entregada = documentacion_entregada;
        this.documentacion_validada = documentacion_validada;
        this.documentacion_senescyt = documentacion_senescyt;
        this.estado_beca = estado_beca;
        this.fecha_revision = fecha_revision;
        this.numero_documento_senescyt = numero_documento_senescyt;
        this.fk_forrmulario = fk_forrmulario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.cedula = cedula;
        this.tipo = tipo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumentacion_entregada() {
        return documentacion_entregada;
    }

    public void setDocumentacion_entregada(String documentacion_entregada) {
        this.documentacion_entregada = documentacion_entregada;
    }

    public String getDocumentacion_validada() {
        return documentacion_validada;
    }

    public void setDocumentacion_validada(String documentacion_validada) {
        this.documentacion_validada = documentacion_validada;
    }

    public String getDocumentacion_senescyt() {
        return documentacion_senescyt;
    }

    public void setDocumentacion_senescyt(String documentacion_senescyt) {
        this.documentacion_senescyt = documentacion_senescyt;
    }

    public String getEstado_beca() {
        return estado_beca;
    }

    public void setEstado_beca(String estado_beca) {
        this.estado_beca = estado_beca;
    }

    public String getFecha_revision() {
        return fecha_revision;
    }

    public void setFecha_revision(String fecha_revision) {
        this.fecha_revision = fecha_revision;
    }

    public String getNumero_documento_senescyt() {
        return numero_documento_senescyt;
    }

    public void setNumero_documento_senescyt(String numero_documento_senescyt) {
        this.numero_documento_senescyt = numero_documento_senescyt;
    }

    public int getFk_forrmulario() {
        return fk_forrmulario;
    }

    public void setFk_forrmulario(int fk_forrmulario) {
        this.fk_forrmulario = fk_forrmulario;
    }
    
    
    
    
    
}
