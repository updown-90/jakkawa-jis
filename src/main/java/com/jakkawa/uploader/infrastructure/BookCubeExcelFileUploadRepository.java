package com.jakkawa.uploader.infrastructure;

import com.jakkawa.uploader.domain.BookCubeExcelFile;
import com.jakkawa.uploader.domain.RidiBooksExcelFile;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookCubeExcelFileUploadRepository {

    @Insert("INSERT INTO public.bookcube" +
            "(title, author, publisher, salestype, salesoutlet, quantity, listprice, salesamt, discount, fee, targetamt, amt, sttlmntmonth, booknumber, isbn, eisbn_pdf, eisbn_epub, servicefile, audit_dt)" +
            "VALUES(#{title}, #{author}, #{publisher}, #{salesType}, #{salesOutlet}, #{quantity}, #{listPrice}, #{salesAmt}, #{discount}, #{fee}, #{targetAmt}, #{amt}, #{sttlmntMonth}, #{bookNumber}, #{isbn}, #{eIsbnPdf}, #{eIsbnEpub}, #{serviceFile}, #{auditDt})")
    void save(BookCubeExcelFile bookCubeExcelFile);

    @Delete("DELETE FROM public.bookcube")
    void deleteAll();
}
