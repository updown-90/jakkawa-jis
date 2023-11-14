package com.jakkawa.uploader.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class AladinB2CExcelFile {

    private String saleCnclDt;
    private String itemId;
    private String title;
    private String salesType;
    private String listPrice;
    private String salesPrice;
    private String sttlmntAmt;
    private String originalOrderDt;
    private String author;
    private String publisher;
    private String sttlmntPlace;
    private String isbn;
    private String cid;
    private LocalDate auditDt;

    @Builder
    public AladinB2CExcelFile(String saleCnclDt,
                              String itemId,
                              String title,
                              String salesType,
                              String listPrice,
                              String salesPrice,
                              String sttlmntAmt,
                              String originalOrderDt,
                              String author,
                              String publisher,
                              String sttlmntPlace,
                              String isbn,
                              String cid,
                              LocalDate auditDt) {
        this.saleCnclDt = saleCnclDt;
        this.itemId = itemId;
        this.title = title;
        this.salesType = salesType;
        this.listPrice = listPrice;
        this.salesPrice = salesPrice;
        this.sttlmntAmt = sttlmntAmt;
        this.originalOrderDt = originalOrderDt;
        this.author = author;
        this.publisher = publisher;
        this.sttlmntPlace = sttlmntPlace;
        this.isbn = isbn;
        this.cid = cid;
        this.auditDt = auditDt;
    }

    public static AladinB2CExcelFile of(List<String> row, LocalDate now) {
        return AladinB2CExcelFile.builder()
                .saleCnclDt(row.get(0))
                .itemId(row.get(1))
                .title(row.get(2))
                .salesType(row.get(3))
                .listPrice(row.get(4))
                .salesPrice(row.get(5))
                .sttlmntAmt(row.get(6))
                .originalOrderDt(row.get(7))
                .author(row.get(8))
                .publisher(row.get(9))
                .sttlmntPlace(row.get(10))
                .isbn(row.get(11))
                .cid(row.get(12))
                .auditDt(now)
                .build();
    }


}
