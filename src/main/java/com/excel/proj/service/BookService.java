package com.excel.proj.service;

import com.excel.proj.jpa.repository.BookRepository;
import com.excel.proj.restcontroller.dto.output.Book;
import com.excel.proj.restcontroller.mapper.Mapper;
import com.excel.proj.service.support.ExcelRow;
import com.excel.proj.utils.ExcelUtility;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    public static final String TEST_XLSX = "test.xlsx";
    private final BookRepository bookRepository;
    private final ExcelUtility excelUtility;

    private Mapper mapper = new Mapper();
    private static final Logger LOGGER = LoggerFactory.getLogger(BookService.class);

    public Book getBook(Integer id){
        return mapper.convetBookEntity(bookRepository.findById(id).get());
    }

    public void getExcel(final HttpServletResponse response){
        response.setHeader(
                "Content-Disposition",
                "attachment;filename="+ TEST_XLSX);

        //PREPARO LE RIGHE DA SALVARE
        List<ExcelRow> rows = new LinkedList<>();
        ExcelRow row1 = ExcelRow.builder()
                .field1("TEST1.1").field2("TEST1.2").field3("TEST1.3").build();
        ExcelRow row2 = ExcelRow.builder()
                .field1("TEST2.1").field2("TEST2.2").field3("TEST2.3").build();
        ExcelRow row3 = ExcelRow.builder()
                .field1("TEST3.1").field2("TEST3.2").field3("TEST3.3").build();
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);

        excelUtility.exportExcel(response,rows,TEST_XLSX);
        LOGGER.info("exportPerimeterGA end");
    }
}
