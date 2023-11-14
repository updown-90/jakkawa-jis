package com.jakkawa.uploader.presentation;

import com.jakkawa.uploader.application.AladinB2CExcelFileUploadService;
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

@Tag(name = "알라딘 B2C 업로드")
@RestController
@RequiredArgsConstructor
public class AladinB2CExcelFileUploadController {

    private final AladinB2CExcelFileUploadService aladinB2CExcelFileUploadService;

    @Operation(summary = "알라딘 B2C 업로드하기")
    @PostMapping(value = "/aladinb2c", consumes = "multipart/form-data")
    public ResponseEntity<Object> aladinb2cExcelFileUpload(@RequestParam("excelFile") MultipartFile excelFile) {
        try {
            ExcelUtils.validateExcelFile(excelFile);

            List<List<String>> readExcelRows = ExcelUtils.readExcelRows(excelFile, 1, 0, 12);

            aladinB2CExcelFileUploadService.upload(readExcelRows);

            return new ResponseEntity<>(readExcelRows.size() + "건 업로드 완료됐습니다", HttpStatus.OK);
        } catch (IOException | IllegalStateException ex) {
            return new ResponseEntity<>("파일 업로드에 실패했습니다.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
