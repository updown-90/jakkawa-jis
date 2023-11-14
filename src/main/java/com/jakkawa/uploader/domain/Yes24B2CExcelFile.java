package com.jakkawa.uploader.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class Yes24B2CExcelFile {

    private String no;
    private String title;
    private String publisher;
    private String publisherSellingPrice;
    private String bookstore;
    private String bookstoreSellingPrice;
    private String bookstoreRefundable;
    private String costRate;
    private String publisherSttlmntAmt;
    private String eventType;
    private String salesType;
    private String eventSellingPrice;
    private String author;
    private String bookId;
    private String epubId;
    private String setCode;
    private String printIsbn;
    private String ebookIsbn;
    private String salesDt;
    private String refundDt;
    private String audioIsbn;
    private String contentsType;
    private LocalDate auditDt;

    @Builder
    public Yes24B2CExcelFile(String no,
                             String title,
                             String publisher,
                             String publisherSellingPrice,
                             String bookstore,
                             String bookstoreSellingPrice,
                             String bookstoreRefundable,
                             String costRate,
                             String publisherSttlmntAmt,
                             String eventType,
                             String salesType,
                             String eventSellingPrice,
                             String author,
                             String bookId,
                             String epubId,
                             String setCode,
                             String printIsbn,
                             String ebookIsbn,
                             String salesDt,
                             String refundDt,
                             String audioIsbn,
                             String contentsType,
                             LocalDate auditDt) {
        this.no = no;
        this.title = title;
        this.publisher = publisher;
        this.publisherSellingPrice = publisherSellingPrice;
        this.bookstore = bookstore;
        this.bookstoreSellingPrice = bookstoreSellingPrice;
        this.bookstoreRefundable = bookstoreRefundable;
        this.costRate = costRate;
        this.publisherSttlmntAmt = publisherSttlmntAmt;
        this.eventType = eventType;
        this.salesType = salesType;
        this.eventSellingPrice = eventSellingPrice;
        this.author = author;
        this.bookId = bookId;
        this.epubId = epubId;
        this.setCode = setCode;
        this.printIsbn = printIsbn;
        this.ebookIsbn = ebookIsbn;
        this.salesDt = salesDt;
        this.refundDt = refundDt;
        this.audioIsbn = audioIsbn;
        this.contentsType = contentsType;
        this.auditDt = auditDt;
    }

    public static Yes24B2CExcelFile of(List<String> row, LocalDate now) {
        return Yes24B2CExcelFile.builder()
                .no(row.get(0))
                .title(row.get(1))
                .publisher(row.get(2))
                .publisherSellingPrice(row.get(3))
                .bookstore(row.get(4))
                .bookstoreSellingPrice(row.get(5))
                .bookstoreRefundable(row.get(6))
                .costRate(row.get(7))
                .publisherSttlmntAmt(row.get(8))
                .eventType(row.get(9))
                .salesType(row.get(10))
                .eventSellingPrice(row.get(11))
                .author(row.get(12))
                .bookId(row.get(13))
                .epubId(row.get(14))
                .setCode(row.get(15))
                .printIsbn(row.get(16))
                .ebookIsbn(row.get(17))
                .salesDt(row.get(18))
                .refundDt(row.get(19))
                .audioIsbn(row.get(20))
                .contentsType(row.get(21))
                .auditDt(now)
                .build();
    }
}
