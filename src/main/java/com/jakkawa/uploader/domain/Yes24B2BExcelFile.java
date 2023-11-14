package com.jakkawa.uploader.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Yes24B2BExcelFile {

    private String no;
    private String orderDt;
    private String supplierName;
    private String title;
    private String author;
    private String publisher;
    private String copyCount;
    private String productNo;
    private String epubId;
    private String isbn;
    private String ebookIsbn;
    private String costRate;
    private String sttlmntPlace;
    private String bookPrice;
    private String publisherSttlmntAmt;
    private String bookId;
    private LocalDate auditDt;

    @Builder
    public Yes24B2BExcelFile(String no,
                             String orderDt,
                             String supplierName,
                             String title,
                             String author,
                             String publisher,
                             String copyCount,
                             String productNo,
                             String epubId,
                             String isbn,
                             String ebookIsbn,
                             String costRate,
                             String sttlmntPlace,
                             String bookPrice,
                             String publisherSttlmntAmt,
                             String bookId,
                             LocalDate auditDt) {
        this.no = no;
        this.orderDt = orderDt;
        this.supplierName = supplierName;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyCount = copyCount;
        this.productNo = productNo;
        this.epubId = epubId;
        this.isbn = isbn;
        this.ebookIsbn = ebookIsbn;
        this.costRate = costRate;
        this.sttlmntPlace = sttlmntPlace;
        this.bookPrice = bookPrice;
        this.publisherSttlmntAmt = publisherSttlmntAmt;
        this.bookId = bookId;
        this.auditDt = auditDt;
    }

    public static Yes24B2BExcelFile of(List<String> row, LocalDate now) {
        return Yes24B2BExcelFile.builder()
                .no(row.get(0))
                .orderDt(row.get(1))
                .supplierName(row.get(2))
                .title(row.get(3))
                .author(row.get(4))
                .publisher(row.get(5))
                .copyCount(row.get(6))
                .productNo(row.get(7))
                .epubId(row.get(8))
                .isbn(row.get(9))
                .ebookIsbn(row.get(10))
                .costRate(row.get(11))
                .sttlmntPlace(row.get(12))
                .bookPrice(row.get(13))
                .publisherSttlmntAmt(row.get(14))
                .bookId(row.get(15))
                .auditDt(now)
                .build();
    }
}
