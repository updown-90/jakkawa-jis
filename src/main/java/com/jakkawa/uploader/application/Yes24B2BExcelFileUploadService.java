package com.jakkawa.uploader.application;

import com.jakkawa.uploader.domain.BookersExcelFile;
import com.jakkawa.uploader.domain.Yes24B2BExcelFile;
import com.jakkawa.uploader.infrastructure.BookersExcelFileUploadRepository;
import com.jakkawa.uploader.infrastructure.Yes24B2BExcelFileUploadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Yes24B2BExcelFileUploadService {

    private final Yes24B2BExcelFileUploadRepository yes24B2BExcelFileUploadRepository;

    @Transactional
    public void upload(List<List<String>> readExcelRows) {
        deleteAll();

        LocalDate now = LocalDate.now();
        for (List<String> row : readExcelRows) {
            Yes24B2BExcelFile yes24B2BExcelFile = Yes24B2BExcelFile.of(row, now);
            yes24B2BExcelFileUploadRepository.save(yes24B2BExcelFile);
        }
    }

    private void deleteAll() {
        yes24B2BExcelFileUploadRepository.deleteAll();
    }
}
