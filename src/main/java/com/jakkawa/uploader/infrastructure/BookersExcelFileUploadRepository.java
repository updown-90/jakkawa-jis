package com.jakkawa.uploader.infrastructure;

import com.jakkawa.uploader.domain.BookersExcelFile;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookersExcelFileUploadRepository {

    @Insert("INSERT INTO public.bookers" +
            "(type, carryover, sttlmntmonth, subscriptionmonth, cpname, brandname, isbn, contentname, one_rentalcount, listprice, sttlmntrate, viewcount, sttlmntamt, audit_dt) " +
            "VALUES (#{type}, #{carryover}, #{sttlmntMonth}, #{subscriptionMonth}, #{cpName}, #{brandName}, #{isbn}, #{contentName}, #{oneRentalCount}, #{listPrice}, #{sttlmntrate}, #{viewCount}, #{sttlmntAmt}, #{auditDt})")
    void save(BookersExcelFile bookersExcelFile);

    @Delete("DELETE FROM public.bookers")
    void deleteAll();
}
