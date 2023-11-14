package com.jakkawa.uploader.application;

import com.jakkawa.uploader.domain.KyoBoExcelFile;
import com.jakkawa.uploader.infrastructure.KyoBoExcelFileUploadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class KyoBoExcelFileUploadService {

    private final KyoBoExcelFileUploadRepository kyoBoExcelFileUploadRepository;

    @Transactional
    public void upload(List<List<String>> readExcelRows) {
        deleteAll();

        LocalDate now = LocalDate.now();

        for (List<String> row : readExcelRows) {
            KyoBoExcelFile kyoBoExcelFile = KyoBoExcelFile.of(row, now);
            kyoBoExcelFileUploadRepository.save(kyoBoExcelFile);
        }
    }

    private void deleteAll() {
        kyoBoExcelFileUploadRepository.deleteAll();
    }
}
