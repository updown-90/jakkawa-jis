package com.jakkawa.uploader.infrastructure;

import com.jakkawa.uploader.domain.MonthlySalesTotal;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MonthlySalesTotalRepository {

    @Insert("INSERT INTO public.monthly_sales_tot " +
            "(sales_id, sales_month, isbn, sales_status, sales_path, sales_type_cd, sales_type_dtl_cd, sales_price, sales_cnt, sales_amt_tot, path_charge_rate, path_charge_amt, write_amt, audit_dt) " +
            "VALUES (#{salesId}, #{salesMonth}, #{isbn}, #{salesStatus}, #{salesPath}, #{salesTypeCd}, #{salesTypeDtlCd}, #{salesPrice}, #{salesCnt}, #{salesAmtTot}, #{pathChargeRate}, #{pathChargeAmt}, #{writeAmt}, #{auditDt})")
    void save(MonthlySalesTotal monthlySalesTotal);

    @Delete("DELETE FROM public.monthly_sales_tot")
    void deleteAll();
}
