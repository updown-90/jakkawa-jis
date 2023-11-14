package com.jakkawa.uploader.application;

import com.jakkawa.uploader.domain.AladinB2BExcelFile;
import com.jakkawa.uploader.infrastructure.AladinB2BExcelFileUploadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AladinB2BExcelFileUploadService {

    private final AladinB2BExcelFileUploadRepository aladinB2BExcelFileUploadRepository;

    @Transactional
    public void upload(List<List<String>> readExcelRows) {
        deleteAll();

        LocalDate now = LocalDate.now();
        for (List<String> row : readExcelRows) {
            AladinB2BExcelFile aladinB2BExcelFile = AladinB2BExcelFile.of(row, now);
            aladinB2BExcelFileUploadRepository.save(aladinB2BExcelFile);
        }
    }

    private void deleteAll() {
        aladinB2BExcelFileUploadRepository.deleteAll();
    }
}
