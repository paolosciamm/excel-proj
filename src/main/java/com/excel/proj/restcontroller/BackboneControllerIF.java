package com.excel.proj.restcontroller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

public interface BackboneControllerIF {

    @GetMapping(value="/test/{id}")
    String get(Integer id);

    @GetMapping(value = "/excel", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<StreamingResponseBody> exportExcel(final HttpServletResponse response);
}
