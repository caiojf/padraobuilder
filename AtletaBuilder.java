package padroescriacao.builder;

public class AtletaBuilder {

    private Atleta atleta;

    public AtletaBuilder() {atleta = new Atleta();
    }

    public Atleta build() {

        if (atleta.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (atleta.getDataNascimento().equals("")) {
            throw new IllegalArgumentException("Data inválida");
        }
        if (atleta.getAltura() <= 0) {
            throw new IllegalArgumentException("Altura inválida");
        }
        if (atleta.getPeso() <= 0) {
            throw new IllegalArgumentException("Peso inválido");
        }
        if (atleta.getIdade() <= 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
        if (atleta.getCor().equals("")) {
            throw new IllegalArgumentException("Cor inválida");
        }
        return atleta;
    }
    public AtletaBuilder setNome(String nome) {
        atleta.setNome(nome);
        return this;
    }

    public AtletaBuilder setDataNascimento(String dataNascimento) {
        atleta.setDataNascimento(dataNascimento);
        return this;
    }


    public AtletaBuilder setAltura(String altura) {
        Atleta.setAltura(altura);
        return this;
    }

    public AtletaBuilder setPeso(int peso) {
        atleta.setPeso(peso);
        return this;
    }

    public AtletaBuilder setIdade(int idade) {
        atleta.setIdade(idade);
        return this;
    }
    public AtletaBuilder setCor(String cor){
    atleta.setCor(cor);
    return this;
    }






