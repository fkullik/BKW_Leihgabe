package Versuch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;






public class SpringJdbcTemplate2PostgreSqlApplication {
    public static void main(String[] args) {
        //cockroachdb connection
        String url = "jdbc:postgresql://free-tier13.aws-eu-central-1.cockroachlabs.cloud:26257/defaultd?sslmode=disable";
        String username = "tohrka";
        String password = "0qGV21S4DcrX-cs717Ooww";
        //create a new JdbcTemplate
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //set the data source properties

        org.postgresql.ds.PGSimpleDataSource d = new org.postgresql.ds.PGSimpleDataSource();
        d.setUrl(url);
        d.setUser(username);
        d.setPassword(password);
        jdbcTemplate.setDataSource(d);

        //create a new table
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS " +
                "Geraete (Seriennummer INT PRIMARY KEY, Marke STRING" +
                ", Modell STRING, Schaeden STRING,Baujahr INT)");


    }
}