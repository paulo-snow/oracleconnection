package oracleconnection.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FolkController {

    @Autowired lateinit var jdbcTemplate: JdbcTemplate

    @GetMapping("/folk")
    fun get(){
        FolkRepository().findAll(jdbcTemplate);
    }
}
