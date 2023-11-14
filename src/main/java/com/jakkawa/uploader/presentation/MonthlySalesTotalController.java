package com.jakkawa.uploader.presentation;

import com.jakkawa.uploader.application.KyoBoExcelFileUploadService;
import com.jakkawa.uploader.application.MonthlySalesTotalService;
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

@Tag(name = "월별 데이터 계산하기")
@RestController
@RequiredArgsConstructor
public class MonthlySalesTotalController {

    private final MonthlySalesTotalService monthlySalesTotalService;

    @Operation(summary = "월별 데이터 계산하기")
    @PostMapping(value = "/monthlySalesTotal")
    public void calculateMonthlySalesTotal() {
        monthlySalesTotalService.calculateMonthlySalesTotal();
    }



}
