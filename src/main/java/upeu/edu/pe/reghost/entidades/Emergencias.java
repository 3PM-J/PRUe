package upeu.edu.pe.reghost.entidades;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Emergencias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    private String nombrePaciente;

    @Column(nullable = false, length = 60)
    private String apellidoPaciente;

    @Column(nullable = false, length = 15)
    private String dniPaciente;

    @Column(nullable = false)
    private LocalDateTime fechaHoraIngreso;

    @Column(nullable = false, length = 20)
    private String tipoEmergencia;

    @Column(nullable = false, length = 20)
    private String nivelPrioridad;

    @Column(nullable = false, length = 500)
    private String descripcionCaso;

    @Column(nullable = false, length = 200)
    private String sintomasPrincipales;

    @Column(nullable = false, length = 15)
    private String telefonoContacto;

    @Column(nullable = false, length = 60)
    private String contactoEmergencia;

    @Column(nullable = false, length = 15)
    private String telefonoEmergencia;

    @Column(length = 60)
    private String doctorAsignado;

    @Column(nullable = false, length = 20)
    private String estado;

    @Column(length = 100)
    private String ambulancia;

    @Column(length = 200)
    private String hospital;

    @Column(length = 500)
    private String observaciones;

    @Column(length = 200)
    private String tratamientoInicial;

    // Constructor completo
    public Emergencias(Long id, String nombrePaciente, String apellidoPaciente, String dniPaciente,
                       LocalDateTime fechaHoraIngreso, String tipoEmergencia, String nivelPrioridad,
                       String descripcionCaso, String sintomasPrincipales, String telefonoContacto,
                       String contactoEmergencia, String telefonoEmergencia, String doctorAsignado,
                       String estado, String ambulancia, String hospital, String observaciones,
                       String tratamientoInicial) {
        this.id = id;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.dniPaciente = dniPaciente;
        this.fechaHoraIngreso = fechaHoraIngreso;
        this.tipoEmergencia = tipoEmergencia;
        this.nivelPrioridad = nivelPrioridad;
        this.descripcionCaso = descripcionCaso;
        this.sintomasPrincipales = sintomasPrincipales;
        this.telefonoContacto = telefonoContacto;
        this.contactoEmergencia = contactoEmergencia;
        this.telefonoEmergencia = telefonoEmergencia;
        this.doctorAsignado = doctorAsignado;
        this.estado = estado;
        this.ambulancia = ambulancia;
        this.hospital = hospital;
        this.observaciones = observaciones;
        this.tratamientoInicial = tratamientoInicial;
    }

    // Constructor vacío
    public Emergencias() {
        super();
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public String getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(String dniPaciente) {
        this.dniPaciente = dniPaciente;
    }

    public LocalDateTime getFechaHoraIngreso() {
        return fechaHoraIngreso;
    }

    public void setFechaHoraIngreso(LocalDateTime fechaHoraIngreso) {
        this.fechaHoraIngreso = fechaHoraIngreso;
    }

    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    public void setTipoEmergencia(String tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }

    public String getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(String nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    public String getDescripcionCaso() {
        return descripcionCaso;
    }

    public void setDescripcionCaso(String descripcionCaso) {
        this.descripcionCaso = descripcionCaso;
    }

    public String getSintomasPrincipales() {
        return sintomasPrincipales;
    }

    public void setSintomasPrincipales(String sintomasPrincipales) {
        this.sintomasPrincipales = sintomasPrincipales;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public String getTelefonoEmergencia() {
        return telefonoEmergencia;
    }

    public void setTelefonoEmergencia(String telefonoEmergencia) {
        this.telefonoEmergencia = telefonoEmergencia;
    }

    public String getDoctorAsignado() {
        return doctorAsignado;
    }

    public void setDoctorAsignado(String doctorAsignado) {
        this.doctorAsignado = doctorAsignado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(String ambulancia) {
        this.ambulancia = ambulancia;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getTratamientoInicial() {
        return tratamientoInicial;
    }

    public void setTratamientoInicial(String tratamientoInicial) {
        this.tratamientoInicial = tratamientoInicial;
    }
}