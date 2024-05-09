public class Pessoa implements Comparable<Pessoa> {
    private int id;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa: " + id + "\n" +
                "Nome: " + nome + "\n";
    }

    @Override
    public int hashCode() {
        //retornar numero de letras que há em nome
        return nome.length();
    }

    @Override
    public boolean equals(Object o) {
        return ((o instanceof Pessoa) && ((Pessoa)o).id == this.id);
    }

    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(this.id, o.id);
    }
}
