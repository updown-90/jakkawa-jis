package com.jakkawa.uploader.infrastructure;

import com.jakkawa.uploader.domain.BookersExcelFile;
import com.jakkawa.uploader.domain.Yes24B2BExcelFile;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Yes24B2BExcelFileUploadRepository {

    @Insert("INSERT INTO public.yes24_b2b (\"no\", order_dt, suppliername, title, author, publisher, " +
            "copycount, productno, epubid, isbn, ebook_isbn, costrate, sttlmntplace, bookprice, " +
            "publishersttlmntamt, bookid, audit_dt) " +
            "VALUES (#{no}, #{orderDt}, #{supplierName}, #{title}, #{author}, #{publisher}, " +
            "#{copyCount}, #{productNo}, #{epubId}, #{isbn}, #{ebookIsbn}, #{costRate}, " +
            "#{sttlmntPlace}, #{bookPrice}, #{publisherSttlmntAmt}, #{bookId}, #{auditDt})")
    void save(Yes24B2BExcelFile yes24B2BExcelFile);

    @Delete("DELETE FROM public.yes24_b2b")
    void deleteAll();
}
