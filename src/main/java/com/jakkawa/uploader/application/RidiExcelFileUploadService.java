package com.jakkawa.uploader.application;

import com.jakkawa.uploader.domain.RidiBooksExcelFile;
import com.jakkawa.uploader.infrastructure.RidiBooksExcelFileUploadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RidiExcelFileUploadService {

    private final RidiBooksExcelFileUploadRepository ridiBooksExcelFileUploadRepository;

    @Transactional
    public void upload(List<List<String>> readExcelRows) {
        deleteAll();

        LocalDate now = LocalDate.now();
        for (List<String> row : readExcelRows) {
            RidiBooksExcelFile ridiBooksExcelFile = RidiBooksExcelFile.of(row, now);
            ridiBooksExcelFileUploadRepository.save(ridiBooksExcelFile);
        }
    }

    private void deleteAll() {
        ridiBooksExcelFileUploadRepository.deleteAll();
    }
}
