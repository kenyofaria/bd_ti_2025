import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository {

    private Connection conn;

    private Connection getConnection() throws SQLException {
        if (conn == null) {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_projetos",
                    "root",
                    "mysql");
        }
        return conn;
    }

    public Funcionario salva(Funcionario funcionario) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("insert into funcionarios (nome) values (?)");
        ps.setString(1, funcionario.getNome());
        ps.execute();
        ps.close();
        return funcionario;
    }

    public Funcionario atualiza(Funcionario funcionario) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("update funcionarios set nome = ? where id = ?");
        ps.setString(1, funcionario.getNome());
        ps.setInt(2, funcionario.getId());
        ps.execute();
        ps.close();
        return funcionario;
    }

    public void remove(int id) throws SQLException {
        PreparedStatement ps = getConnection().prepareStatement("delete from funcionarios where id = ?");
        ps.setInt(1, id);
        ps.execute();
        ps.close();
    }

    public List<Funcionario> lista() throws SQLException {
        List<Funcionario> resultado = new ArrayList<>(); //armazena os funcionarios encontrados

        PreparedStatement ps = getConnection().prepareStatement("select id, nome from funcionarios");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Funcionario funcionario = new Funcionario(rs.getInt("id"), rs.getString("nome"));
            resultado.add(funcionario);
        }
        ps.close();
        return resultado;
    }

}
