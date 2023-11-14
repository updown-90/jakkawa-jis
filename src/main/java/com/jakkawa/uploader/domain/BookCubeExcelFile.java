package com.jakkawa.uploader.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class BookCubeExcelFile {
    private String title;
    private String author;
    private String publisher;
    private String salesType;
    private String salesOutlet;
    private String quantity;
    private String listPrice;
    private String salesAmt;
    private String discount;
    private String fee;
    private String targetAmt;
    private String amt;
    private String sttlmntMonth;
    private String bookNumber;
    private String isbn;
    private String eIsbnPdf;
    private String eIsbnEpub;
    private String serviceFile;
    private LocalDate auditDt;

    @Builder
    public BookCubeExcelFile(String title,
                             String author,
                             String publisher,
                             String salesType,
                             String salesOutlet,
                             String quantity,
                             String listPrice,
                             String salesAmt,
                             String discount,
                             String fee,
                             String targetAmt,
                             String amt,
                             String sttlmntMonth,
                             String bookNumber,
                             String isbn,
                             String eIsbnPdf,
                             String eIsbnEpub,
                             String serviceFile,
                             LocalDate auditDt) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.salesType = salesType;
        this.salesOutlet = salesOutlet;
        this.quantity = quantity;
        this.listPrice = listPrice;
        this.salesAmt = salesAmt;
        this.discount = discount;
        this.fee = fee;
        this.targetAmt = targetAmt;
        this.amt = amt;
        this.sttlmntMonth = sttlmntMonth;
        this.bookNumber = bookNumber;
        this.isbn = isbn;
        this.eIsbnPdf = eIsbnPdf;
        this.eIsbnEpub = eIsbnEpub;
        this.serviceFile = serviceFile;
        this.auditDt = auditDt;
    }

    public static BookCubeExcelFile of(List<String> row, LocalDate now) {
        return BookCubeExcelFile.builder()
                .title(row.get(0))
                .author(row.get(1))
                .publisher(row.get(2))
                .salesType(row.get(3))
                .salesOutlet(row.get(4))
                .quantity(row.get(5))
                .listPrice(row.get(6))
                .salesAmt(row.get(7))
                .discount(row.get(8))
                .fee(row.get(9))
                .targetAmt(row.get(10))
                .amt(row.get(11))
                .sttlmntMonth(row.get(12))
                .bookNumber(row.get(13))
                .isbn(row.get(14))
                .eIsbnPdf(row.get(15))
                .eIsbnEpub(row.get(16))
                .serviceFile(row.get(17))
                .auditDt(now)
                .build();
    }
}
