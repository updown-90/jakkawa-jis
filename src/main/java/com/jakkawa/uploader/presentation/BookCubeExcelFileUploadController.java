package com.jakkawa.uploader.presentation;

import com.jakkawa.uploader.application.RidiExcelFileUploadService;
import com.jakkawa.uploader.common.utils.ExcelUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Tag(name = "북큐브 파일 업로드")
@RestController
@RequiredArgsConstructor
public class BookCubeExcelFileUploadController {

    private final RidiExcelFileUploadService ridiExcelFileUploadService;

    @Operation(summary = "북큐브 파일 업로드하기")
    @PostMapping(value = "/bookcube", consumes = "multipart/form-data")
    public ResponseEntity<Object> bookcubeExcelFileUpload(@RequestParam("excelFile") MultipartFile excelFile) {
        try {
            ExcelUtils.validateExcelFile(excelFile);

            List<List<String>> readExcelRows = ExcelUtils.readExcelRows(excelFile, 3, 0, 17);

            ridiExcelFileUploadService.upload(readExcelRows);

            return new ResponseEntity<>(readExcelRows.size() + "건 업로드 완료됐습니다", HttpStatus.OK);
        } catch (IOException | IllegalStateException ex) {
            return new ResponseEntity<>("파일 업로드에 실패했습니다.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
