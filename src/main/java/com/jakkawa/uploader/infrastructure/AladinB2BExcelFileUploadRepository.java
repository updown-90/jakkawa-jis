package com.jakkawa.uploader.infrastructure;

import com.jakkawa.uploader.domain.AladinB2BExcelFile;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AladinB2BExcelFileUploadRepository {

    @Insert("INSERT INTO public.aladin_b2b" +
            "(order_dt, customer, title, author, publisher, supplier, itemid, cid, copycount, listprice, totallistprice, receiptrate, sttlmntamt, audit_dt)" +
            "VALUES(#{orderDt}, #{customer}, #{title}, #{author}, #{publisher}, #{supplier}, #{itemId}, #{cid}, #{copyCount}, #{listPrice}, #{totalListPrice}, #{receiptRate}, #{sttlmntAmt}, #{auditDt})")
    void save(AladinB2BExcelFile aladinB2BExcelFile);

    @Delete("DELETE FROM public.aladin_b2b")
    void deleteAll();

}
