package com.jakkawa.uploader.infrastructure;

import com.jakkawa.uploader.domain.MillieExcelFile;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MillieExcelFileUploadRepository {

    @Insert("INSERT INTO public.milli (ebookisbn, title, \"type\", author, imprint, " +
            "rentalcount, cumulativerentalcount, supplycopycount, cumulativesupplycopycount, " +
            "salesamt, preorderappliedcopycount, cumulativepreorderappliedcopycount, preordercontractcopy, " +
            "regularsttlmntcopy, sttlmntamt, \"_15timesnewrelease\", periodicexpiration_dt, cpproductcode, audit_dt) " +
            "VALUES (#{ebookIsbn}, #{title}, #{type}, #{author}, #{imprint}, " +
            "#{rentalCount}, #{cumulativeRentalCount}, #{supplyCopyCount}, #{cumulativeSupplyCopyCount}, " +
            "#{salesAmt}, #{preorderAppliedCopyCount}, #{cumulativePreorderAppliedCopyCount}, #{preorderContractCopy}, " +
            "#{regularSttlmntCopy}, #{sttlmntAmt}, #{_15TimesNewRelease}, #{periodicExpirationDt}, #{cpProductCode}, #{auditDt})")
    void save(MillieExcelFile millieExcelFile);

    @Delete("DELETE FROM public.milli")
    void deleteAll();
}
