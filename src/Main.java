import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main {

    private static void adicionaContato() throws SQLException {
        //   public Contato(String contato, String tipo, Funcionario funcionario)
        FuncionarioRepository repository = new FuncionarioRepository();
        Funcionario funcionarioExistente = repository.obtem(4);
        Contato contato = new Contato("627898782", "tel", funcionarioExistente);
        repository.adicionaContato(contato);
    }
    public static void main(String[] args) throws SQLException {
//        FuncionarioRepository repository = new FuncionarioRepository();
//        Funcionario funcionario = new Funcionario(3, "Aline Paula de Melo");
//        repository.remove(1);
//        repository.salva(aline);
//        repository.atualiza(funcionario);
//        List<Funcionario> lista = repository.lista();
//        lista.forEach(System.out::println);
        adicionaContato();
        System.out.println("fim");
    }
}