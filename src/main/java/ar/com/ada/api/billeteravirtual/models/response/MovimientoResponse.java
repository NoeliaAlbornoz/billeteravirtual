package ar.com.ada.api.billeteravirtual.models.response;

import java.math.BigDecimal;
import java.util.Date;

import ar.com.ada.api.billeteravirtual.entities.Transaccion.ConceptoTransaccionEnum;
import ar.com.ada.api.billeteravirtual.entities.Transaccion.TipoTransaccionEnum;

public class MovimientoResponse {

    public Integer numeroDeTransaccion;
    public Date fecha;
    public BigDecimal importe;
    public String moneda;
    public TipoTransaccionEnum tipoOperacion;
    public ConceptoTransaccionEnum conceptoOperacion;
    public String detalle;
    public String aUsuario;

}