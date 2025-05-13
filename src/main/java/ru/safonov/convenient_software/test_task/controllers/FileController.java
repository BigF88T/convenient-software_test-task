package ru.safonov.convenient_software.test_task.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.safonov.convenient_software.test_task.dto.FileRequest;
import ru.safonov.convenient_software.test_task.services.FileService;

@RestController
@RequestMapping("/api")
public class FileController {

    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @Operation(summary = "Получить минимальное N`ое-число ")
    @PostMapping("/find-min")
    public int findMin(@RequestBody FileRequest req) {
        return fileService.findMinNumFromFile(req);
    }

}
