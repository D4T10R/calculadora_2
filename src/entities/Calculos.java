

public class Calculos {
    

    // ATRIBUTOS
    private Double num_1;
    private Double num_2;
    // ATRIBUTOS

    // CONSTRUTORES
    public Calculos(Double num_1, Double num_2) {
        this.num_1 = num_1;
        this.num_2 = num_2;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Double getNum_1() {
        return num_1;
    }
    public void setNum_1(Double num_1) {
        this.num_1 = num_1;
    }
    
    public Double getNum_2() {
        return num_2;
    }
    public void setNum_2(Double num_2) {
        this.num_2 = num_2;
    }
    // ENCAPSULAMENTO

    // METODOS
    public Double soma(Double num_1, Double num_2) {
        return num_1 + num_2;
    }

    public Double subtracao(Double num_1, Double num_2) {
        return num_1 - num_2;
    }

    public Double multiplicação(Double num_1, Double num_2) {
        return num_1 * num_2;
    }
    // METODOS




}
