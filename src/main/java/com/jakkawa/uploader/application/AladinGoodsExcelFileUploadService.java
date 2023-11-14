package com.jakkawa.uploader.application;

import com.jakkawa.uploader.domain.AladinGoodsExcelFile;
import com.jakkawa.uploader.domain.Yes24B2CExcelFile;
import com.jakkawa.uploader.infrastructure.AladinGoodsExcelFileUploadRepository;
import com.jakkawa.uploader.infrastructure.Yes24B2CExcelFileUploadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AladinGoodsExcelFileUploadService {

    private final AladinGoodsExcelFileUploadRepository aladinGoodsExcelFileUploadRepository;

    @Transactional
    public void upload(List<List<String>> readExcelRows) {
        deleteAll();

        LocalDate now = LocalDate.now();
        for (List<String> row : readExcelRows) {
            AladinGoodsExcelFile aladinGoodsExcelFile = AladinGoodsExcelFile.of(row, now);
            aladinGoodsExcelFileUploadRepository.save(aladinGoodsExcelFile);
        }
    }

    public void deleteAll() {
        aladinGoodsExcelFileUploadRepository.deleteAll();
    }
}
