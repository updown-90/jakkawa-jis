package com.jakkawa.uploader.application;

import com.jakkawa.uploader.domain.BookCubeExcelFile;
import com.jakkawa.uploader.domain.Yes24B2CExcelFile;
import com.jakkawa.uploader.infrastructure.BookCubeExcelFileUploadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookCubeExcelFileUploadService {

    private final BookCubeExcelFileUploadRepository bookCubeExcelFileUploadRepository;

    @Transactional
    public void upload(List<List<String>> readExcelRows) {
        deleteAll();

        LocalDate now = LocalDate.now();
        for (List<String> row : readExcelRows) {
            BookCubeExcelFile bookCubeExcelFile = BookCubeExcelFile.of(row, now);
            bookCubeExcelFileUploadRepository.save(bookCubeExcelFile);
        }
    }

    private void deleteAll() {
        bookCubeExcelFileUploadRepository.deleteAll();
    }
}
