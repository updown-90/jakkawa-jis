package com.jakkawa.uploader.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class BookersExcelFile {

    private String type;
    private String carryover;
    private String sttlmntMonth;
    private String subscriptionMonth;
    private String cpName;
    private String brandName;
    private String isbn;
    private String contentName;
    private String oneRentalCount;
    private String listPrice;
    private String sttlmntrate;
    private String viewCount;
    private String sttlmntAmt;
    private LocalDate auditDt;

    @Builder
    public BookersExcelFile(String type,
                            String carryover,
                            String sttlmntMonth,
                            String subscriptionMonth,
                            String cpName,
                            String brandName,
                            String isbn,
                            String contentName,
                            String oneRentalCount,
                            String listPrice,
                            String sttlmntrate,
                            String viewCount,
                            String sttlmntAmt,
                            LocalDate auditDt) {
        this.type = type;
        this.carryover = carryover;
        this.sttlmntMonth = sttlmntMonth;
        this.subscriptionMonth = subscriptionMonth;
        this.cpName = cpName;
        this.brandName = brandName;
        this.isbn = isbn;
        this.contentName = contentName;
        this.oneRentalCount = oneRentalCount;
        this.listPrice = listPrice;
        this.sttlmntrate = sttlmntrate;
        this.viewCount = viewCount;
        this.sttlmntAmt = sttlmntAmt;
        this.auditDt = auditDt;
    }

    public static BookersExcelFile of(List<String> row, LocalDate now) {
        return BookersExcelFile.builder()
                .type(row.get(0))
                .carryover(row.get(1))
                .sttlmntMonth(row.get(2))
                .subscriptionMonth(row.get(3))
                .cpName(row.get(4))
                .brandName(row.get(5))
                .isbn(row.get(6))
                .contentName(row.get(7))
                .oneRentalCount(row.get(8))
                .listPrice(row.get(9))
                .sttlmntrate(row.get(10))
                .viewCount(row.get(11))
                .sttlmntAmt(row.get(12))
                .auditDt(now)
                .build();
    }
}
