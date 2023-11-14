package com.jakkawa.uploader.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class MillieExcelFile {

    private String ebookIsbn;
    private String title;
    private String type;
    private String author;
    private String imprint;
    private String rentalCount;
    private String cumulativeRentalCount;
    private String supplyCopyCount;
    private String cumulativeSupplyCopyCount;
    private String salesAmt;
    private String preorderAppliedCopyCount;
    private String cumulativePreorderAppliedCopyCount;
    private String preorderContractCopy;
    private String regularSttlmntCopy;
    private String sttlmntAmt;
    private String _15TimesNewRelease;
    private String periodicExpirationDt;
    private String cpProductCode;
    private LocalDate auditDt;

    @Builder
    public MillieExcelFile(String ebookIsbn,
                           String title,
                           String type,
                           String author,
                           String imprint,
                           String rentalCount,
                           String cumulativeRentalCount,
                           String supplyCopyCount,
                           String cumulativeSupplyCopyCount,
                           String salesAmt,
                           String preorderAppliedCopyCount,
                           String cumulativePreorderAppliedCopyCount,
                           String preorderContractCopy,
                           String regularSttlmntCopy,
                           String sttlmntAmt,
                           String _15TimesNewRelease,
                           String periodicExpirationDt,
                           String cpProductCode,
                           LocalDate auditDt) {
        this.ebookIsbn = ebookIsbn;
        this.title = title;
        this.type = type;
        this.author = author;
        this.imprint = imprint;
        this.rentalCount = rentalCount;
        this.cumulativeRentalCount = cumulativeRentalCount;
        this.supplyCopyCount = supplyCopyCount;
        this.cumulativeSupplyCopyCount = cumulativeSupplyCopyCount;
        this.salesAmt = salesAmt;
        this.preorderAppliedCopyCount = preorderAppliedCopyCount;
        this.cumulativePreorderAppliedCopyCount = cumulativePreorderAppliedCopyCount;
        this.preorderContractCopy = preorderContractCopy;
        this.regularSttlmntCopy = regularSttlmntCopy;
        this.sttlmntAmt = sttlmntAmt;
        this._15TimesNewRelease = _15TimesNewRelease;
        this.periodicExpirationDt = periodicExpirationDt;
        this.cpProductCode = cpProductCode;
        this.auditDt = auditDt;
    }

    // 정적팩토리 메소드 생성 List 받아서
    public static MillieExcelFile of(List<String> row, LocalDate now) {
        return MillieExcelFile.builder()
                .ebookIsbn(row.get(0))
                .title(row.get(1))
                .type(row.get(2))
                .author(row.get(3))
                .imprint(row.get(4))
                .rentalCount(row.get(5))
                .cumulativeRentalCount(row.get(6))
                .supplyCopyCount(row.get(7))
                .cumulativeSupplyCopyCount(row.get(8))
                .salesAmt(row.get(9))
                .preorderAppliedCopyCount(row.get(10))
                .cumulativePreorderAppliedCopyCount(row.get(11))
                .preorderContractCopy(row.get(12))
                .regularSttlmntCopy(row.get(13))
                .sttlmntAmt(row.get(14))
                ._15TimesNewRelease(row.get(15))
                .periodicExpirationDt(row.get(16))
                .cpProductCode(row.get(17))
                .auditDt(now)
                .build();
    }
}
