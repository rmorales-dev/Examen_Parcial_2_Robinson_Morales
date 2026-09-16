public class ObjPlato {
    int Codigo;
    String Tipo;
    String Material;
    String Color;
    public ObjPlato(int codigo, String tipo, String material, String color) {
        Codigo = codigo;
        Tipo = tipo;
        Material = material;
        Color = color;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public String getMaterial() {
        return Material;
    }
    public void setMaterial(String material) {
        Material = material;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    
}
