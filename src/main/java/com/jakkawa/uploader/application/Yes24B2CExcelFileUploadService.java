package com.jakkawa.uploader.application;

import com.jakkawa.uploader.domain.Yes24B2CExcelFile;
import com.jakkawa.uploader.infrastructure.Yes24B2CExcelFileUploadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Yes24B2CExcelFileUploadService {

    private final Yes24B2CExcelFileUploadRepository yes24B2CExcelFileUploadRepository;

    @Transactional
    public void upload(List<List<String>> readExcelRows) {
        deleteAll();

        LocalDate now = LocalDate.now();

        for (List<String> row : readExcelRows) {
            Yes24B2CExcelFile yes24B2CExcelFile = Yes24B2CExcelFile.of(row, now);
            yes24B2CExcelFileUploadRepository.save(yes24B2CExcelFile);
        }
    }

    private void deleteAll() {
        yes24B2CExcelFileUploadRepository.deleteAll();
    }
}
