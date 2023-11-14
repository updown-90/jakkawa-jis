// com.jakkawa.uploader.domain.AladinGoodsExcelFile
package com.jakkawa.uploader.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class AladinGoodsExcelFile {

    private String setYn;
    private String productCode;
    private String itemId;
    private String productName;
    private String subtitle;
    private String author1;
    private String author2;
    private String author3;
    private String publisherName;
    private String supplierName;
    private String b2cSettlementRate;
    private String holdingPrice;
    private String holdingSalePrice;
    private String saleStatus;
    private String rentalPrice;
    private String rentalSalePrice;
    private String rentalDays;
    private String printBookIsbn;
    private String ebookIsbn;
    private String ecn;
    private String issn;
    private String cid;
    private String ebookPublicationDate;
    private String ageRestriction;
    private String volume;
    private String readingDirection;
    private String lang;
    private String categoryCode;
    private String previewYn;
    private String fmt;
    private String serialUsage;
    private String holdingEvent;
    private String rentalEvent;
    private LocalDate auditDt;

    @Builder
    public AladinGoodsExcelFile(String setYn,
                                String productCode,
                                String itemId,
                                String productName,
                                String subtitle,
                                String author1,
                                String author2,
                                String author3,
                                String publisherName,
                                String supplierName,
                                String b2cSettlementRate,
                                String holdingPrice,
                                String holdingSalePrice,
                                String saleStatus,
                                String rentalPrice,
                                String rentalSalePrice,
                                String rentalDays,
                                String printBookIsbn,
                                String ebookIsbn,
                                String ecn,
                                String issn,
                                String cid,
                                String ebookPublicationDate,
                                String ageRestriction,
                                String volume,
                                String readingDirection,
                                String lang,
                                String categoryCode,
                                String previewYn,
                                String fmt,
                                String serialUsage,
                                String holdingEvent,
                                String rentalEvent,
                                LocalDate auditDt) {
        this.setYn = setYn;
        this.productCode = productCode;
        this.itemId = itemId;
        this.productName = productName;
        this.subtitle = subtitle;
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
        this.publisherName = publisherName;
        this.supplierName = supplierName;
        this.b2cSettlementRate = b2cSettlementRate;
        this.holdingPrice = holdingPrice;
        this.holdingSalePrice = holdingSalePrice;
        this.saleStatus = saleStatus;
        this.rentalPrice = rentalPrice;
        this.rentalSalePrice = rentalSalePrice;
        this.rentalDays = rentalDays;
        this.printBookIsbn = printBookIsbn;
        this.ebookIsbn = ebookIsbn;
        this.ecn = ecn;
        this.issn = issn;
        this.cid = cid;
        this.ebookPublicationDate = ebookPublicationDate;
        this.ageRestriction = ageRestriction;
        this.volume = volume;
        this.readingDirection = readingDirection;
        this.lang = lang;
        this.categoryCode = categoryCode;
        this.previewYn = previewYn;
        this.fmt = fmt;
        this.serialUsage = serialUsage;
        this.holdingEvent = holdingEvent;
        this.rentalEvent = rentalEvent;
        this.auditDt = auditDt;
    }

    public static AladinGoodsExcelFile of(List<String> row, LocalDate now) {
        return AladinGoodsExcelFile.builder()
                .setYn(row.get(0))
                .productCode(row.get(1))
                .itemId(row.get(2))
                .productName(row.get(3))
                .subtitle(row.get(4))
                .author1(row.get(5))
                .author2(row.get(6))
                .author3(row.get(7))
                .publisherName(row.get(8))
                .supplierName(row.get(9))
                .b2cSettlementRate(row.get(10))
                .holdingPrice(row.get(11))
                .holdingSalePrice(row.get(12))
                .saleStatus(row.get(13))
                .rentalPrice(row.get(14))
                .rentalSalePrice(row.get(15))
                .rentalDays(row.get(16))
                .printBookIsbn(row.get(17))
                .ebookIsbn(row.get(18))
                .ecn(row.get(19))
                .issn(row.get(20))
                .cid(row.get(21))
                .ebookPublicationDate(row.get(22))
                .ageRestriction(row.get(23))
                .volume(row.get(24))
                .readingDirection(row.get(25))
                .lang(row.get(26))
                .categoryCode(row.get(27))
                .previewYn(row.get(28))
                .fmt(row.get(29))
                .serialUsage(row.get(30))
                .holdingEvent(row.get(31))
                .rentalEvent(row.get(32))
                .auditDt(now)
                .build();
    }
}
