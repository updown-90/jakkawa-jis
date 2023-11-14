package com.jakkawa.uploader.application;

import com.jakkawa.uploader.domain.KyoBoExcelFile;
import com.jakkawa.uploader.domain.MonthlySalesTotal;
import com.jakkawa.uploader.infrastructure.KyoBoExcelFileUploadRepository;
import com.jakkawa.uploader.infrastructure.MonthlySalesTotalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MonthlySalesTotalService {

    private final MonthlySalesTotalRepository monthlySalesTotalRepository;
    private final KyoBoExcelFileUploadRepository kyoBoExcelFileUploadRepository;

    @Transactional
    public void calculateMonthlySalesTotal() {
        List<KyoBoExcelFile> kyoBoExcelFiles = kyoBoExcelFileUploadRepository.findAll();

        for (KyoBoExcelFile kyoBoExcelFile : kyoBoExcelFiles) {

            String salesId = kyoBoExcelFile.getSalesMonth() + "_" + kyoBoExcelFile.getSalesStatus() + "_" + kyoBoExcelFile.getSalesPath() + "_" + kyoBoExcelFile.getSalesChannel() + "_" + kyoBoExcelFile.getIsbn();
            String salesMonth = kyoBoExcelFile.getSalesMonth();
            String isbn = kyoBoExcelFile.getIsbn();
            String salesStatus = kyoBoExcelFile.getSalesStatus();
            String salesPath = kyoBoExcelFile.getSalesPath();
            String salesTypeCd = kyoBoExcelFile.getSalesChannel();
            String salesTypeDtlCd = kyoBoExcelFile.getSalesMethod();
            Integer salesPrice = Integer.parseInt(kyoBoExcelFile.getSellingPrice());
            Integer salesCnt = Integer.parseInt(kyoBoExcelFile.getQuantitySold());
            Integer salesAmtTot = Integer.parseInt(kyoBoExcelFile.getTotalTargetSellingPrice());
            Double pathChargeRate = Double.parseDouble(kyoBoExcelFile.getSttlMntRate());
            Integer pathChargeAmt = (int) (pathChargeRate * salesAmtTot);
            Integer writeAmt = salesAmtTot - pathChargeAmt;

            MonthlySalesTotal monthlySalesTotal = MonthlySalesTotal.of(salesId, salesMonth, isbn, salesStatus, salesPath, salesTypeCd, salesTypeDtlCd, salesPrice, salesCnt, salesAmtTot, pathChargeRate, pathChargeAmt, writeAmt, LocalDate.now());

            monthlySalesTotalRepository.save(monthlySalesTotal);
        }
    }
}
