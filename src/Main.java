import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        FuncionarioRepository repository = new FuncionarioRepository();
//        Funcionario funcionario = new Funcionario(3, "Aline Paula de Melo");
//        repository.remove(1);
//        repository.salva(aline);
//        repository.atualiza(funcionario);
        List<Funcionario> lista = repository.lista();
        lista.forEach(System.out::println);
        System.out.println("fim");
    }
}