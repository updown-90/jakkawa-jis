package com.jakkawa.uploader.domain;

import io.micrometer.common.util.StringUtils;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class KyoBoExcelFile {
    private String salesPeriod;
    private String total;
    private String salesChannel;
    private String salesMethod;
    private String productType;
    private String productName;
    private String episodeName;
    private String author;
    private String publisher;
    private String affiliate;
    private String supplier;
    private String listPrice;
    private String sellingPrice;
    private String quantitySold;
    private String targetSellingPrice;
    private String totalTargetSellingPrice;
    private String sttlMntRate;
    private String sttlMntAmt;
    private String category;
    private String productId;
    private String epubIsbn;
    private String pdfIsbn;
    private String zipIsbn;
    private String mp3Isbn;
    private String issn;
    private String printIsbn;
    private String bookNumber;
    private LocalDate auditDt;

    @Builder
    public KyoBoExcelFile(String salesPeriod,
                          String total,
                          String salesChannel,
                          String salesMethod,
                          String productType,
                          String productName,
                          String episodeName,
                          String author,
                          String publisher,
                          String affiliate,
                          String supplier,
                          String listPrice,
                          String sellingPrice,
                          String quantitySold,
                          String targetSellingPrice,
                          String totalTargetSellingPrice,
                          String sttlMntRate,
                          String sttlMntAmt,
                          String category,
                          String productId,
                          String epubIsbn,
                          String pdfIsbn,
                          String zipIsbn,
                          String mp3Isbn,
                          String issn,
                          String printIsbn,
                          String bookNumber,
                          LocalDate auditDt) {
        this.salesPeriod = salesPeriod;
        this.total = total;
        this.salesChannel = salesChannel;
        this.salesMethod = salesMethod;
        this.productType = productType;
        this.productName = productName;
        this.episodeName = episodeName;
        this.author = author;
        this.publisher = publisher;
        this.affiliate = affiliate;
        this.supplier = supplier;
        this.listPrice = listPrice;
        this.sellingPrice = sellingPrice;
        this.quantitySold = quantitySold;
        this.targetSellingPrice = targetSellingPrice;
        this.totalTargetSellingPrice = totalTargetSellingPrice;
        this.sttlMntRate = sttlMntRate;
        this.sttlMntAmt = sttlMntAmt;
        this.category = category;
        this.productId = productId;
        this.epubIsbn = epubIsbn;
        this.pdfIsbn = pdfIsbn;
        this.zipIsbn = zipIsbn;
        this.mp3Isbn = mp3Isbn;
        this.issn = issn;
        this.printIsbn = printIsbn;
        this.bookNumber = bookNumber;
        this.auditDt = auditDt;
    }

    public static KyoBoExcelFile of(List<String> row, LocalDate now) {
        return KyoBoExcelFile.builder()
                .salesPeriod(row.get(0))
                .total(row.get(1))
                .salesChannel(row.get(2))
                .salesMethod(row.get(3))
                .productType(row.get(4))
                .productName(row.get(5))
                .episodeName(row.get(6))
                .author(row.get(7))
                .publisher(row.get(8))
                .affiliate(row.get(9))
                .supplier(row.get(10))
                .listPrice(row.get(11))
                .sellingPrice(row.get(12))
                .quantitySold(row.get(13))
                .targetSellingPrice(row.get(14))
                .totalTargetSellingPrice(row.get(15))
                .sttlMntRate(row.get(16))
                .sttlMntAmt(row.get(17))
                .category(row.get(18))
                .productId(row.get(19))
                .epubIsbn(row.get(20))
                .pdfIsbn(row.get(21))
                .zipIsbn(row.get(22))
                .mp3Isbn(row.get(23))
                .issn(row.get(24))
                .printIsbn(row.get(25))
                .bookNumber(row.get(26))
                .auditDt(now)
                .build();
    }

    public String getSalesStatus() {
        if (Integer.parseInt(this.totalTargetSellingPrice) >= 0) {
            return "판매";
        } else if (Integer.parseInt(this.totalTargetSellingPrice) < 0) {
            return "환불";
        }

        return null;
    }

    public String getSalesPath() {
        return "교보문고";
    }

    public String getIsbn() {
        if (!StringUtils.isEmpty(this.epubIsbn)) {
            return this.epubIsbn;
        } else {
            return this.pdfIsbn;
        }
    }

    public String getSalesMonth() {
        return this.salesPeriod.replaceAll("-", "").substring(2);
    }
}
