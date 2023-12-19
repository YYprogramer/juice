package com.example.juice;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class JuiceController {
    private final JuiceService juiceService;
    public JuiceController(JuiceService juiceService) {

        this.juiceService = juiceService;
    }
    @GetMapping("/juices/{id}")
    public Juice getJuice(@PathVariable("id") int id) {
        return juiceService.findJuice(id);
    }

    @ExceptionHandler(value = JuiceNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleJuiceNotFoundException(
            JuiceNotFoundException e, HttpServletRequest request) {
        Map<String, String> body = Map.of(
                "timestamp", ZonedDateTime.now().toString(),
                "status",String.valueOf(HttpStatus.NOT_FOUND.value()),
                "error",HttpStatus.NOT_FOUND.getReasonPhrase(),
                "message",e.getMessage(),
                "path",request.getRequestURI());
                return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }
}
