import java.text.DecimalFormat;

public class Aluno {

    private String nome;
    private double[] notas;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }


    public String calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        DecimalFormat df = new DecimalFormat("#.##"); // Formata para duas casas decimais
        return df.format(media);
    }
}
