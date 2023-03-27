package com.mk.bookpub.cmdRunner;

import com.mk.bookpub.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import javax.sql.DataSource;

@Slf4j
public class StartupRunner implements CommandLineRunner {

//    @Autowired
//    private DataSource dataSource;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
//        log.info("Hello From CommandLineRunner"+dataSource.toString());
        log.info("Number of books -:"+bookRepository.count());
    }
}
