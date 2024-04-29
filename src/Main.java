public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(20240505);
        conta.setSaldo(50502);
        conta.titular = "Natalia";
        conta.exibirDadosConta();

        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Vitor");
        pessoa.setIdade(25);
        pessoa.verificarIdade();

        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(2500);
        produto.aplicarDesconto(10);
        System.out.println("Preço com desconto: " + produto.getPreco());

        Aluno aluno = new Aluno();
        aluno.setNome("Debora");
        aluno.setNotas(new double[]{8.5, 7.0, 9.0});
        System.out.println("Média do aluno: " + aluno.calcularMedia());

        Livro livro = new Livro();
        livro.setTitulo("A Batalha do Apocalipse");
        livro.setAutor("Eduardo Spohr");
        livro.exibirDetalhes();
    }
}
