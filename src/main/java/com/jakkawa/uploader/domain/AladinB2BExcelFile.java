package com.jakkawa.uploader.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class AladinB2BExcelFile {

    private String orderDt;
    private String customer;
    private String title;
    private String author;
    private String publisher;
    private String supplier;
    private String itemId;
    private String cid;
    private String copyCount;
    private String listPrice;
    private String totalListPrice;
    private String receiptRate;
    private String sttlmntAmt;
    private LocalDate auditDt;

    @Builder
    public AladinB2BExcelFile(String orderDt,
                              String customer,
                              String title,
                              String author,
                              String publisher,
                              String supplier,
                              String itemId,
                              String cid,
                              String copyCount,
                              String listPrice,
                              String totalListPrice,
                              String receiptRate,
                              String sttlmntAmt,
                              LocalDate auditDt) {
        this.orderDt = orderDt;
        this.customer = customer;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.supplier = supplier;
        this.itemId = itemId;
        this.cid = cid;
        this.copyCount = copyCount;
        this.listPrice = listPrice;
        this.totalListPrice = totalListPrice;
        this.receiptRate = receiptRate;
        this.sttlmntAmt = sttlmntAmt;
        this.auditDt = auditDt;
    }

    public static AladinB2BExcelFile of(List<String> row, LocalDate auditDt) {
        return AladinB2BExcelFile.builder()
                .orderDt(row.get(0))
                .customer(row.get(1))
                .title(row.get(2))
                .author(row.get(3))
                .publisher(row.get(4))
                .supplier(row.get(5))
                .itemId(row.get(6))
                .cid(row.get(7))
                .copyCount(row.get(8))
                .listPrice(row.get(9))
                .totalListPrice(row.get(10))
                .receiptRate(row.get(11))
                .sttlmntAmt(row.get(12))
                .auditDt(auditDt)
                .build();
    }

}
