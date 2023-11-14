package com.jakkawa.uploader.domain;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
public class MonthlySalesTotal {

    private Long seq;
    private String salesId;
    private String salesMonth;
    private String isbn;
    private String salesStatus;
    private String salesPath;
    private String salesTypeCd;
    private String salesTypeDtlCd;
    private Integer salesPrice;
    private Integer salesCnt;
    private Integer salesAmtTot;
    private Double pathChargeRate;
    private Integer pathChargeAmt;
    private Integer writeAmt;
    private LocalDate auditDt;

    @Builder
    public MonthlySalesTotal(Long seq, String salesId, String salesMonth, String isbn,
                             String salesStatus, String salesPath, String salesTypeCd,
                             String salesTypeDtlCd, Integer salesPrice, Integer salesCnt,
                             Integer salesAmtTot, Double pathChargeRate,
                             Integer pathChargeAmt, Integer writeAmt, LocalDate auditDt) {
        this.seq = seq;
        this.salesId = salesId;
        this.salesMonth = salesMonth;
        this.isbn = isbn;
        this.salesStatus = salesStatus;
        this.salesPath = salesPath;
        this.salesTypeCd = salesTypeCd;
        this.salesTypeDtlCd = salesTypeDtlCd;
        this.salesPrice = salesPrice;
        this.salesCnt = salesCnt;
        this.salesAmtTot = salesAmtTot;
        this.pathChargeRate = pathChargeRate;
        this.pathChargeAmt = pathChargeAmt;
        this.writeAmt = writeAmt;
        this.auditDt = auditDt;
    }

    public static MonthlySalesTotal of(String salesId, String salesMonth, String isbn,
                                       String salesStatus, String salesPath, String salesTypeCd,
                                       String salesTypeDtlCd, Integer salesPrice, Integer salesCnt,
                                       Integer salesAmtTot, Double pathChargeRate,
                                       Integer pathChargeAmt, Integer writeAmt, LocalDate auditDt) {
        return MonthlySalesTotal.builder()
                .salesId(salesId)
                .salesMonth(salesMonth)
                .isbn(isbn)
                .salesStatus(salesStatus)
                .salesPath(salesPath)
                .salesTypeCd(salesTypeCd)
                .salesTypeDtlCd(salesTypeDtlCd)
                .salesPrice(salesPrice)
                .salesCnt(salesCnt)
                .salesAmtTot(salesAmtTot)
                .pathChargeRate(pathChargeRate)
                .pathChargeAmt(pathChargeAmt)
                .writeAmt(writeAmt)
                .auditDt(auditDt)
                .build();
    }
}
