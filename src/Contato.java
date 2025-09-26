public class Contato {

    private int id;
    private String contato;
    private String tipo; //Solução porca. Precisa melhorar
    private Funcionario funcionario;

    public Contato(int id, String contato, String tipo, Funcionario funcionario) {
        this.id = id;
        this.contato = contato;
        this.tipo = tipo;
        this.funcionario = funcionario;
    }

    public Contato(String contato, String tipo, Funcionario funcionario) {
        this.contato = contato;
        this.tipo = tipo;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public String getContato() {
        return contato;
    }

    public String getTipo() {
        return tipo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
}
