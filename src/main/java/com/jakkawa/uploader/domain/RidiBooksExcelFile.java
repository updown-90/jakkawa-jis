package com.jakkawa.uploader.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class RidiBooksExcelFile {

    private String salesOutlet;
    private String seriesId;
    private String bookId;
    private String title;
    private String volume;
    private String author;
    private String translator;
    private String illustrator;
    private String publisher;
    private String seriesName;
    private String ebookPrice;
    private String singleVolumeSalesAmt;
    private String singleVolumeSalesRights;
    private String singleVolumeFreeRights;
    private String rentalAmt;
    private String rentalPaidRights202004;
    private String rentalFreeRights;
    private String freeDownloadAmt;
    private String freeDownloadRights;
    private String setSalesAmt;
    private String setSalesRights;
    private String setRentalAmt;
    private String setRentalRights;
    private String cnclSingleVolumeSalesAmt;
    private String cnclSingleVolumeSalesRights;
    private String cnclRentalAmt;
    private String cnclRentalRights;
    private String cnclFreeDownloadAmt;
    private String cnclFreeDownloadRights;
    private String cnclSetSalesAmt;
    private String cnclSetSalesRights;
    private String cnclSetRentalAmt;
    private String cnclSetRentalRights;
    private String salesAmt;
    private String salesRights;
    private String cnclAmt;
    private String cnclRights;
    private String normalSalesAmt;
    private String normalCnclAmt;
    private String appMarketsSttlmntAmt;
    private String appMarketFee;
    private String appMarketCnclAmt;
    private String iosSttlmntAmt;
    private String iosFee;
    private String iosCnclAmt;
    private String androidSttlmntAmt;
    private String androidFee;
    private String androidCnclAmt;
    private String oneStoreSttlmntAmt;
    private String oneStoreFee;
    private String oneStoreCnclAmt;
    private String sttlmntAmt;
    private String printIsbn10;
    private String printIsbn13;
    private String ebookIsbn10;
    private String ebookIsbn13;
    private String cpManagementId;
    private String category1;
    private String category2;
    private LocalDate auditDt;

    @Builder
    public RidiBooksExcelFile(String salesOutlet,
                              String seriesId,
                              String bookId,
                              String title,
                              String volume,
                              String author,
                              String translator,
                              String illustrator,
                              String publisher,
                              String seriesName,
                              String ebookPrice,
                              String singleVolumeSalesAmt,
                              String singleVolumeSalesRights,
                              String singleVolumeFreeRights,
                              String rentalAmt,
                              String rentalPaidRights202004,
                              String rentalFreeRights,
                              String freeDownloadAmt,
                              String freeDownloadRights,
                              String setSalesAmt,
                              String setSalesRights,
                              String setRentalAmt,
                              String setRentalRights,
                              String cnclSingleVolumeSalesAmt,
                              String cnclSingleVolumeSalesRights,
                              String cnclRentalAmt,
                              String cnclRentalRights,
                              String cnclFreeDownloadAmt,
                              String cnclFreeDownloadRights,
                              String cnclSetSalesAmt,
                              String cnclSetSalesRights,
                              String cnclSetRentalAmt,
                              String cnclSetRentalRights,
                              String salesAmt,
                              String salesRights,
                              String cnclAmt,
                              String cnclRights,
                              String normalSalesAmt,
                              String normalCnclAmt,
                              String appMarketsSttlmntAmt,
                              String appMarketFee,
                              String appMarketCnclAmt,
                              String iosSttlmntAmt,
                              String iosFee,
                              String iosCnclAmt,
                              String androidSttlmntAmt,
                              String androidFee,
                              String androidCnclAmt,
                              String oneStoreSttlmntAmt,
                              String oneStoreFee,
                              String oneStoreCnclAmt,
                              String sttlmntAmt,
                              String printIsbn10,
                              String printIsbn13,
                              String ebookIsbn10,
                              String ebookIsbn13,
                              String cpManagementId,
                              String category1,
                              String category2,
                              LocalDate auditDt) {
        this.salesOutlet = salesOutlet;
        this.seriesId = seriesId;
        this.bookId = bookId;
        this.title = title;
        this.volume = volume;
        this.author = author;
        this.translator = translator;
        this.illustrator = illustrator;
        this.publisher = publisher;
        this.seriesName = seriesName;
        this.ebookPrice = ebookPrice;
        this.singleVolumeSalesAmt = singleVolumeSalesAmt;
        this.singleVolumeSalesRights = singleVolumeSalesRights;
        this.singleVolumeFreeRights = singleVolumeFreeRights;
        this.rentalAmt = rentalAmt;
        this.rentalPaidRights202004 = rentalPaidRights202004;
        this.rentalFreeRights = rentalFreeRights;
        this.freeDownloadAmt = freeDownloadAmt;
        this.freeDownloadRights = freeDownloadRights;
        this.setSalesAmt = setSalesAmt;
        this.setSalesRights = setSalesRights;
        this.setRentalAmt = setRentalAmt;
        this.setRentalRights = setRentalRights;
        this.cnclSingleVolumeSalesAmt = cnclSingleVolumeSalesAmt;
        this.cnclSingleVolumeSalesRights = cnclSingleVolumeSalesRights;
        this.cnclRentalAmt = cnclRentalAmt;
        this.cnclRentalRights = cnclRentalRights;
        this.cnclFreeDownloadAmt = cnclFreeDownloadAmt;
        this.cnclFreeDownloadRights = cnclFreeDownloadRights;
        this.cnclSetSalesAmt = cnclSetSalesAmt;
        this.cnclSetSalesRights = cnclSetSalesRights;
        this.cnclSetRentalAmt = cnclSetRentalAmt;
        this.cnclSetRentalRights = cnclSetRentalRights;
        this.salesAmt = salesAmt;
        this.salesRights = salesRights;
        this.cnclAmt = cnclAmt;
        this.cnclRights = cnclRights;
        this.normalSalesAmt = normalSalesAmt;
        this.normalCnclAmt = normalCnclAmt;
        this.appMarketsSttlmntAmt = appMarketsSttlmntAmt;
        this.appMarketFee = appMarketFee;
        this.appMarketCnclAmt = appMarketCnclAmt;
        this.iosSttlmntAmt = iosSttlmntAmt;
        this.iosFee = iosFee;
        this.iosCnclAmt = iosCnclAmt;
        this.androidSttlmntAmt = androidSttlmntAmt;
        this.androidFee = androidFee;
        this.androidCnclAmt = androidCnclAmt;
        this.oneStoreSttlmntAmt = oneStoreSttlmntAmt;
        this.oneStoreFee = oneStoreFee;
        this.oneStoreCnclAmt = oneStoreCnclAmt;
        this.sttlmntAmt = sttlmntAmt;
        this.printIsbn10 = printIsbn10;
        this.printIsbn13 = printIsbn13;
        this.ebookIsbn10 = ebookIsbn10;
        this.ebookIsbn13 = ebookIsbn13;
        this.cpManagementId = cpManagementId;
        this.category1 = category1;
        this.category2 = category2;
        this.auditDt = auditDt;
    }

    public static RidiBooksExcelFile of(List<String> row, LocalDate now) {
        return RidiBooksExcelFile.builder()
                .salesOutlet(row.get(0))
                .seriesId(row.get(1))
                .bookId(row.get(2))
                .title(row.get(3))
                .volume(row.get(4))
                .author(row.get(5))
                .translator(row.get(6))
                .illustrator(row.get(7))
                .publisher(row.get(8))
                .seriesName(row.get(9))
                .ebookPrice(row.get(10))
                .singleVolumeSalesAmt(row.get(11))
                .singleVolumeSalesRights(row.get(12))
                .singleVolumeFreeRights(row.get(13))
                .rentalAmt(row.get(14))
                .rentalPaidRights202004(row.get(15))
                .rentalFreeRights(row.get(16))
                .freeDownloadAmt(row.get(17))
                .freeDownloadRights(row.get(18))
                .setSalesAmt(row.get(19))
                .setSalesRights(row.get(20))
                .setRentalAmt(row.get(21))
                .setRentalRights(row.get(22))
                .cnclSingleVolumeSalesAmt(row.get(23))
                .cnclSingleVolumeSalesRights(row.get(24))
                .cnclRentalAmt(row.get(25))
                .cnclRentalRights(row.get(26))
                .cnclFreeDownloadAmt(row.get(27))
                .cnclFreeDownloadRights(row.get(28))
                .cnclSetSalesAmt(row.get(29))
                .cnclSetSalesRights(row.get(30))
                .cnclSetRentalAmt(row.get(31))
                .cnclSetRentalRights(row.get(32))
                .salesAmt(row.get(33))
                .salesRights(row.get(34))
                .cnclAmt(row.get(35))
                .cnclRights(row.get(36))
                .normalSalesAmt(row.get(37))
                .normalCnclAmt(row.get(38))
                .appMarketsSttlmntAmt(row.get(39))
                .appMarketFee(row.get(40))
                .appMarketCnclAmt(row.get(41))
                .iosSttlmntAmt(row.get(42))
                .iosFee(row.get(43))
                .iosCnclAmt(row.get(44))
                .androidSttlmntAmt(row.get(45))
                .androidFee(row.get(46))
                .androidCnclAmt(row.get(47))
                .oneStoreSttlmntAmt(row.get(48))
                .oneStoreFee(row.get(49))
                .oneStoreCnclAmt(row.get(50))
                .sttlmntAmt(row.get(51))
                .printIsbn10(row.get(52))
                .printIsbn13(row.get(53))
                .ebookIsbn10(row.get(54))
                .ebookIsbn13(row.get(55))
                .cpManagementId(row.get(56))
                .category1(row.get(57))
                .category2(row.get(58))
                .auditDt(LocalDate.now())
                .build();

    }
    
}
