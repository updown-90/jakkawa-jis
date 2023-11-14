package com.jakkawa.uploader.infrastructure;

import com.jakkawa.uploader.domain.Yes24B2CExcelFile;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Yes24B2CExcelFileUploadRepository {

    @Insert("INSERT INTO public.yes24_b2c (\"no\", title, publisher, publishersellingprice, bookstore, " +
            "bookstoresellingprice, bookstorerefundable, costrate, publishersttlmntamt, eventtype, salestype, " +
            "eventsellingprice, author, bookid, epubid, setcode, printisbn, ebookisbn, sales_dt, refund_dt, " +
            "audioisbn, contentstype, audit_dt) " +
            "VALUES (#{no}, #{title}, #{publisher}, #{publisherSellingPrice}, #{bookstore}, #{bookstoreSellingPrice}, " +
            "#{bookstoreRefundable}, #{costRate}, #{publisherSttlmntAmt}, #{eventType}, #{salesType}, " +
            "#{eventSellingPrice}, #{author}, #{bookId}, #{epubId}, #{setCode}, #{printIsbn}, #{ebookIsbn}, " +
            "#{salesDt}, #{refundDt}, #{audioIsbn}, #{contentsType}, #{auditDt})")
    void save(Yes24B2CExcelFile yes24B2CExcelFile);

    @Delete("DELETE FROM public.yes24_b2c")
    void deleteAll();
}
