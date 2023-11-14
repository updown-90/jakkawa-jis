package com.jakkawa.uploader.infrastructure;

import com.jakkawa.uploader.domain.RidiBooksExcelFile;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RidiBooksExcelFileUploadRepository {

    @Insert("INSERT INTO public.readibooks (" +
            "salesoutlet, seriesid, bookid, title, volume, author, translator, illustrator," +
            "publisher, seriesname, ebookprice, singlevolumesalesamt, singlevolumesalesrights," +
            "singlevolumefreerights, rentalamt, rentalpaidrights_202004, rentalfreerights," +
            "freedownloadamt, freedownloadrights, setsalesamt, setsalesrights, setrentalamt," +
            "setrentalrights, cnclsinglevolumesalesamt, cnclsinglevolumesalesrights," +
            "cnclrentalamt, cnclrentalrights, cnclfreedownloadamt, cnclfreedownloadrights," +
            "cnclsetsalesamt, cnclsetsalesrights, cnclsetrentalamt, cnclsetrentalrights," +
            "salesamt, salesrights, cnclamt, cnclrights, normalsalesamt, normalcnclamt," +
            "appmarketsttlmntamt, appmarketfee, appmarketcnclamt, iossttlmntamt, iosfee," +
            "ioscnclamt, androidsttlmntamt, androidfee, androidcnclamt, onestoresttlmntamt," +
            "onestorefee, onestorecnclamt, sttlmntamt, printisbn10, printisbn13, ebookisbn10," +
            "ebookisbn13, cpmanagementid, category1, category2, audit_dt" +
            ") VALUES (" +
            "#{salesOutlet}, #{seriesId}, #{bookId}, #{title}, #{volume}, #{author}," +
            "#{translator}, #{illustrator}, #{publisher}, #{seriesName}, #{ebookPrice}," +
            "#{singleVolumeSalesAmt}, #{singleVolumeSalesRights}, #{singleVolumeFreeRights}," +
            "#{rentalAmt}, #{rentalPaidRights202004}, #{rentalFreeRights}, #{freeDownloadAmt}," +
            "#{freeDownloadRights}, #{setSalesAmt}, #{setSalesRights}, #{setRentalAmt}," +
            "#{setRentalRights}, #{cnclSingleVolumeSalesAmt}, #{cnclSingleVolumeSalesRights}," +
            "#{cnclRentalAmt}, #{cnclRentalRights}, #{cnclFreeDownloadAmt}," +
            "#{cnclFreeDownloadRights}, #{cnclSetSalesAmt}, #{cnclSetSalesRights}," +
            "#{cnclSetRentalAmt}, #{cnclSetRentalRights}, #{salesAmt}, #{salesRights}," +
            "#{cnclAmt}, #{cnclRights}, #{normalSalesAmt}, #{normalCnclAmt}," +
            "#{appMarketsSttlmntAmt}, #{appMarketFee}, #{appMarketCnclAmt}," +
            "#{iosSttlmntAmt}, #{iosFee}, #{iosCnclAmt}, #{androidSttlmntAmt}," +
            "#{androidFee}, #{androidCnclAmt}, #{oneStoreSttlmntAmt}, #{oneStoreFee}," +
            "#{oneStoreCnclAmt}, #{sttlmntAmt}, #{printIsbn10}, #{printIsbn13}," +
            "#{ebookIsbn10}, #{ebookIsbn13}, #{cpManagementId}, #{category1}, #{category2}, #{auditDt}" +
            ")")
    void save(RidiBooksExcelFile ridiBooksExcelFile);

    @Delete("DELETE FROM public.readibooks")
    void deleteAll();
}
