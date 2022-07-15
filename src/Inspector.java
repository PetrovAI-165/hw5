import java.util.Date;

public  class Inspector {
    static public boolean driveAccess(Driver driver){
        Date currentDate = new Date();
        if (driver.getLicenseId()!=null && driver.getPassportId()!=null && ((dateDiffDays(currentDate,driver.getLastFine())<=365))){
            return true;
        }else{
            return false;
        }
    }
    static public int dateDiffDays(Date d1, Date d2){
        return (int) ((d1.getTime() - d2.getTime()) / (24 * 60 * 60 * 1000));
    }
}
