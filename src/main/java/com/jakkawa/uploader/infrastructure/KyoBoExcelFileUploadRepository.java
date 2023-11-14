package com.jakkawa.uploader.infrastructure;

import com.jakkawa.uploader.domain.KyoBoExcelFile;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface KyoBoExcelFileUploadRepository {

    @Insert("INSERT INTO public.kyobo" +
            "(salesperiod, total, saleschannel, salesmethod, producttype, productname, episodename, author, publisher, affiliate, supplier, listprice, sellingprice, quantitysold, targetsellingprice, totaltargetsellingprice, sttlmntrate, sttlmntamt, category, productid, epubisbn, pdfisbn, zipisbn, mp3isbn, issn, printisbn, booknumber, audit_dt)" +
            "VALUES(#{salesPeriod}, #{total}, #{salesChannel}, #{salesMethod}, #{productType}, #{productName}, #{episodeName}, #{author}, #{publisher}, #{affiliate}, #{supplier}, #{listPrice}, #{sellingPrice}, #{quantitySold}, #{targetSellingPrice}, #{totalTargetSellingPrice}, #{sttlMntRate}, #{sttlMntAmt}, #{category}, #{productId}, #{epubIsbn}, #{pdfIsbn}, #{zipIsbn}, #{mp3Isbn}, #{issn}, #{printIsbn}, #{bookNumber}, #{auditDt})")
    void save(KyoBoExcelFile kyoBoExcelFile);

    @Delete("DELETE FROM public.kyobo")
    void deleteAll();

    @Select(
            "SELECT " +
                    "salesperiod, total, saleschannel, salesmethod, producttype, productname, episodename, author, publisher, affiliate, supplier, listprice, sellingprice, quantitysold, targetsellingprice, totaltargetsellingprice, sttlmntrate, sttlmntamt, category, productid, epubisbn, pdfisbn, zipisbn, mp3isbn, issn, printisbn, booknumber, audit_dt " +
                    "FROM public.kyobo"
    )
    List<KyoBoExcelFile> findAll();
}
