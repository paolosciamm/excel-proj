package com.excel.proj.restcontroller.mapper;

import com.excel.proj.jpa.entities.BookEntity;
import com.excel.proj.log.LoggingAdvice;
import com.excel.proj.restcontroller.dto.output.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mapper {
    Logger log = LoggerFactory.getLogger(LoggingAdvice.class);
    public Book convetBookEntity(BookEntity entity){
        log.info("convertBookEntity");
        return Book.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}
