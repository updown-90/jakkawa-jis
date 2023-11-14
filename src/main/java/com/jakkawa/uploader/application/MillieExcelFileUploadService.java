package com.jakkawa.uploader.application;

import com.jakkawa.uploader.domain.MillieExcelFile;
import com.jakkawa.uploader.infrastructure.MillieExcelFileUploadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MillieExcelFileUploadService {

    private final MillieExcelFileUploadRepository millieExcelFileUploadRepository;

    @Transactional
    public void upload(List<List<String>> readExcelRows) {
        deleteAll();

        LocalDate now = LocalDate.now();

        for (List<String> row : readExcelRows) {
            MillieExcelFile millieExcelFile = MillieExcelFile.of(row, now);
            millieExcelFileUploadRepository.save(millieExcelFile);
        }
    }

    private void deleteAll() {
        millieExcelFileUploadRepository.deleteAll();
    }
}
