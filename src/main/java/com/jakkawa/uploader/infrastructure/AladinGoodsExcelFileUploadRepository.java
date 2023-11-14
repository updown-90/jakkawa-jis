package com.jakkawa.uploader.infrastructure;

import com.jakkawa.uploader.domain.AladinGoodsExcelFile;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AladinGoodsExcelFileUploadRepository {


    @Insert("INSERT INTO aladin_products (\n" +
            "setyn, productcode, itemid, productname, subtitle,\n" +
            "author1, author2, author3, publishername, suppliername,\n" +
            "b2csettlementrate, holdingprice, holdingsaleprice, salestatus,\n" +
            "rentalprice, rentalsaleprice, rentaldays, printbookisbn,\n" +
            "ebookisbn, ecn, issn, cid, ebookpublicationdate,\n" +
            "agerestriction, volume, readingdirection, lang,\n" +
            "categorycode, previewyn, fmt, serialusage, holdingevent,\n" +
            "rentalevent, audit_dt\n" +
            ") VALUES (\n" +
            "#{setYn}, #{productCode}, #{itemId}, #{productName}, #{subtitle},\n" +
            "#{author1}, #{author2}, #{author3}, #{publisherName}, #{supplierName},\n" +
            "#{b2cSettlementRate}, #{holdingPrice}, #{holdingSalePrice}, #{saleStatus},\n" +
            "#{rentalPrice}, #{rentalSalePrice}, #{rentalDays}, #{printBookIsbn},\n" +
            "#{ebookIsbn}, #{ecn}, #{issn}, #{cid}, #{ebookPublicationDate},\n" +
            "#{ageRestriction}, #{volume}, #{readingDirection}, #{lang},\n" +
            "#{categoryCode}, #{previewYn}, #{fmt}, #{serialUsage}, #{holdingEvent},\n" +
            "#{rentalEvent}, #{auditDt}\n" +
            ")")
    void save(AladinGoodsExcelFile aladinGoodsExcelFile);

    @Delete("DELETE FROM aladin_products")
    void deleteAll();
}
