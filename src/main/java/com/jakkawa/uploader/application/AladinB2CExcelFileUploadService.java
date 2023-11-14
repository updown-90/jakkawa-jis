package com.jakkawa.uploader.application;

import com.jakkawa.uploader.domain.AladinB2CExcelFile;
import com.jakkawa.uploader.infrastructure.AladinB2CExcelFileUploadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AladinB2CExcelFileUploadService {

    private final AladinB2CExcelFileUploadRepository aladinB2CExcelFileUploadRepository;

    @Transactional
    public void upload(List<List<String>> readExcelRows) {
        deleteAll();

        LocalDate now = LocalDate.now();
        for (List<String> row : readExcelRows) {
            AladinB2CExcelFile aladinB2CExcelFile = AladinB2CExcelFile.of(row, now);
            aladinB2CExcelFileUploadRepository.save(aladinB2CExcelFile);
        }
    }

    private void deleteAll() {
        aladinB2CExcelFileUploadRepository.deleteAll();
    }
}
