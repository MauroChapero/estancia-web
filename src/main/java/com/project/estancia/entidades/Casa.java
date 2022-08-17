package com.project.estancia.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Casa {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String calle;
    private Integer numero;
    private String codPostal;
    private String ciudad;
    private Date fechaDesde;
    private Date fechaHasta;
    private Integer minDias;
    private Integer maxDias;
    private Double Precio;
    private String tipoVivienda;

    public Casa() {
    }

    public Casa(String calle, Integer numero, String codPostal, String ciudad, Date fechaDesde, Date fechaHasta, Integer minDias, Integer maxDias, Double Precio, String tipoVivienda) {
        this.calle = calle;
        this.numero = numero;
        this.codPostal = codPostal;
        this.ciudad = ciudad;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.minDias = minDias;
        this.maxDias = maxDias;
        this.Precio = Precio;
        this.tipoVivienda = tipoVivienda;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Integer getMinDias() {
        return minDias;
    }

    public void setMinDias(Integer minDias) {
        this.minDias = minDias;
    }

    public Integer getMaxDias() {
        return maxDias;
    }

    public void setMaxDias(Integer maxDias) {
        this.maxDias = maxDias;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    @Override
    public String toString() {
        return "Casa{" + "id=" + id + ", calle=" + calle + ", numero=" + numero + ", codPostal=" + codPostal + ", ciudad=" + ciudad + ", fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", minDias=" + minDias + ", maxDias=" + maxDias + ", Precio=" + Precio + ", tipoVivienda=" + tipoVivienda + '}';
    }

}
