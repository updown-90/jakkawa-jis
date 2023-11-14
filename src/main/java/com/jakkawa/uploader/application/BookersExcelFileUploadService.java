package com.jakkawa.uploader.application;

import com.jakkawa.uploader.domain.BookersExcelFile;
import com.jakkawa.uploader.domain.MillieExcelFile;
import com.jakkawa.uploader.infrastructure.BookersExcelFileUploadRepository;
import com.jakkawa.uploader.infrastructure.MillieExcelFileUploadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookersExcelFileUploadService {

    private final BookersExcelFileUploadRepository bookersExcelFileUploadRepository;

    @Transactional
    public void upload(List<List<String>> readExcelRows) {
        deleteAll();

        LocalDate now = LocalDate.now();

        for (int i = 0; i < readExcelRows.size() - 1; i++) {
            List<String> row = readExcelRows.get(i);
            BookersExcelFile bookersExcelFile = BookersExcelFile.of(row, now);
            bookersExcelFileUploadRepository.save(bookersExcelFile);
        }
    }

    private void deleteAll() {
        bookersExcelFileUploadRepository.deleteAll();
    }
}
