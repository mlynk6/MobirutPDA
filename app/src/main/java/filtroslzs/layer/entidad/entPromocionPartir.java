package filtroslzs.layer.entidad;

public class entPromocionPartir {
    private String c_tiposisventa;
    private double n_porcentaje=0;

    public String getTipoSisVenta() {
        return c_tiposisventa;
    }

    public void setTipoSisVenta(String c_tiposisventa) {
        this.c_tiposisventa = c_tiposisventa;
    }

    public double getPorcentaje() {
        return n_porcentaje;
    }

    public void setPorcentaje(double n_porcentaje) {
        this.n_porcentaje = n_porcentaje;
    }
}
