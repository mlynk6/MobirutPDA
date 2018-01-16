package filtroslzs.layer.entidad;

public class entSistemaVenta {
    private int n_codsisventa=0,n_codcia=0,n_codtiposistemaventa=0;
    private String v_codsisventa="",v_dessisventa="";
    private double n_pordescuento=0,n_pordescuentoad=0;
    private int n_flgestado,n_diasvencimiento=0;
    private String v_generarletras="N",c_tiposisventa="";

    public int getCodSisventa() {
        return n_codsisventa;
    }

    public void setCodSisventa(int n_codsisventa) {
        this.n_codsisventa = n_codsisventa;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public int getCodTipoSistemaVenta() {
        return n_codtiposistemaventa;
    }

    public void setCodTipoSistemaVenta(int n_codtiposistemaventa) {
        this.n_codtiposistemaventa = n_codtiposistemaventa;
    }

    public String getCodSisVenta() {
        return v_codsisventa;
    }

    public void setCodSisVenta(String v_codsisventa) {
        this.v_codsisventa = v_codsisventa;
    }

    public String getDesSisVenta() {
        return v_dessisventa;
    }

    public void setDesSisVenta(String v_dessisventa) {
        this.v_dessisventa = v_dessisventa;
    }

    public double getPorDescuento() {
        return n_pordescuento;
    }

    public void setPorDescuento(double n_pordescuento) {
        this.n_pordescuento = n_pordescuento;
    }

    public double getPorDescuentoAD() {
        return n_pordescuentoad;
    }

    public void setPorDescuentoAD(double n_pordescuentoad) {
        this.n_pordescuentoad = n_pordescuentoad;
    }

    public int getFlgEstado() {
        return n_flgestado;
    }

    public void setFlgEstado(int n_flgestado) {
        this.n_flgestado = n_flgestado;
    }

    public int getDiasVencimiento() {
        return n_diasvencimiento;
    }

    public void setDiasVencimiento(int n_diasvencimiento) {
        this.n_diasvencimiento = n_diasvencimiento;
    }

    public String getGenerarLetras() {
        return v_generarletras;
    }

    public void setGenerarLetras(String v_generarletras) {
        this.v_generarletras = v_generarletras;
    }

    public String getTipoSisVenta() {
        return c_tiposisventa;
    }

    public void setTipoSisVenta(String c_tiposisventa) {
        this.c_tiposisventa = c_tiposisventa;
    }
}
