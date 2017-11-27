package oracleconnection.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.beans.factory.annotation.Autowired
import javax.sql.DataSource
import org.springframework.transaction.annotation.Transactional
import java.lang.System.exit
import jdk.nashorn.internal.objects.NativeArray.forEach
import org.springframework.boot.CommandLineRunner
import org.springframework.jdbc.core.JdbcTemplate

//@SpringBootApplication
//open class DemoApplication : CommandLineRunner {
//    @Autowired lateinit var jdbcTemplate: JdbcTemplate
//
//    override fun run(vararg args: String?) {
//        jdbcTemplate.query<String>(
//                "SELECT 'folk' as folk FROM dual"
//        ) { rs, rowNum -> rs.getString("folk") }.forEach {f -> System.out.println(f)}
//
//    }
//}

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}

