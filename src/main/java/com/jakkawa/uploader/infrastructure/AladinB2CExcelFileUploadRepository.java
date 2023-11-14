package com.jakkawa.uploader.infrastructure;

import com.jakkawa.uploader.domain.AladinB2CExcelFile;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AladinB2CExcelFileUploadRepository {

    @Insert("INSERT INTO public.aladin_b2c" +
            "(salecncl_dt, itemid, title, salestype, listprice, salesprice, sttlmntamt, originalorder_dt, author, publisher, sttlmntplace, isbn, cid, audit_dt)" +
            "VALUES(#{saleCnclDt}, #{itemId}, #{title}, #{salesType}, #{listPrice}, #{salesPrice}, #{sttlmntAmt}, #{originalOrderDt}, #{author}, #{publisher}, #{sttlmntPlace}, #{isbn}, #{cid}, #{auditDt})")
    void save(AladinB2CExcelFile aladinB2CExcelFile);

    @Delete("DELETE FROM public.aladin_b2c")
    void deleteAll();
}
