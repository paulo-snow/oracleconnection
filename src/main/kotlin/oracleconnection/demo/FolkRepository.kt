package oracleconnection.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class FolkRepository {

    fun findAll(jdbcTemplate: JdbcTemplate): Unit {
        jdbcTemplate.query<String>(
                "SELECT 'folk' as folk FROM dual"
        ) { rs, rowNum -> rs.getString("folk") }.forEach {f -> System.out.println(f)}
        Unit
    }

}