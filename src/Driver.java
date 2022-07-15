import java.util.Date;
import java.util.Objects;

public class Driver {
    private String name;
    private String licenseId;
    private String passportId;
    private Date lastFine;

    public Driver(String name, String licenseId,String passportId ,Date lastFine) {
        this.name = name;
        this.licenseId = licenseId;
        this.lastFine = lastFine;
        this.passportId = passportId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public Date getLastFine() {
        return lastFine;
    }

    public void setLastFine(Date lastFine) {
        this.lastFine = lastFine;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return name.equals(driver.name) && licenseId.equals(driver.licenseId) && passportId.equals(driver.passportId) && lastFine.equals(driver.lastFine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, licenseId, passportId, lastFine);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenseId='" + licenseId + '\'' +
                ", passportId='" + passportId + '\'' +
                ", lastFine=" + lastFine +
                '}';
    }
}
