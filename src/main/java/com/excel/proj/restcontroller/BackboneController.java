package com.excel.proj.restcontroller;

import com.excel.proj.restcontroller.dto.output.Book;
import com.excel.proj.service.BookService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@RestController
@RequiredArgsConstructor
public class BackboneController implements BackboneControllerIF{

    private final BookService bookService;

    @Override
    public String get(@PathVariable(name="id") Integer id) {
        Book b = bookService.getBook(id);
        return b.getName();
    }

    @Override
    public ResponseEntity<StreamingResponseBody> exportExcel(final HttpServletResponse response){
        StreamingResponseBody stream = null;

        ServletRequestAttributes serv = RequestContextHolder.getRequestAttributes() instanceof ServletRequestAttributes
                ? (ServletRequestAttributes) RequestContextHolder.getRequestAttributes()
                : null;
        if (serv != null) {
            stream = out -> bookService.getExcel(response);
        }
        return new ResponseEntity<>(stream, HttpStatus.OK);
    }
}
