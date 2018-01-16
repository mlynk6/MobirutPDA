package filtroslzs.layer.entidad;

public class entItemSegmentoCat {
    private int n_codpro=0,n_codcia=0;
    private String c_segmento="",c_tipocategoria="";
    private double n_pordescuento=0;

    public int getCodPro() {
        return n_codpro;
    }

    public void setCodPro(int n_codpro) {
        this.n_codpro = n_codpro;
    }

    public int getCodCia() {
        return n_codcia;
    }

    public void setCodCia(int n_codcia) {
        this.n_codcia = n_codcia;
    }

    public String getSegmento() {
        return c_segmento;
    }

    public void setSegmento(String c_segmento) {
        this.c_segmento = c_segmento;
    }

    public String getTipoCategoria() {
        return c_tipocategoria;
    }

    public void setTipoCategoria(String c_tipocategoria) {
        this.c_tipocategoria = c_tipocategoria;
    }

    public double getPorDescuento() {
        return n_pordescuento;
    }

    public void setPorDescuento(double n_pordescuento) {
        this.n_pordescuento = n_pordescuento;
    }
}
