package springbook.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

public class JdbcContext {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void executeSql(final String query) throws SQLException {
        workWithStatementStrategy(
                c -> c.prepareStatement(query)
        );
    }


    public void workWithStatementStrategy(StatementStrategy stmt) throws SQLException {
        try (Connection c = this.dataSource.getConnection();
                PreparedStatement ps = stmt.makePreparedStatement(c);
        ) {
            ps.executeUpdate();
        } catch (SQLException e) {
            throw e;
        }
    }
}
