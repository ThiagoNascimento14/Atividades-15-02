// Subclasse Retangulo
class Retangulo extends FiguraGeometrica {
    private double comprimento;
    private double largura;
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    public double calcularArea() {
        return comprimento * largura;
    }
    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}